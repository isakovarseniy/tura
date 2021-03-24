/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.tura.platform.repository.jpa.operation;

import java.lang.reflect.Method;
import java.util.List;

import org.apache.commons.lang.WordUtils;
import org.tura.platform.repository.core.Registry;
import org.tura.platform.repository.core.RepoKeyPath;
import org.tura.platform.repository.core.RepositoryCommandType;
import org.tura.platform.repository.core.RepositoryException;
import org.tura.platform.repository.core.RepositoryHelper;
import org.tura.platform.repository.spa.SpaControl;
import org.tura.platform.repository.spa.SpaObjectRegistry;
import org.tura.platform.repository.spa.SpaRepositoryCommand;

public class JpaUpdateOperation extends SpaRepositoryCommand {

	private static final long serialVersionUID = -3182728113293903808L;
	Object pk;
    String className;
    String property;
    Object value;

    public JpaUpdateOperation(Registry registry,SpaObjectRegistry spaRegistry) {
        super(registry,spaRegistry);
    }

    public Object getPk() {
        return pk;
    }

    public void setPk(Object pk) {
        this.pk = pk;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    @Override
    public List<SpaControl> prepare() throws RepositoryException {
        try {
            JpaSearchService sp = (JpaSearchService) this.providerHash.get(className);
            Object object = sp.find(getPk(), getClassName());
            String name = "set" + WordUtils.capitalize(getProperty());
            Method m;
            if (getValue() != null) {
              m = object.getClass().getMethod(name, getValue().getClass());
            }else {
              m= new RepositoryHelper(null).getMethodsToSetNull(object.getClass(), name);
            }
            m.invoke(object, getValue());

            this.knownObjects.add(getClassName());

            return null;
        } catch (Exception e) {
            throw new RepositoryException(e);
        }
    }

    @Override
    public boolean checkCommand(RepositoryCommandType cmdType, Object... parameters) throws RepositoryException {

        RepoKeyPath pk_ = (RepoKeyPath) parameters[0];
        String property_ = (String) parameters[1];
        Object value_ = parameters[2];

        setProperty(property_);
        setValue(value_);
        setClassName(getJpaPersistanceClassName(pk_));
        setPk(getJpaPrimaryKey(pk_));

        this.knownObjects.add(className);

        return true;
    }

}

