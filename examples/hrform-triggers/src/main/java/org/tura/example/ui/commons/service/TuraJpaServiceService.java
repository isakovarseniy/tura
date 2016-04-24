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
package org.tura.example.ui.commons.service;

import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.object.TuraObject;
import org.tura.platform.object.persistence.EntityManagerHelper;
import org.tura.platform.services.JPAService;

import java.util.List;

import javax.annotation.Priority;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Alternative;

import javax.inject.Inject;

import javax.persistence.EntityManager;

@Alternative
@Priority(0)
@RequestScoped
public class TuraJpaServiceService extends JPAService {
    private static final long serialVersionUID = 1L;
    @Inject
    private EntityManagerHelper emHelper;

    @Override
    public EntityManager getEntityManager() {
        return emHelper.getEntityManager();
    }

    @Override
    public TuraObject create(String objectClass) throws Exception {
        try {
            getEntityManager().getTransaction().begin();

            return super.create(objectClass);
        } finally {
            getEntityManager().getTransaction().commit();

        }
    }

    @Override
    public List<?> find(List<SearchCriteria> searchCriteria,
        List<OrderCriteria> orderCriteria, Integer startIndex,
        Integer endIndex, String objectClass) throws Exception {
        try {
            return super.find(searchCriteria, orderCriteria, startIndex,
                endIndex, objectClass);
        } finally {
            emHelper.destroyEntityManager();
        }
    }
}
