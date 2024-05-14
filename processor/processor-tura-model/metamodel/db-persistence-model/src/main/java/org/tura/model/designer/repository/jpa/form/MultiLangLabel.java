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

package org.tura.model.designer.repository.jpa.form;

import java.io.Serializable;
import org.tura.platform.repository.persistence.TypeAware;
import org.tura.platform.object.JpaDomainInterfaceSetter;
import org.tura.platform.repository.persistence.CastTo;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.OneToOne;
import org.tura.platform.repository.core.RepositoryException;
import javax.persistence.Entity;

@Entity(name = "MultiLangLabel")
@javax.persistence.Table(name = "MULTILANGLABEL")
public class MultiLangLabel implements Serializable, TypeAware, JpaDomainInterfaceSetter, CastTo {

  private static final long serialVersionUID = 1L;

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.jpa.form.MultiLangLabel.class;
  }

  @Id
  @GeneratedValue(generator = "UUID")
  @GenericGenerator(name = "UUID", strategy = "org.tura.jpa.id.UUIDGenerator")
  @javax.persistence.Column(name = "SUID")
  private String suid;

  public void setSuid(java.lang.String suid) {
    this.suid = suid;
  }

  public String getSuid() {
    return suid;
  }

  @javax.persistence.Version
  @javax.persistence.Column(name = "V_MULTILANGLABEL")
  private int vMultiLangLabel;

  public int getVmultiLangLabel() {
    return vMultiLangLabel;
  }

  public void setVmultiLangLabel(int vMultiLangLabel) {
    this.vMultiLangLabel = vMultiLangLabel;
  }

  @OneToOne(mappedBy = "opMultiLangLabelMultiLangLabel", fetch = javax.persistence.FetchType.LAZY)
  private Context multiLangLabel;

  public Context getMultiLangLabel() {
    return multiLangLabel;
  }

  public void setMultiLangLabel(
      org.tura.model.designer.repository.jpa.form.Context multiLangLabel) {
    this.multiLangLabel = multiLangLabel;
  }

  @Override
  public <T> T castTo(Class<T> clazz) throws RepositoryException {
    return ((CastTo) getObject()).castTo(clazz);
  }

  @OneToOne(mappedBy = "inhMultiLangLabel", fetch = javax.persistence.FetchType.LAZY)
  private PopupCanvas clPopupCanvas;

  @OneToOne(mappedBy = "inhMultiLangLabel", fetch = javax.persistence.FetchType.LAZY)
  private OverlayCanvas clOverlayCanvas;

  @OneToOne(mappedBy = "inhMultiLangLabel", fetch = javax.persistence.FetchType.LAZY)
  private Canvas clCanvas;

  @OneToOne(mappedBy = "inhMultiLangLabel", fetch = javax.persistence.FetchType.LAZY)
  private Window clWindow;

  @OneToOne(mappedBy = "inhMultiLangLabel", fetch = javax.persistence.FetchType.LAZY)
  private TabCanvas clTabCanvas;

  @OneToOne(mappedBy = "inhMultiLangLabel", fetch = javax.persistence.FetchType.LAZY)
  private TabPage clTabPage;

  @OneToOne(mappedBy = "inhMultiLangLabel", fetch = javax.persistence.FetchType.LAZY)
  private Label clLabel;

  @OneToOne(mappedBy = "inhMultiLangLabel", fetch = javax.persistence.FetchType.LAZY)
  private MessageElement clMessageElement;

  @OneToOne(mappedBy = "inhMultiLangLabel", fetch = javax.persistence.FetchType.LAZY)
  private Button clButton;

  @OneToOne(mappedBy = "inhMultiLangLabel", fetch = javax.persistence.FetchType.LAZY)
  private Column clColumn;

  @OneToOne(mappedBy = "inhMultiLangLabel", fetch = javax.persistence.FetchType.LAZY)
  private Table clTable;

  @OneToOne(mappedBy = "inhMultiLangLabel", fetch = javax.persistence.FetchType.LAZY)
  private Menu clMenu;

  @OneToOne(mappedBy = "inhMultiLangLabel", fetch = javax.persistence.FetchType.LAZY)
  private FileDownload clFileDownload;

  @OneToOne(mappedBy = "inhMultiLangLabel", fetch = javax.persistence.FetchType.LAZY)
  private DataScroller clDataScroller;

  @OneToOne(mappedBy = "inhMultiLangLabel", fetch = javax.persistence.FetchType.LAZY)
  private TimeLine clTimeLine;

  @OneToOne(mappedBy = "inhMultiLangLabel", fetch = javax.persistence.FetchType.LAZY)
  private MenuElement clMenuElement;

  @OneToOne(mappedBy = "inhMultiLangLabel", fetch = javax.persistence.FetchType.LAZY)
  private MenuFolder clMenuFolder;

  @OneToOne(mappedBy = "inhMultiLangLabel", fetch = javax.persistence.FetchType.LAZY)
  private Tree clTree;

  @javax.persistence.Column(name = "INH_SWITCH")
  private String inhSwitch;

  public Object getObject() {
    if (inhSwitch == null) {
      return this;
    }
    if (clPopupCanvas != null) {
      return clPopupCanvas.getObject();
    }
    if (clOverlayCanvas != null) {
      return clOverlayCanvas.getObject();
    }
    if (clCanvas != null) {
      return clCanvas.getObject();
    }
    if (clWindow != null) {
      return clWindow.getObject();
    }
    if (clTabCanvas != null) {
      return clTabCanvas.getObject();
    }
    if (clTabPage != null) {
      return clTabPage.getObject();
    }
    if (clLabel != null) {
      return clLabel.getObject();
    }
    if (clMessageElement != null) {
      return clMessageElement.getObject();
    }
    if (clButton != null) {
      return clButton.getObject();
    }
    if (clColumn != null) {
      return clColumn.getObject();
    }
    if (clTable != null) {
      return clTable.getObject();
    }
    if (clMenu != null) {
      return clMenu.getObject();
    }
    if (clFileDownload != null) {
      return clFileDownload.getObject();
    }
    if (clDataScroller != null) {
      return clDataScroller.getObject();
    }
    if (clTimeLine != null) {
      return clTimeLine.getObject();
    }
    if (clMenuElement != null) {
      return clMenuElement.getObject();
    }
    if (clMenuFolder != null) {
      return clMenuFolder.getObject();
    }
    if (clTree != null) {
      return clTree.getObject();
    }
    return this;
  }

  public void setObject(Object obj) {
    if (obj != null) {
      inhSwitch = obj.getClass().getName();
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.PopupCanvas")) {
        clPopupCanvas = (PopupCanvas) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.OverlayCanvas")) {
        clOverlayCanvas = (OverlayCanvas) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.Canvas")) {
        clCanvas = (Canvas) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.Window")) {
        clWindow = (Window) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.TabCanvas")) {
        clTabCanvas = (TabCanvas) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.TabPage")) {
        clTabPage = (TabPage) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.Label")) {
        clLabel = (Label) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.MessageElement")) {
        clMessageElement = (MessageElement) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.Button")) {
        clButton = (Button) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.Column")) {
        clColumn = (Column) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.Table")) {
        clTable = (Table) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.Menu")) {
        clMenu = (Menu) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.FileDownload")) {
        clFileDownload = (FileDownload) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.DataScroller")) {
        clDataScroller = (DataScroller) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.TimeLine")) {
        clTimeLine = (TimeLine) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.MenuElement")) {
        clMenuElement = (MenuElement) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.MenuFolder")) {
        clMenuFolder = (MenuFolder) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.Tree")) {
        clTree = (Tree) obj;
      }
    }
  }
}
