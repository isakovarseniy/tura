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

package org.tura.model.designer.repository.neoj4.form;

import java.io.Serializable;
import org.tura.platform.repository.persistence.TypeAware;
import org.tura.model.designer.repository.neoj4.metabase.MetaObject;
import org.neo4j.ogm.annotation.Index;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class LinkToMessage implements Serializable, TypeAware, MetaObject {

  private static final long serialVersionUID = 1L;

  @org.neo4j.ogm.annotation.Property(name = "SUID")
  @Index
  protected String suid = java.util.UUID.randomUUID().toString();

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.neoj4.form.LinkToMessage.class;
  }

  @Id @GeneratedValue Long __id;

  @org.neo4j.ogm.annotation.Version
  @org.neo4j.ogm.annotation.Property(name = "V_LINKTOMESSAGE")
  private long vLinkToMessage;

  public long getVlinkToMessage() {
    return vLinkToMessage;
  }

  public void setVlinkToMessage(long vLinkToMessage) {
    this.vLinkToMessage = vLinkToMessage;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "UID")
  private String uid;

  public void setUid(java.lang.String uid) {
    this.uid = uid;
  }

  public String getUid() {
    return uid;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_LINK_TO_MESSAGES_VIEW_AREA")
  private String refLinkToMessagesViewArea;

  public void setRefLinkToMessagesViewArea(java.lang.String refLinkToMessagesViewArea) {
    this.refLinkToMessagesViewArea = refLinkToMessagesViewArea;
  }

  public String getRefLinkToMessagesViewArea() {
    return refLinkToMessagesViewArea;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_OP_SOURCE_LINK_TO_MESSAGE_INPUT_ELEMENT")
  private String refOpSourceLinkToMessageInputElement;

  public void setRefOpSourceLinkToMessageInputElement(
      java.lang.String refOpSourceLinkToMessageInputElement) {
    this.refOpSourceLinkToMessageInputElement = refOpSourceLinkToMessageInputElement;
  }

  public String getRefOpSourceLinkToMessageInputElement() {
    return refOpSourceLinkToMessageInputElement;
  }

  @Index
  @org.neo4j.ogm.annotation.Property(name = "REF_OP_TARGET_LINK_TO_MESSAGE_MESSAGE_ELEMENT")
  private String refOpTargetLinkToMessageMessageElement;

  public void setRefOpTargetLinkToMessageMessageElement(
      java.lang.String refOpTargetLinkToMessageMessageElement) {
    this.refOpTargetLinkToMessageMessageElement = refOpTargetLinkToMessageMessageElement;
  }

  public String getRefOpTargetLinkToMessageMessageElement() {
    return refOpTargetLinkToMessageMessageElement;
  }

  public void setSuidMetaObject(java.lang.String suid) {}

  public String getSuidMetaObject() {
    return this.suid;
  }

  public void setSuid(java.lang.String suid) {}

  public String getSuid() {
    return this.suid;
  }
}
