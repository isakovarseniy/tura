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
package org.elsoft.windowbuilder;

import org.elsoft.windowbuilder.reader.Reader;

public enum ElementBuilder {
	Shell(org.elsoft.windowbuilder.reader.ShellReader.class),
	Composite(org.elsoft.windowbuilder.reader.CompositeReader.class),
	Composite_layout(org.elsoft.windowbuilder.reader.CompositeLayoutReader.class),
	GridLayout(org.elsoft.windowbuilder.reader.GridLayoutReader.class),
	ViewPort(org.elsoft.windowbuilder.reader.ViewPortReader.class),
	MetaTable(org.elsoft.windowbuilder.reader.TableReader.class),
	MetaTableColumn(org.elsoft.windowbuilder.reader.TableColumnReader.class),
	MetaAction(org.elsoft.windowbuilder.reader.ButtonReader.class),
	MetaInputText(org.elsoft.windowbuilder.reader.TextReader.class),
	TabFolder(org.elsoft.windowbuilder.reader.TabFolderReader.class),
	TabItem(org.elsoft.windowbuilder.reader.TabItemReader.class),
	TabItem_control(org.elsoft.windowbuilder.reader.TabItemControlReader.class),
	MetaDropDown(org.elsoft.windowbuilder.reader.DropDownReader.class),
	Label(org.elsoft.windowbuilder.reader.LabelReader.class),
	MetaTree(org.elsoft.windowbuilder.reader.TreeReader.class),
	MetaTreeColumn(org.elsoft.windowbuilder.reader.TreeColumnReader.class),
	DataDefinition(org.elsoft.windowbuilder.reader.DataDefinitionReader.class),
	DataControl(org.elsoft.windowbuilder.reader.DataControlReader.class),
	Relation(org.elsoft.windowbuilder.reader.RelationReader.class),
	Link(org.elsoft.windowbuilder.reader.LinkReader.class),
	DefaultOrderBy(org.elsoft.windowbuilder.reader.DefaultOrderByReader.class),
	DefaultSearch(org.elsoft.windowbuilder.reader.DefaultSearchReader.class),
	MetaLOV(org.elsoft.windowbuilder.reader.LOVReader.class),
	LovDisplayField(org.elsoft.windowbuilder.reader.LovDisplayFieldReader.class),
	LovReturnField(org.elsoft.windowbuilder.reader.LovReturnFieldReader.class),
	Trigger(org.elsoft.windowbuilder.reader.TriggerReader.class),
	MetaFieldSet(org.elsoft.windowbuilder.reader.FieldSetReader.class),
	ArtificialField(org.elsoft.windowbuilder.reader.ArtifitialFieldReader.class),
	DrugAndDrop(org.elsoft.windowbuilder.reader.DrugAndDropReader.class),
	MetaImage(org.elsoft.windowbuilder.reader.ImageReader.class),
	MetaCheckbox(org.elsoft.windowbuilder.reader.CheckboxReader.class),
	Dependency( org.elsoft.windowbuilder.reader.DependencyReader.class)
	;
	
	Class<?> clazz; 
	ElementBuilder(Class<?> clazz){
		this.clazz=clazz;
	}
	
	public Reader getInstance() throws Exception{
		return (Reader) clazz.newInstance();
	}

}
