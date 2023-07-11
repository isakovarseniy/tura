/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.kie.server.services.impl.security;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Stack;

import org.kie.internal.identity.IdentityProvider;
import org.kie.server.api.security.SecurityAdapter;

public abstract class BaseIdentityProvider
        implements IdentityProvider {

    protected Stack<String> contextUsers;

    protected static final ServiceLoader<SecurityAdapter> securityAdapters = ServiceLoader.load(SecurityAdapter.class);

    protected List<SecurityAdapter> adapters = new ArrayList<>();

    public BaseIdentityProvider() {
        for (SecurityAdapter adapter : securityAdapters) {
            adapters.add(adapter);
        }
        contextUsers = new Stack<>();
    }


    protected String getNameFromAdapter() {
        for (SecurityAdapter adapter : adapters) {
            String name = adapter.getUser();
            if (name != null && !name.isEmpty()) {
                return name;
            }
        }

        return "unknown";
    }

    protected List<String> getRolesFromAdapter() {
        List<String> roles = new ArrayList<String>();

        for (SecurityAdapter adapter : adapters) {
            List<String> adapterRoles = adapter.getRoles();
            if (adapterRoles != null && !adapterRoles.isEmpty()) {
                roles.addAll(adapterRoles);
            }
        }

        return roles;
    }
}