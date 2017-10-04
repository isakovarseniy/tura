/**
 * Copyright (C) 2010 David Rousselie <drousselie@octo.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.octo.java.sql;

import static com.octo.java.sql.query.Query.insertInto;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;


import java.util.Map;

import org.junit.Test;

import com.octo.java.sql.query.InsertQuery;
import com.octo.java.sql.query.QueryException;

public class InsertQueryTest {
  @Test
  public void testShouldBuildInsertSQLQuery() throws QueryException {
    final InsertQuery query = insertInto("table").set("column1", 42).set(
        "column2", "value2");

    assertEquals(
        "INSERT INTO table (column1, column2) VALUES (:p1, :p2)",
        query.toSql());
    final Map<String, Object> params = query.getParams();
    assertEquals(2, (int)params.size());
    assertEquals(42, (int)params.get("p1"));
    assertEquals("value2", (String)params.get("p2"));
  }

  @Test
  public void testShouldBuildInsertSQLQueryInvertedColumns()
      throws QueryException {
    final InsertQuery query = insertInto("table").set("column2", "value2").set(
        "column1", 42);

    assertEquals(
        "INSERT INTO table (column2, column1) VALUES (:p1, :p2)",
        query.toSql());
    final Map<String, Object> params = query.getParams();
    assertEquals(2, (int)params.size());
    assertEquals(42, (int)params.get("p2"));
    assertEquals("value2", (String)params.get("p1"));
  }

  @Test
  public void testShouldBuildInsertSQLQueryWithDefaultValue()
      throws QueryException {
    final InsertQuery query = insertInto("table").set("column1", null, "3").set(
        "column2", null);

    assertEquals(
        "INSERT INTO table (column1, column2) VALUES (:p1, :p2)",
        query.toSql());
    final Map<String, Object> params = query.getParams();
    assertEquals(2, (int)params.size());
    assertEquals("3", (String)params.get("p1"));
    assertNull( params.get("p2"));
  }
}
