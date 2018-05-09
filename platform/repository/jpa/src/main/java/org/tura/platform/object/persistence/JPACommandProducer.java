package org.tura.platform.object.persistence;

import java.util.ArrayList;
import java.util.List;

import org.tura.platform.object.persistence.data.ConnectData;
import org.tura.platform.object.persistence.data.DisconnectData;
import org.tura.platform.object.persistence.data.PersistData;
import org.tura.platform.object.persistence.data.RemoveData;
import org.tura.platform.object.persistence.data.UpdateData;
import org.tura.platform.repository.CommandProducer;
import org.tura.platform.repository.RepoKeyPath;

public abstract class JPACommandProducer implements CommandProducer{

	public abstract  Object getPrimaryKey(RepoKeyPath pk);
	public abstract String getRelationType(RepoKeyPath pk, String property);
	public abstract  String getPersistanceClassName(RepoKeyPath masterPk) ;
	
	
	@Override
	public List<Object> removeObject(Object repositoryObject) {
		ArrayList<Object> list = new ArrayList<>();
		RemoveData data = new RemoveData();
		data.setObject(repositoryObject);
		list.add(data);
		return list;
	}

	@Override
	public List<Object> removeInternal(RepoKeyPath masterPk, String masterProperty, Object detailObject,String detailProperty) {
		throw new UnsupportedOperationException();
	}

	@Override
	public List<Object> addObject(Object repositoryObject) {
		ArrayList<Object> list = new ArrayList<>();
		PersistData data = new PersistData();
		data.setObject(repositoryObject);
		list.add(data);
		return list;
	}

	@Override
	public List<Object> addInternal(RepoKeyPath masterPk, String masterProperty, Object detailObject,
			String detailProperty) {
		throw new UnsupportedOperationException();
	}

	@Override
	public List<Object> disconnectMasterFromDetail(RepoKeyPath masterPk, String masterProperty, RepoKeyPath detailPk,
			String detailProperty) {
		ArrayList<Object> list = new ArrayList<>();
		
		DisconnectData data = new DisconnectData();
		data.setMasterPk(getPrimaryKey(masterPk));
		data.setMasterProperty(masterProperty);
		data.setMasterClassName(getPersistanceClassName(masterPk));
		data.setDetailPk(getPrimaryKey(detailPk));
		data.setDetailClassName(getPersistanceClassName(detailPk));

		list.add(data);
		return list;
	}

	
	@Override
	public List<Object> disconnectDetailFromMaster(RepoKeyPath masterPk, String masterProperty, RepoKeyPath detailPk,
			String detailProperty) {
		ArrayList<Object> list = new ArrayList<>();
		
		DisconnectData data = new DisconnectData();
		data.setMasterPk(getPrimaryKey(detailPk));
		data.setMasterProperty(detailProperty);
		data.setMasterClassName(getPersistanceClassName(detailPk));

		data.setDetailPk(getPrimaryKey(masterPk));
		data.setDetailClassName(getPersistanceClassName(masterPk));

		list.add(data);
		return list;
	}

	@Override
	public List<Object> connectMasterToDetail(RepoKeyPath masterPk, String masterProperty, RepoKeyPath detailPk,
			String detailProperty) {
		ArrayList<Object> list = new ArrayList<>();
		
		ConnectData data = new ConnectData();
		data.setMasterPk(getPrimaryKey(masterPk));
		data.setMasterProperty(masterProperty);
		data.setMasterClassName(getPersistanceClassName(masterPk));
		data.setDetailPk(getPrimaryKey(detailPk));
		data.setDetailClassName(getPersistanceClassName(detailPk));

		list.add(data);
		return list;
	}

	@Override
	public List<Object> connectDetailToMaster(RepoKeyPath masterPk, String masterProperty, RepoKeyPath detailPk,
			String detailProperty) {
		ArrayList<Object> list = new ArrayList<>();
		
		ConnectData data = new ConnectData();
		data.setMasterPk(getPrimaryKey(detailPk));
		data.setMasterProperty(detailProperty);
		data.setMasterClassName(getPersistanceClassName(detailPk));

		data.setDetailPk(getPrimaryKey(masterPk));
		data.setDetailClassName(getPersistanceClassName(masterPk));

		list.add(data);
		return list;
	}

	@Override
	public List<Object> update(RepoKeyPath pk, String property, Object value) {
		ArrayList<Object> list = new ArrayList<>();
		
		UpdateData data = new UpdateData();
		data.setProperty(property);
		data.setValue(value);
		data.setClassName(pk.getPath().get(0).getType());
		data.setPk(getPrimaryKey(pk));
		
		list.add(data);
		
		return list;
	}


}
