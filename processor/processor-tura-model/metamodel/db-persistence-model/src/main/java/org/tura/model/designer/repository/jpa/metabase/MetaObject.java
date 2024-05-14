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

package org.tura.model.designer.repository.jpa.metabase;

import java.io.Serializable;
import org.tura.platform.repository.persistence.TypeAware;
import org.tura.platform.object.JpaDomainInterfaceSetter;
import org.tura.platform.repository.persistence.CastTo;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import org.hibernate.annotations.GenericGenerator;
import org.tura.model.designer.repository.jpa.objectmapper.AttributeConnector;
import java.util.Collection;
import javax.persistence.OneToMany;
import org.tura.model.designer.repository.jpa.form.ContextParameter;
import org.tura.model.designer.repository.jpa.form.ExpressionPart;
import org.tura.model.designer.repository.jpa.form.ControlPointer;
import org.tura.model.designer.repository.jpa.form.Selection;
import org.tura.model.designer.repository.jpa.form.OrderBy;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.model.designer.repository.jpa.domain.Domain;
import javax.persistence.OneToOne;
import org.tura.model.designer.repository.jpa.domain.DomainArtifacts;
import org.tura.model.designer.repository.jpa.domain.DomainArtifact;
import org.tura.model.designer.repository.jpa.domain.DomainTypes;
import org.tura.model.designer.repository.jpa.domain.DomainTypesRepository;
import org.tura.model.designer.repository.jpa.domain.DomainApplications;
import org.tura.model.designer.repository.jpa.domain.DomainApplication;
import org.tura.model.designer.repository.jpa.domain.DomainMappers;
import org.tura.model.designer.repository.jpa.domain.DomainMapper;
import org.tura.model.designer.repository.jpa.artifact.ArtifactGroup;
import org.tura.model.designer.repository.jpa.artifact.TechLeaf;
import org.tura.model.designer.repository.jpa.artifact.Artifact;
import org.tura.model.designer.repository.jpa.artifact.GenerationHintWithNickName;
import org.tura.model.designer.repository.jpa.artifact.ConfigVariableWithNickName;
import org.tura.model.designer.repository.jpa.artifact.ConfigHashWithNickName;
import org.tura.model.designer.repository.jpa.artifact.GenerationHint;
import org.tura.model.designer.repository.jpa.artifact.ConfigVariable;
import org.tura.model.designer.repository.jpa.artifact.ConfigHash;
import org.tura.model.designer.repository.jpa.artifact.ModelQuery;
import org.tura.model.designer.repository.jpa.artifact.QueryParameter;
import org.tura.model.designer.repository.jpa.artifact.Technology;
import org.tura.model.designer.repository.jpa.artifact.Option;
import org.tura.model.designer.repository.jpa.artifact.Classifier;
import org.tura.model.designer.repository.jpa.type.TypeGroup;
import org.tura.model.designer.repository.jpa.type.PrimitivesGroup;
import org.tura.model.designer.repository.jpa.type.References;
import org.tura.model.designer.repository.jpa.type.Generalization;
import org.tura.model.designer.repository.jpa.type.TypePointerObj;
import org.tura.model.designer.repository.jpa.type.Assosiation;
import org.tura.model.designer.repository.jpa.type.Link;
import org.tura.model.designer.repository.jpa.type.Attribute;
import org.tura.model.designer.repository.jpa.type.Operation;
import org.tura.model.designer.repository.jpa.type.Primitive;
import org.tura.model.designer.repository.jpa.type.Type;
import org.tura.model.designer.repository.jpa.type.TypeReference;
import org.tura.model.designer.repository.jpa.type.Parameter;
import org.tura.model.designer.repository.jpa.type.ReturnValue;
import org.tura.model.designer.repository.jpa.type.Enumerator;
import org.tura.model.designer.repository.jpa.type.EnumAttribute;
import org.tura.model.designer.repository.jpa.type.AttributePointer;
import org.tura.model.designer.repository.jpa.application.ApplicationGroup;
import org.tura.model.designer.repository.jpa.application.Application;
import org.tura.model.designer.repository.jpa.application.ApplicationInfrastructureLayers;
import org.tura.model.designer.repository.jpa.application.ApplicationInfrastructureLayer;
import org.tura.model.designer.repository.jpa.application.ApplicationMessageLibraries;
import org.tura.model.designer.repository.jpa.application.ApplicationLanguages;
import org.tura.model.designer.repository.jpa.application.ApplicationMessageLibrary;
import org.tura.model.designer.repository.jpa.application.ApplicationRealms;
import org.tura.model.designer.repository.jpa.application.ApplicationRealm;
import org.tura.model.designer.repository.jpa.application.ApplicationStyleLibraries;
import org.tura.model.designer.repository.jpa.application.ApplicationStyle;
import org.tura.model.designer.repository.jpa.application.ApplicationUILayer;
import org.tura.model.designer.repository.jpa.application.ApplicationUIPackage;
import org.tura.model.designer.repository.jpa.application.ApplicationRecipes;
import org.tura.model.designer.repository.jpa.application.ApplicationRecipe;
import org.tura.model.designer.repository.jpa.application.ApplicationMappers;
import org.tura.model.designer.repository.jpa.application.ApplicationMapper;
import org.tura.model.designer.repository.jpa.objectmapper.ProcessingStage;
import org.tura.model.designer.repository.jpa.objectmapper.ObjectMapperGroup;
import org.tura.model.designer.repository.jpa.objectmapper.ObjectMapper;
import org.tura.model.designer.repository.jpa.objectmapper.Variable;
import org.tura.model.designer.repository.jpa.objectmapper.Aggregation;
import org.tura.model.designer.repository.jpa.objectmapper.OmRelation;
import org.tura.model.designer.repository.jpa.objectmapper.OperationConnector;
import org.tura.model.designer.repository.jpa.permission.Roles;
import org.tura.model.designer.repository.jpa.permission.Role;
import org.tura.model.designer.repository.jpa.permission.Group;
import org.tura.model.designer.repository.jpa.permission.Group2Group;
import org.tura.model.designer.repository.jpa.permission.Group2Role;
import org.tura.model.designer.repository.jpa.permission.GrantAccess;
import org.tura.model.designer.repository.jpa.message.MessageLibrary;
import org.tura.model.designer.repository.jpa.message.Message;
import org.tura.model.designer.repository.jpa.message.Translation;
import org.tura.model.designer.repository.jpa.message.Language;
import org.tura.model.designer.repository.jpa.infra.EnterpriseInfrastructure;
import org.tura.model.designer.repository.jpa.infra.Datacenter;
import org.tura.model.designer.repository.jpa.infra.Subsystem;
import org.tura.model.designer.repository.jpa.infra.InfrastructureLayer;
import org.tura.model.designer.repository.jpa.infra.InfrastructureConnection;
import org.tura.model.designer.repository.jpa.infra.Server;
import org.tura.model.designer.repository.jpa.infra.Router;
import org.tura.model.designer.repository.jpa.infra.Hub;
import org.tura.model.designer.repository.jpa.infra.Storage;
import org.tura.model.designer.repository.jpa.infra.ServerClaster;
import org.tura.model.designer.repository.jpa.form.Form;
import org.tura.model.designer.repository.jpa.form.FormParameter;
import org.tura.model.designer.repository.jpa.form.Views;
import org.tura.model.designer.repository.jpa.form.PopupCanvas;
import org.tura.model.designer.repository.jpa.form.OverlayCanvas;
import org.tura.model.designer.repository.jpa.form.Canvas;
import org.tura.model.designer.repository.jpa.form.Window;
import org.tura.model.designer.repository.jpa.form.MenuDefinition;
import org.tura.model.designer.repository.jpa.form.TabCanvas;
import org.tura.model.designer.repository.jpa.form.TabPage;
import org.tura.model.designer.repository.jpa.form.ViewPort;
import org.tura.model.designer.repository.jpa.form.ViewArea;
import org.tura.model.designer.repository.jpa.form.ViewPortTrigger;
import org.tura.model.designer.repository.jpa.form.ViewInheritance;
import org.tura.model.designer.repository.jpa.form.TabPagesInheritance;
import org.tura.model.designer.repository.jpa.form.LinkToMessage;
import org.tura.model.designer.repository.jpa.form.LinkToLabel;
import org.tura.model.designer.repository.jpa.form.FlexField;
import org.tura.model.designer.repository.jpa.form.AreaRef;
import org.tura.model.designer.repository.jpa.form.LayerHolder;
import org.tura.model.designer.repository.jpa.form.InputText;
import org.tura.model.designer.repository.jpa.form.Password;
import org.tura.model.designer.repository.jpa.form.Label;
import org.tura.model.designer.repository.jpa.form.MessageElement;
import org.tura.model.designer.repository.jpa.form.OutputText;
import org.tura.model.designer.repository.jpa.form.CheckBox;
import org.tura.model.designer.repository.jpa.form.DropDownSelection;
import org.tura.model.designer.repository.jpa.form.SelectManyMenu;
import org.tura.model.designer.repository.jpa.form.RadioSelection;
import org.tura.model.designer.repository.jpa.form.Image;
import org.tura.model.designer.repository.jpa.form.Date;
import org.tura.model.designer.repository.jpa.form.Button;
import org.tura.model.designer.repository.jpa.form.DataExporter;
import org.tura.model.designer.repository.jpa.form.Column;
import org.tura.model.designer.repository.jpa.form.Table;
import org.tura.model.designer.repository.jpa.form.Menu;
import org.tura.model.designer.repository.jpa.form.BlockUI;
import org.tura.model.designer.repository.jpa.form.FileUpload;
import org.tura.model.designer.repository.jpa.form.FileDownload;
import org.tura.model.designer.repository.jpa.form.DataScroller;
import org.tura.model.designer.repository.jpa.form.TimeLine;
import org.tura.model.designer.repository.jpa.form.FullCalendar;
import org.tura.model.designer.repository.jpa.form.Poll;
import org.tura.model.designer.repository.jpa.form.DataTemplate;
import org.tura.model.designer.repository.jpa.form.WindowRef;
import org.tura.model.designer.repository.jpa.form.MenuFolder;
import org.tura.model.designer.repository.jpa.form.MenuItem;
import org.tura.model.designer.repository.jpa.form.MenuExtensionPoint;
import org.tura.model.designer.repository.jpa.form.SubMenu;
import org.tura.model.designer.repository.jpa.form.ToSubmenu;
import org.tura.model.designer.repository.jpa.form.MenuSeparator;
import org.tura.model.designer.repository.jpa.form.Tree;
import org.tura.model.designer.repository.jpa.form.Controls;
import org.tura.model.designer.repository.jpa.form.PREFormTrigger;
import org.tura.model.designer.repository.jpa.form.PREQueryTrigger;
import org.tura.model.designer.repository.jpa.form.POSTQueryTrigger;
import org.tura.model.designer.repository.jpa.form.PREInsertTrigger;
import org.tura.model.designer.repository.jpa.form.PREDeleteTrigger;
import org.tura.model.designer.repository.jpa.form.POSTCreateTrigger;
import org.tura.model.designer.repository.jpa.form.PREUpdateTrigger;
import org.tura.model.designer.repository.jpa.form.CreateTrigger;
import org.tura.model.designer.repository.jpa.form.InsertTrigger;
import org.tura.model.designer.repository.jpa.form.UpdateTrigger;
import org.tura.model.designer.repository.jpa.form.DeleteTrigger;
import org.tura.model.designer.repository.jpa.form.SearchTrigger;
import org.tura.model.designer.repository.jpa.form.Root;
import org.tura.model.designer.repository.jpa.form.FormVariable;
import org.tura.model.designer.repository.jpa.form.DataControl;
import org.tura.model.designer.repository.jpa.form.ContextParametersObj;
import org.tura.model.designer.repository.jpa.form.RelationMapper;
import org.tura.model.designer.repository.jpa.form.Orders;
import org.tura.model.designer.repository.jpa.form.InternalRelation;
import org.tura.model.designer.repository.jpa.form.Dependency;
import org.tura.model.designer.repository.jpa.form.ArtificialField;
import org.tura.model.designer.repository.jpa.recipe.Recipes;
import org.tura.model.designer.repository.jpa.recipe.Recipe;
import org.tura.model.designer.repository.jpa.recipe.ConfigExtension;
import org.tura.model.designer.repository.jpa.recipe.Recipe2Infrastructure;
import org.tura.model.designer.repository.jpa.recipe.Infrastructure2Configuration;
import org.tura.model.designer.repository.jpa.recipe.DeploymentComponent;
import org.tura.model.designer.repository.jpa.recipe.DeploymentStarStep;
import org.tura.model.designer.repository.jpa.recipe.Ingredient;
import org.tura.model.designer.repository.jpa.recipe.JavaComponent;
import org.tura.model.designer.repository.jpa.recipe.JavaScriptComponent;
import org.tura.model.designer.repository.jpa.recipe.Infrastructure;
import org.tura.model.designer.repository.jpa.recipe.Configuration;
import org.tura.model.designer.repository.jpa.recipe.ModelMapper;
import org.tura.model.designer.repository.jpa.recipe.Property;
import org.tura.model.designer.repository.jpa.recipe.HashProperty;
import org.tura.model.designer.repository.jpa.recipe.KeyValuePair;
import org.tura.model.designer.repository.jpa.recipe.MappingTecnologiy;
import org.tura.model.designer.repository.jpa.recipe.Query;
import org.tura.model.designer.repository.jpa.recipe.QueryVariable;
import org.tura.model.designer.repository.jpa.mapper.Mappers;
import org.tura.model.designer.repository.jpa.mapper.Version;
import org.tura.model.designer.repository.jpa.mapper.MappingLayer;
import org.tura.model.designer.repository.jpa.mapper.JavaMapper;
import org.tura.model.designer.repository.jpa.mapper.JavaPackageMapper;
import org.tura.model.designer.repository.jpa.mapper.JavaScriptMapper;
import org.tura.model.designer.repository.jpa.mapper.CSSMapper;
import org.tura.model.designer.repository.jpa.mapper.RoleMapper;
import org.tura.model.designer.repository.jpa.mapper.XMLPackageMapper;
import org.tura.model.designer.repository.jpa.mapper.XMLTypeMapper;
import org.tura.model.designer.repository.jpa.mapper.MetamodelPackageMapper;
import org.tura.model.designer.repository.jpa.style.StyleLibrary;
import org.tura.model.designer.repository.jpa.style.StyleSet;
import javax.persistence.Entity;

@Entity(name = "MetaObject")
@javax.persistence.Table(name = "METAOBJECT")
public class MetaObject implements Serializable, TypeAware, JpaDomainInterfaceSetter, CastTo {

  private static final long serialVersionUID = 1L;

  public Class<?> getTypeClazz() {
    return org.tura.model.designer.repository.jpa.metabase.MetaObject.class;
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
  @javax.persistence.Column(name = "V_METAOBJECT")
  private int vMetaObject;

  public int getVmetaObject() {
    return vMetaObject;
  }

  public void setVmetaObject(int vMetaObject) {
    this.vMetaObject = vMetaObject;
  }

  @OneToMany(mappedBy = "source", fetch = javax.persistence.FetchType.LAZY)
  private Collection<AttributeConnector> opSourceAttributeConnector;

  public Collection<AttributeConnector> getOpSourceAttributeConnector() {
    return opSourceAttributeConnector;
  }

  public void setOpSourceAttributeConnector(
      java.util.Collection<AttributeConnector> opSourceAttributeConnector) {
    this.opSourceAttributeConnector = opSourceAttributeConnector;
  }

  @OneToMany(mappedBy = "target", fetch = javax.persistence.FetchType.LAZY)
  private Collection<AttributeConnector> opTargetAttributeConnector;

  public Collection<AttributeConnector> getOpTargetAttributeConnector() {
    return opTargetAttributeConnector;
  }

  public void setOpTargetAttributeConnector(
      java.util.Collection<AttributeConnector> opTargetAttributeConnector) {
    this.opTargetAttributeConnector = opTargetAttributeConnector;
  }

  @OneToMany(mappedBy = "refObj", fetch = javax.persistence.FetchType.LAZY)
  private Collection<ContextParameter> opRefObjContextParameter;

  public Collection<ContextParameter> getOpRefObjContextParameter() {
    return opRefObjContextParameter;
  }

  public void setOpRefObjContextParameter(
      java.util.Collection<ContextParameter> opRefObjContextParameter) {
    this.opRefObjContextParameter = opRefObjContextParameter;
  }

  @OneToMany(mappedBy = "objRef", fetch = javax.persistence.FetchType.LAZY)
  private Collection<ExpressionPart> opObjRefExpressionPart;

  public Collection<ExpressionPart> getOpObjRefExpressionPart() {
    return opObjRefExpressionPart;
  }

  public void setOpObjRefExpressionPart(
      java.util.Collection<ExpressionPart> opObjRefExpressionPart) {
    this.opObjRefExpressionPart = opObjRefExpressionPart;
  }

  @OneToMany(mappedBy = "valuePointer", fetch = javax.persistence.FetchType.LAZY)
  private Collection<ControlPointer> opValuePointerControlPointer;

  public Collection<ControlPointer> getOpValuePointerControlPointer() {
    return opValuePointerControlPointer;
  }

  public void setOpValuePointerControlPointer(
      java.util.Collection<ControlPointer> opValuePointerControlPointer) {
    this.opValuePointerControlPointer = opValuePointerControlPointer;
  }

  @OneToMany(mappedBy = "displayOptionPointer", fetch = javax.persistence.FetchType.LAZY)
  private Collection<Selection> opDisplayOptionPointerSelection;

  public Collection<Selection> getOpDisplayOptionPointerSelection() {
    return opDisplayOptionPointerSelection;
  }

  public void setOpDisplayOptionPointerSelection(
      java.util.Collection<Selection> opDisplayOptionPointerSelection) {
    this.opDisplayOptionPointerSelection = opDisplayOptionPointerSelection;
  }

  @OneToMany(mappedBy = "valueOptionPointer", fetch = javax.persistence.FetchType.LAZY)
  private Collection<Selection> opValueOptionPointerSelection;

  public Collection<Selection> getOpValueOptionPointerSelection() {
    return opValueOptionPointerSelection;
  }

  public void setOpValueOptionPointerSelection(
      java.util.Collection<Selection> opValueOptionPointerSelection) {
    this.opValueOptionPointerSelection = opValueOptionPointerSelection;
  }

  @OneToMany(mappedBy = "refObj", fetch = javax.persistence.FetchType.LAZY)
  private Collection<OrderBy> opRefObjOrderBy;

  public Collection<OrderBy> getOpRefObjOrderBy() {
    return opRefObjOrderBy;
  }

  public void setOpRefObjOrderBy(java.util.Collection<OrderBy> opRefObjOrderBy) {
    this.opRefObjOrderBy = opRefObjOrderBy;
  }

  @Override
  public <T> T castTo(Class<T> clazz) throws RepositoryException {
    return ((CastTo) getObject()).castTo(clazz);
  }

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private Domain clDomain;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private DomainArtifacts clDomainArtifacts;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private DomainArtifact clDomainArtifact;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private DomainTypes clDomainTypes;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private DomainTypesRepository clDomainTypesRepository;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private DomainApplications clDomainApplications;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private DomainApplication clDomainApplication;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private DomainMappers clDomainMappers;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private DomainMapper clDomainMapper;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private ArtifactGroup clArtifactGroup;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private TechLeaf clTechLeaf;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private Artifact clArtifact;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private GenerationHintWithNickName clGenerationHintWithNickName;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private ConfigVariableWithNickName clConfigVariableWithNickName;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private ConfigHashWithNickName clConfigHashWithNickName;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private GenerationHint clGenerationHint;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private ConfigVariable clConfigVariable;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private ConfigHash clConfigHash;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private ModelQuery clModelQuery;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private QueryParameter clQueryParameter;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private Technology clTechnology;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private Option clOption;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private Classifier clClassifier;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private TypeGroup clTypeGroup;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private PrimitivesGroup clPrimitivesGroup;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private References clReferences;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private Generalization clGeneralization;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private TypePointerObj clTypePointerObj;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private Assosiation clAssosiation;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private Link clLink;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private Attribute clAttribute;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private Operation clOperation;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private Primitive clPrimitive;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private Type clType;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private TypeReference clTypeReference;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private Parameter clParameter;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private ReturnValue clReturnValue;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private Enumerator clEnumerator;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private EnumAttribute clEnumAttribute;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private AttributePointer clAttributePointer;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private ApplicationGroup clApplicationGroup;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private Application clApplication;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private ApplicationInfrastructureLayers clApplicationInfrastructureLayers;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private ApplicationInfrastructureLayer clApplicationInfrastructureLayer;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private ApplicationMessageLibraries clApplicationMessageLibraries;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private ApplicationLanguages clApplicationLanguages;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private ApplicationMessageLibrary clApplicationMessageLibrary;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private ApplicationRealms clApplicationRealms;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private ApplicationRealm clApplicationRealm;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private ApplicationStyleLibraries clApplicationStyleLibraries;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private ApplicationStyle clApplicationStyle;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private ApplicationUILayer clApplicationUILayer;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private ApplicationUIPackage clApplicationUIPackage;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private ApplicationRecipes clApplicationRecipes;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private ApplicationRecipe clApplicationRecipe;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private ApplicationMappers clApplicationMappers;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private ApplicationMapper clApplicationMapper;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private ProcessingStage clProcessingStage;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private ObjectMapperGroup clObjectMapperGroup;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private ObjectMapper clObjectMapper;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private Variable clVariable;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private Aggregation clAggregation;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private OmRelation clOmRelation;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private AttributeConnector clAttributeConnector;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private OperationConnector clOperationConnector;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private Roles clRoles;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private Role clRole;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private Group clGroup;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private Group2Group clGroup2Group;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private Group2Role clGroup2Role;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private GrantAccess clGrantAccess;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private MessageLibrary clMessageLibrary;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private Message clMessage;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private Translation clTranslation;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private Language clLanguage;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private EnterpriseInfrastructure clEnterpriseInfrastructure;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private Datacenter clDatacenter;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private Subsystem clSubsystem;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private InfrastructureLayer clInfrastructureLayer;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private InfrastructureConnection clInfrastructureConnection;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private Server clServer;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private Router clRouter;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private Hub clHub;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private Storage clStorage;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private ServerClaster clServerClaster;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private Form clForm;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private FormParameter clFormParameter;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private Views clViews;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private PopupCanvas clPopupCanvas;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private OverlayCanvas clOverlayCanvas;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private Canvas clCanvas;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private Window clWindow;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private MenuDefinition clMenuDefinition;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private TabCanvas clTabCanvas;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private TabPage clTabPage;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private ViewPort clViewPort;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private ViewArea clViewArea;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private ViewPortTrigger clViewPortTrigger;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private ViewInheritance clViewInheritance;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private TabPagesInheritance clTabPagesInheritance;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private LinkToMessage clLinkToMessage;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private LinkToLabel clLinkToLabel;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private ContextParameter clContextParameter;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private ExpressionPart clExpressionPart;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private FlexField clFlexField;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private AreaRef clAreaRef;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private Selection clSelection;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private LayerHolder clLayerHolder;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private InputText clInputText;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private Password clPassword;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private Label clLabel;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private MessageElement clMessageElement;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private OutputText clOutputText;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private CheckBox clCheckBox;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private DropDownSelection clDropDownSelection;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private SelectManyMenu clSelectManyMenu;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private RadioSelection clRadioSelection;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private Image clImage;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private Date clDate;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private Button clButton;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private DataExporter clDataExporter;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private Column clColumn;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private Table clTable;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private Menu clMenu;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private BlockUI clBlockUI;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private FileUpload clFileUpload;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private FileDownload clFileDownload;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private DataScroller clDataScroller;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private TimeLine clTimeLine;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private FullCalendar clFullCalendar;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private Poll clPoll;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private DataTemplate clDataTemplate;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private WindowRef clWindowRef;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private MenuFolder clMenuFolder;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private MenuItem clMenuItem;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private MenuExtensionPoint clMenuExtensionPoint;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private SubMenu clSubMenu;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private ToSubmenu clToSubmenu;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private MenuSeparator clMenuSeparator;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private Tree clTree;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private Controls clControls;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private PREFormTrigger clPREFormTrigger;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private PREQueryTrigger clPREQueryTrigger;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private POSTQueryTrigger clPOSTQueryTrigger;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private PREInsertTrigger clPREInsertTrigger;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private PREDeleteTrigger clPREDeleteTrigger;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private POSTCreateTrigger clPOSTCreateTrigger;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private PREUpdateTrigger clPREUpdateTrigger;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private CreateTrigger clCreateTrigger;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private InsertTrigger clInsertTrigger;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private UpdateTrigger clUpdateTrigger;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private DeleteTrigger clDeleteTrigger;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private SearchTrigger clSearchTrigger;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private Root clRoot;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private FormVariable clFormVariable;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private DataControl clDataControl;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private ContextParametersObj clContextParametersObj;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private RelationMapper clRelationMapper;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private Orders clOrders;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private OrderBy clOrderBy;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private InternalRelation clInternalRelation;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private Dependency clDependency;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private ArtificialField clArtificialField;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private Recipes clRecipes;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private Recipe clRecipe;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private ConfigExtension clConfigExtension;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private Recipe2Infrastructure clRecipe2Infrastructure;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private Infrastructure2Configuration clInfrastructure2Configuration;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private DeploymentComponent clDeploymentComponent;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private DeploymentStarStep clDeploymentStarStep;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private Ingredient clIngredient;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private JavaComponent clJavaComponent;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private JavaScriptComponent clJavaScriptComponent;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private Infrastructure clInfrastructure;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private Configuration clConfiguration;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private ModelMapper clModelMapper;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private Property clProperty;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private HashProperty clHashProperty;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private KeyValuePair clKeyValuePair;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private MappingTecnologiy clMappingTecnologiy;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private Query clQuery;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private QueryVariable clQueryVariable;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private Mappers clMappers;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private Version clVersion;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private MappingLayer clMappingLayer;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private JavaMapper clJavaMapper;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private JavaPackageMapper clJavaPackageMapper;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private JavaScriptMapper clJavaScriptMapper;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private CSSMapper clCSSMapper;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private RoleMapper clRoleMapper;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private XMLPackageMapper clXMLPackageMapper;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private XMLTypeMapper clXMLTypeMapper;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private MetamodelPackageMapper clMetamodelPackageMapper;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private StyleLibrary clStyleLibrary;

  @OneToOne(mappedBy = "inhMetaObject", fetch = javax.persistence.FetchType.LAZY)
  private StyleSet clStyleSet;

  @javax.persistence.Column(name = "INH_SWITCH")
  private String inhSwitch;

  public Object getObject() {
    if (inhSwitch == null) {
      return this;
    }
    if (clDomain != null) {
      return clDomain.getObject();
    }
    if (clDomainArtifacts != null) {
      return clDomainArtifacts.getObject();
    }
    if (clDomainArtifact != null) {
      return clDomainArtifact.getObject();
    }
    if (clDomainTypes != null) {
      return clDomainTypes.getObject();
    }
    if (clDomainTypesRepository != null) {
      return clDomainTypesRepository.getObject();
    }
    if (clDomainApplications != null) {
      return clDomainApplications.getObject();
    }
    if (clDomainApplication != null) {
      return clDomainApplication.getObject();
    }
    if (clDomainMappers != null) {
      return clDomainMappers.getObject();
    }
    if (clDomainMapper != null) {
      return clDomainMapper.getObject();
    }
    if (clArtifactGroup != null) {
      return clArtifactGroup.getObject();
    }
    if (clTechLeaf != null) {
      return clTechLeaf.getObject();
    }
    if (clArtifact != null) {
      return clArtifact.getObject();
    }
    if (clGenerationHintWithNickName != null) {
      return clGenerationHintWithNickName.getObject();
    }
    if (clConfigVariableWithNickName != null) {
      return clConfigVariableWithNickName.getObject();
    }
    if (clConfigHashWithNickName != null) {
      return clConfigHashWithNickName.getObject();
    }
    if (clGenerationHint != null) {
      return clGenerationHint.getObject();
    }
    if (clConfigVariable != null) {
      return clConfigVariable.getObject();
    }
    if (clConfigHash != null) {
      return clConfigHash.getObject();
    }
    if (clModelQuery != null) {
      return clModelQuery.getObject();
    }
    if (clQueryParameter != null) {
      return clQueryParameter.getObject();
    }
    if (clTechnology != null) {
      return clTechnology.getObject();
    }
    if (clOption != null) {
      return clOption.getObject();
    }
    if (clClassifier != null) {
      return clClassifier.getObject();
    }
    if (clTypeGroup != null) {
      return clTypeGroup.getObject();
    }
    if (clPrimitivesGroup != null) {
      return clPrimitivesGroup.getObject();
    }
    if (clReferences != null) {
      return clReferences.getObject();
    }
    if (clGeneralization != null) {
      return clGeneralization.getObject();
    }
    if (clTypePointerObj != null) {
      return clTypePointerObj.getObject();
    }
    if (clAssosiation != null) {
      return clAssosiation.getObject();
    }
    if (clLink != null) {
      return clLink.getObject();
    }
    if (clAttribute != null) {
      return clAttribute.getObject();
    }
    if (clOperation != null) {
      return clOperation.getObject();
    }
    if (clPrimitive != null) {
      return clPrimitive.getObject();
    }
    if (clType != null) {
      return clType.getObject();
    }
    if (clTypeReference != null) {
      return clTypeReference.getObject();
    }
    if (clParameter != null) {
      return clParameter.getObject();
    }
    if (clReturnValue != null) {
      return clReturnValue.getObject();
    }
    if (clEnumerator != null) {
      return clEnumerator.getObject();
    }
    if (clEnumAttribute != null) {
      return clEnumAttribute.getObject();
    }
    if (clAttributePointer != null) {
      return clAttributePointer.getObject();
    }
    if (clApplicationGroup != null) {
      return clApplicationGroup.getObject();
    }
    if (clApplication != null) {
      return clApplication.getObject();
    }
    if (clApplicationInfrastructureLayers != null) {
      return clApplicationInfrastructureLayers.getObject();
    }
    if (clApplicationInfrastructureLayer != null) {
      return clApplicationInfrastructureLayer.getObject();
    }
    if (clApplicationMessageLibraries != null) {
      return clApplicationMessageLibraries.getObject();
    }
    if (clApplicationLanguages != null) {
      return clApplicationLanguages.getObject();
    }
    if (clApplicationMessageLibrary != null) {
      return clApplicationMessageLibrary.getObject();
    }
    if (clApplicationRealms != null) {
      return clApplicationRealms.getObject();
    }
    if (clApplicationRealm != null) {
      return clApplicationRealm.getObject();
    }
    if (clApplicationStyleLibraries != null) {
      return clApplicationStyleLibraries.getObject();
    }
    if (clApplicationStyle != null) {
      return clApplicationStyle.getObject();
    }
    if (clApplicationUILayer != null) {
      return clApplicationUILayer.getObject();
    }
    if (clApplicationUIPackage != null) {
      return clApplicationUIPackage.getObject();
    }
    if (clApplicationRecipes != null) {
      return clApplicationRecipes.getObject();
    }
    if (clApplicationRecipe != null) {
      return clApplicationRecipe.getObject();
    }
    if (clApplicationMappers != null) {
      return clApplicationMappers.getObject();
    }
    if (clApplicationMapper != null) {
      return clApplicationMapper.getObject();
    }
    if (clProcessingStage != null) {
      return clProcessingStage.getObject();
    }
    if (clObjectMapperGroup != null) {
      return clObjectMapperGroup.getObject();
    }
    if (clObjectMapper != null) {
      return clObjectMapper.getObject();
    }
    if (clVariable != null) {
      return clVariable.getObject();
    }
    if (clAggregation != null) {
      return clAggregation.getObject();
    }
    if (clOmRelation != null) {
      return clOmRelation.getObject();
    }
    if (clAttributeConnector != null) {
      return clAttributeConnector.getObject();
    }
    if (clOperationConnector != null) {
      return clOperationConnector.getObject();
    }
    if (clRoles != null) {
      return clRoles.getObject();
    }
    if (clRole != null) {
      return clRole.getObject();
    }
    if (clGroup != null) {
      return clGroup.getObject();
    }
    if (clGroup2Group != null) {
      return clGroup2Group.getObject();
    }
    if (clGroup2Role != null) {
      return clGroup2Role.getObject();
    }
    if (clGrantAccess != null) {
      return clGrantAccess.getObject();
    }
    if (clMessageLibrary != null) {
      return clMessageLibrary.getObject();
    }
    if (clMessage != null) {
      return clMessage.getObject();
    }
    if (clTranslation != null) {
      return clTranslation.getObject();
    }
    if (clLanguage != null) {
      return clLanguage.getObject();
    }
    if (clEnterpriseInfrastructure != null) {
      return clEnterpriseInfrastructure.getObject();
    }
    if (clDatacenter != null) {
      return clDatacenter.getObject();
    }
    if (clSubsystem != null) {
      return clSubsystem.getObject();
    }
    if (clInfrastructureLayer != null) {
      return clInfrastructureLayer.getObject();
    }
    if (clInfrastructureConnection != null) {
      return clInfrastructureConnection.getObject();
    }
    if (clServer != null) {
      return clServer.getObject();
    }
    if (clRouter != null) {
      return clRouter.getObject();
    }
    if (clHub != null) {
      return clHub.getObject();
    }
    if (clStorage != null) {
      return clStorage.getObject();
    }
    if (clServerClaster != null) {
      return clServerClaster.getObject();
    }
    if (clForm != null) {
      return clForm.getObject();
    }
    if (clFormParameter != null) {
      return clFormParameter.getObject();
    }
    if (clViews != null) {
      return clViews.getObject();
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
    if (clMenuDefinition != null) {
      return clMenuDefinition.getObject();
    }
    if (clTabCanvas != null) {
      return clTabCanvas.getObject();
    }
    if (clTabPage != null) {
      return clTabPage.getObject();
    }
    if (clViewPort != null) {
      return clViewPort.getObject();
    }
    if (clViewArea != null) {
      return clViewArea.getObject();
    }
    if (clViewPortTrigger != null) {
      return clViewPortTrigger.getObject();
    }
    if (clViewInheritance != null) {
      return clViewInheritance.getObject();
    }
    if (clTabPagesInheritance != null) {
      return clTabPagesInheritance.getObject();
    }
    if (clLinkToMessage != null) {
      return clLinkToMessage.getObject();
    }
    if (clLinkToLabel != null) {
      return clLinkToLabel.getObject();
    }
    if (clContextParameter != null) {
      return clContextParameter.getObject();
    }
    if (clExpressionPart != null) {
      return clExpressionPart.getObject();
    }
    if (clFlexField != null) {
      return clFlexField.getObject();
    }
    if (clAreaRef != null) {
      return clAreaRef.getObject();
    }
    if (clSelection != null) {
      return clSelection.getObject();
    }
    if (clLayerHolder != null) {
      return clLayerHolder.getObject();
    }
    if (clInputText != null) {
      return clInputText.getObject();
    }
    if (clPassword != null) {
      return clPassword.getObject();
    }
    if (clLabel != null) {
      return clLabel.getObject();
    }
    if (clMessageElement != null) {
      return clMessageElement.getObject();
    }
    if (clOutputText != null) {
      return clOutputText.getObject();
    }
    if (clCheckBox != null) {
      return clCheckBox.getObject();
    }
    if (clDropDownSelection != null) {
      return clDropDownSelection.getObject();
    }
    if (clSelectManyMenu != null) {
      return clSelectManyMenu.getObject();
    }
    if (clRadioSelection != null) {
      return clRadioSelection.getObject();
    }
    if (clImage != null) {
      return clImage.getObject();
    }
    if (clDate != null) {
      return clDate.getObject();
    }
    if (clButton != null) {
      return clButton.getObject();
    }
    if (clDataExporter != null) {
      return clDataExporter.getObject();
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
    if (clBlockUI != null) {
      return clBlockUI.getObject();
    }
    if (clFileUpload != null) {
      return clFileUpload.getObject();
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
    if (clFullCalendar != null) {
      return clFullCalendar.getObject();
    }
    if (clPoll != null) {
      return clPoll.getObject();
    }
    if (clDataTemplate != null) {
      return clDataTemplate.getObject();
    }
    if (clWindowRef != null) {
      return clWindowRef.getObject();
    }
    if (clMenuFolder != null) {
      return clMenuFolder.getObject();
    }
    if (clMenuItem != null) {
      return clMenuItem.getObject();
    }
    if (clMenuExtensionPoint != null) {
      return clMenuExtensionPoint.getObject();
    }
    if (clSubMenu != null) {
      return clSubMenu.getObject();
    }
    if (clToSubmenu != null) {
      return clToSubmenu.getObject();
    }
    if (clMenuSeparator != null) {
      return clMenuSeparator.getObject();
    }
    if (clTree != null) {
      return clTree.getObject();
    }
    if (clControls != null) {
      return clControls.getObject();
    }
    if (clPREFormTrigger != null) {
      return clPREFormTrigger.getObject();
    }
    if (clPREQueryTrigger != null) {
      return clPREQueryTrigger.getObject();
    }
    if (clPOSTQueryTrigger != null) {
      return clPOSTQueryTrigger.getObject();
    }
    if (clPREInsertTrigger != null) {
      return clPREInsertTrigger.getObject();
    }
    if (clPREDeleteTrigger != null) {
      return clPREDeleteTrigger.getObject();
    }
    if (clPOSTCreateTrigger != null) {
      return clPOSTCreateTrigger.getObject();
    }
    if (clPREUpdateTrigger != null) {
      return clPREUpdateTrigger.getObject();
    }
    if (clCreateTrigger != null) {
      return clCreateTrigger.getObject();
    }
    if (clInsertTrigger != null) {
      return clInsertTrigger.getObject();
    }
    if (clUpdateTrigger != null) {
      return clUpdateTrigger.getObject();
    }
    if (clDeleteTrigger != null) {
      return clDeleteTrigger.getObject();
    }
    if (clSearchTrigger != null) {
      return clSearchTrigger.getObject();
    }
    if (clRoot != null) {
      return clRoot.getObject();
    }
    if (clFormVariable != null) {
      return clFormVariable.getObject();
    }
    if (clDataControl != null) {
      return clDataControl.getObject();
    }
    if (clContextParametersObj != null) {
      return clContextParametersObj.getObject();
    }
    if (clRelationMapper != null) {
      return clRelationMapper.getObject();
    }
    if (clOrders != null) {
      return clOrders.getObject();
    }
    if (clOrderBy != null) {
      return clOrderBy.getObject();
    }
    if (clInternalRelation != null) {
      return clInternalRelation.getObject();
    }
    if (clDependency != null) {
      return clDependency.getObject();
    }
    if (clArtificialField != null) {
      return clArtificialField.getObject();
    }
    if (clRecipes != null) {
      return clRecipes.getObject();
    }
    if (clRecipe != null) {
      return clRecipe.getObject();
    }
    if (clConfigExtension != null) {
      return clConfigExtension.getObject();
    }
    if (clRecipe2Infrastructure != null) {
      return clRecipe2Infrastructure.getObject();
    }
    if (clInfrastructure2Configuration != null) {
      return clInfrastructure2Configuration.getObject();
    }
    if (clDeploymentComponent != null) {
      return clDeploymentComponent.getObject();
    }
    if (clDeploymentStarStep != null) {
      return clDeploymentStarStep.getObject();
    }
    if (clIngredient != null) {
      return clIngredient.getObject();
    }
    if (clJavaComponent != null) {
      return clJavaComponent.getObject();
    }
    if (clJavaScriptComponent != null) {
      return clJavaScriptComponent.getObject();
    }
    if (clInfrastructure != null) {
      return clInfrastructure.getObject();
    }
    if (clConfiguration != null) {
      return clConfiguration.getObject();
    }
    if (clModelMapper != null) {
      return clModelMapper.getObject();
    }
    if (clProperty != null) {
      return clProperty.getObject();
    }
    if (clHashProperty != null) {
      return clHashProperty.getObject();
    }
    if (clKeyValuePair != null) {
      return clKeyValuePair.getObject();
    }
    if (clMappingTecnologiy != null) {
      return clMappingTecnologiy.getObject();
    }
    if (clQuery != null) {
      return clQuery.getObject();
    }
    if (clQueryVariable != null) {
      return clQueryVariable.getObject();
    }
    if (clMappers != null) {
      return clMappers.getObject();
    }
    if (clVersion != null) {
      return clVersion.getObject();
    }
    if (clMappingLayer != null) {
      return clMappingLayer.getObject();
    }
    if (clJavaMapper != null) {
      return clJavaMapper.getObject();
    }
    if (clJavaPackageMapper != null) {
      return clJavaPackageMapper.getObject();
    }
    if (clJavaScriptMapper != null) {
      return clJavaScriptMapper.getObject();
    }
    if (clCSSMapper != null) {
      return clCSSMapper.getObject();
    }
    if (clRoleMapper != null) {
      return clRoleMapper.getObject();
    }
    if (clXMLPackageMapper != null) {
      return clXMLPackageMapper.getObject();
    }
    if (clXMLTypeMapper != null) {
      return clXMLTypeMapper.getObject();
    }
    if (clMetamodelPackageMapper != null) {
      return clMetamodelPackageMapper.getObject();
    }
    if (clStyleLibrary != null) {
      return clStyleLibrary.getObject();
    }
    if (clStyleSet != null) {
      return clStyleSet.getObject();
    }
    return this;
  }

  public void setObject(Object obj) {
    if (obj != null) {
      inhSwitch = obj.getClass().getName();
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.domain.Domain")) {
        clDomain = (Domain) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.domain.DomainArtifacts")) {
        clDomainArtifacts = (DomainArtifacts) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.domain.DomainArtifact")) {
        clDomainArtifact = (DomainArtifact) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.domain.DomainTypes")) {
        clDomainTypes = (DomainTypes) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.domain.DomainTypesRepository")) {
        clDomainTypesRepository = (DomainTypesRepository) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.domain.DomainApplications")) {
        clDomainApplications = (DomainApplications) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.domain.DomainApplication")) {
        clDomainApplication = (DomainApplication) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.domain.DomainMappers")) {
        clDomainMappers = (DomainMappers) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.domain.DomainMapper")) {
        clDomainMapper = (DomainMapper) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.artifact.ArtifactGroup")) {
        clArtifactGroup = (ArtifactGroup) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.artifact.TechLeaf")) {
        clTechLeaf = (TechLeaf) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.artifact.Artifact")) {
        clArtifact = (Artifact) obj;
      }
      if (inhSwitch.equals(
          "org.tura.model.designer.repository.jpa.artifact.GenerationHintWithNickName")) {
        clGenerationHintWithNickName = (GenerationHintWithNickName) obj;
      }
      if (inhSwitch.equals(
          "org.tura.model.designer.repository.jpa.artifact.ConfigVariableWithNickName")) {
        clConfigVariableWithNickName = (ConfigVariableWithNickName) obj;
      }
      if (inhSwitch.equals(
          "org.tura.model.designer.repository.jpa.artifact.ConfigHashWithNickName")) {
        clConfigHashWithNickName = (ConfigHashWithNickName) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.artifact.GenerationHint")) {
        clGenerationHint = (GenerationHint) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.artifact.ConfigVariable")) {
        clConfigVariable = (ConfigVariable) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.artifact.ConfigHash")) {
        clConfigHash = (ConfigHash) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.artifact.ModelQuery")) {
        clModelQuery = (ModelQuery) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.artifact.QueryParameter")) {
        clQueryParameter = (QueryParameter) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.artifact.Technology")) {
        clTechnology = (Technology) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.artifact.Option")) {
        clOption = (Option) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.artifact.Classifier")) {
        clClassifier = (Classifier) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.type.TypeGroup")) {
        clTypeGroup = (TypeGroup) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.type.PrimitivesGroup")) {
        clPrimitivesGroup = (PrimitivesGroup) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.type.References")) {
        clReferences = (References) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.type.Generalization")) {
        clGeneralization = (Generalization) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.type.TypePointerObj")) {
        clTypePointerObj = (TypePointerObj) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.type.Assosiation")) {
        clAssosiation = (Assosiation) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.type.Link")) {
        clLink = (Link) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.type.Attribute")) {
        clAttribute = (Attribute) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.type.Operation")) {
        clOperation = (Operation) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.type.Primitive")) {
        clPrimitive = (Primitive) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.type.Type")) {
        clType = (Type) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.type.TypeReference")) {
        clTypeReference = (TypeReference) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.type.Parameter")) {
        clParameter = (Parameter) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.type.ReturnValue")) {
        clReturnValue = (ReturnValue) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.type.Enumerator")) {
        clEnumerator = (Enumerator) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.type.EnumAttribute")) {
        clEnumAttribute = (EnumAttribute) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.type.AttributePointer")) {
        clAttributePointer = (AttributePointer) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.application.ApplicationGroup")) {
        clApplicationGroup = (ApplicationGroup) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.application.Application")) {
        clApplication = (Application) obj;
      }
      if (inhSwitch.equals(
          "org.tura.model.designer.repository.jpa.application.ApplicationInfrastructureLayers")) {
        clApplicationInfrastructureLayers = (ApplicationInfrastructureLayers) obj;
      }
      if (inhSwitch.equals(
          "org.tura.model.designer.repository.jpa.application.ApplicationInfrastructureLayer")) {
        clApplicationInfrastructureLayer = (ApplicationInfrastructureLayer) obj;
      }
      if (inhSwitch.equals(
          "org.tura.model.designer.repository.jpa.application.ApplicationMessageLibraries")) {
        clApplicationMessageLibraries = (ApplicationMessageLibraries) obj;
      }
      if (inhSwitch.equals(
          "org.tura.model.designer.repository.jpa.application.ApplicationLanguages")) {
        clApplicationLanguages = (ApplicationLanguages) obj;
      }
      if (inhSwitch.equals(
          "org.tura.model.designer.repository.jpa.application.ApplicationMessageLibrary")) {
        clApplicationMessageLibrary = (ApplicationMessageLibrary) obj;
      }
      if (inhSwitch.equals(
          "org.tura.model.designer.repository.jpa.application.ApplicationRealms")) {
        clApplicationRealms = (ApplicationRealms) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.application.ApplicationRealm")) {
        clApplicationRealm = (ApplicationRealm) obj;
      }
      if (inhSwitch.equals(
          "org.tura.model.designer.repository.jpa.application.ApplicationStyleLibraries")) {
        clApplicationStyleLibraries = (ApplicationStyleLibraries) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.application.ApplicationStyle")) {
        clApplicationStyle = (ApplicationStyle) obj;
      }
      if (inhSwitch.equals(
          "org.tura.model.designer.repository.jpa.application.ApplicationUILayer")) {
        clApplicationUILayer = (ApplicationUILayer) obj;
      }
      if (inhSwitch.equals(
          "org.tura.model.designer.repository.jpa.application.ApplicationUIPackage")) {
        clApplicationUIPackage = (ApplicationUIPackage) obj;
      }
      if (inhSwitch.equals(
          "org.tura.model.designer.repository.jpa.application.ApplicationRecipes")) {
        clApplicationRecipes = (ApplicationRecipes) obj;
      }
      if (inhSwitch.equals(
          "org.tura.model.designer.repository.jpa.application.ApplicationRecipe")) {
        clApplicationRecipe = (ApplicationRecipe) obj;
      }
      if (inhSwitch.equals(
          "org.tura.model.designer.repository.jpa.application.ApplicationMappers")) {
        clApplicationMappers = (ApplicationMappers) obj;
      }
      if (inhSwitch.equals(
          "org.tura.model.designer.repository.jpa.application.ApplicationMapper")) {
        clApplicationMapper = (ApplicationMapper) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.objectmapper.ProcessingStage")) {
        clProcessingStage = (ProcessingStage) obj;
      }
      if (inhSwitch.equals(
          "org.tura.model.designer.repository.jpa.objectmapper.ObjectMapperGroup")) {
        clObjectMapperGroup = (ObjectMapperGroup) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.objectmapper.ObjectMapper")) {
        clObjectMapper = (ObjectMapper) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.objectmapper.Variable")) {
        clVariable = (Variable) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.objectmapper.Aggregation")) {
        clAggregation = (Aggregation) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.objectmapper.OmRelation")) {
        clOmRelation = (OmRelation) obj;
      }
      if (inhSwitch.equals(
          "org.tura.model.designer.repository.jpa.objectmapper.AttributeConnector")) {
        clAttributeConnector = (AttributeConnector) obj;
      }
      if (inhSwitch.equals(
          "org.tura.model.designer.repository.jpa.objectmapper.OperationConnector")) {
        clOperationConnector = (OperationConnector) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.permission.Roles")) {
        clRoles = (Roles) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.permission.Role")) {
        clRole = (Role) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.permission.Group")) {
        clGroup = (Group) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.permission.Group2Group")) {
        clGroup2Group = (Group2Group) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.permission.Group2Role")) {
        clGroup2Role = (Group2Role) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.permission.GrantAccess")) {
        clGrantAccess = (GrantAccess) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.message.MessageLibrary")) {
        clMessageLibrary = (MessageLibrary) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.message.Message")) {
        clMessage = (Message) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.message.Translation")) {
        clTranslation = (Translation) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.message.Language")) {
        clLanguage = (Language) obj;
      }
      if (inhSwitch.equals(
          "org.tura.model.designer.repository.jpa.infra.EnterpriseInfrastructure")) {
        clEnterpriseInfrastructure = (EnterpriseInfrastructure) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.infra.Datacenter")) {
        clDatacenter = (Datacenter) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.infra.Subsystem")) {
        clSubsystem = (Subsystem) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.infra.InfrastructureLayer")) {
        clInfrastructureLayer = (InfrastructureLayer) obj;
      }
      if (inhSwitch.equals(
          "org.tura.model.designer.repository.jpa.infra.InfrastructureConnection")) {
        clInfrastructureConnection = (InfrastructureConnection) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.infra.Server")) {
        clServer = (Server) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.infra.Router")) {
        clRouter = (Router) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.infra.Hub")) {
        clHub = (Hub) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.infra.Storage")) {
        clStorage = (Storage) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.infra.ServerClaster")) {
        clServerClaster = (ServerClaster) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.Form")) {
        clForm = (Form) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.FormParameter")) {
        clFormParameter = (FormParameter) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.Views")) {
        clViews = (Views) obj;
      }
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
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.MenuDefinition")) {
        clMenuDefinition = (MenuDefinition) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.TabCanvas")) {
        clTabCanvas = (TabCanvas) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.TabPage")) {
        clTabPage = (TabPage) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.ViewPort")) {
        clViewPort = (ViewPort) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.ViewArea")) {
        clViewArea = (ViewArea) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.ViewPortTrigger")) {
        clViewPortTrigger = (ViewPortTrigger) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.ViewInheritance")) {
        clViewInheritance = (ViewInheritance) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.TabPagesInheritance")) {
        clTabPagesInheritance = (TabPagesInheritance) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.LinkToMessage")) {
        clLinkToMessage = (LinkToMessage) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.LinkToLabel")) {
        clLinkToLabel = (LinkToLabel) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.ContextParameter")) {
        clContextParameter = (ContextParameter) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.ExpressionPart")) {
        clExpressionPart = (ExpressionPart) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.FlexField")) {
        clFlexField = (FlexField) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.AreaRef")) {
        clAreaRef = (AreaRef) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.Selection")) {
        clSelection = (Selection) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.LayerHolder")) {
        clLayerHolder = (LayerHolder) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.InputText")) {
        clInputText = (InputText) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.Password")) {
        clPassword = (Password) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.Label")) {
        clLabel = (Label) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.MessageElement")) {
        clMessageElement = (MessageElement) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.OutputText")) {
        clOutputText = (OutputText) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.CheckBox")) {
        clCheckBox = (CheckBox) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.DropDownSelection")) {
        clDropDownSelection = (DropDownSelection) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.SelectManyMenu")) {
        clSelectManyMenu = (SelectManyMenu) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.RadioSelection")) {
        clRadioSelection = (RadioSelection) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.Image")) {
        clImage = (Image) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.Date")) {
        clDate = (Date) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.Button")) {
        clButton = (Button) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.DataExporter")) {
        clDataExporter = (DataExporter) obj;
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
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.BlockUI")) {
        clBlockUI = (BlockUI) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.FileUpload")) {
        clFileUpload = (FileUpload) obj;
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
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.FullCalendar")) {
        clFullCalendar = (FullCalendar) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.Poll")) {
        clPoll = (Poll) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.DataTemplate")) {
        clDataTemplate = (DataTemplate) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.WindowRef")) {
        clWindowRef = (WindowRef) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.MenuFolder")) {
        clMenuFolder = (MenuFolder) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.MenuItem")) {
        clMenuItem = (MenuItem) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.MenuExtensionPoint")) {
        clMenuExtensionPoint = (MenuExtensionPoint) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.SubMenu")) {
        clSubMenu = (SubMenu) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.ToSubmenu")) {
        clToSubmenu = (ToSubmenu) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.MenuSeparator")) {
        clMenuSeparator = (MenuSeparator) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.Tree")) {
        clTree = (Tree) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.Controls")) {
        clControls = (Controls) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.PREFormTrigger")) {
        clPREFormTrigger = (PREFormTrigger) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.PREQueryTrigger")) {
        clPREQueryTrigger = (PREQueryTrigger) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.POSTQueryTrigger")) {
        clPOSTQueryTrigger = (POSTQueryTrigger) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.PREInsertTrigger")) {
        clPREInsertTrigger = (PREInsertTrigger) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.PREDeleteTrigger")) {
        clPREDeleteTrigger = (PREDeleteTrigger) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.POSTCreateTrigger")) {
        clPOSTCreateTrigger = (POSTCreateTrigger) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.PREUpdateTrigger")) {
        clPREUpdateTrigger = (PREUpdateTrigger) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.CreateTrigger")) {
        clCreateTrigger = (CreateTrigger) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.InsertTrigger")) {
        clInsertTrigger = (InsertTrigger) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.UpdateTrigger")) {
        clUpdateTrigger = (UpdateTrigger) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.DeleteTrigger")) {
        clDeleteTrigger = (DeleteTrigger) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.SearchTrigger")) {
        clSearchTrigger = (SearchTrigger) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.Root")) {
        clRoot = (Root) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.FormVariable")) {
        clFormVariable = (FormVariable) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.DataControl")) {
        clDataControl = (DataControl) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.ContextParametersObj")) {
        clContextParametersObj = (ContextParametersObj) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.RelationMapper")) {
        clRelationMapper = (RelationMapper) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.Orders")) {
        clOrders = (Orders) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.OrderBy")) {
        clOrderBy = (OrderBy) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.InternalRelation")) {
        clInternalRelation = (InternalRelation) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.Dependency")) {
        clDependency = (Dependency) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.form.ArtificialField")) {
        clArtificialField = (ArtificialField) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.recipe.Recipes")) {
        clRecipes = (Recipes) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.recipe.Recipe")) {
        clRecipe = (Recipe) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.recipe.ConfigExtension")) {
        clConfigExtension = (ConfigExtension) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.recipe.Recipe2Infrastructure")) {
        clRecipe2Infrastructure = (Recipe2Infrastructure) obj;
      }
      if (inhSwitch.equals(
          "org.tura.model.designer.repository.jpa.recipe.Infrastructure2Configuration")) {
        clInfrastructure2Configuration = (Infrastructure2Configuration) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.recipe.DeploymentComponent")) {
        clDeploymentComponent = (DeploymentComponent) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.recipe.DeploymentStarStep")) {
        clDeploymentStarStep = (DeploymentStarStep) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.recipe.Ingredient")) {
        clIngredient = (Ingredient) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.recipe.JavaComponent")) {
        clJavaComponent = (JavaComponent) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.recipe.JavaScriptComponent")) {
        clJavaScriptComponent = (JavaScriptComponent) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.recipe.Infrastructure")) {
        clInfrastructure = (Infrastructure) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.recipe.Configuration")) {
        clConfiguration = (Configuration) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.recipe.ModelMapper")) {
        clModelMapper = (ModelMapper) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.recipe.Property")) {
        clProperty = (Property) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.recipe.HashProperty")) {
        clHashProperty = (HashProperty) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.recipe.KeyValuePair")) {
        clKeyValuePair = (KeyValuePair) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.recipe.MappingTecnologiy")) {
        clMappingTecnologiy = (MappingTecnologiy) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.recipe.Query")) {
        clQuery = (Query) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.recipe.QueryVariable")) {
        clQueryVariable = (QueryVariable) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.mapper.Mappers")) {
        clMappers = (Mappers) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.mapper.Version")) {
        clVersion = (Version) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.mapper.MappingLayer")) {
        clMappingLayer = (MappingLayer) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.mapper.JavaMapper")) {
        clJavaMapper = (JavaMapper) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.mapper.JavaPackageMapper")) {
        clJavaPackageMapper = (JavaPackageMapper) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.mapper.JavaScriptMapper")) {
        clJavaScriptMapper = (JavaScriptMapper) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.mapper.CSSMapper")) {
        clCSSMapper = (CSSMapper) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.mapper.RoleMapper")) {
        clRoleMapper = (RoleMapper) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.mapper.XMLPackageMapper")) {
        clXMLPackageMapper = (XMLPackageMapper) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.mapper.XMLTypeMapper")) {
        clXMLTypeMapper = (XMLTypeMapper) obj;
      }
      if (inhSwitch.equals(
          "org.tura.model.designer.repository.jpa.mapper.MetamodelPackageMapper")) {
        clMetamodelPackageMapper = (MetamodelPackageMapper) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.style.StyleLibrary")) {
        clStyleLibrary = (StyleLibrary) obj;
      }
      if (inhSwitch.equals("org.tura.model.designer.repository.jpa.style.StyleSet")) {
        clStyleSet = (StyleSet) obj;
      }
    }
  }
}
