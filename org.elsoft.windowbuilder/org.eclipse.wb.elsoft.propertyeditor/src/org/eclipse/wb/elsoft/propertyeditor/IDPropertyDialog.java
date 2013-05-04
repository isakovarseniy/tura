package org.eclipse.wb.elsoft.propertyeditor;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.internal.core.DesignerPlugin;
import org.eclipse.wb.internal.core.model.ModelMessages;
import org.eclipse.wb.internal.core.model.property.Property;
import org.eclipse.wb.internal.core.utils.execution.ExecutionUtils;
import org.eclipse.wb.internal.core.utils.execution.RunnableEx;
import org.eclipse.wb.internal.core.utils.ui.GridDataFactory;
import org.eclipse.wb.internal.core.utils.ui.dialogs.ResizableDialog;

public final class IDPropertyDialog extends ResizableDialog {
  ////////////////////////////////////////////////////////////////////////////
  //
  // Final fields
  //
  ////////////////////////////////////////////////////////////////////////////
  private final Property m_property;
  private String dialogValue;

  ////////////////////////////////////////////////////////////////////////////
  //
  // Constructor
  //
  ////////////////////////////////////////////////////////////////////////////
  public IDPropertyDialog(Shell parentShell, Property property) throws Exception {
    super(parentShell, DesignerPlugin.getDefault());
      m_property = property;
  }

  ////////////////////////////////////////////////////////////////////////////
  //
  // GUI
  //
  ////////////////////////////////////////////////////////////////////////////
  private Text m_valueText;

  @Override
  public void create() {
    super.create();
    // show initial source/key
    updateSourceKey();
    m_valueText.selectAll();
  }

  @Override
  protected Control createDialogArea(Composite parent) {
    Composite area = (Composite) super.createDialogArea(parent);
    // value
    {
      m_valueText = new Text(area, SWT.BORDER | SWT.MULTI | SWT.WRAP);
      GridDataFactory.create(m_valueText).grab().hintC(80, 8).fill();
      // initial value
      ExecutionUtils.runLog(new RunnableEx() {
        public void run() throws Exception {
          Object value = m_property.getValue();
          if (value instanceof String) {
            m_valueText.setText((String) value);
          }
        }
      });
      // handle Ctrl+Enter as OK
      m_valueText.addKeyListener(new KeyAdapter() {
        @Override
        public void keyPressed(KeyEvent e) {
          if (e.stateMask == SWT.CTRL && e.keyCode == SWT.CR) {
            okPressed();
          }
        }
      });
    }
    //
    return area;
  }

  /**
   * Shows source/key in {@link Control}'s.
   */
  private void updateSourceKey() {

  }

  ////////////////////////////////////////////////////////////////////////////
  //
  // Shell
  //
  ////////////////////////////////////////////////////////////////////////////
  @Override
  protected void configureShell(Shell newShell) {
    super.configureShell(newShell);
    newShell.setText(ModelMessages.StringPropertyDialog_title);
  }

  @Override
  protected void okPressed() {
    dialogValue = m_valueText.getText();
    super.okPressed();
  }

public String getDialogValue() {
	return dialogValue;
}
  
}
