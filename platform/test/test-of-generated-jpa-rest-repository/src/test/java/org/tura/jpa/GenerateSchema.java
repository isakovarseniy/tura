/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2022 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.jpa;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.hibernate.tool.schema.TargetType;

public class GenerateSchema {

    public static void main(String[] args) {
        Map<String, String> settings = new HashMap<>();
        settings.put("connection.driver_class", "org.h2.jdbcx.JdbcDataSource");
        settings.put("dialect", "org.hibernate.dialect.H2Dialect");
        settings.put("hibernate.connection.url", "jdbc:h2:mem:test");
        settings.put("hibernate.connection.username", "sa");
        settings.put("hibernate.connection.password", "sa");
        settings.put("show_sql", "true");
        settings.put("hibernate.default_schema", "HR");
 
        MetadataSources metadata = new MetadataSources(
                new StandardServiceRegistryBuilder()
                        .applySettings(settings)
                        .build());

        
        metadata.addAnnotatedClass(org.tura.jpa.test.One2Many1B.class);
        metadata.addAnnotatedClass(org.tura.jpa.test.JPAObject11.class);
        metadata.addAnnotatedClass(org.tura.jpa.test.C1.class);
        metadata.addAnnotatedClass(org.tura.jpa.test.One2One2A.class);
        metadata.addAnnotatedClass(org.tura.jpa.test.Q1.class);
        metadata.addAnnotatedClass(org.tura.jpa.test.DD1.class);
        metadata.addAnnotatedClass(org.tura.jpa.test.JPAObject8.class);
        metadata.addAnnotatedClass(org.tura.jpa.test.One2One1B.class);
        metadata.addAnnotatedClass(org.tura.jpa.test.One2Many3A.class);
        metadata.addAnnotatedClass(org.tura.jpa.test.One2One2B.class);
        metadata.addAnnotatedClass(org.tura.jpa.test.One2Many2A.class);
        metadata.addAnnotatedClass(org.tura.jpa.test.JPAObject4.class);
        metadata.addAnnotatedClass(org.tura.jpa.test.JPAObject6.class);
        metadata.addAnnotatedClass(org.tura.jpa.test.Client.class);
        metadata.addAnnotatedClass(org.tura.jpa.test.T1T2.class);
        metadata.addAnnotatedClass(org.tura.jpa.test.JPAObject7.class);
        metadata.addAnnotatedClass(org.tura.jpa.test.One2One3A.class);
        metadata.addAnnotatedClass(org.tura.jpa.test.JPAObject1.class);
        metadata.addAnnotatedClass(org.tura.jpa.test.Department1.class);
        metadata.addAnnotatedClass(org.tura.jpa.test.Q2.class);
        metadata.addAnnotatedClass(org.tura.jpa.test.IndepObject2.class);
        metadata.addAnnotatedClass(org.tura.jpa.test.Many2Many1A.class);
        metadata.addAnnotatedClass(org.tura.jpa.test.B2.class);
        metadata.addAnnotatedClass(org.tura.jpa.test.JPAObject3.class);
        metadata.addAnnotatedClass(org.tura.jpa.test.P1.class);
        metadata.addAnnotatedClass(org.tura.jpa.test.Location.class);
        metadata.addAnnotatedClass(org.tura.jpa.test.Order.class);
        metadata.addAnnotatedClass(org.tura.jpa.test.Customer.class);
        metadata.addAnnotatedClass(org.tura.jpa.test.One2One4B.class);
        metadata.addAnnotatedClass(org.tura.jpa.test.One2One1A.class);
        metadata.addAnnotatedClass(org.tura.jpa.test.Employee1.class);
        metadata.addAnnotatedClass(org.tura.jpa.test.One2One4A.class);
        metadata.addAnnotatedClass(org.tura.jpa.test.Many2Many1B.class);
        metadata.addAnnotatedClass(org.tura.jpa.test.JPAObject5.class);
        metadata.addAnnotatedClass(org.tura.jpa.test.Person.class);
        metadata.addAnnotatedClass(org.tura.jpa.test.Many2Many2A.class);
        metadata.addAnnotatedClass(org.tura.jpa.test.One2Many3B.class);
        metadata.addAnnotatedClass(org.tura.jpa.test.Phone.class);
        metadata.addAnnotatedClass(org.tura.jpa.test.JPAObject2.class);
        metadata.addAnnotatedClass(org.tura.jpa.test.Vehicle.class);
        metadata.addAnnotatedClass(org.tura.jpa.test.Employee2.class);
        metadata.addAnnotatedClass(org.tura.jpa.test.One2One3B.class);
        metadata.addAnnotatedClass(org.tura.jpa.test.Q4.class);
        metadata.addAnnotatedClass(org.tura.jpa.test.One2Many1A.class);
        metadata.addAnnotatedClass(org.tura.jpa.test.IndepObject1.class);
        metadata.addAnnotatedClass(org.tura.jpa.test.MailAddress.class);
        metadata.addAnnotatedClass(org.tura.jpa.test.B1.class);
        metadata.addAnnotatedClass(org.tura.jpa.test.T1.class);
        metadata.addAnnotatedClass(org.tura.jpa.test.File.class);
        metadata.addAnnotatedClass(org.tura.jpa.test.One2Many2B.class);
        metadata.addAnnotatedClass(org.tura.jpa.test.Many2Many2B.class);
        metadata.addAnnotatedClass(org.tura.jpa.test.Department2.class);
        metadata.addAnnotatedClass(org.tura.jpa.test.Q3.class);


        SchemaExport schemaExport = new SchemaExport( );
        schemaExport.setHaltOnError(true);
        schemaExport.setFormat(true);
        schemaExport.setDelimiter(";");
        schemaExport.setOutputFile("first-db-schema.sql");
        schemaExport.create(EnumSet.of( TargetType.SCRIPT ), metadata.buildMetadata());
        
        
        
        //Second db
        settings = new HashMap<>();
        settings.put("connection.driver_class", "org.h2.jdbcx.JdbcDataSource");
        settings.put("dialect", "org.hibernate.dialect.H2Dialect");
        settings.put("hibernate.connection.url", "jdbc:h2:mem:test");
        settings.put("hibernate.connection.username", "sa");
        settings.put("hibernate.connection.password", "sa");
        settings.put("show_sql", "true");
        settings.put("hibernate.default_schema", "HR");
 
        metadata = new MetadataSources(
                new StandardServiceRegistryBuilder()
                        .applySettings(settings)
                        .build());

                
        metadata.addAnnotatedClass(org.tura.jpa2.test.JPAObjectSecondDb.class);
        
        schemaExport = new SchemaExport( );
        schemaExport.setHaltOnError(true);
        schemaExport.setFormat(true);
        schemaExport.setDelimiter(";");
        schemaExport.setOutputFile("second-db-schema.sql");
        schemaExport.create(EnumSet.of( TargetType.SCRIPT ), metadata.buildMetadata());
        
        
        
        
    }

    
}
