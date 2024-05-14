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
import org.tura.platform.repository.persistence.CastTo;
import java.util.Collection;
import javax.persistence.OneToMany;
import org.tura.platform.repository.core.RepositoryException;
import javax.persistence.Entity;

@Entity(name = "InputElement")
@javax.persistence.Table(name = "INPUTELEMENT")
public class InputElement extends SourcesPointer implements Serializable, TypeAware, CastTo {

  private static final long serialVersionUID = 1L;

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.jpa.form.InputElement.class;
  }

  @OneToMany(mappedBy = "source", fetch = javax.persistence.FetchType.LAZY)
  private Collection<LinkToMessage> opSourceLinkToMessage;

  public Collection<LinkToMessage> getOpSourceLinkToMessage() {
    return opSourceLinkToMessage;
  }

  public void setOpSourceLinkToMessage(java.util.Collection<LinkToMessage> opSourceLinkToMessage) {
    this.opSourceLinkToMessage = opSourceLinkToMessage;
  }

  @OneToMany(mappedBy = "source", fetch = javax.persistence.FetchType.LAZY)
  private Collection<LinkToLabel> opSourceLinkToLabel;

  public Collection<LinkToLabel> getOpSourceLinkToLabel() {
    return opSourceLinkToLabel;
  }

  public void setOpSourceLinkToLabel(java.util.Collection<LinkToLabel> opSourceLinkToLabel) {
    this.opSourceLinkToLabel = opSourceLinkToLabel;
  }

  public InputElement() {}

  @SuppressWarnings("unchecked")
  @Override
  public <T> T castTo(Class<T> clazz) throws RepositoryException {
    if (clazz
        .getName()
        .equals(org.tura.model.designer.repository.jpa.form.InputElement.class.getName())) {
      return (T) this;
    }
    if (clazz
        .getName()
        .equals(org.tura.model.designer.repository.jpa.form.SourcesPointer.class.getName())) {
      return (T) this;
    }
    if (clazz
        .getName()
        .equals(org.tura.model.designer.repository.jpa.form.Uielement.class.getName())) {
      return (T) this;
    }
    return super.castTo(clazz);
  }
}
