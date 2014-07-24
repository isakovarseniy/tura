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
import static com.octo.java.sql.query.Query.e;
import static com.octo.java.sql.query.Query.f;
import static com.octo.java.sql.query.Query.select;
import static org.easymock.EasyMock.createMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.easymock.EasyMock.verify;
import static org.junit.Assert.assertEquals;

import java.util.Map;

import org.junit.Test;

import com.octo.java.sql.exp.JavaSQLFunc;
import com.octo.java.sql.exp.Nullable;
import com.octo.java.sql.exp.Operator;
import com.octo.java.sql.exp.JavaSQLFunc.Evaluable;
import com.octo.java.sql.query.Query;
import com.octo.java.sql.query.QueryException;
import com.octo.java.sql.query.QueryGrammarException;
import com.octo.java.sql.query.SelectQuery;
import com.octo.java.sql.query.visitor.OracleQueryBuilder;

public class SelectQueryTest {
  @Test
  public void testShouldBuildSQLQueryWithoutWhereClause() throws QueryException {
    final SelectQuery query = select("*").from("table");

    assertEquals("SELECT * FROM table", query.toSql());
    assertEquals(0, query.getParams().size());
  }

  @Test
  public void testShouldBuildSQLQueryWithOneWhereClause() throws QueryException {
    final SelectQuery query = select("*").from("table") //
        .where(c("column")).eq("columnValue");

    assertEquals("SELECT * FROM table WHERE (column = :p1)", query.toSql());
    assertEquals(1, query.getParams().size());
    assertEquals("columnValue", query.getParams().get("p1"));
  }

  @Test
  public void testShouldBuildSQLQueryWithOneIsNullWhereClause()
      throws QueryException {
    final SelectQuery query = select("*").from("table") //
        .where(c("column")).isNull();

    assertEquals("SELECT * FROM table WHERE (column IS NULL)", query.toSql());
    assertEquals(0, query.getParams().size());
  }

  @Test
  public void testShouldBuildSQLQueryWithOneWhereClauseAndGivenOperator()
      throws QueryException {
    final SelectQuery query = select("*").from("table") //
        .where(c("column")).op(Operator.EQ, "columnValue");

    assertEquals("SELECT * FROM table WHERE (column = :p1)", query.toSql());
    assertEquals(1, query.getParams().size());
    assertEquals("columnValue", query.getParams().get("p1"));
  }

  @Test
  public void testShouldBuildSQLQueryWithLimit() throws QueryException {
    final SelectQuery query = select("*").from("table").limit(10L);

    assertEquals("SELECT * FROM table LIMIT :p1", query.toSql());
    assertEquals(1, query.getParams().size());
    assertEquals(10L, query.getParams().get("p1"));
  }

  @Test
  public void testShouldBuildSQLQueryWithWhereClauseAndLimit()
      throws QueryException {
    final SelectQuery query = select("*").from("table") //
        .where(c("column")).eq("columnValue").limit(10L);

    assertEquals("SELECT * FROM table WHERE (column = :p1) LIMIT :p2",
        query.toSql());
    assertEquals(2, query.getParams().size());
    assertEquals("columnValue", query.getParams().get("p1"));
    assertEquals(10L, query.getParams().get("p2"));
  }

  @Test
  public void testShouldBuildSQLQueryWithOneWhereInClauseSimplified()
      throws QueryException {
    final SelectQuery query = select("*").from("table") //
        .where(c("column")).in("columnValue1", "columnValue2");

    assertEquals("SELECT * FROM table WHERE (column IN (:p1,:p2))",
        query.toSql());
    assertEquals(2, query.getParams().size());
    assertEquals("columnValue1", query.getParams().get("p1"));
    assertEquals("columnValue2", query.getParams().get("p2"));
  }

  @Test(expected = QueryGrammarException.class)
  public void testShouldBuildSQLQueryWithOneWhereInClauseAndANullValue()
      throws QueryException {
    final SelectQuery query = select("*").from("table") //
        .where(c("column")).in((Object[]) null);

    query.toSql();
  }

  @Test
  public void testShouldBuildSQLQueryWithOneWhereNotInClauseSimplified()
      throws QueryException {
    final SelectQuery query = select("*").from("table") //
        .where(c("column")).notIn("columnValue1", "columnValue2");

    assertEquals(
        "SELECT * FROM table WHERE (column NOT IN (:p1,:p2))", query
            .toSql());
    assertEquals(2, query.getParams().size());
    assertEquals("columnValue1", query.getParams().get("p1"));
    assertEquals("columnValue2", query.getParams().get("p2"));
  }

  @Test
  public void testShouldBuildSQLQueryWithNestedInExp() throws QueryException {
    final SelectQuery query = select("*").from("table") //
        .where(c("column")) //
        .in(select(c("columnIn")).from("tableIn").where(c("columnIn")).eq(2));

    assertEquals(
        "SELECT * FROM table WHERE (column IN ((SELECT columnIn FROM tableIn WHERE (columnIn = :p1))))",
        query.toSql());
    assertEquals(1, query.getParams().size());
    assertEquals(2, query.getParams().get("p1"));
  }

  @Test
  public void testShouldBuildSQLQueryWithOneWhereInClauseAndComparisonClause()
      throws QueryException {
    final SelectQuery query = select("*").from("table") //
        .where(c("column")).eq("columnValue1") //
        .and(c("otherColumn")).in("columnValue2", "columnValue3");

    assertEquals(
        "SELECT * FROM table WHERE ((column = :p1) AND (otherColumn IN (:p2,:p3)))",
        query.toSql());
    assertEquals(3, query.getParams().size());
    assertEquals("columnValue1", query.getParams().get("p1"));
    assertEquals("columnValue2", query.getParams().get("p2"));
    assertEquals("columnValue3", query.getParams().get("p3"));
  }

  @Test
  public void testShouldBuildSQLQueryWithOneWhereClauseAndANullValue()
      throws QueryException {
    final SelectQuery query = select("*").from("table") //
        .where(c("column")).eq(null);

    assertEquals("SELECT * FROM table WHERE (column IS NULL)", query.toSql());
    assertEquals(0, query.getParams().size());
  }

  @Test
  public void testShouldBuildSQLQueryWithOneWhereEqOrIsNullClauseAndNullValue()
      throws QueryException {
    final SelectQuery query = select("*").from("table") //
        .where(c("column")).eqOrIsNull(null);

    assertEquals("SELECT * FROM table WHERE (column IS NULL)", query.toSql());
    assertEquals(0, query.getParams().size());
  }

  @Test
  public void testShouldBuildSQLQueryWithOneWhereEqOrIsNullClauseAndNotNullValue()
      throws QueryException {
    final SelectQuery query = select("*").from("table") //
        .where(c("column")).eqOrIsNull(42);

    assertEquals("SELECT * FROM table WHERE (column = :p1)", query.toSql());
    assertEquals(1, query.getParams().size());
    assertEquals(42, query.getParams().get("p1"));
  }

  @Test
  public void testShouldBuildSQLQueryWithOneWhereEqClauseAndANullableNullValue()
      throws QueryException {
    final SelectQuery query = select("*").from("table") //
        .where(c("column")).eq(new Nullable(null));

    assertEquals("SELECT * FROM table WHERE (column IS NULL)", query.toSql());
    assertEquals(0, query.getParams().size());
  }

  @Test
  public void testShouldBuildSQLQueryWithOneWhereEqClauseAndANullableNotNullValue()
      throws QueryException {
    final SelectQuery query = select("*").from("table") //
        .where(c("column")).eq(new Nullable(42));

    assertEquals("SELECT * FROM table WHERE (column = :p1)", query.toSql());
    assertEquals(1, query.getParams().size());
    assertEquals(42, query.getParams().get("p1"));
  }

  @Test
  public void testShouldBuildSQLQueryWithMoreThanOneWhereClauseSimplified()
      throws QueryException {
    final SelectQuery query = select("*").from("table") //
        .where(c("column")).eq("columnValue") //
        .and(c("otherColumn")).eq("otherColumnValue");

    assertEquals(
        "SELECT * FROM table WHERE ((column = :p1) AND (otherColumn = :p2))",
        query.toSql());
    assertEquals(2, query.getParams().size());
    assertEquals("columnValue", query.getParams().get("p1"));
    assertEquals("otherColumnValue", query.getParams().get("p2"));
  }

  @Test
  public void testShouldBuildSQLQueryWithMoreThanOneWhereClauseAndANullValue()
      throws QueryException {
    final SelectQuery query = select("*").from("table") //
        .where(c("column")).eq(null) //
        .and(c("otherColumn")).eq(null) //
        .and(c("lastColumn")).eq("lastColumnValue");

    assertEquals(
        "SELECT * FROM table WHERE (((column IS NULL) AND (otherColumn IS NULL)) AND (lastColumn = :p1))",
        query.toSql());
    assertEquals(1, query.getParams().size());
    assertEquals("lastColumnValue", query.getParams().get("p1"));
  }

  @Test
  public void testShouldBuildSQLQueryWithOneJoinClauseSimpleOn()
      throws QueryException {
    final SelectQuery query = select("*").from("table1") //
        .innerJoin("table2").on(c("table1.column")).eq(c("table2.column"));

    assertEquals(
        "SELECT * FROM table1 INNER JOIN table2 ON (table1.column = table2.column)",
        query.toSql());
    assertEquals(0, query.getParams().size());
  }

  @Test
  public void testShouldBuildSQLQueryWithOneJoinClauseComplexOnAndWhereClause()
      throws QueryException {
    final SelectQuery query = select("*").from("table1") //
        .innerJoin("table2").on(e(c("table1.column")).eq(c("table2.column")) //
            .and(c("table1.otherColumn")).geq(42L)) //
        .where(c("lastColumn")).eq("test");

    assertEquals(
        "SELECT * FROM table1 INNER JOIN table2 ON ((table1.column = table2.column) AND (table1.otherColumn >= :p1)) WHERE (lastColumn = :p2)",
        query.toSql());
    assertEquals(2, query.getParams().size());
    assertEquals(42L, query.getParams().get("p1"));
    assertEquals("test", query.getParams().get("p2"));
  }

  @Test
  public void testShouldBuildSQLQueryWithOneWhereClauseOrderBy()
      throws QueryException {
    final SelectQuery query = select("*").from("table") //
        .where(c("column")).eq("columnValue").orderBy("column");

    assertEquals(
        "SELECT * FROM table WHERE (column = :p1) ORDER BY column", query
            .toSql());
    assertEquals(1, query.getParams().size());
    assertEquals("columnValue", query.getParams().get("p1"));
  }

  @Test
  public void testShouldBuildSQLQueryWithOneWhereClauseAndMultipleOrderBy()
      throws QueryException {
    final SelectQuery query = select("*").from("table") //
        .where(c("column")).eq("columnValue") //
        .orderBy("column1").asc() //
        .orderBy("column2").desc();

    assertEquals(
        "SELECT * FROM table WHERE (column = :p1) ORDER BY column1 ASC, column2 DESC",
        query.toSql());
    assertEquals(1, query.getParams().size());
    assertEquals("columnValue", query.getParams().get("p1"));
  }

  @Test
  public void testShouldBuildSQLQueryWithOneWhereClauseNotNeededOrderBy()
      throws QueryException {
    final SelectQuery query = select("*").from("table") //
        .where(c("column")).eq("columnValue") //
        .orderBy("columnValue", false);

    assertEquals("SELECT * FROM table WHERE (column = :p1)", query.toSql());
    assertEquals(1, query.getParams().size());
    assertEquals("columnValue", query.getParams().get("p1"));
  }

  @Test
  public void testShouldBuildSQLQueryOrderBy() throws QueryException {
    final SelectQuery query = select("*").from("table").orderBy("columnValue");

    assertEquals("SELECT * FROM table ORDER BY columnValue", query.toSql());
    assertEquals(0, query.getParams().size());
  }

  @Test
  public void testShouldBuildSQLQueryOrderByAsc() throws QueryException {
    final SelectQuery query = select("*").from("table") //
        .orderBy("columnValue").asc();

    assertEquals("SELECT * FROM table ORDER BY columnValue ASC", query.toSql());
    assertEquals(0, query.getParams().size());
  }

  @Test
  public void testShouldBuildSQLQueryOrderByDesc() throws QueryException {
    final SelectQuery query = select("*").from("table") //
        .orderBy("columnValue").desc();

    assertEquals("SELECT * FROM table ORDER BY columnValue DESC", query.toSql());
    assertEquals(0, query.getParams().size());
  }

  @Test
  public void testShouldBuildSQLQueryWithOneIsNotNullWhereClause()
      throws QueryException {
    final SelectQuery query = select("*").from("table") //
        .where(c("column")).isNotNull();

    assertEquals("SELECT * FROM table WHERE (column IS NOT NULL)", query
        .toSql());
    assertEquals(0, query.getParams().size());
  }

  @Test
  public void testShouldBuildSQLQueryStartWith() throws QueryException {
    final SelectQuery query = select("*").from("table") //
        .where(c("column")).startWith("str");

    assertEquals("SELECT * FROM table WHERE (column LIKE :p1)", query
        .toSql());
    assertEquals(1, query.getParams().size());
    assertEquals("str%", query.getParams().get("p1"));
  }

  @Test(expected = QueryGrammarException.class)
  public void testShouldBuildSQLQueryStartWithNullExp() throws QueryException {
    final SelectQuery query = select("*").from("table") //
        .where(c("column")).startWith(null);

    query.toSql();
  }

  @Test(expected = QueryGrammarException.class)
  public void testShouldBuildSQLQueryStartWithEmptyString()
      throws QueryException {
    final SelectQuery query = select("*").from("table") //
        .where(c("column")).startWith("");

    query.toSql();
  }

  @Test
  public void testShouldBuildSQLQueryWithContains() throws QueryException {
    final SelectQuery query = select("*").from("table") //
        .where(c("column")).contains("str");

    assertEquals("SELECT * FROM table WHERE (column LIKE :p1)", query
        .toSql());
    assertEquals(1, query.getParams().size());
    assertEquals("%str%", query.getParams().get("p1"));
  }

  @Test(expected = QueryGrammarException.class)
  public void testShouldBuildSQLQueryWithContainsWithNull()
      throws QueryException {
    final SelectQuery query = select("*").from("table") //
        .where(c("column")).contains(null);

    query.toSql();
  }

  @Test(expected = QueryGrammarException.class)
  public void testShouldBuildSQLQueryWithContainsWithEmptyString()
      throws QueryException {
    final SelectQuery query = select("*").from("table") //
        .where(c("column")).contains("");

    query.toSql();
  }

  @Test
  public void testShouldBuildSQLQueryWithInterlinkedCompExp()
      throws QueryException {
    final SelectQuery query = select("*").from("table") //
        .where(c("column")).isNull() //
        .and(e(c("column")).eq("value").or(c("column")).eq("value"));

    assertEquals(
        "SELECT * FROM table WHERE ((column IS NULL) AND ((column = :p1) OR (column = :p2)))",
        query.toSql());
    assertEquals(2, query.getParams().size());
  }

  @Test
  public void testShouldBuildSQLQueryWithBetweenSign() throws QueryException {
    final SelectQuery query = select("*").from("table") //
        .where(c("column")).between("valueStart", "valueEnd") //
        .and(c("column")).eq("value");

    assertEquals(
        "SELECT * FROM table WHERE ((column BETWEEN :p1 AND :p2) AND (column = :p3))",
        query.toSql());
    final Map<String, Object> params = query.getParams();
    assertEquals(3, params.size());
    assertEquals("valueStart", params.get("p1"));
    assertEquals("valueEnd", params.get("p2"));
    assertEquals("value", params.get("p3"));
  }

  @Test(expected = QueryGrammarException.class)
  public void testShouldBuildSQLQueryWithoutBetweenSignWhenValuesAreNull()
      throws QueryException {
    final SelectQuery query = select("*").from("table") //
        .where(c("column")).between(null, null) //
        .and(c("column")).eq("value");

    query.toSql();
  }

  @Test
  public void testShouldBuildSQLQueryWithFunctionInColumnNames()
      throws QueryException {
    final SelectQuery query = select(f("myFunc", "param", 2)).from("table") //
        .where(c("column")).eq(42);

    assertEquals(
        "SELECT myFunc(:p1,:p2) FROM table WHERE (column = :p3)",
        query.toSql());
    final Map<String, Object> params = query.getParams();
    assertEquals(3, params.size());
    assertEquals("param", params.get("p1"));
    assertEquals(2, params.get("p2"));
    assertEquals(42, params.get("p3"));
  }

  @Test
  public void testShouldBuildSQLQueryWithFunctionWithAliasInColumnNames()
      throws QueryException {
    final SelectQuery query = select(f("myFunc", "param", 2).as("myAlias")) //
        .from("table") //
        .where(c("column")).eq(42);

    assertEquals(
        "SELECT myFunc(:p1,:p2) AS myAlias FROM table WHERE (column = :p3)",
        query.toSql());
    final Map<String, Object> params = query.getParams();
    assertEquals(3, params.size());
    assertEquals("param", params.get("p1"));
    assertEquals(2, params.get("p2"));
    assertEquals(42, params.get("p3"));
  }

  @Test
  public void testShouldBuildSQLQueryWithColNameAndFunctionInColumnNames()
      throws QueryException {
    final SelectQuery query = select(c("col1"), //
        f("myFunc", c("colparam"), 2), //
        c("col3"), //
        f("mySecondFunc", "param2", 22)) //
        .from("table") //
        .where(c("column")).eq(42);

    final String sqlQuery = query.toSql();
    final Map<String, Object> params = query.getParams();

    assertEquals(4, params.size());
    assertEquals(2, params.get("p1"));
    assertEquals("param2", params.get("p2"));
    assertEquals(22, params.get("p3"));
    assertEquals(42, params.get("p4"));

    assertEquals(
        "SELECT col1,myFunc(colparam,:p1),col3,mySecondFunc(:p2,:p3) FROM table WHERE (column = :p4)",
        sqlQuery);

  }

  @Test
  public void testShouldBuildSQLQueryWithFunctionInWhereClause()
      throws QueryException {
    final SelectQuery query = select("*") //
        .from("table") //
        .where(f("upper", c("column"))).eq("AA");

    assertEquals("SELECT * FROM table WHERE (upper(column) = :p1)", query
        .toSql());
    final Map<String, Object> params = query.getParams();
    assertEquals(1, params.size());
    assertEquals("AA", params.get("p1"));
  }

  @Test
  public void testShouldBuildSQLQueryWithFunctionInEqClause()
      throws QueryException {
    final SelectQuery query = select("*") //
        .from("table") //
        .where(c("column")).eq(f("myFunc", "AA"));

    assertEquals("SELECT * FROM table WHERE (column = myFunc(:p1))", query
        .toSql());
    final Map<String, Object> params = query.getParams();
    assertEquals(1, params.size());
    assertEquals("AA", params.get("p1"));
  }

  @SuppressWarnings("unchecked")
  @Test
  public void testShouldBuildSQLQueryWithMockFunctionInColumnNames()
      throws QueryException {
    final Evaluable<String> funcMock = createMock(JavaSQLFunc.Evaluable.class);
    expect(funcMock.eval("param", 1)).andReturn("1");
    expect(funcMock.eval("param2", 2)).andReturn("2");
    replay(funcMock);
    final OracleQueryBuilder queryBuilder = new OracleQueryBuilder();
    queryBuilder.addFunction("myFunc", funcMock);
    final SelectQuery query = select(f("myFunc", "param", 1),
        f("myFunc", "param2", 2)) //
        .from("table") //
        .where(c("column")).eq(42);

    assertEquals("SELECT 1,2 FROM table WHERE (column = :p1)", query
        .toSql(queryBuilder));
    verify(funcMock);
    final Map<String, Object> params = query.getParams();
    assertEquals(1, params.size());
    assertEquals(42, params.get("p1"));
    Query.clearVisitors();
  }

  @Test
  public void testShouldBuildSQLQueryWithFunctionInAndClause()
      throws QueryException {
    final SelectQuery query = select("*") //
        .from("table") //
        .where(c("col")).eq(42) //
        .and(f("upper", c("column"))).eq("AA");

    assertEquals(
        "SELECT * FROM table WHERE ((col = :p1) AND (upper(column) = :p2))",
        query.toSql());
    final Map<String, Object> params = query.getParams();
    assertEquals(2, params.size());
    assertEquals(42, params.get("p1"));
    assertEquals("AA", params.get("p2"));
  }

  @Test
  public void testShouldBuildSQLQueryWith1ValueAndEqualSign()
      throws QueryException {
    final SelectQuery query = select("*").from("table") //
        .where(c("col")).eq("val") //
        .and(c("column")).betweenOrOp(Operator.EQ, "valueStart", "valueEnd") //
        .and(c("column")).eq("value"); //

    assertEquals(
        "SELECT * FROM table WHERE (((col = :p1) AND (column = :p2)) AND (column = :p3))",
        query.toSql());
    final Map<String, Object> params = query.getParams();
    assertEquals(3, params.size());
    assertEquals("val", params.get("p1"));
    assertEquals("valueStart", params.get("p2"));
    assertEquals("value", params.get("p3"));
  }

  @Test
  public void testShouldBuildSQLQueryWith2ValueAndBetweenSign()
      throws QueryException {
    final SelectQuery query = select("*").from("table") //
        .where(c("col")).eq("val") //
        .and(c("column")).betweenOrOp(Operator.BTW, "valueStart", "valueEnd") //
        .and(c("column")).eq("value");

    assertEquals(
        "SELECT * FROM table WHERE (((col = :p1) AND (column BETWEEN :p2 AND :p3)) AND (column = :p4))",
        query.toSql());
    final Map<String, Object> params = query.getParams();
    assertEquals(4, params.size());
    assertEquals("val", params.get("p1"));
    assertEquals("valueStart", params.get("p2"));
    assertEquals("valueEnd", params.get("p3"));
    assertEquals("value", params.get("p4"));
  }

  @Test
  public void testShouldBuildSQLQueryWithUnionSelect() throws QueryException {
    final SelectQuery query = select("*")//
        .from("table") //
        .where(c("col")).eq("val") //
        .union(//
            select(c("col1"), c("NULL col2")) //
                .from("otherTable") //
                .where(c("col1")).eq("val1") //
        );

    assertEquals(
        "SELECT * FROM table WHERE (col = :p1) UNION SELECT col1,NULL col2 FROM otherTable WHERE (col1 = :p2)",
        query.toSql());
    final Map<String, Object> params = query.getParams();
    assertEquals(2, params.size());
    assertEquals("val1", params.get("p2"));
    assertEquals("val", params.get("p1"));
  }
}
