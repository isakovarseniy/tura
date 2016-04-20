/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2015, Arseniy Isakov
 *
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
 *
 * Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.tura.example.ui.commons.datacontrol;

import org.tura.platform.datacontrol.ELResolver;

import java.io.Serializable;

import javax.el.ELContext;
import javax.el.ExpressionFactory;
import javax.el.ValueExpression;

import javax.enterprise.context.ApplicationScoped;

import javax.inject.Inject;

@ApplicationScoped
public class ELResolverImpl implements ELResolver, Serializable {
    private static final long serialVersionUID = 1L;
    @Inject
    private transient ExpressionFactory ef;
    @Inject
    private transient ELContext context;

    public Object getValue(String exp) {
        ValueExpression ve =
            ef.createValueExpression(context, exp, Object.class);
        return ve.getValue(context);

    }

    public void setValue(String exp, Object value) {
        ValueExpression ve =
            ef.createValueExpression(context, exp, Object.class);
        ve.setValue(context, value);
    }
}
