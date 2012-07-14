/*******************************************************************************
 * Copyright 2012 Arseniy Isakov
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
 ******************************************************************************/
package org.elsoft.platform.metamodel.processor.uicontainer.model;

import org.elsoft.platform.metamodel.PersistentInterface;
import org.elsoft.platform.metamodel.general.CreateFormDAO;
import org.elsoft.platform.metamodel.processor.CommandHandler;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateForm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;

public class Form extends PersistentInterface {

	private String name;
	private String uuid = UUID.randomUUID().toString();
	private HashMap<String,DataLink> datalink = new HashMap<String,DataLink>();
	private ArrayList<Window> windows = new ArrayList<Window>();
	private ArrayList<Canvas> canvases = new ArrayList<Canvas>();
	private String domain;
	private String functionalDomain;
	private String application;
	

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getFunctionalDomain() {
		return functionalDomain;
	}

	public void setFunctionalDomain(String functionalDomain) {
		this.functionalDomain = functionalDomain;
	}

	public String getApplication() {
		return application;
	}

	public void setApplication(String application) {
		this.application = application;
	}

	public Form(CreateFormDAO command, HashMap<String, Object> context) {
          setUuid(command.getUUID());
          setName(command.getFormName());
          setDomain(command.getDomain());
          setFunctionalDomain(command.getFunctionalDomain());
          setApplication(command.getApplication());
	}

	@Override
	protected void serialize(CommandHandler ch) throws Exception {
		CreateForm.save(ch, null, this);
		Iterator<DataLink> itr = datalink.values().iterator();
		while (itr.hasNext()) {
			DataLink lnk = itr.next();
			lnk.serialize(ch);
		}

		itr = datalink.values().iterator();
		while (itr.hasNext()) {
			DataLink lnk = itr.next();
			if (lnk.getRelation() != null) {
				Iterator<Relation> itrRel = lnk.getRelation().iterator();
				while (itrRel.hasNext()) {
					Relation rel = itrRel.next();
					rel.serialize(ch);
				}
			}
		}
		Iterator<Canvas> itrCanvas = canvases.iterator();
		while (itrCanvas.hasNext()) {
			Canvas canvas = itrCanvas.next();
			canvas.serialize(ch);
		}

		Iterator<Window> itrWin = windows.iterator();
		while (itrWin.hasNext()) {
			Window win = itrWin.next();
			win.serialize(ch);
		}

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public void addDataLink(DataLink datalink) {
		datalink.setParentUuid(this.uuid);
		this.datalink.put(datalink.getName(),datalink);
	}

	public void addWindow(Window win) {
		win.setParentUuid(this.uuid);
		this.windows.add(win);
	}

	public void addCanvas(Canvas canvas) {
		canvas.setParentUuid(this.uuid);
		this.canvases.add(canvas);
	}

	public ArrayList<Window> getWindows() {
		return windows;
	}

	public ArrayList<Canvas> getCanvases() {
		return canvases;
	}

	public Collection<DataLink> getDatalinks() {
		return this.datalink.values();
	}
}
