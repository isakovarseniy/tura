package com.turasolutions.sirius.diagram.producer.tura;

import com.turasolutions.sirius.diagram.producer.tura.config.items.applicatioin.ApplicationConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.applicatioin.ApplicationGroupConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.applicatioin.ApplicationInfrastructureLayerConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.applicatioin.ApplicationInfrastructureLayersConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.applicatioin.ApplicationLanguagesConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.applicatioin.ApplicationMapperConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.applicatioin.ApplicationMappersConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.applicatioin.ApplicationMessageLibrariesConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.applicatioin.ApplicationMessageLibraryConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.applicatioin.ApplicationRealmConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.applicatioin.ApplicationRealmsConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.applicatioin.ApplicationRecipeConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.applicatioin.ApplicationRecipesConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.applicatioin.ApplicationStyleConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.applicatioin.ApplicationStyleLibrariesConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.applicatioin.ApplicationUILayerConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.applicatioin.ApplicationUIPackageConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.form.ControlsConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.form.FormConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.form.FormParameterConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.form.ViewsConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.infrastructure.EnterpriseInfrastructureConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.message.LanguageConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.message.MessageLibraryConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.recipe.RecipesConfigurator;
import com.turasolutions.sirius.dsl.treediagram.tTreeItem;
import java.util.ArrayList;
import java.util.List;

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
