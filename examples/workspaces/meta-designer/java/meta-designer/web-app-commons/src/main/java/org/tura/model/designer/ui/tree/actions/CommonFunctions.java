/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2026 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.tura.model.designer.ui.tree.actions;

import jakarta.enterprise.context.spi.CreationalContext;
import jakarta.enterprise.inject.spi.Bean;
import jakarta.enterprise.inject.spi.BeanManager;
import jakarta.enterprise.inject.spi.CDI;

import org.tura.model.designer.exchange.CdiAppExchange;
import org.tura.model.designer.repository.serialized.artifact.TechLeaf;
import org.tura.model.designer.repository.serialized.artifact.TechLeafProxy;
import org.tura.model.designer.repository.serialized.type.Type;
import org.tura.model.designer.repository.serialized.type.TypeElement;
import org.tura.model.designer.repository.serialized.type.TypeReference;
import org.tura.model.designer.ui.tree.Crud;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.datacontrol.command.base.OnChangeArtificialFieldTrigger;
import org.tura.platform.datacontrol.commons.Constants;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.repository.core.FieldValue;
import org.tura.platform.repository.core.ObjectControl;
import org.tura.platform.repository.core.RepoKeyPath;
import org.tura.platform.repository.core.RepoObjectKey;
import org.tura.platform.uuiclient.model.TreeModel;
import org.tura.platform.uuiclient.model.ViewModel;
import org.tura.platform.uuiclient.rest.client.commands.EnableTreeEditCommand;
import org.tura.platform.uuiclient.rest.client.commands.ResponseState;
import org.tura.platform.uuiclient.rest.client.commands.UpdateMessage;

public class CommonFunctions {

	public void enableTreeEdit(ResponseState responseState, String treeId) {
		EnableTreeEditCommand cmd = new EnableTreeEditCommand();
		cmd.setTarget(toId(treeId));
		responseState.addCommand(cmd);
	}

	public boolean enableEditButton(String treeId, ViewModel viewModel) throws TuraException {
		String id = treeId;
		Object m = viewModel.getModel(id);
		if (m == null) {
			return false;
		} else {
			TreeModel model = (TreeModel) m;
			Object obj = model.getCurrentNode().getData();
			ObjectControl w = (ObjectControl) obj;
			DataControl<?> dc = (DataControl<?>) w.getObjectControlAttributes().get(Constants.DATA_CONTROL);
			OnChangeArtificialFieldTrigger trg = dc.getOnChangeArtificialFieldTrigger();
			if (trg != null) {
				if (trg instanceof Crud) {
					return ((Crud) trg).isEditable(model.getTreeDataControl(), dc, w);
				} else {
					return false;
				}
			} else {
				return false;
			}
		}
	}

	public boolean enableCreateChildrenButton(String treeId, ViewModel viewModel) throws TuraException {
		String id = treeId;
		Object m = viewModel.getModel(id);
		if (m == null) {
			return false;
		} else {
			TreeModel model = (TreeModel) m;
			Object obj = model.getCurrentNode().getData();
			ObjectControl w = (ObjectControl) obj;
			DataControl<?> dc = (DataControl<?>) w.getObjectControlAttributes().get(Constants.DATA_CONTROL);
			OnChangeArtificialFieldTrigger trg = dc.getOnChangeArtificialFieldTrigger();
			if (trg != null) {
				if (trg instanceof Crud) {
					return ((Crud) trg).isEnableToCreateChildren(model.getTreeDataControl(), dc, w);
				} else {
					return false;
				}
			} else {
				return false;
			}
		}
	}

	public boolean enableDeleteButton(String treeId, ViewModel viewModel) throws TuraException {
		String id = treeId;
		Object m = viewModel.getModel(id);
		if (m == null) {
			return false;
		} else {
			TreeModel model = (TreeModel) m;
			Object obj = model.getCurrentNode().getData();
			ObjectControl w = (ObjectControl) obj;
			DataControl<?> dc = (DataControl<?>) w.getObjectControlAttributes().get(Constants.DATA_CONTROL);
			OnChangeArtificialFieldTrigger trg = dc.getOnChangeArtificialFieldTrigger();
			if (trg != null) {
				if (trg instanceof Crud) {
					return ((Crud) trg).isEnableToDelete(model.getTreeDataControl(), dc, w);
				} else {
					return false;
				}
			} else {
				return false;
			}
		}
	}

	public void createChildren(String treeId, ViewModel viewModel, String childType) throws TuraException {
		String id = treeId;
		Object m = viewModel.getModel(id);
		if (m == null) {
			return;
		} else {
		}
		TreeModel model = (TreeModel) m;
		Object obj = model.getCurrentNode().getData();
		ObjectControl w = (ObjectControl) obj;
		DataControl<?> dc = (DataControl<?>) w.getObjectControlAttributes().get(Constants.DATA_CONTROL);
		OnChangeArtificialFieldTrigger trg = dc.getOnChangeArtificialFieldTrigger();
		if (trg != null) {
			if (trg instanceof Crud) {
				((Crud) trg).createChildren(model.getTreeDataControl(), dc, w, childType);
			} else {
				return;
			}
		} else {
			return;
		}
	}

	public void delete(String treeId, ViewModel viewModel) throws TuraException {
		String id = treeId;
		Object m = viewModel.getModel(id);
		if (m == null) {
			return;
		} else {
		}
		TreeModel model = (TreeModel) m;
		Object obj = model.getCurrentNode().getData();
		ObjectControl w = (ObjectControl) obj;
		DataControl<?> dc = (DataControl<?>) w.getObjectControlAttributes().get(Constants.DATA_CONTROL);
		OnChangeArtificialFieldTrigger trg = dc.getOnChangeArtificialFieldTrigger();
		if (trg != null) {
			if (trg instanceof Crud) {
				((Crud) trg).delete(model.getTreeDataControl(), dc, w);
			} else {
				return;
			}
		} else {
			return;
		}
	}

	public void addInfomessage(ResponseState responseState, String key, ELResolver elResolver, String messageId) {
		UpdateMessage cmd = new UpdateMessage();
		cmd.setTarget(toId(messageId));
		cmd.setSeverity("info");
		cmd.setMessage("Info");
		cmd.setDetails((String) elResolver.getValue("#{Navigator['" + key + "']}"));
		responseState.addCommand(cmd);
	}

	public void addErrormessage(ResponseState responseState, String key, ELResolver elResolver, String messageId) {
		UpdateMessage cmd = new UpdateMessage();
		cmd.setTarget(toId(messageId));
		cmd.setSeverity("error");
		cmd.setMessage("Erroe");
		cmd.setDetails((String) elResolver.getValue("#{Navigator['" + key + "']}"));
		responseState.addCommand(cmd);
	}

	public static String toId(String turaId) {
		return turaId.replaceAll("tura", "").replaceAll("_", "\\-");
	}

	public static String fromd(String turaId) {
		return  "tura"+turaId.replace("-", "_");
	}

	
	public static String techFullPath(TechLeaf leaf) {
		TechLeafProxy proxyLeaf = (TechLeafProxy) leaf;
		Object parent = proxyLeaf.eContainer();
		if (parent instanceof TechLeaf) {
			return techFullPath((TechLeaf) parent) + "/" + leaf.getName();
		} else {
			return "/" + proxyLeaf.getName();
		}
	}

	public static String TechLeaf2String(TechLeaf l1) {
		String technologyValue = null;
		if (l1 != null) {
			technologyValue = l1.getName();
			Object obj2 = ((TechLeafProxy) l1).eContainer();
			if (obj2 instanceof TechLeaf) {
				TechLeafProxy l2 = (TechLeafProxy) obj2;
				technologyValue = l2.getName() + "\\" + technologyValue;
				Object obj3 = l2.eContainer();
				if (obj3 instanceof TechLeaf) {
					TechLeafProxy l3 = (TechLeafProxy) obj3;
					technologyValue = l3.getName() + "\\" + technologyValue;
				}
			}
		}
		return technologyValue;
	}

	
	public static RepoKeyPath buildKey(String uid, Class<?> clazz) {
		
		RepoObjectKey repoKey = new RepoObjectKey();
		repoKey.setType(clazz.getName());
	    FieldValue value = new FieldValue("Uid", "java.lang.String", uid);
	    repoKey.addValue(value);
		
	    RepoKeyPath path = new RepoKeyPath();
	    path.addRepoObjectKey(null, repoKey);

	    return path;
	    
	}
	
	
	public static Type getType( TypeElement te) {
		if ( te instanceof Type) {
			return (Type) te;
		}
		if ( te instanceof TypeReference) {
			return (Type) ((TypeReference)te).getTypeRef();
		}
		return null;
	}
	
	
	public static ResponseState getResponseState() {
		BeanManager bm = CDI.current().getBeanManager();
		@SuppressWarnings("unchecked")
		Bean<ResponseState> bean = (Bean<ResponseState>) bm.getBeans(ResponseState.class).iterator().next();
		CreationalContext<?> ctx = bm.createCreationalContext(bean);
		ResponseState response = (ResponseState) bm.getReference(bean, ResponseState.class, ctx);
		return response;
	}
	
	public static CdiAppExchange getCdiAppExchange() {
		BeanManager bm = CDI.current().getBeanManager();
		@SuppressWarnings("unchecked")
		Bean<CdiAppExchange> bean = (Bean<CdiAppExchange>) bm.getBeans(CdiAppExchange.class).iterator().next();
		CreationalContext<?> ctx = bm.createCreationalContext(bean);
		CdiAppExchange exchange = (CdiAppExchange) bm.getReference(bean, CdiAppExchange.class, ctx);
		return exchange;
	}

	
	
}
