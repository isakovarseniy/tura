package com.turasolutions.sirius.diagram.producer.tura;

import java.util.ArrayList;
import java.util.List;

import com.turasolutions.sirius.diagram.producer.tura.config.items.form.InftastructureContextMenu;
import com.turasolutions.sirius.diagram.producer.tura.config.items.recipe.ConfigExtensionConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.recipe.ConfigurationConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.recipe.ConfigurationContextMenu;
import com.turasolutions.sirius.diagram.producer.tura.config.items.recipe.HashPropertiesConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.recipe.HashPropertyConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.recipe.Infrastructure2ConfigurationConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.recipe.InfrastructureConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.recipe.IngredientConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.recipe.JavaComponentConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.recipe.ModelMapperConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.recipe.PropertiesConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.recipe.PropertyConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.recipe.QueryConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.recipe.Recipe2InfrastructureConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.recipe.RecipeConfigurator;
import com.turasolutions.sirius.diagram.producer.tura.config.items.recipe.RecipeContextMenu;
import com.turasolutions.sirius.dsl.diagram.tContainer;
import com.turasolutions.sirius.dsl.diagram.tNode;
import com.turasolutions.sirius.dsl.diagram.tToolSection;

public class RecipeDiagram {
	public List<Object> getChildrens() {
		ArrayList<Object> list = new ArrayList<Object>();

		tContainer cnt = RecipeConfigurator.create()
				.addChild(IngredientConfigurator.create().addChild(JavaComponentConfigurator.create()
						.addChild(ModelMapperConfigurator.create().addChild(QueryConfigurator.create()))));

		list.add(cnt);

		tNode node = InfrastructureConfigurator.create();
		list.add(node);

		cnt = ConfigurationConfigurator.create();
		cnt.addChild(PropertiesConfigurator.create().addChild(PropertyConfigurator.create()));
		cnt.addChild(HashPropertiesConfigurator.create().addChild(HashPropertyConfigurator.create()));
		list.add(cnt);

		list.add(ConfigExtensionConfigurator.create());
		list.add(Recipe2InfrastructureConfigurator.create());
		list.add(Infrastructure2ConfigurationConfigurator.create());

		tToolSection nodeToolSection = new tToolSection("Nodes");
		list.add(nodeToolSection);
		nodeToolSection.addChildrens(RecipeConfigurator.getTools());
		nodeToolSection.addChildrens(IngredientConfigurator.getTools());
		nodeToolSection.addChildrens(JavaComponentConfigurator.getTools());
		nodeToolSection.addChildrens(ModelMapperConfigurator.getTools());
		nodeToolSection.addChildrens(QueryConfigurator.getTools());
		nodeToolSection.addChildrens(InfrastructureConfigurator.getTools());
		nodeToolSection.addChildrens(ConfigurationConfigurator.getTools());
		nodeToolSection.addChildrens(ConfigurationContextMenu.getMenu());
		nodeToolSection.addChildrens(RecipeContextMenu.getMenu());

		nodeToolSection = new tToolSection("Connection");
		list.add(nodeToolSection);
		nodeToolSection.addChildrens(ConfigExtensionConfigurator.getTools());
		nodeToolSection.addChildrens(Recipe2InfrastructureConfigurator.getTools());
		nodeToolSection.addChildrens(Infrastructure2ConfigurationConfigurator.getTools());
		nodeToolSection.addChildrens(InftastructureContextMenu.getMenu());

		return list;
	}
}
