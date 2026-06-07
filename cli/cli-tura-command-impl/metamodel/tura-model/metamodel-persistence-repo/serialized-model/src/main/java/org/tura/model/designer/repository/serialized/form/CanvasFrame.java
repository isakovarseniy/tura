/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2026 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
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
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.ArrayList;
import java.util.List;
import org.tura.platform.repository.core.annotation.Association;
import org.tura.platform.repository.core.annotation.Links;
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
      value = org.tura.model.designer.repository.serialized.form.PopupCanvas.class,
      name = "PopupCanvas"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.OverlayCanvas.class,
      name = "OverlayCanvas"),
  @Type(value = org.tura.model.designer.repository.serialized.form.Canvas.class, name = "Canvas"),
  @Type(value = org.tura.model.designer.repository.serialized.form.Window.class, name = "Window"),
  @Type(
      value = org.tura.model.designer.repository.serialized.form.TabCanvas.class,
      name = "TabCanvas"),
  @Type(value = org.tura.model.designer.repository.serialized.form.TabPage.class, name = "TabPage")
})
public class CanvasFrame implements Serializable, StyleElement {

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

  @JsonIgnore
  public boolean isInMemory() {
    throw new UnsupportedOperationException();
  }

  @JsonIgnore
  public CanvasFrame inMemory() {
    throw new UnsupportedOperationException();
  }

  private String uid;

  public String getUid() {
    return uid;
  }

  public void setUid(java.lang.String uid) {
    this.uid = uid;
  }

  private String name;

  public String getName() {
    return name;
  }

  public void setName(java.lang.String name) {
    this.name = name;
  }

  private String transientrefCanvasesViews;

  public String getTransientrefCanvasesViews() {
    return transientrefCanvasesViews;
  }

  public void setTransientrefCanvasesViews(java.lang.String transientrefCanvasesViews) {
    this.transientrefCanvasesViews = transientrefCanvasesViews;
  }

  private List<ViewInheritance> opTargetViewInheritance = new ArrayList<>();

  @Association(
      id = "63e52612-c3bc-446e-ac0a-d59ede1b321a",
      from = org.tura.model.designer.repository.serialized.form.CanvasFrame.class,
      mappedBy = org.tura.model.designer.repository.serialized.form.ViewInheritance.class,
      property = "target",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  @Links(
      type = "src",
      links = {
        @org.tura.platform.repository.core.annotation.Link(
            field1 = "uid",
            field2 = "refOpTargetViewInheritanceCanvasFrame",
            field1Suffix = "",
            field2Suffix = "")
      })
  public List<ViewInheritance> getOpTargetViewInheritance() {
    return opTargetViewInheritance;
  }

  public void setOpTargetViewInheritance(java.util.List<ViewInheritance> opTargetViewInheritance) {
    this.opTargetViewInheritance = opTargetViewInheritance;
  }

  private Views opCanvasesViews;

  @Association(
      id = "b0db9024-d29b-4921-a814-6e7b553ffea0",
      from = org.tura.model.designer.repository.serialized.form.CanvasFrame.class,
      mappedBy = org.tura.model.designer.repository.serialized.form.Views.class,
      property = "canvases",
      containment = false,
      type = "One2Many",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Opposite)
  @Links(
      type = "trg",
      links = {
        @org.tura.platform.repository.core.annotation.Link(
            field1 = "uid",
            field2 = "refCanvasesViews",
            field1Suffix = "",
            field2Suffix = "")
      })
  public Views getOpCanvasesViews() {
    return opCanvasesViews;
  }

  public void setOpCanvasesViews(
      org.tura.model.designer.repository.serialized.form.Views opCanvasesViews) {
    this.opCanvasesViews = opCanvasesViews;
  }

  private String suidStyleElement;

  public String getSuidStyleElement() {
    return suidStyleElement;
  }

  public void setSuidStyleElement(java.lang.String suidStyleElement) {
    this.suidStyleElement = suidStyleElement;
  }

  private Context style;

  @Association(
      id = "b04e4269-0ab9-4463-bc8b-9717bae47ec6",
      from = org.tura.model.designer.repository.serialized.form.StyleElement.class,
      mappedBy = org.tura.model.designer.repository.serialized.form.Context.class,
      property = "opStyleStyleElement",
      containment = true,
      type = "One2One",
      lazy = true,
      direction = org.tura.platform.repository.core.RelationType.Direct)
  @Links(
      type = "src",
      links = {
        @org.tura.platform.repository.core.annotation.Link(
            field1 = "suid",
            field2 = "refStyleStyleElement",
            field1Suffix = "StyleElement",
            field2Suffix = "")
      })
  public Context getStyle() {
    return style;
  }

  public void setStyle(org.tura.model.designer.repository.serialized.form.Context style) {
    this.style = style;
  }
}
