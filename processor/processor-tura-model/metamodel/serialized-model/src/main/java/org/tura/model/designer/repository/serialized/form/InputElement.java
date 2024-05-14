/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2024 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.model.designer.repository.serialized.form;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.tura.platform.repository.core.annotation.Association;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonSubTypes;

@JsonIdentityInfo(
    generator = com.fasterxml.jackson.annotation.ObjectIdGenerators.PropertyGenerator.class,
    property = "serializationid")
@JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "@class")
@JsonSubTypes({
  @Type(
      value = org.tura.model.designer.repository.serialized.form.InputText.class,
      name = "InputText"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.Password.class,
      name = "Password"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.OutputText.class,
      name = "OutputText"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.CheckBox.class,
      name = "CheckBox"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.DropDownSelection.class,
      name = "DropDownSelection"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.RadioSelection.class,
      name = "RadioSelection"),
  @Type(value = org.tura.model.designer.repository.serialized.form.Image.class, name = "Image"),
  @Type(value = org.tura.model.designer.repository.serialized.form.Date.class, name = "Date"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.DataExporter.class,
      name = "DataExporter"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.DataTemplate.class,
      name = "DataTemplate")
})
public class InputElement extends SourcesPointer implements Serializable {

  private static final long serialVersionUID = 1L;

  private Boolean attached;

  public Boolean getAttached() {
    return attached;
  }

  public void setAttached(Boolean value) {
    this.attached = value;
  }

  private String serializationid;

  public String getSerializationid() {
    return serializationid;
  }

  public void setSerializationid(String value) {
    this.serializationid = value;
  }

  private String cpaid;

  public String getCpaid() {
    return cpaid;
  }

  public void setCpaid(String value) {
    this.cpaid = value;
  }

  private List<LinkToMessage> opSourceLinkToMessage = new ArrayList<>();

  @Association(
      id = "12a67221-e9b2-4ce1-82ee-da66d710affb",
      from = org.tura.model.designer.repository.serialized.form.InputElement.class,
      mappedBy = org.tura.model.designer.repository.serialized.form.LinkToMessage.class,
      property = "source",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public List<LinkToMessage> getOpSourceLinkToMessage() {
    return opSourceLinkToMessage;
  }

  public void setOpSourceLinkToMessage(java.util.List<LinkToMessage> opSourceLinkToMessage) {
    this.opSourceLinkToMessage = opSourceLinkToMessage;
  }

  private List<LinkToLabel> opSourceLinkToLabel = new ArrayList<>();

  @Association(
      id = "47951375-a738-466e-bfdd-c1fdff45ed86",
      from = org.tura.model.designer.repository.serialized.form.InputElement.class,
      mappedBy = org.tura.model.designer.repository.serialized.form.LinkToLabel.class,
      property = "source",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  public List<LinkToLabel> getOpSourceLinkToLabel() {
    return opSourceLinkToLabel;
  }

  public void setOpSourceLinkToLabel(java.util.List<LinkToLabel> opSourceLinkToLabel) {
    this.opSourceLinkToLabel = opSourceLinkToLabel;
  }
}
