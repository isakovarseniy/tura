package sales.analyzer.service.jbpm.commands;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.core.RepoKeyPath;
import org.tura.platform.repository.core.RepoObjectKey;
import org.tura.platform.repository.core.RepositoryCommandType;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.core.SearchProvider;
import org.tura.platform.repository.persistence.PersistanceMapper;
import org.tura.platform.repository.spa.OperationLevel;
import org.tura.platform.repository.spa.SpaControl;
import org.tura.platform.repository.spa.SpaObjectRegistry;
import org.tura.platform.repository.spa.SpaRepositoryCommand;
import org.tura.salesanalyzer.serialized.jbpm.CaseProcess;

import sales.analyzer.api.model.impl.SalesAnalyzerProcessInstance;
import sales.analyzer.api.model.impl.SalesAnalyzerTaskInstance;
import sales.analyzer.api.model.impl.TaskComletion;

public class TaskCompletionCommand extends SpaRepositoryCommand {

	private RepoObjectKey pk;
	private RepoKeyPath extendedPk;
	private String property;
	private Object value;
	private String objectType;
	private String persistanceType;

	
	public TaskCompletionCommand(Registry registry, SpaObjectRegistry spaRegistry) {
		super(registry, spaRegistry);
	}

	@Override
	public boolean checkCommand(RepositoryCommandType cmdType, Object... parameters) throws RepositoryException {
		if (!RepositoryCommandType.update.equals(cmdType)) {
			return false;
		}
		extendedPk = (RepoKeyPath) parameters[0];
		pk = extendedPk.getPath().get(0);
		property = (String) parameters[1];
		value = parameters[2];

		objectType = pk.getType();
		RepoObjectKey updatedObjPk = extendedPk.getPath().get(extendedPk.getPath().size()-1);
		String updatedObjType = updatedObjPk.getType();
		if (CaseProcess.class.getName().equals(updatedObjType)) {
			if (property.equals("CompleteTask")) {
				persistanceType = registry.findPersistanceClass(objectType);
				this.knownObjects.add(persistanceType);
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	@Override
	public List<SpaControl> prepare() throws RepositoryException {
		try {

			SearchProvider sp = this.providerHash.get(persistanceType);
			PersistanceMapper mapper = findPersistanceMapper(Class.forName(objectType));

			Object persistanceObject = sp.find(mapper.getPKey(pk), persistanceType);
			if (persistanceObject == null) {
				throw new RepositoryException("Could not find the object with primary key " + pk.toString());
			}
			Object extendedPersistanceMasterObject = getExtendedObject(extendedPk,persistanceObject);
			
			SalesAnalyzerProcessInstance process = (SalesAnalyzerProcessInstance) extendedPersistanceMasterObject;
			SalesAnalyzerTaskInstance task = process.getActiveUserTasks().iterator().next();
			
			TaskComletion cmd = new TaskComletion();
			cmd.setProcessInstanceId(process.getId());
			cmd.setTaskId(task.getId());
			
			if (AssignActorCommand.TASK2_NAME.equals(task.getName())) {
				cmd.setDirection((Integer) value);
			}

			SpaControl control = new SpaControl(cmd, UUID.randomUUID().toString(), OperationLevel.OPERATION);

			List<SpaControl> list = new ArrayList<>();
			list.add(control);
			return list;

		} catch (Exception e) {
			throw new RepositoryException(e);
		}
	}

}