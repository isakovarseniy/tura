package com.turasolutions.sirius.diagram.producer.tura;

import java.util.ArrayList;
import java.util.List;

import com.turasolutions.sirius.diagram.producer.tura.config.items.artifact.ArtifactGroupConfigurator;
import com.turasolutions.sirius.dsl.treediagram.tTreeItem;

public class TuraArtifact
{
  public List<tTreeItem> getConfig()
  {
    ArrayList<tTreeItem> children = new ArrayList<tTreeItem>();
    children.add(
      ArtifactGroupConfigurator.create().addCreationDiagramNavigation("Artifact package", "Domain tree"));
    return children;
  }
}
