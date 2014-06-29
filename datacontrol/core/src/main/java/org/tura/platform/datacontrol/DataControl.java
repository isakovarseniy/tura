package org.tura.platform.datacontrol;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.logging.Logger;

import org.apache.commons.lang.StringUtils;
import org.tura.platform.datacontrol.commons.Constants;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.PlatformConfig;
import org.tura.platform.datacontrol.commons.Reflection;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.datacontrol.metainfo.Relation;

public abstract class DataControl<T> extends MetaInfoHolder {

	private ArrayList<ChangeRecordListener> chageRecordLiteners = new ArrayList<>();
	private String uuid = UUID.randomUUID().toString();

	private List<SearchCriteria> filter;
	private List<OrderCriteria> orderby;

	private Pager<T> pager;
	private int currentPosition = 0;
	private int ghostCounter = 0;

	private static Logger logger = Logger
			.getLogger(DataControl.class.getName());

	protected Object comandResultHolder;

	private CommandStack commandStack;

	public void addChageRecordLiteners(ChangeRecordListener listener) {
		chageRecordLiteners.add(listener);
	}

    public void forceRefresh(){
		pager.cleanPager();
		notifyChageRecordAll(pager.getObject(currentPosition));
    }

    public void handleChangeMusterCurrentRecordNotification(
			Object newCurrentObject) {
		pager.cleanPager();
		currentPosition=0;
		notifyChageRecordAll(pager.getObject(currentPosition));
	}

	protected void notifyChageRecordAll(T newCurrentObject) {
		notifyChildrenDataControlsChangeCurrentRecord(newCurrentObject);
		notifyChageRecordLiteners(newCurrentObject);
	}

	private void notifyChageRecordLiteners(T newCurrentObject) {
		for (ChangeRecordListener listener : chageRecordLiteners) {
			listener.handleChangeRecord(this, newCurrentObject);
		}

	}

	public Pager<T> getPager() {
		return pager;
	}

	public synchronized void incGhostCounter() {
		ghostCounter++;
		commandStack.addGhostObjectsControls(uuid, this);
	}

	public synchronized void decGhostCounter() {
		ghostCounter--;
		if (ghostCounter == 0)
			commandStack.removeGhostObjectsControls(uuid);
	}

	public synchronized void cleanGhost() {
		ghostCounter = 0;
		commandStack.removeGhostObjectsControls(uuid);
	}

	public synchronized void cleanGhostObjects() throws Exception {
		if (ghostCounter < 0)
			throw new Exception("ghostCounter < 0");

		ghostCounter = 0;
	}

	public synchronized void setGhostCounter() {
		ghostCounter = 0;
	}

	private void notifyChildrenDataControlsChangeCurrentRecord(
			T newCurrentObject) {
		for (Relation relation : children.values()) {
			relation.setMasterCurrentObject(newCurrentObject);
			((DataControl<?>) relation.getChild())
					.handleChangeMusterCurrentRecordNotification(newCurrentObject);
		}

	}

	public List<SearchCriteria> getFilter() {
		return filter;
	}

	public void setFilter(List<SearchCriteria> filter) {
		this.filter = filter;
	}

	public List<OrderCriteria> getOrderby() {
		return orderby;
	}

	public void setOrderby(List<OrderCriteria> orderby) {
		this.orderby = orderby;
	}

	public ELResolver getElResolver() {
		return elResolver;
	}

	public void initControl() throws Exception {
		this.pager = new Pager<T>(this);
	}

	public T getCurrentObject() {
		return getObject(currentPosition);
	}

	public void nextObject() {
		T newRecord = pager.getObject(currentPosition+1);
		if (newRecord != null) {
			currentPosition++;
			notifyChageRecordAll(newRecord);
		}
	}

	public void prevObject() {
		T newRecord = pager.getObject(currentPosition-1);
		if (newRecord != null) {
			currentPosition--;
			notifyChageRecordAll(newRecord);
		}
	}

	public void removeObject() throws Exception {

			for  (String relName : getRelationsName() ) {
				Relation rel = this.getChild(relName);

				if ((rel.isCascade()) && (rel.getChild() == null)) {
					Factory.createDataControl(this, rel);
				}

				if ((rel.isCascade())
						&& (rel.getChild() != null)
						&& ( rel.getChild().getCurrentObject() != null)   )
					rel.getChild().removeAll();
			}
		this.pager.remove(currentPosition);
	}

	public String getObjectKey(Object object) {

		StringBuffer key = new StringBuffer();
		Iterator<String> itr = this.getKeys().iterator();
		while (itr.hasNext()) {
			String method = "get" + StringUtils.capitalize(itr.next());
			key.append(Reflection.call(object, method));
			key.append(" ");
		}
		return key.toString();
	}

	public void removeAll() throws Exception {
		T obj = null;
		int i = 0;
		do {
			obj = this.getObject(i * Pager.LOADSTEP);
			if (obj != null)
				removeObject();
			else {
				i++;
				obj = this.getObject(i * Pager.LOADSTEP);
			}
		} while (obj != null);

	}

	public List<T> getList() {
		this.currentPosition = 0;
		return new ObjectIterator<T>(this, pager);
	}

	public synchronized T getObject(int index) {

		T obj = pager.getObject(index);
		this.currentPosition = index;

		return obj;
	}

	public T createObject() {
		// Refresh tree
		getObject(currentPosition);

		// Create a new object
		T objWrp = pager.createObject(currentPosition);

		try {
			if (objWrp != null) {
				if (getParent() != null) {
					BeanWrapper w = ((BeanWrapper) Reflection.call(objWrp,
							"getWrapper"));
					Object obj = w.getObj();

					List<SearchCriteria> ls = getParent()
							.getChildSearchCriteria();
					Iterator<SearchCriteria> itr = ls.iterator();
					while (itr.hasNext()) {
						SearchCriteria sc = itr.next();

						String name = sc.getName();
						String className = sc.getClassName();
						String value = sc.getValue();
						if (value != Constants.UNDEFINED_PARAMETER) {

							String method = "set"
									+ StringUtils.capitalize(name);
							Constructor<?> cons = Class.forName(className)
									.getConstructor(String.class);

							Reflection.call(obj, method,
									cons.newInstance(value));
						}
					}
				}

			}
		} catch (Exception e) {
			logger.log(PlatformConfig.LOGGER_LEVEL, e.getMessage(), e);
			objWrp = null;
		}
		return objWrp;
	}

	public int getCurrentPosition() {
		return currentPosition;
	}

	/**
	 * @return the commandStack
	 */
	public CommandStack getCommandStack() {
		return commandStack;
	}

	/**
	 * @param commandStack
	 *            the commandStack to set
	 */
	public void setCommandStack(CommandStack commandStack) {
		this.commandStack = commandStack;
	}

}
