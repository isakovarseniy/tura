/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   http://sourceforge.net/p/tura/wiki/Home/
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.sirius.diagram.producer.tura;

import java.util.ArrayList;
import java.util.List;

import org.tura.sirius.diagram.producer.tura.config.items.applicatioin.ApplicationConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.applicatioin.ApplicationGroupConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.applicatioin.ApplicationInfrastructureLayerConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.applicatioin.ApplicationInfrastructureLayersConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.applicatioin.ApplicationLanguagesConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.applicatioin.ApplicationMapperConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.applicatioin.ApplicationMappersConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.applicatioin.ApplicationMessageLibrariesConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.applicatioin.ApplicationMessageLibraryConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.applicatioin.ApplicationRealmConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.applicatioin.ApplicationRealmsConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.applicatioin.ApplicationRecipeConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.applicatioin.ApplicationRecipesConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.applicatioin.ApplicationStyleConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.applicatioin.ApplicationStyleLibrariesConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.applicatioin.ApplicationUILayerConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.applicatioin.ApplicationUIPackageConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.form.ControlsConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.form.FormConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.form.FormParameterConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.form.ViewsConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.infrastructure.EnterpriseInfrastructureConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.message.LanguageConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.message.MessageLibraryConfigurator;
import org.tura.sirius.diagram.producer.tura.config.items.recipe.RecipesConfigurator;
import org.tura.sirius.dsl.treediagram.tTreeItem;

public class TuraApplicaton {
	public List<tTreeItem> getConfig() {
		ArrayList<tTreeItem> children = new ArrayList<tTreeItem>();
		children.add(ApplicationGroupConfigurator.create().addChild(ApplicationConfigurator.create().addChildren(() -> {
			ArrayList<tTreeItem> c1 = new ArrayList<tTreeItem>();
			c1.add(ApplicationRecipesConfigurator.create().addChild(ApplicationRecipeConfigurator.create().addChild(
					RecipesConfigurator.create().addCreationDiagramNavigation("Recipe diagram", "Domain tree"))));
			c1.add(ApplicationMappersConfigurator.create().addChild(ApplicationMapperConfigurator.create()
					.addCreationTreeNavigation("Mapping diagram", "Domain tree")));
			c1.add(ApplicationUILayerConfigurator.create()
					.addChild(ApplicationUIPackageConfigurator.create()
							.addChild(FormConfigurator.create()
									.addChild(ViewsConfigurator.create().addCreationDiagramNavigation("Views diagram",
											"Domain tree"))
									.addChild(ControlsConfigurator.create().addCreationDiagramNavigation("Data Control",
											"Domain tree"))
									.addChild(FormParameterConfigurator.create()))));
			c1.add(ApplicationInfrastructureLayersConfigurator.create()
					.addChild(ApplicationInfrastructureLayerConfigurator.create()
							.addChild(EnterpriseInfrastructureConfigurator.create()
									.addCreationDiagramNavigation("Infrastructure diagram", "Domain tree"))));
			c1.add(ApplicationStyleLibrariesConfigurator.create().addChild(
					ApplicationStyleConfigurator.create().addCreationTreeNavigation("Style library", "Domain tree")));
			c1.add(ApplicationRealmsConfigurator.create().addChild(ApplicationRealmConfigurator.create()
					.addCreationDiagramNavigation("Security rules set", "Domain tree")));
			c1.add(ApplicationMessageLibrariesConfigurator.create().addChildren(() -> {
				ArrayList<tTreeItem> c2 = new ArrayList<tTreeItem>();
				c2.add(ApplicationMessageLibraryConfigurator.create().addChild(MessageLibraryConfigurator.create()
						.addCreationTableNavigation("Message Library", "Domain tree")));
				c2.add(ApplicationLanguagesConfigurator.create().addChild(LanguageConfigurator.create()));
				return c2;
			}));
			return c1;
		})));
		return children;
	}
}
