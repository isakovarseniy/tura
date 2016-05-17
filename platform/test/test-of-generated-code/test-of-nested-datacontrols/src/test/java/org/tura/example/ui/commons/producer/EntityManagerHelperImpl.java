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
package org.tura.example.ui.commons.producer;

import java.io.Serializable;

import javax.annotation.Priority;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Alternative;

import javax.inject.Inject;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.tura.platform.object.persistence.EntityManagerHelper;

@Alternative
@Priority(0)
@ApplicationScoped
public class EntityManagerHelperImpl implements EntityManagerHelper, Serializable {
    private static final long serialVersionUID = 1L;
    @Inject
    private EntityManagerFactory emf;
    private EntityManager em;

    public EntityManager getEntityManager() {
        if (em == null) {
            em = emf.createEntityManager();
        }
        return em;
    }

    public void destroyEntityManager() {
        if (em.isOpen()) {
            em.close();
        }
        em = null;
    }
}
