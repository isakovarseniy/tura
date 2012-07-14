package org.elsoft.component;

import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;

public class ELsoftCanvas extends Canvas {
  private String canvas;

  public ELsoftCanvas(Composite parent, int style) {
    super(parent, style);
  }

  public String getCanvas() {
    return canvas;
  }

  public void setCanvas(String canvas) {
    this.canvas = canvas;
  }
}
