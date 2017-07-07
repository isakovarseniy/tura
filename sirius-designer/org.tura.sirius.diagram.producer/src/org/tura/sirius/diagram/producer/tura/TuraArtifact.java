package org.tura.sirius.diagram.producer.tura;

import java.util.ArrayList;
import java.util.List;

import org.tura.sirius.diagram.producer.tura.config.items.artifact.ArtifactGroupConfigurator;
import org.tura.sirius.dsl.treediagram.tTreeItem;

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
