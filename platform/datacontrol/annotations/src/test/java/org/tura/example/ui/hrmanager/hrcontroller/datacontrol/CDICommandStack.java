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
package org.tura.example.ui.hrmanager.hrcontroller.datacontrol;

import org.tura.platform.datacontrol.CommandStack;
import org.tura.platform.datacontrol.annotations.Selector;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;

import javax.inject.Inject;

import javax.persistence.EntityManager;

@ApplicationScoped
@Selector("hrmanager.hrcontroller")
public class CDICommandStack extends CommandStack implements Serializable {
    private static final long serialVersionUID = 1L;
    @Inject
    private EntityManager em;

    @Override
    public void beginTransaction() {
        em.getTransaction().begin();

    }

    @Override
    public void commitTransaction() {
        em.getTransaction().commit();

    }

    @Override
    public void rallbackTransaction() {
        em.getTransaction().rollback();
    }
}
