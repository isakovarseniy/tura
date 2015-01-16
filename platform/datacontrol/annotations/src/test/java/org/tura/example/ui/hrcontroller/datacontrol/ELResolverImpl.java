package org.tura.example.ui.hrcontroller.datacontrol;

import org.tura.platform.datacontrol.ELResolver;

import java.io.Serializable;

import javax.el.ELContext;
import javax.el.ExpressionFactory;
import javax.el.ValueExpression;

import javax.enterprise.context.ApplicationScoped;

import javax.inject.Inject;
import javax.inject.Named;

@Named("elResolver")
@ApplicationScoped
public class ELResolverImpl implements ELResolver, Serializable {
	private static final long serialVersionUID = 1L;
	@Inject
	private transient ExpressionFactory ef;
	@Inject
	private transient ELContext context;

	public Object getValue(String exp) {
		ValueExpression ve = ef.createValueExpression(context, exp,
				Object.class);
		return ve.getValue(context);

	}

	public void setValue(String exp, Object value) {
		ValueExpression ve = ef.createValueExpression(context, exp,
				Object.class);
		ve.setValue(context, value);
	}
}
