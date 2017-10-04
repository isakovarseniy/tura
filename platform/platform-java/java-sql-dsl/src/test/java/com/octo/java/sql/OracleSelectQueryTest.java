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

import static com.octo.java.sql.query.Query.c;
import static com.octo.java.sql.query.Query.select;
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.octo.java.sql.query.QueryException;
import com.octo.java.sql.query.SelectQuery;
import com.octo.java.sql.query.visitor.OracleQueryBuilder;

public class OracleSelectQueryTest {
  @Before
  public void setUp() {
    SelectQuery.setDefaultQueryBuilder(getDefaultBuilder());
  }

  private  String getDefaultBuilder(){
	  return OracleQueryBuilder.class.getName();
  }
  
  
  @After
  public void tearDown() {
    SelectQuery.resetDefaultQueryBuilder();
  }

  @Test
  public void testShouldBuildSQLQueryWithLimit() throws QueryException {
    final SelectQuery query = select("*").from("table").limit(10L);

    assertEquals("SELECT * FROM (SELECT * FROM table) WHERE (rownum<=:p1)",
        query.toSql());
    assertEquals(1, (int)query.getParams().size());
    assertEquals(10L, (long)query.getParams().get("p1"));
  }

  @Test
  public void testShouldBuildSQLQueryWithWhereClauseAndLimit()
      throws QueryException {
    final SelectQuery query = select("*").from("table") //
        .where(c("column")).eq("columnValue").limit(10L);

    assertEquals(
        "SELECT * FROM (SELECT * FROM table WHERE (column = :p1)) WHERE (rownum<=:p2)",
        query.toSql());
    assertEquals(2, (int)query.getParams().size());
    assertEquals("columnValue", (String)query.getParams().get("p1"));
    assertEquals(10L, (long)query.getParams().get("p2"));
  }

}
