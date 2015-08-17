/*******************************************************************************
 * Tura - application generation platform
 *
 * Copyright (c) 2012, 2015, Arseniy Isakov
 *  
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

/*
 * 
 */
package recipe.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import recipe.diagram.providers.DomainElementTypes;

/**
 * @generated
 */
public class DomainPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	* Creates "Objects" palette tool group
	* @generated
	*/
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createConfiguration1CreationTool());
		paletteContainer.add(createDeploymentSequence2CreationTool());
		paletteContainer.add(createInfrastructure3CreationTool());
		paletteContainer.add(createIngredient4CreationTool());
		paletteContainer.add(createJavaComponent5CreationTool());
		paletteContainer.add(createModelMapper6CreationTool());
		paletteContainer.add(createProperty7CreationTool());
		paletteContainer.add(createQuery8CreationTool());
		paletteContainer.add(createRecipe9CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Connections" palette tool group
	* @generated
	*/
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createDeployment1CreationTool());
		paletteContainer.add(createInfrastructures2CreationTool());
		paletteContainer.add(createRecipeConfig3CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createConfiguration1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Configuration1CreationTool_title,
				Messages.Configuration1CreationTool_desc,
				Collections.singletonList(DomainElementTypes.Configuration_302002));
		entry.setId("createConfiguration1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes.getImageDescriptor(DomainElementTypes.Configuration_302002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDeploymentSequence2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.DeploymentSequence2CreationTool_title,
				Messages.DeploymentSequence2CreationTool_desc,
				Collections.singletonList(DomainElementTypes.DeploymentSequence_302004));
		entry.setId("createDeploymentSequence2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes.getImageDescriptor(DomainElementTypes.DeploymentSequence_302004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInfrastructure3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Infrastructure3CreationTool_title,
				Messages.Infrastructure3CreationTool_desc,
				Collections.singletonList(DomainElementTypes.Infrastructure_302003));
		entry.setId("createInfrastructure3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes.getImageDescriptor(DomainElementTypes.Infrastructure_302003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createIngredient4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Ingredient4CreationTool_title,
				Messages.Ingredient4CreationTool_desc, Collections.singletonList(DomainElementTypes.Ingredient_303001));
		entry.setId("createIngredient4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes.getImageDescriptor(DomainElementTypes.Ingredient_303001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createJavaComponent5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.JavaComponent5CreationTool_title,
				Messages.JavaComponent5CreationTool_desc,
				Collections.singletonList(DomainElementTypes.JavaComponent_303002));
		entry.setId("createJavaComponent5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes.getImageDescriptor(DomainElementTypes.JavaComponent_303002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createModelMapper6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ModelMapper6CreationTool_title,
				Messages.ModelMapper6CreationTool_desc,
				Collections.singletonList(DomainElementTypes.ModelMapper_303003));
		entry.setId("createModelMapper6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes.getImageDescriptor(DomainElementTypes.ModelMapper_303003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createProperty7CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Property7CreationTool_title,
				Messages.Property7CreationTool_desc, Collections.singletonList(DomainElementTypes.Property_303005));
		entry.setId("createProperty7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes.getImageDescriptor(DomainElementTypes.Property_303005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createQuery8CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Query8CreationTool_title,
				Messages.Query8CreationTool_desc, Collections.singletonList(DomainElementTypes.Query_303004));
		entry.setId("createQuery8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes.getImageDescriptor(DomainElementTypes.Query_303004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createRecipe9CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Recipe9CreationTool_title,
				Messages.Recipe9CreationTool_desc, Collections.singletonList(DomainElementTypes.Recipe_302001));
		entry.setId("createRecipe9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes.getImageDescriptor(DomainElementTypes.Recipe_302001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDeployment1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Deployment1CreationTool_title,
				Messages.Deployment1CreationTool_desc,
				Collections.singletonList(DomainElementTypes.RecipeDeployment_304013));
		entry.setId("createDeployment1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes.getImageDescriptor(DomainElementTypes.RecipeDeployment_304013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInfrastructures2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Infrastructures2CreationTool_title,
				Messages.Infrastructures2CreationTool_desc,
				Collections.singletonList(DomainElementTypes.RecipeInfrastructures_304004));
		entry.setId("createInfrastructures2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes.getImageDescriptor(DomainElementTypes.RecipeInfrastructures_304004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createRecipeConfig3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.RecipeConfig3CreationTool_title,
				Messages.RecipeConfig3CreationTool_desc,
				Collections.singletonList(DomainElementTypes.InfrastructureRecipeConfig_304006));
		entry.setId("createRecipeConfig3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DomainElementTypes.getImageDescriptor(DomainElementTypes.InfrastructureRecipeConfig_304006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
