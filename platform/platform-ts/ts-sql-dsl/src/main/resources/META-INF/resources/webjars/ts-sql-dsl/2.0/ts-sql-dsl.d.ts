export interface Visitable {
    accept(visitor: QueryVisitor): any;
}
export declare abstract class Exp implements Visitable {
    valid: boolean;
    invalidate(): void;
    isValid(): boolean;
    and$com_octo_java_sql_exp_Column$com_octo_java_sql_exp_Operator$java_lang_Object(andColumn: Column, andOperator: Operator, andValue: any): AndExp;
    and(andColumn?: any, andOperator?: any, andValue?: any): any;
    and$com_octo_java_sql_exp_Column(andColumn: Column): AndExp;
    and$com_octo_java_sql_exp_SQLFunc(func: SQLFunc): AndExp;
    and$com_octo_java_sql_exp_Exp(exp: Exp): AndExp;
    or$com_octo_java_sql_exp_Column$com_octo_java_sql_exp_Operator$java_lang_Object$boolean(orColumn: Column, orOperator: Operator, orValue: any, orValueIsColumnName: boolean): OrExp;
    or(orColumn?: any, orOperator?: any, orValue?: any, orValueIsColumnName?: any): any;
    or$com_octo_java_sql_exp_Column(orColumn: Column): OrExp;
    or$com_octo_java_sql_exp_Exp(exp: Exp): OrExp;
    eq(value: any): Exp;
    neq(value: any): Exp;
    geq(value: number): Exp;
    leq(value: number): Exp;
    like(value: string): Exp;
    between(valueStart: any, valueEnd: any): Exp;
    startWith(value: string): Exp;
    contains(value: string): Exp;
    in(...values: any[]): Exp;
    notIn(...values: any[]): Exp;
    isNull(): Exp;
    isNotNull(): Exp;
    /**
     * If operator is "between" do a between operation, else apply operation with
     * op.
     *
     * @param {Operator} op
     * @param {*} valueStart
     * @param {*} valueEnd
     * @return
     * @throws QueryGrammarException
     * @return {Exp}
     */
    betweenOrOp(op: Operator, valueStart: any, valueEnd: any): Exp;
    abstract applyOperation(operator: Operator, value: any): Exp;
    abstract applyInOperation(...values: any[]): Exp;
    abstract applyNotInOperation(...values: any[]): Exp;
    abstract applyBetweenOperation(valueStart: any, valueEnd: any): Exp;
    abstract accept(visitor?: any): any;
    constructor();
}
export declare abstract class ExpSeq extends Exp {
    clauses: Array<Exp>;
    constructor(...clauses: Exp[]);
    /**
     *
     * @param {Operator} operator
     * @param {*} value
     * @return {Exp}
     */
    applyOperation(operator: Operator, value: any): Exp;
    /**
     *
     * @param {*} valueStart
     * @param {*} valueEnd
     * @return {Exp}
     */
    applyBetweenOperation(valueStart: any, valueEnd: any): Exp;
    /**
     *
     * @param {Array} values
     * @return {Exp}
     */
    applyInOperation(...values: any[]): Exp;
    /**
     *
     * @param {Array} values
     * @return {Exp}
     */
    applyNotInOperation(...values: any[]): Exp;
    accept(visitor: QueryVisitor): void;
    abstract getOperator(): Operator;
    getClauses(): Array<Exp>;
}
export declare class SQLFunc implements Visitable {
    funcName: string;
    params: any[];
    alias: string;
    constructor(funcName?: any, ...params: any[]);
    getName(): string;
    as(alias: string): SQLFunc;
    accept(visitor: QueryVisitor): void;
    getParams(): any[];
    getAlias(): string;
}
export declare class AndExp extends ExpSeq {
    constructor(...clauses: Exp[]);
    /**
     *
     * @return {Operator}
     */
    getOperator(): Operator;
}
export declare class BetweenExp extends Exp {
    column: Column;
    valueStart: any;
    valueEnd: any;
    constructor(column: Column, valueStart: any, valueEnd: any);
    /**
     *
     * @param {Array} newValues
     * @return {Exp}
     */
    applyInOperation(...newValues: any[]): Exp;
    /**
     *
     * @param {Array} values
     * @return {Exp}
     */
    applyNotInOperation(...values: any[]): Exp;
    /**
     *
     * @param {Operator} operator
     * @param {*} value
     * @return {Exp}
     */
    applyOperation(operator: Operator, value: any): Exp;
    /**
     *
     * @param {*} start
     * @param {*} end
     * @return {Exp}
     */
    applyBetweenOperation(start: any, end: any): Exp;
    accept(visitor: QueryVisitor): void;
    getColumn(): Column;
    getValueStart(): any;
    getValueEnd(): any;
}
export declare class Column implements Visitable {
    name: string;
    constructor(name: string);
    getName(): string;
    /**
     *
     * @return {number}
     */
    hashCode(): number;
    /**
     *
     * @param {*} obj
     * @return {boolean}
     */
    equals(obj: any): boolean;
    /**
     *
     * @return {string}
     */
    toString(): string;
    accept(visitor: QueryVisitor): void;
    getTableName(): string;
}
export declare class Constant implements Visitable {
    static NULL: Constant;
    static NULL_$LI$(): Constant;
    static STAR: Constant;
    static STAR_$LI$(): Constant;
    value: string;
    constructor(value: string);
    getValue(): string;
    accept(visitor: QueryVisitor): void;
}
export declare class InExp extends Exp {
    column: Column;
    values: any[];
    negative: boolean;
    constructor(column: Column, negative: boolean, ...values: any[]);
    /**
     *
     * @param {Array} newValues
     * @return {Exp}
     */
    applyInOperation(...newValues: any[]): Exp;
    /**
     *
     * @param {Array} values
     * @return {Exp}
     */
    applyNotInOperation(...values: any[]): Exp;
    /**
     *
     * @param {Operator} operator
     * @param {*} value
     * @return {Exp}
     */
    applyOperation(operator: Operator, value: any): Exp;
    /**
     *
     * @param {*} valueStart
     * @param {*} valueEnd
     * @return {Exp}
     */
    applyBetweenOperation(valueStart: any, valueEnd: any): Exp;
    accept(visitor: QueryVisitor): void;
    getColumn(): Column;
    getValues(): any[];
    isNegative(): boolean;
}
export declare class JavaSQLFunc extends SQLFunc {
    evaluator: JavaSQLFunc.Evaluable<string>;
    constructor(funcName: string, params: any[], evaluator: JavaSQLFunc.Evaluable<string>);
    getEvaluator(): JavaSQLFunc.Evaluable<string>;
}
export declare namespace JavaSQLFunc {
    interface Evaluable<T> {
        eval(...params: any[]): T;
    }
}
export declare class JoinClause implements Visitable {
    table: string;
    joinType: JoinClause.JoinType;
    onClause: Exp;
    query: SelectQuery;
    valid: boolean;
    constructor(table: string, joinType: JoinClause.JoinType, query: SelectQuery);
    on$com_octo_java_sql_exp_Column$com_octo_java_sql_exp_Operator$java_lang_Object(column: Column, operator: Operator, value: any): SelectQuery;
    on(column?: any, operator?: any, value?: any): any;
    on$com_octo_java_sql_exp_Exp(exp: Exp): SelectQuery;
    on$com_octo_java_sql_exp_Column(column: Column): JoinClause;
    eq(value: any): SelectQuery;
    assertOnClauseIsInitialized(operation: string): void;
    accept(visitor: QueryVisitor): void;
    getOnClause(): Exp;
    getType(): JoinClause.JoinType;
    getTable(): string;
    isValid(): boolean;
    invalidate(): void;
}
export declare namespace JoinClause {
    enum JoinType {
        LEFT_OUTER_JOIN = 0,
        RIGHT_OUTER_JOIN = 1,
        INNER_JOIN = 2,
    }
    /** @ignore */
    class JoinType_$WRAPPER {
        protected _$ordinal: number;
        protected _$name: string;
        value: any;
        constructor(_$ordinal: number, _$name: string, value: any);
        name(): string;
        ordinal(): number;
    }
}
export declare class Nullable implements Visitable {
    value: any;
    constructor(value: any);
    getValue(): any;
    isNull(): boolean;
    /**
     *
     * @param {*} obj
     * @return {boolean}
     */
    equals(obj: any): boolean;
    accept(visitor: QueryVisitor): void;
}
export declare enum Operator {
    IS = 0,
    BTW = 1,
    LIKE = 2,
    EQ = 3,
    NEQ = 4,
    GT = 5,
    GEQ = 6,
    LT = 7,
    LEQ = 8,
    NOT = 9,
    IN = 10,
    IS_NOT = 11,
    AND = 12,
    OR = 13,
}
/** @ignore */
export declare class Operator_$WRAPPER {
    protected _$ordinal: number;
    protected _$name: string;
    value: any;
    constructor(_$ordinal: number, _$name: string, value: any);
    getValue(): string;
    name(): string;
    ordinal(): number;
}
export declare class OpExp extends Exp {
    lhsValue: any;
    rhsValue: any;
    operator: Operator;
    constructor(lhsValue?: any, operator?: any, rhsValue?: any);
    /**
     *
     * @param {Operator} newOperator
     * @param {*} newRhsValue
     * @return {Exp}
     */
    applyOperation(newOperator: Operator, newRhsValue: any): Exp;
    /**
     *
     * @param {Array} values
     * @return {Exp}
     */
    applyInOperation(...values: any[]): Exp;
    /**
     *
     * @param {Array} values
     * @return {Exp}
     */
    applyNotInOperation(...values: any[]): Exp;
    /**
     *
     * @param {*} valueStart
     * @param {*} valueEnd
     * @return {Exp}
     */
    applyBetweenOperation(valueStart: any, valueEnd: any): Exp;
    accept(visitor: QueryVisitor): void;
    getLhsValue(): any;
    getOperator(): Operator;
    getRhsValue(): any;
    setLhsValue(lhsValue: any): void;
    setRhsValue(rhsValue: any): void;
}
export declare class OrExp extends ExpSeq {
    constructor(...clauses: Exp[]);
    /**
     *
     * @return {Operator}
     */
    getOperator(): Operator;
}
export declare class SetClause implements Visitable {
    column: Column;
    value: any;
    constructor(column: Column, value: any);
    accept(visitor: QueryVisitor): void;
    getColumn(): Column;
    getValue(): any;
}
export declare abstract class BaseVisitor implements QueryVisitor {
    acceptOrVisitValue(value?: any, baseName?: any): any;
    acceptOrVisitValue$java_lang_Object(param: any): void;
    abstract visitValue(value?: any): any;
    abstract visit(column?: any): any;
    abstract visit(exp?: any): any;
    abstract visit(betweenExp?: any): any;
    abstract visit(expSeq?: any): any;
    abstract visit(inExp?: any): any;
    abstract visit(joinClause?: any): any;
    abstract visit(setClause?: any): any;
    abstract visit(sqlFunc?: any): any;
    abstract visit(constant?: any): any;
    abstract visit(query?: any): any;
    abstract visit(updateQuery?: any): any;
    abstract visit(insertQuery?: any): any;
    abstract visit(deleteQuery?: any): any;
    abstract visit(nullable?: any): any;
    constructor();
}
export declare class DefaultVisitor extends BaseVisitor {
    visitValue(value: any): void;
    visit$com_octo_java_sql_exp_SQLFunc(func: SQLFunc): void;
    visit$com_octo_java_sql_exp_JavaSQLFunc(javaSQLFunc: JavaSQLFunc): void;
    visit(javaSQLFunc?: any): any;
    visit$com_octo_java_sql_exp_Column(column: Column): void;
    visit$com_octo_java_sql_exp_OpExp(exp: OpExp): void;
    visit$com_octo_java_sql_exp_BetweenExp(betweenExp: BetweenExp): void;
    visit$com_octo_java_sql_exp_ExpSeq(expSeq: ExpSeq): void;
    visit$com_octo_java_sql_exp_InExp(inExp: InExp): void;
    visit$com_octo_java_sql_exp_JoinClause(joinClause: JoinClause): void;
    visit$com_octo_java_sql_exp_SetClause(setClause: SetClause): void;
    visit$com_octo_java_sql_exp_Constant(constant: Constant): void;
    visit$com_octo_java_sql_query_SelectQuery(query: SelectQuery): void;
    visit$com_octo_java_sql_query_UpdateQuery(updateQuery: UpdateQuery): void;
    visit$com_octo_java_sql_query_InsertQuery(insertQuery: InsertQuery): void;
    visit$com_octo_java_sql_query_DeleteQuery(deleteQuery: DeleteQuery): void;
    visit$com_octo_java_sql_exp_Nullable(nullable: Nullable): void;
    constructor();
}
export declare class BasicQueryOptimizer extends DefaultVisitor {
    usedTables: Array<string>;
    tableReverseDependency: any;
    tableJoin: any;
    currentJoinedTable: string;
    visit$com_octo_java_sql_exp_BetweenExp(betweenExp: BetweenExp): void;
    /**
     *
     * @param {BetweenExp} betweenExp
     */
    visit(betweenExp?: any): any;
    visit$com_octo_java_sql_exp_InExp(inExp: InExp): void;
    visit$com_octo_java_sql_exp_OpExp(exp: OpExp): void;
    visit$com_octo_java_sql_exp_ExpSeq(expSeq: ExpSeq): void;
    visit$com_octo_java_sql_exp_Column(column: Column): void;
    visit$com_octo_java_sql_exp_JoinClause(joinClause: JoinClause): void;
    visit$com_octo_java_sql_query_SelectQuery(query: SelectQuery): void;
    visit$com_octo_java_sql_exp_Constant(constant: Constant): void;
    /**
     * Add table1 as a reverse dependency of table2 (ie. table1 depends on table2)
     *
     * @param {string} table1
     * @param {string} table2
     * @private
     */
    addTableReverseDependency(table1: string, table2: string): void;
    /**
     * Determine if given joined table is used. <br>
     * 4 possibles cases : <br>
     * - null is in usedTables which means a column name has been specified
     * without the table it belongs to<br>
     * - '*' is in usedTables<br>
     * - a column of the table has been used in SELECT or in a WHERE clause<br>
     * - another table which is necessary has a dependency on the given table<br>
     * In this exemple, "table1" depends on "table2", "table3" depends on "table1"
     * and join on "table1" is necessary because "table3" is necessary because a
     * "table3" column is used in SELECT:<br>
     * <code>
     * query = select(c("table3.column")).from("table2");
     * query.innerJoin("table1").on(c("table1.column")).eq(c("table2.column"));
     * query.innerJoin("table3").on(c("table3.column")).eq(c("table1.column"));
     * </code>
     *
     * @param {string} table
     * @return
     * @return {boolean}
     */
    isJoinNecessary(table: string): boolean;
    constructor();
}
export declare namespace BasicQueryOptimizer {
    class BasicQueryOptimizer$0 implements Predicate {
        __parent: any;
        evaluate(object: any): boolean;
        constructor(__parent: any);
    }
    class BasicQueryOptimizer$1 implements Predicate {
        __parent: any;
        evaluate(exp: any): boolean;
        constructor(__parent: any);
    }
    class BasicQueryOptimizer$2 implements Predicate {
        __parent: any;
        evaluate(dependency: any): boolean;
        constructor(__parent: any);
    }
}
export declare abstract class Query<T extends Query<T>> implements Visitable {
    /**
     * Set it to false when using HSQLDB
     */
    static oracleDialect: boolean;
    static funcEvaluatorMap: any;
    static funcEvaluatorMap_$LI$(): any;
    whereClause: Exp;
    static querybuilderClassName: string;
    static querybuilderClassName_$LI$(): string;
    static visitors: Array<QueryVisitor>;
    static visitors_$LI$(): Array<QueryVisitor>;
    builder: DefaultQueryBuilder;
    static setDefaultQueryBuilder(className: string): void;
    static getDefaultBuilder(): string;
    static resetDefaultQueryBuilder(): void;
    getWhereClause(): Exp;
    /**
     * @param columns
     * to put both SQLFunc & Colsname
     * @param {Array} columnsAndFunc
     * @return {SelectQuery}
     */
    static select(...columnsAndFunc: any[]): SelectQuery;
    /**
     * Create an UPDATE Query
     *
     * @param {string} table
     * @return
     * @return {UpdateQuery}
     */
    static update(table: string): UpdateQuery;
    /**
     * Create an INSERT Query
     *
     * @param {string} table
     * @return
     * @return {InsertQuery}
     */
    static insertInto(table: string): InsertQuery;
    /**
     * Create an DELETE Query
     *
     * @param {string} table
     * @return
     * @return {DeleteQuery}
     */
    static deleteFrom(table: string): DeleteQuery;
    /**
     * Create an SQLFunc
     *
     * @param {string} funcName
     * @param {Array} params
     * @return
     * @return {SQLFunc}
     */
    static f(funcName: string, ...params: any[]): SQLFunc;
    /**
     * Create a Column
     *
     * @param {string} name
     * @return
     * @return {Column}
     */
    static c(name: string): Column;
    static e$com_octo_java_sql_exp_Column(columnName: Column): OpExp;
    /**
     * Create a new OpExp
     *
     * @param {Column} columnName
     * @return
     * @return {OpExp}
     */
    static e(columnName?: any): any;
    static e$com_octo_java_sql_exp_SQLFunc(func: SQLFunc): OpExp;
    toSql$(): string;
    toSql$com_octo_java_sql_query_visitor_DefaultQueryBuilder(queryBuilder: DefaultQueryBuilder): string;
    toSql(queryBuilder?: any): any;
    getQueryBuilder(): DefaultQueryBuilder;
    runVisitors(): void;
    getParams(): any;
    static addVisitor(visitor: QueryVisitor): void;
    static clearVisitors(): void;
    whereReset(): T;
    where$com_octo_java_sql_exp_Column(column: Column): T;
    where$com_octo_java_sql_exp_Exp(newWhereClause: Exp): T;
    where$com_octo_java_sql_exp_Column$com_octo_java_sql_exp_Operator$java_lang_Object(column: Column, operator: Operator, value: any): T;
    where(column?: any, operator?: any, value?: any): any;
    where$com_octo_java_sql_exp_SQLFunc(func: SQLFunc): T;
    eq(value: any): T;
    eqOrIsNull(value: any): T;
    neq(value: any): T;
    neqNullable(value: any): T;
    geq(value: number): T;
    leq(value: number): T;
    like(value: string): T;
    in(...values: any[]): T;
    notIn(...values: any[]): T;
    and$com_octo_java_sql_exp_Column(column: Column): T;
    and(column?: any): any;
    and$com_octo_java_sql_exp_SQLFunc(func: SQLFunc): T;
    and$com_octo_java_sql_exp_Exp(exp: Exp): T;
    isNull(): T;
    isNotNull(): T;
    /**
     * @param {Operator} op
     * @param {*} valueStart
     * @param {*} valueEnd
     * @return {Query} If operator is "between" do a between operation, else apply
     * operation with op on valueStart.
     * @throws QueryGrammarException
     */
    betweenOrOp(op: Operator, valueStart: any, valueEnd: any): T;
    between(valueStart: any, valueEnd: any): T;
    op(op: Operator, value: any): T;
    startWith(value: string): T;
    contains(value: string): T;
    static addFuncEvaluator(funcName: string, evaluator: JavaSQLFunc.Evaluable<string>): void;
    static clearFuncEvaluatorMap(): void;
    assertWhereClauseIsInitialized(operation: string): void;
    abstract accept(visitor?: any): any;
    constructor();
}
export declare class DeleteQuery extends Query<DeleteQuery> {
    tables: string[];
    constructor(...tables: string[]);
    accept(visitor: QueryVisitor): void;
    getTables(): string[];
}
export declare class InsertQuery extends Query<InsertQuery> {
    columnsValues: any;
    table: string;
    constructor(table: string);
    set$java_lang_String$java_lang_Object(column: string, value: any): InsertQuery;
    set$java_lang_String$java_lang_Object$java_lang_Object(column: string, value: any, defaultValueIfNull: any): InsertQuery;
    set(column?: any, value?: any, defaultValueIfNull?: any): any;
    accept(visitor: QueryVisitor): void;
    getColumnsValues(): any;
    getTable(): string;
}
export declare class QueryException extends Error {
    static serialVersionUID: number;
    constructor(message: string);
}
export declare class QueryGrammarException extends QueryException {
    static __com_octo_java_sql_query_QueryGrammarException_serialVersionUID: number;
    constructor(message: string);
}
export declare class SelectQuery extends Query<SelectQuery> {
    /**
     * Contains String or SQLFunc
     */
    columns: any[];
    tables: string[];
    joinClauses: Array<JoinClause>;
    __orderBy: any;
    __limit: number;
    lastOrderByColumn: string;
    lastOrderByNeeded: boolean;
    unions: Array<SelectQuery>;
    alias: string;
    constructor(...columns: any[]);
    from(...newTables: string[]): SelectQuery;
    innerJoin(table: string): JoinClause;
    leftOuterJoin(table: string): JoinClause;
    orderBy$java_lang_String(value: string): SelectQuery;
    orderByReset(): SelectQuery;
    orderBy$java_lang_String$boolean(value: string, isOrderByNeeded: boolean): SelectQuery;
    orderBy(value?: any, isOrderByNeeded?: any): any;
    desc(): SelectQuery;
    assertOrderBySpecified(operation: string): void;
    asc(): SelectQuery;
    limit(newLimit: number): SelectQuery;
    as(alias: string): SelectQuery;
    union(innerQuery: SelectQuery): SelectQuery;
    setColumns(...columns: any[]): SelectQuery;
    accept(visitor: QueryVisitor): void;
    getColumns(): any[];
    getTables(): string[];
    getJoinClauses(): Array<JoinClause>;
    getAlias(): string;
    getOrderBy(): any;
    getLimit(): number;
    getUnions(): Array<SelectQuery>;
}
export declare namespace SelectQuery {
    enum Order {
        DESC = 0,
        ASC = 1,
    }
}
export declare class UpdateQuery extends Query<UpdateQuery> {
    setClauses: Array<SetClause>;
    table: string;
    constructor(table: string);
    set(column: Column, value: any): UpdateQuery;
    accept(visitor: QueryVisitor): void;
    getTable(): string;
    getSetClauses(): Array<SetClause>;
}
export declare class DefaultQueryBuilder extends BaseVisitor {
    static DEFAULT_BASE_VARIABLE_NAME: string;
    static OPEN_BRACKET: string;
    static BETWEEN: string;
    static CLOSE_BRACKET: string;
    static ON: string;
    static AS: string;
    static SELECT: string;
    static FROM: string;
    static WHERE: string;
    static ORDER_BY: string;
    static UNION: string;
    static INSERT: string;
    static VALUES: string;
    static UPDATE: string;
    static SET: string;
    static DELETE_FROM: string;
    result: {
        str: string;
    };
    variableIndex: number;
    params: any;
    addBracketToNextSelectQuery: boolean;
    functions: any;
    addFunction(functionName: string, __function: JavaSQLFunc.Evaluable<string>): void;
    getResult(): {
        str: string;
    };
    getParams(): any;
    /**
     * Add a variable to parameters map and return its name
     *
     * @param columnName
     * @return
     * @param {*} value
     * @param {string} baseColumnName
     * @return {string}
     */
    addVariable(value: any, baseColumnName: string): string;
    getVariableName(obj: any, defaultName: string): string;
    acceptOrVisitValue$java_lang_Object$java_lang_String(value: any, baseName: string): void;
    acceptOrVisitValue(value?: any, baseName?: any): any;
    visitValue(value: any): void;
    buildWhereClause(whereClause: Exp): void;
    buildLimitClause(query: SelectQuery): void;
    visit$com_octo_java_sql_exp_Column(column: Column): void;
    /**
     * Visit methods
     * @param {Column} column
     */
    visit(column?: any): any;
    visit$com_octo_java_sql_exp_OpExp(exp: OpExp): void;
    visit$com_octo_java_sql_exp_BetweenExp(betweenExp: BetweenExp): void;
    visit$com_octo_java_sql_exp_ExpSeq(expSeq: ExpSeq): void;
    visit$com_octo_java_sql_exp_InExp(inExp: InExp): void;
    visit$com_octo_java_sql_exp_JoinClause(joinClause: JoinClause): void;
    visit$com_octo_java_sql_exp_SetClause(setClause: SetClause): void;
    visit$com_octo_java_sql_exp_SQLFunc(sqlFunc: SQLFunc): void;
    visit$com_octo_java_sql_exp_Constant(constant: Constant): void;
    visit$com_octo_java_sql_query_SelectQuery(query: SelectQuery): void;
    visit$com_octo_java_sql_query_UpdateQuery(updateQuery: UpdateQuery): void;
    visit$com_octo_java_sql_query_InsertQuery(insertQuery: InsertQuery): void;
    visit$com_octo_java_sql_query_DeleteQuery(deleteQuery: DeleteQuery): void;
    visit$com_octo_java_sql_exp_Nullable(nullable: Nullable): void;
    constructor();
}
export declare class OracleQueryBuilder extends DefaultQueryBuilder {
    /**
     *
     * @param {SelectQuery} query
     */
    buildLimitClause(query: SelectQuery): void;
    constructor();
}
export interface QueryVisitor {
    visit(javaSQLFunc?: any): any;
    visitValue(value: any): any;
}
export declare class ArrayUtils {
    static isEmpty(array: any[]): boolean;
}
export declare class CollectionUtils {
    static isEmpty(coll: Array<any>): boolean;
    static exists(collection: Array<any>, predicate: Predicate): boolean;
}
export declare class ObjectUtils {
    static toString(obj: any): string;
}
export interface Predicate {
    /**
     * Use the specified parameter to perform a test that returns true or false.
     *
     * @param {*} object  the object to evaluate, should not be changed
     * @return {boolean} true or false
     * @throws ClassCastException (runtime) if the input is the wrong class
     * @throws IllegalArgumentException (runtime) if the input is invalid
     * @throws FunctorException (runtime) if the predicate encounters a problem
     */
    evaluate(object: any): boolean;
}
export declare class StringUtils {
    static EMPTY: string;
    static isEmpty(str: string): boolean;
    static join$java_lang_Object_A$char(array: any[], separator: string): string;
    static join$java_lang_Object_A$char$int$int(array: any[], separator: string, startIndex: number, endIndex: number): string;
    static join(array?: any, separator?: any, startIndex?: any, endIndex?: any): any;
    static join$java_util_Collection$java_lang_String(collection: Array<any>, separator: string): string;
    static join$java_util_Iterator$java_lang_String(iterator: any, separator: string): string;
}
