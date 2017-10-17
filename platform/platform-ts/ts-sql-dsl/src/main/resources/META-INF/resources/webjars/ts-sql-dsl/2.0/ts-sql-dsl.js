var g; if (typeof window === 'undefined') { g = global;}else{ g = window;}  
var java =  g['java'];
var __Function = Function;
/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export class Exp {
    constructor() {
        /*private*/ this.valid = true;
    }
    invalidate() {
        this.valid = false;
    }
    isValid() {
        return this.valid;
    }
    and$com_octo_java_sql_exp_Column$com_octo_java_sql_exp_Operator$java_lang_Object(andColumn, andOperator, andValue) {
        return new AndExp(this, new OpExp(andColumn, andOperator, andValue));
    }
    and(andColumn, andOperator, andValue) {
        if (((andColumn != null && andColumn instanceof Column) || andColumn === null) && ((typeof andOperator === 'number') || andOperator === null) && ((andValue != null) || andValue === null)) {
            return this.and$com_octo_java_sql_exp_Column$com_octo_java_sql_exp_Operator$java_lang_Object(andColumn, andOperator, andValue);
        }
        else if (((andColumn != null && andColumn instanceof Column) || andColumn === null) && andOperator === undefined && andValue === undefined) {
            return this.and$com_octo_java_sql_exp_Column(andColumn);
        }
        else if (((andColumn != null && andColumn instanceof SQLFunc) || andColumn === null) && andOperator === undefined && andValue === undefined) {
            return this.and$com_octo_java_sql_exp_SQLFunc(andColumn);
        }
        else if (((andColumn != null && andColumn instanceof Exp) || andColumn === null) && andOperator === undefined && andValue === undefined) {
            return this.and$com_octo_java_sql_exp_Exp(andColumn);
        }
        else
            throw new Error('invalid overload');
    }
    and$com_octo_java_sql_exp_Column(andColumn) {
        return new AndExp(this, new OpExp(andColumn));
    }
    and$com_octo_java_sql_exp_SQLFunc(func) {
        return new AndExp(this, new OpExp(func));
    }
    and$com_octo_java_sql_exp_Exp(exp) {
        return new AndExp(this, exp);
    }
    or$com_octo_java_sql_exp_Column$com_octo_java_sql_exp_Operator$java_lang_Object$boolean(orColumn, orOperator, orValue, orValueIsColumnName) {
        return new OrExp(this, new OpExp(orColumn, orOperator, orValue));
    }
    or(orColumn, orOperator, orValue, orValueIsColumnName) {
        if (((orColumn != null && orColumn instanceof Column) || orColumn === null) && ((typeof orOperator === 'number') || orOperator === null) && ((orValue != null) || orValue === null) && ((typeof orValueIsColumnName === 'boolean') || orValueIsColumnName === null)) {
            return this.or$com_octo_java_sql_exp_Column$com_octo_java_sql_exp_Operator$java_lang_Object$boolean(orColumn, orOperator, orValue, orValueIsColumnName);
        }
        else if (((orColumn != null && orColumn instanceof Column) || orColumn === null) && orOperator === undefined && orValue === undefined && orValueIsColumnName === undefined) {
            return this.or$com_octo_java_sql_exp_Column(orColumn);
        }
        else if (((orColumn != null && orColumn instanceof Exp) || orColumn === null) && orOperator === undefined && orValue === undefined && orValueIsColumnName === undefined) {
            return this.or$com_octo_java_sql_exp_Exp(orColumn);
        }
        else
            throw new Error('invalid overload');
    }
    or$com_octo_java_sql_exp_Column(orColumn) {
        return new OrExp(this, new OpExp(orColumn));
    }
    or$com_octo_java_sql_exp_Exp(exp) {
        return new OrExp(this, exp);
    }
    eq(value) {
        return this.applyOperation(Operator.EQ, value);
    }
    neq(value) {
        return this.applyOperation(Operator.NEQ, value);
    }
    geq(value) {
        return this.applyOperation(Operator.GEQ, value);
    }
    leq(value) {
        return this.applyOperation(Operator.LEQ, value);
    }
    like(value) {
        return this.applyOperation(Operator.LIKE, value);
    }
    between(valueStart, valueEnd) {
        return this.applyBetweenOperation(valueStart, valueEnd);
    }
    startWith(value) {
        value = StringUtils.isEmpty(value) ? null : value.concat("%");
        return this.applyOperation(Operator.LIKE, value);
    }
    contains(value) {
        value = StringUtils.isEmpty(value) ? null : "%".concat(value.concat("%"));
        return this.applyOperation(Operator.LIKE, value);
    }
    in(...values) {
        return this.applyInOperation.apply(this, values);
    }
    notIn(...values) {
        return this.applyNotInOperation.apply(this, values);
    }
    isNull() {
        return this.applyOperation(Operator.IS, Constant.NULL_$LI$());
    }
    isNotNull() {
        return this.applyOperation(Operator.IS_NOT, Constant.NULL_$LI$());
    }
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
    betweenOrOp(op, valueStart, valueEnd) {
        if (((Operator.BTW) === (op))) {
            return this.applyBetweenOperation(valueStart, valueEnd);
        }
        else {
            return this.applyOperation(op, valueStart);
        }
    }
}
Exp["__class"] = "com.octo.java.sql.exp.Exp";
Exp["__interfaces"] = ["com.octo.java.sql.query.visitor.Visitable"];
/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export class ExpSeq extends Exp {
    constructor(...clauses) {
        super();
        if (this.clauses === undefined)
            this.clauses = null;
        this.clauses = java.util.Arrays.asList(...clauses);
    }
    /**
     *
     * @param {Operator} operator
     * @param {*} value
     * @return {Exp}
     */
    applyOperation(operator, value) {
        let lastIndex = this.clauses.size() - 1;
        let lastClause = this.clauses.get(lastIndex);
        this.clauses.set(lastIndex, lastClause.applyOperation(operator, value));
        return this;
    }
    /**
     *
     * @param {*} valueStart
     * @param {*} valueEnd
     * @return {Exp}
     */
    applyBetweenOperation(valueStart, valueEnd) {
        let lastIndex = this.clauses.size() - 1;
        let lastClause = this.clauses.get(lastIndex);
        this.clauses.set(lastIndex, lastClause.applyBetweenOperation(valueStart, valueEnd));
        return this;
    }
    /**
     *
     * @param {Array} values
     * @return {Exp}
     */
    applyInOperation(...values) {
        let lastIndex = this.clauses.size() - 1;
        let lastClause = this.clauses.get(lastIndex);
        this.clauses.set(lastIndex, (o => o.applyInOperation.apply(o, values))(lastClause));
        return this;
    }
    /**
     *
     * @param {Array} values
     * @return {Exp}
     */
    applyNotInOperation(...values) {
        let lastIndex = this.clauses.size() - 1;
        let lastClause = this.clauses.get(lastIndex);
        this.clauses.set(lastIndex, (o => o.applyNotInOperation.apply(o, values))(lastClause));
        return this;
    }
    accept(visitor) {
        visitor['visit$com_octo_java_sql_exp_ExpSeq'](this);
    }
    getClauses() {
        return this.clauses;
    }
}
ExpSeq["__class"] = "com.octo.java.sql.exp.ExpSeq";
ExpSeq["__interfaces"] = ["com.octo.java.sql.query.visitor.Visitable"];
/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export class SQLFunc {
    constructor(funcName, ...params) {
        if (((typeof funcName === 'string') || funcName === null) && ((params != null && params instanceof Array && (params.length == 0 || params[0] == null || (params[0] != null))) || params === null)) {
            let __args = Array.prototype.slice.call(arguments);
            if (this.funcName === undefined)
                this.funcName = null;
            if (this.params === undefined)
                this.params = null;
            if (this.alias === undefined)
                this.alias = null;
            if (this.funcName === undefined)
                this.funcName = null;
            if (this.params === undefined)
                this.params = null;
            if (this.alias === undefined)
                this.alias = null;
            (() => {
                this.funcName = funcName;
                this.params = params;
            })();
        }
        else if (((typeof funcName === 'string') || funcName === null) && params === undefined) {
            let __args = Array.prototype.slice.call(arguments);
            if (this.funcName === undefined)
                this.funcName = null;
            if (this.params === undefined)
                this.params = null;
            if (this.alias === undefined)
                this.alias = null;
            if (this.funcName === undefined)
                this.funcName = null;
            if (this.params === undefined)
                this.params = null;
            if (this.alias === undefined)
                this.alias = null;
            (() => {
                this.funcName = funcName;
            })();
        }
        else
            throw new Error('invalid overload');
    }
    getName() {
        return this.funcName;
    }
    as(alias) {
        this.alias = alias;
        return this;
    }
    accept(visitor) {
        visitor['visit$com_octo_java_sql_exp_SQLFunc'](this);
    }
    getParams() {
        return this.params;
    }
    getAlias() {
        return this.alias;
    }
}
SQLFunc["__class"] = "com.octo.java.sql.exp.SQLFunc";
SQLFunc["__interfaces"] = ["com.octo.java.sql.query.visitor.Visitable"];
var __Function = Function;
/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export class AndExp extends ExpSeq {
    constructor(...clauses) {
        super(...clauses);
    }
    /**
     *
     * @return {Operator}
     */
    getOperator() {
        return Operator.AND;
    }
}
AndExp["__class"] = "com.octo.java.sql.exp.AndExp";
AndExp["__interfaces"] = ["com.octo.java.sql.query.visitor.Visitable"];
/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export class BetweenExp extends Exp {
    constructor(column, valueStart, valueEnd) {
        super();
        if (this.column === undefined)
            this.column = null;
        if (this.valueStart === undefined)
            this.valueStart = null;
        if (this.valueEnd === undefined)
            this.valueEnd = null;
        this.column = column;
        this.valueStart = valueStart;
        this.valueEnd = valueEnd;
    }
    /**
     *
     * @param {Array} newValues
     * @return {Exp}
     */
    applyInOperation(...newValues) {
        throw new QueryGrammarException("Cannot apply IN operation on an BETWEEN expression.");
    }
    /**
     *
     * @param {Array} values
     * @return {Exp}
     */
    applyNotInOperation(...values) {
        throw new QueryGrammarException("Cannot apply NOT IN operation on an BETWEEN expression.");
    }
    /**
     *
     * @param {Operator} operator
     * @param {*} value
     * @return {Exp}
     */
    applyOperation(operator, value) {
        throw new QueryGrammarException("Cannot apply " + operator + " operation on an BETWEEN expression.");
    }
    /**
     *
     * @param {*} start
     * @param {*} end
     * @return {Exp}
     */
    applyBetweenOperation(start, end) {
        throw new QueryGrammarException("Cannot apply BETWEEN on a BETWEEN expression.");
    }
    accept(visitor) {
        visitor['visit$com_octo_java_sql_exp_BetweenExp'](this);
    }
    getColumn() {
        return this.column;
    }
    getValueStart() {
        return this.valueStart;
    }
    getValueEnd() {
        return this.valueEnd;
    }
}
BetweenExp["__class"] = "com.octo.java.sql.exp.BetweenExp";
BetweenExp["__interfaces"] = ["com.octo.java.sql.query.visitor.Visitable"];
/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export class Column {
    constructor(name) {
        if (this.name === undefined)
            this.name = null;
        this.name = name;
    }
    getName() {
        return this.name;
    }
    /**
     *
     * @return {number}
     */
    hashCode() {
        return ((o) => { if (o.hashCode) {
            return o.hashCode();
        }
        else {
            return o.toString();
        } })(this.name);
    }
    /**
     *
     * @param {*} obj
     * @return {boolean}
     */
    equals(obj) {
        if (this === obj)
            return true;
        if (!(obj != null && obj instanceof Column))
            return false;
        let otherObj = obj;
        if (this.name == null)
            return otherObj.getName() == null;
        else
            return ((o1, o2) => { if (o1 && o1.equals) {
                return o1.equals(o2);
            }
            else {
                return o1 === o2;
            } })(this.name, otherObj.getName());
    }
    /**
     *
     * @return {string}
     */
    toString() {
        return this.name;
    }
    accept(visitor) {
        visitor['visit$com_octo_java_sql_exp_Column'](this);
    }
    getTableName() {
        if (this.name.indexOf(".") > 0)
            return this.name.split("\.")[0];
        else
            return null;
    }
}
Column["__class"] = "com.octo.java.sql.exp.Column";
Column["__interfaces"] = ["com.octo.java.sql.query.visitor.Visitable"];
/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export class Constant {
    static NULL_$LI$() { if (Constant.NULL == null)
        Constant.NULL = new Constant("NULL"); return Constant.NULL; }
    ;
    static STAR_$LI$() { if (Constant.STAR == null)
        Constant.STAR = new Constant("*"); return Constant.STAR; }
    ;
    constructor(value) {
        if (this.value === undefined)
            this.value = null;
        this.value = value;
    }
    getValue() {
        return this.value;
    }
    accept(visitor) {
        visitor['visit$com_octo_java_sql_exp_Constant'](this);
    }
}
Constant["__class"] = "com.octo.java.sql.exp.Constant";
Constant["__interfaces"] = ["com.octo.java.sql.query.visitor.Visitable"];
Constant.STAR_$LI$();
Constant.NULL_$LI$();
/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export class InExp extends Exp {
    constructor(column, negative, ...values) {
        super();
        if (this.column === undefined)
            this.column = null;
        if (this.values === undefined)
            this.values = null;
        if (this.negative === undefined)
            this.negative = false;
        this.column = column;
        this.values = values;
        this.negative = negative;
    }
    /**
     *
     * @param {Array} newValues
     * @return {Exp}
     */
    applyInOperation(...newValues) {
        throw new QueryGrammarException("Cannot apply IN operation on an IN expression.");
    }
    /**
     *
     * @param {Array} values
     * @return {Exp}
     */
    applyNotInOperation(...values) {
        throw new QueryGrammarException("Cannot apply NOT IN operation on an IN expression.");
    }
    /**
     *
     * @param {Operator} operator
     * @param {*} value
     * @return {Exp}
     */
    applyOperation(operator, value) {
        throw new QueryGrammarException("Cannot apply " + operator + " operation on an IN expression.");
    }
    /**
     *
     * @param {*} valueStart
     * @param {*} valueEnd
     * @return {Exp}
     */
    applyBetweenOperation(valueStart, valueEnd) {
        throw new QueryGrammarException("Cannot apply IN on a BETWEEN expression.");
    }
    accept(visitor) {
        visitor['visit$com_octo_java_sql_exp_InExp'](this);
    }
    getColumn() {
        return this.column;
    }
    getValues() {
        return this.values;
    }
    isNegative() {
        return this.negative;
    }
}
InExp["__class"] = "com.octo.java.sql.exp.InExp";
InExp["__interfaces"] = ["com.octo.java.sql.query.visitor.Visitable"];
/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export class JavaSQLFunc extends SQLFunc {
    constructor(funcName, params, evaluator) {
        super(funcName);
        if (this.evaluator === undefined)
            this.evaluator = null;
        this.params = params;
        this.evaluator = evaluator;
    }
    getEvaluator() {
        return this.evaluator;
    }
}
JavaSQLFunc["__class"] = "com.octo.java.sql.exp.JavaSQLFunc";
JavaSQLFunc["__interfaces"] = ["com.octo.java.sql.query.visitor.Visitable"];
/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export class JoinClause {
    constructor(table, joinType, query) {
        /*private*/ this.valid = true;
        if (this.table === undefined)
            this.table = null;
        if (this.joinType === undefined)
            this.joinType = null;
        if (this.onClause === undefined)
            this.onClause = null;
        if (this.query === undefined)
            this.query = null;
        this.table = table;
        this.joinType = joinType;
        this.query = query;
    }
    on$com_octo_java_sql_exp_Column$com_octo_java_sql_exp_Operator$java_lang_Object(column, operator, value) {
        this.onClause = new OpExp(column, operator, value);
        return this.query;
    }
    on(column, operator, value) {
        if (((column != null && column instanceof Column) || column === null) && ((typeof operator === 'number') || operator === null) && ((value != null) || value === null)) {
            return this.on$com_octo_java_sql_exp_Column$com_octo_java_sql_exp_Operator$java_lang_Object(column, operator, value);
        }
        else if (((column != null && column instanceof Exp) || column === null) && operator === undefined && value === undefined) {
            return this.on$com_octo_java_sql_exp_Exp(column);
        }
        else if (((column != null && column instanceof Column) || column === null) && operator === undefined && value === undefined) {
            return this.on$com_octo_java_sql_exp_Column(column);
        }
        else
            throw new Error('invalid overload');
    }
    on$com_octo_java_sql_exp_Exp(exp) {
        this.onClause = exp;
        return this.query;
    }
    on$com_octo_java_sql_exp_Column(column) {
        this.onClause = new OpExp(column);
        return this;
    }
    eq(value) {
        this.assertOnClauseIsInitialized("eq");
        this.onClause = this.onClause.eq(value);
        return this.query;
    }
    assertOnClauseIsInitialized(operation) {
        if (this.onClause == null)
            throw new QueryGrammarException("Cannot apply \'" + operation + "\' operation without an initialized join clause.");
    }
    accept(visitor) {
        visitor['visit$com_octo_java_sql_exp_JoinClause'](this);
    }
    getOnClause() {
        return this.onClause;
    }
    getType() {
        return this.joinType;
    }
    getTable() {
        return this.table;
    }
    isValid() {
        return this.valid;
    }
    invalidate() {
        this.valid = false;
    }
}
JoinClause["__class"] = "com.octo.java.sql.exp.JoinClause";
JoinClause["__interfaces"] = ["com.octo.java.sql.query.visitor.Visitable"];
(function (JoinClause) {
    var JoinType;
    (function (JoinType) {
        JoinType[JoinType["LEFT_OUTER_JOIN"] = 0] = "LEFT_OUTER_JOIN";
        JoinType[JoinType["RIGHT_OUTER_JOIN"] = 1] = "RIGHT_OUTER_JOIN";
        JoinType[JoinType["INNER_JOIN"] = 2] = "INNER_JOIN";
    })(JoinType = JoinClause.JoinType || (JoinClause.JoinType = {}));
    /** @ignore */
    class JoinType_$WRAPPER {
        constructor(_$ordinal, _$name, value) {
            this._$ordinal = _$ordinal;
            this._$name = _$name;
            if (this.value === undefined)
                this.value = null;
            this.value = value;
        }
        name() { return this._$name; }
        ordinal() { return this._$ordinal; }
    }
    JoinClause.JoinType_$WRAPPER = JoinType_$WRAPPER;
    JoinType["__class"] = "com.octo.java.sql.exp.JoinClause.JoinType";
    JoinType["__interfaces"] = ["java.lang.Comparable", "java.io.Serializable"];
    JoinType["_$wrappers"] = [new JoinType_$WRAPPER(0, "LEFT_OUTER_JOIN", "LEFT OUTER JOIN"), new JoinType_$WRAPPER(1, "RIGHT_OUTER_JOIN", "RIGHT OUTER JOIN"), new JoinType_$WRAPPER(2, "INNER_JOIN", "INNER JOIN")];
})(JoinClause || (JoinClause = {}));
/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export class Nullable {
    constructor(value) {
        if (this.value === undefined)
            this.value = null;
        this.value = value;
    }
    getValue() {
        return this.value;
    }
    isNull() {
        return this.value == null;
    }
    /**
     *
     * @param {*} obj
     * @return {boolean}
     */
    equals(obj) {
        if (obj == null)
            return false;
        if (!(obj != null && obj instanceof Nullable))
            return false;
        let otherObj = obj;
        if (this.value == null)
            return otherObj.getValue() == null;
        else
            return ((o1, o2) => { if (o1 && o1.equals) {
                return o1.equals(o2);
            }
            else {
                return o1 === o2;
            } })(this.value, otherObj.getValue());
    }
    accept(visitor) {
        visitor['visit$com_octo_java_sql_exp_Nullable'](this);
    }
}
Nullable["__class"] = "com.octo.java.sql.exp.Nullable";
Nullable["__interfaces"] = ["com.octo.java.sql.query.visitor.Visitable"];
/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export var Operator;
(function (Operator) {
    Operator[Operator["IS"] = 0] = "IS";
    Operator[Operator["BTW"] = 1] = "BTW";
    Operator[Operator["LIKE"] = 2] = "LIKE";
    Operator[Operator["EQ"] = 3] = "EQ";
    Operator[Operator["NEQ"] = 4] = "NEQ";
    Operator[Operator["GT"] = 5] = "GT";
    Operator[Operator["GEQ"] = 6] = "GEQ";
    Operator[Operator["LT"] = 7] = "LT";
    Operator[Operator["LEQ"] = 8] = "LEQ";
    Operator[Operator["NOT"] = 9] = "NOT";
    Operator[Operator["IN"] = 10] = "IN";
    Operator[Operator["IS_NOT"] = 11] = "IS_NOT";
    Operator[Operator["AND"] = 12] = "AND";
    Operator[Operator["OR"] = 13] = "OR";
})(Operator || (Operator = {}));
/** @ignore */
export class Operator_$WRAPPER {
    constructor(_$ordinal, _$name, value) {
        this._$ordinal = _$ordinal;
        this._$name = _$name;
        if (this.value === undefined)
            this.value = null;
        this.value = value;
    }
    getValue() {
        return this.value;
    }
    name() { return this._$name; }
    ordinal() { return this._$ordinal; }
}
Operator["__class"] = "com.octo.java.sql.exp.Operator";
Operator["__interfaces"] = ["java.lang.Comparable", "java.io.Serializable"];
Operator["_$wrappers"] = [new Operator_$WRAPPER(0, "IS", "IS"), new Operator_$WRAPPER(1, "BTW", "BETWEEN"), new Operator_$WRAPPER(2, "LIKE", "LIKE"), new Operator_$WRAPPER(3, "EQ", "="), new Operator_$WRAPPER(4, "NEQ", "!="), new Operator_$WRAPPER(5, "GT", ">"), new Operator_$WRAPPER(6, "GEQ", ">="), new Operator_$WRAPPER(7, "LT", "<"), new Operator_$WRAPPER(8, "LEQ", "<="), new Operator_$WRAPPER(9, "NOT", "NOT"), new Operator_$WRAPPER(10, "IN", "IN"), new Operator_$WRAPPER(11, "IS_NOT", "IS NOT"), new Operator_$WRAPPER(12, "AND", "AND"), new Operator_$WRAPPER(13, "OR", "OR")];
/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export class OpExp extends Exp {
    constructor(lhsValue, operator, rhsValue) {
        if (((lhsValue != null) || lhsValue === null) && ((typeof operator === 'number') || operator === null) && ((rhsValue != null) || rhsValue === null)) {
            let __args = Array.prototype.slice.call(arguments);
            super();
            if (this.lhsValue === undefined)
                this.lhsValue = null;
            if (this.rhsValue === undefined)
                this.rhsValue = null;
            if (this.operator === undefined)
                this.operator = null;
            if (this.lhsValue === undefined)
                this.lhsValue = null;
            if (this.rhsValue === undefined)
                this.rhsValue = null;
            if (this.operator === undefined)
                this.operator = null;
            (() => {
                this.lhsValue = lhsValue;
                this.rhsValue = rhsValue;
                this.operator = operator;
            })();
        }
        else if (((lhsValue != null) || lhsValue === null) && operator === undefined && rhsValue === undefined) {
            let __args = Array.prototype.slice.call(arguments);
            super();
            if (this.lhsValue === undefined)
                this.lhsValue = null;
            if (this.rhsValue === undefined)
                this.rhsValue = null;
            if (this.operator === undefined)
                this.operator = null;
            if (this.lhsValue === undefined)
                this.lhsValue = null;
            if (this.rhsValue === undefined)
                this.rhsValue = null;
            if (this.operator === undefined)
                this.operator = null;
            (() => {
                this.lhsValue = lhsValue;
                this.rhsValue = null;
                this.operator = null;
            })();
        }
        else
            throw new Error('invalid overload');
    }
    /**
     *
     * @param {Operator} newOperator
     * @param {*} newRhsValue
     * @return {Exp}
     */
    applyOperation(newOperator, newRhsValue) {
        if (this.operator != null) {
            throw new QueryGrammarException("Cannot apply " + Operator["_$wrappers"][newOperator].getValue() + " operation on an " + Operator["_$wrappers"][this.operator].getValue() + " expression.");
        }
        return new OpExp(this.lhsValue, newOperator, newRhsValue);
    }
    /**
     *
     * @param {Array} values
     * @return {Exp}
     */
    applyInOperation(...values) {
        if (!(this.lhsValue != null && this.lhsValue instanceof Column))
            throw new QueryGrammarException("Can only apply \'in\' operation on a Column");
        return new (__Function.prototype.bind.apply(InExp, [null, this.lhsValue, false].concat(values)));
    }
    /**
     *
     * @param {Array} values
     * @return {Exp}
     */
    applyNotInOperation(...values) {
        if (!(this.lhsValue != null && this.lhsValue instanceof Column))
            throw new QueryGrammarException("Can only apply \'in\' operation on a Column");
        return new (__Function.prototype.bind.apply(InExp, [null, this.lhsValue, true].concat(values)));
    }
    /**
     *
     * @param {*} valueStart
     * @param {*} valueEnd
     * @return {Exp}
     */
    applyBetweenOperation(valueStart, valueEnd) {
        if (!(this.lhsValue != null && this.lhsValue instanceof Column))
            throw new QueryGrammarException("Can only apply \'between\' operation on a Column");
        return new BetweenExp(this.lhsValue, valueStart, valueEnd);
    }
    accept(visitor) {
        visitor['visit$com_octo_java_sql_exp_OpExp'](this);
    }
    getLhsValue() {
        return this.lhsValue;
    }
    getOperator() {
        return this.operator;
    }
    getRhsValue() {
        return this.rhsValue;
    }
    setLhsValue(lhsValue) {
        this.lhsValue = lhsValue;
    }
    setRhsValue(rhsValue) {
        this.rhsValue = rhsValue;
    }
}
OpExp["__class"] = "com.octo.java.sql.exp.OpExp";
OpExp["__interfaces"] = ["com.octo.java.sql.query.visitor.Visitable"];
var __Function = Function;
/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export class OrExp extends ExpSeq {
    constructor(...clauses) {
        super(...clauses);
    }
    /**
     *
     * @return {Operator}
     */
    getOperator() {
        return Operator.OR;
    }
}
OrExp["__class"] = "com.octo.java.sql.exp.OrExp";
OrExp["__interfaces"] = ["com.octo.java.sql.query.visitor.Visitable"];
var __Function = Function;
/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export class SetClause {
    constructor(column, value) {
        if (this.column === undefined)
            this.column = null;
        if (this.value === undefined)
            this.value = null;
        this.column = column;
        this.value = value;
    }
    accept(visitor) {
        visitor['visit$com_octo_java_sql_exp_SetClause'](this);
    }
    getColumn() {
        return this.column;
    }
    getValue() {
        return this.value;
    }
}
SetClause["__class"] = "com.octo.java.sql.exp.SetClause";
SetClause["__interfaces"] = ["com.octo.java.sql.query.visitor.Visitable"];
var __Function = Function;
/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export class BaseVisitor {
    acceptOrVisitValue(value, baseName) {
        if (((value != null) || value === null) && baseName === undefined) {
            return this.acceptOrVisitValue$java_lang_Object(value);
        }
        else
            throw new Error('invalid overload');
    }
    acceptOrVisitValue$java_lang_Object(param) {
        if (param != null && (param["__interfaces"] != null && param["__interfaces"].indexOf("com.octo.java.sql.query.visitor.Visitable") >= 0 || param.constructor != null && param.constructor["__interfaces"] != null && param.constructor["__interfaces"].indexOf("com.octo.java.sql.query.visitor.Visitable") >= 0))
            param.accept(this);
        else
            this.visitValue(param);
    }
    constructor() {
    }
}
BaseVisitor["__class"] = "com.octo.java.sql.query.visitor.BaseVisitor";
BaseVisitor["__interfaces"] = ["com.octo.java.sql.query.visitor.QueryVisitor"];
var __Function = Function;
/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export class DefaultVisitor extends BaseVisitor {
    visitValue(value) {
    }
    visit$com_octo_java_sql_exp_SQLFunc(func) {
        {
            let array136 = func.getParams();
            for (let index135 = 0; index135 < array136.length; index135++) {
                let param = array136[index135];
                this.acceptOrVisitValue$java_lang_Object(param);
            }
        }
    }
    visit$com_octo_java_sql_exp_JavaSQLFunc(javaSQLFunc) {
    }
    visit(javaSQLFunc) {
        if (((javaSQLFunc != null && javaSQLFunc instanceof JavaSQLFunc) || javaSQLFunc === null)) {
            return this.visit$com_octo_java_sql_exp_JavaSQLFunc(javaSQLFunc);
        }
        else if (((javaSQLFunc != null && javaSQLFunc instanceof SQLFunc) || javaSQLFunc === null)) {
            return this.visit$com_octo_java_sql_exp_SQLFunc(javaSQLFunc);
        }
        else if (((javaSQLFunc != null && javaSQLFunc instanceof Column) || javaSQLFunc === null)) {
            return this.visit$com_octo_java_sql_exp_Column(javaSQLFunc);
        }
        else if (((javaSQLFunc != null && javaSQLFunc instanceof OpExp) || javaSQLFunc === null)) {
            return this.visit$com_octo_java_sql_exp_OpExp(javaSQLFunc);
        }
        else if (((javaSQLFunc != null && javaSQLFunc instanceof BetweenExp) || javaSQLFunc === null)) {
            return this.visit$com_octo_java_sql_exp_BetweenExp(javaSQLFunc);
        }
        else if (((javaSQLFunc != null && javaSQLFunc instanceof ExpSeq) || javaSQLFunc === null)) {
            return this.visit$com_octo_java_sql_exp_ExpSeq(javaSQLFunc);
        }
        else if (((javaSQLFunc != null && javaSQLFunc instanceof InExp) || javaSQLFunc === null)) {
            return this.visit$com_octo_java_sql_exp_InExp(javaSQLFunc);
        }
        else if (((javaSQLFunc != null && javaSQLFunc instanceof JoinClause) || javaSQLFunc === null)) {
            return this.visit$com_octo_java_sql_exp_JoinClause(javaSQLFunc);
        }
        else if (((javaSQLFunc != null && javaSQLFunc instanceof SetClause) || javaSQLFunc === null)) {
            return this.visit$com_octo_java_sql_exp_SetClause(javaSQLFunc);
        }
        else if (((javaSQLFunc != null && javaSQLFunc instanceof Constant) || javaSQLFunc === null)) {
            return this.visit$com_octo_java_sql_exp_Constant(javaSQLFunc);
        }
        else if (((javaSQLFunc != null && javaSQLFunc instanceof SelectQuery) || javaSQLFunc === null)) {
            return this.visit$com_octo_java_sql_query_SelectQuery(javaSQLFunc);
        }
        else if (((javaSQLFunc != null && javaSQLFunc instanceof UpdateQuery) || javaSQLFunc === null)) {
            return this.visit$com_octo_java_sql_query_UpdateQuery(javaSQLFunc);
        }
        else if (((javaSQLFunc != null && javaSQLFunc instanceof InsertQuery) || javaSQLFunc === null)) {
            return this.visit$com_octo_java_sql_query_InsertQuery(javaSQLFunc);
        }
        else if (((javaSQLFunc != null && javaSQLFunc instanceof DeleteQuery) || javaSQLFunc === null)) {
            return this.visit$com_octo_java_sql_query_DeleteQuery(javaSQLFunc);
        }
        else if (((javaSQLFunc != null && javaSQLFunc instanceof Nullable) || javaSQLFunc === null)) {
            return this.visit$com_octo_java_sql_exp_Nullable(javaSQLFunc);
        }
        else
            throw new Error('invalid overload');
    }
    visit$com_octo_java_sql_exp_Column(column) {
    }
    visit$com_octo_java_sql_exp_OpExp(exp) {
        this.acceptOrVisitValue$java_lang_Object(exp.getLhsValue());
        this.acceptOrVisitValue$java_lang_Object(exp.getRhsValue());
    }
    visit$com_octo_java_sql_exp_BetweenExp(betweenExp) {
        betweenExp.getColumn().accept(this);
        this.acceptOrVisitValue$java_lang_Object(betweenExp.getValueStart());
        this.acceptOrVisitValue$java_lang_Object(betweenExp.getValueEnd());
    }
    visit$com_octo_java_sql_exp_ExpSeq(expSeq) {
        for (let index137 = expSeq.getClauses().iterator(); index137.hasNext();) {
            let clause = index137.next();
            clause.accept(this);
        }
    }
    visit$com_octo_java_sql_exp_InExp(inExp) {
        inExp.getColumn().accept(this);
        if (!ArrayUtils.isEmpty(inExp.getValues())) {
            let array139 = inExp.getValues();
            for (let index138 = 0; index138 < array139.length; index138++) {
                let value = array139[index138];
                this.acceptOrVisitValue$java_lang_Object(value);
            }
        }
    }
    visit$com_octo_java_sql_exp_JoinClause(joinClause) {
        joinClause.getOnClause().accept(this);
    }
    visit$com_octo_java_sql_exp_SetClause(setClause) {
        setClause.getColumn().accept(this);
        this.acceptOrVisitValue$java_lang_Object(setClause.getValue());
    }
    visit$com_octo_java_sql_exp_Constant(constant) {
    }
    visit$com_octo_java_sql_query_SelectQuery(query) {
        {
            let array141 = query.getColumns();
            for (let index140 = 0; index140 < array141.length; index140++) {
                let column = array141[index140];
                this.acceptOrVisitValue$java_lang_Object(column);
            }
        }
        for (let index142 = query.getJoinClauses().iterator(); index142.hasNext();) {
            let clause = index142.next();
            clause.accept(this);
        }
        let whereClause = query.getWhereClause();
        if (whereClause != null)
            whereClause.accept(this);
        for (let index143 = query.getUnions().iterator(); index143.hasNext();) {
            let union = index143.next();
            union.accept(this);
        }
    }
    visit$com_octo_java_sql_query_UpdateQuery(updateQuery) {
        for (let index144 = updateQuery.getSetClauses().iterator(); index144.hasNext();) {
            let clause = index144.next();
            clause.accept(this);
        }
        let whereClause = updateQuery.getWhereClause();
        if (whereClause != null)
            whereClause.accept(this);
    }
    visit$com_octo_java_sql_query_InsertQuery(insertQuery) {
        let columnValues = insertQuery.getColumnsValues();
        for (let index145 = columnValues.keySet().iterator(); index145.hasNext();) {
            let column = index145.next();
            this.acceptOrVisitValue$java_lang_Object(columnValues.get(column));
        }
    }
    visit$com_octo_java_sql_query_DeleteQuery(deleteQuery) {
        let whereClause = deleteQuery.getWhereClause();
        if (whereClause != null)
            whereClause.accept(this);
    }
    visit$com_octo_java_sql_exp_Nullable(nullable) {
        this.acceptOrVisitValue$java_lang_Object(nullable.getValue());
    }
    constructor() {
        super();
    }
}
DefaultVisitor["__class"] = "com.octo.java.sql.query.visitor.DefaultVisitor";
DefaultVisitor["__interfaces"] = ["com.octo.java.sql.query.visitor.QueryVisitor"];
var __Function = Function;
/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export class BasicQueryOptimizer extends DefaultVisitor {
    constructor() {
        super();
        /*private*/ this.usedTables = new java.util.HashSet();
        /*private*/ this.tableReverseDependency = new java.util.HashMap();
        /*private*/ this.tableJoin = new java.util.HashMap();
        if (this.currentJoinedTable === undefined)
            this.currentJoinedTable = null;
    }
    visit$com_octo_java_sql_exp_BetweenExp(betweenExp) {
        super.visit$com_octo_java_sql_exp_BetweenExp(betweenExp);
        if ((betweenExp.getValueStart() == null) || (betweenExp.getValueEnd() == null))
            betweenExp.invalidate();
    }
    /**
     *
     * @param {BetweenExp} betweenExp
     */
    visit(betweenExp) {
        if (((betweenExp != null && betweenExp instanceof BetweenExp) || betweenExp === null)) {
            return this.visit$com_octo_java_sql_exp_BetweenExp(betweenExp);
        }
        else if (((betweenExp != null && betweenExp instanceof InExp) || betweenExp === null)) {
            return this.visit$com_octo_java_sql_exp_InExp(betweenExp);
        }
        else if (((betweenExp != null && betweenExp instanceof OpExp) || betweenExp === null)) {
            return this.visit$com_octo_java_sql_exp_OpExp(betweenExp);
        }
        else if (((betweenExp != null && betweenExp instanceof ExpSeq) || betweenExp === null)) {
            return this.visit$com_octo_java_sql_exp_ExpSeq(betweenExp);
        }
        else if (((betweenExp != null && betweenExp instanceof Column) || betweenExp === null)) {
            return this.visit$com_octo_java_sql_exp_Column(betweenExp);
        }
        else if (((betweenExp != null && betweenExp instanceof JoinClause) || betweenExp === null)) {
            return this.visit$com_octo_java_sql_exp_JoinClause(betweenExp);
        }
        else if (((betweenExp != null && betweenExp instanceof SelectQuery) || betweenExp === null)) {
            return this.visit$com_octo_java_sql_query_SelectQuery(betweenExp);
        }
        else if (((betweenExp != null && betweenExp instanceof Constant) || betweenExp === null)) {
            return this.visit$com_octo_java_sql_exp_Constant(betweenExp);
        }
        else if (((betweenExp != null && betweenExp instanceof JavaSQLFunc) || betweenExp === null)) {
            super.visit(betweenExp);
        }
        else if (((betweenExp != null && betweenExp instanceof SQLFunc) || betweenExp === null)) {
            return this.visit$com_octo_java_sql_exp_SQLFunc(betweenExp);
        }
        else if (((betweenExp != null && betweenExp instanceof SetClause) || betweenExp === null)) {
            return this.visit$com_octo_java_sql_exp_SetClause(betweenExp);
        }
        else if (((betweenExp != null && betweenExp instanceof UpdateQuery) || betweenExp === null)) {
            return this.visit$com_octo_java_sql_query_UpdateQuery(betweenExp);
        }
        else if (((betweenExp != null && betweenExp instanceof InsertQuery) || betweenExp === null)) {
            return this.visit$com_octo_java_sql_query_InsertQuery(betweenExp);
        }
        else if (((betweenExp != null && betweenExp instanceof DeleteQuery) || betweenExp === null)) {
            return this.visit$com_octo_java_sql_query_DeleteQuery(betweenExp);
        }
        else if (((betweenExp != null && betweenExp instanceof Nullable) || betweenExp === null)) {
            return this.visit$com_octo_java_sql_exp_Nullable(betweenExp);
        }
        else
            throw new Error('invalid overload');
    }
    visit$com_octo_java_sql_exp_InExp(inExp) {
        super.visit$com_octo_java_sql_exp_InExp(inExp);
        if (ArrayUtils.isEmpty(inExp.getValues()))
            inExp.invalidate();
        else {
            let atLeastOneInValueIsNull = CollectionUtils.exists(java.util.Arrays.asList(...inExp.getValues()), new BasicQueryOptimizer.BasicQueryOptimizer$0(this));
            if (atLeastOneInValueIsNull)
                inExp.invalidate();
        }
    }
    visit$com_octo_java_sql_exp_OpExp(exp) {
        super.visit$com_octo_java_sql_exp_OpExp(exp);
        if ((exp.getLhsValue() == null) || (exp.getRhsValue() == null))
            exp.invalidate();
    }
    visit$com_octo_java_sql_exp_ExpSeq(expSeq) {
        super.visit$com_octo_java_sql_exp_ExpSeq(expSeq);
        let atLeastOneExpIsValid = CollectionUtils.exists(expSeq.getClauses(), new BasicQueryOptimizer.BasicQueryOptimizer$1(this));
        if (!atLeastOneExpIsValid)
            expSeq.invalidate();
    }
    visit$com_octo_java_sql_exp_Column(column) {
        super.visit$com_octo_java_sql_exp_Column(column);
        let tableName = column.getTableName();
        if (!StringUtils.isEmpty(tableName)) {
            if (this.currentJoinedTable == null)
                this.usedTables.add(tableName);
            else if (!((o1, o2) => { if (o1 && o1.equals) {
                return o1.equals(o2);
            }
            else {
                return o1 === o2;
            } })(this.currentJoinedTable, tableName))
                this.addTableReverseDependency(this.currentJoinedTable, tableName);
        }
    }
    visit$com_octo_java_sql_exp_JoinClause(joinClause) {
        this.currentJoinedTable = joinClause.getTable();
        super.visit$com_octo_java_sql_exp_JoinClause(joinClause);
        this.tableJoin.put(this.currentJoinedTable, joinClause);
        this.currentJoinedTable = null;
    }
    visit$com_octo_java_sql_query_SelectQuery(query) {
        super.visit$com_octo_java_sql_query_SelectQuery(query);
        for (let index121 = this.tableJoin.keySet().iterator(); index121.hasNext();) {
            let table = index121.next();
            if (!this.isJoinNecessary(table))
                this.tableJoin.get(table).invalidate();
        }
    }
    visit$com_octo_java_sql_exp_Constant(constant) {
        super.visit$com_octo_java_sql_exp_Constant(constant);
        if (((o1, o2) => { if (o1 && o1.equals) {
            return o1.equals(o2);
        }
        else {
            return o1 === o2;
        } })(Constant.STAR_$LI$(), constant))
            this.usedTables.add(null);
    }
    /**
     * Add table1 as a reverse dependency of table2 (ie. table1 depends on table2)
     *
     * @param {string} table1
     * @param {string} table2
     * @private
     */
    /*private*/ addTableReverseDependency(table1, table2) {
        let reverseDependencies;
        if (!this.tableReverseDependency.containsKey(table2)) {
            reverseDependencies = new java.util.HashSet();
            this.tableReverseDependency.put(table2, reverseDependencies);
        }
        else
            reverseDependencies = this.tableReverseDependency.get(table2);
        reverseDependencies.add(table1);
    }
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
    isJoinNecessary(table) {
        return this.usedTables.contains(null) || this.usedTables.contains(Constant.STAR_$LI$().getValue()) || this.usedTables.contains(table) || (this.tableReverseDependency.containsKey(table) && CollectionUtils.exists(this.tableReverseDependency.get(table), new BasicQueryOptimizer.BasicQueryOptimizer$2(this)));
    }
}
BasicQueryOptimizer["__class"] = "com.octo.java.sql.query.BasicQueryOptimizer";
BasicQueryOptimizer["__interfaces"] = ["com.octo.java.sql.query.visitor.QueryVisitor"];
(function (BasicQueryOptimizer) {
    class BasicQueryOptimizer$0 {
        constructor(__parent) {
            this.__parent = __parent;
        }
        evaluate(object) {
            return object == null;
        }
    }
    BasicQueryOptimizer.BasicQueryOptimizer$0 = BasicQueryOptimizer$0;
    BasicQueryOptimizer$0["__interfaces"] = ["util.Predicate"];
    class BasicQueryOptimizer$1 {
        constructor(__parent) {
            this.__parent = __parent;
        }
        evaluate(exp) {
            return exp.isValid();
        }
    }
    BasicQueryOptimizer.BasicQueryOptimizer$1 = BasicQueryOptimizer$1;
    BasicQueryOptimizer$1["__interfaces"] = ["util.Predicate"];
    class BasicQueryOptimizer$2 {
        constructor(__parent) {
            this.__parent = __parent;
        }
        evaluate(dependency) {
            return this.__parent.isJoinNecessary(dependency);
        }
    }
    BasicQueryOptimizer.BasicQueryOptimizer$2 = BasicQueryOptimizer$2;
    BasicQueryOptimizer$2["__interfaces"] = ["util.Predicate"];
})(BasicQueryOptimizer || (BasicQueryOptimizer = {}));
var __Function = Function;
/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export class Query {
    constructor() {
        if (this.whereClause === undefined)
            this.whereClause = null;
        if (this.builder === undefined)
            this.builder = null;
    }
    static funcEvaluatorMap_$LI$() { if (Query.funcEvaluatorMap == null)
        Query.funcEvaluatorMap = new java.util.HashMap(); return Query.funcEvaluatorMap; }
    ;
    static querybuilderClassName_$LI$() { if (Query.querybuilderClassName == null)
        Query.querybuilderClassName = Query.getDefaultBuilder(); return Query.querybuilderClassName; }
    ;
    static visitors_$LI$() { if (Query.visitors == null)
        Query.visitors = new java.util.HashSet(); return Query.visitors; }
    ;
    static setDefaultQueryBuilder(className) {
        Query.querybuilderClassName = className;
    }
    /*private*/ static getDefaultBuilder() {
        return "DefaultQueryBuilder";
    }
    static resetDefaultQueryBuilder() {
        Query.querybuilderClassName = Query.getDefaultBuilder();
    }
    getWhereClause() {
        return this.whereClause;
    }
    /**
     * @param columns
     * to put both SQLFunc & Colsname
     * @param {Array} columnsAndFunc
     * @return {SelectQuery}
     */
    static select(...columnsAndFunc) {
        return new (__Function.prototype.bind.apply(SelectQuery, [null].concat(columnsAndFunc)));
    }
    /**
     * Create an UPDATE Query
     *
     * @param {string} table
     * @return
     * @return {UpdateQuery}
     */
    static update(table) {
        return new UpdateQuery(table);
    }
    /**
     * Create an INSERT Query
     *
     * @param {string} table
     * @return
     * @return {InsertQuery}
     */
    static insertInto(table) {
        return new InsertQuery(table);
    }
    /**
     * Create an DELETE Query
     *
     * @param {string} table
     * @return
     * @return {DeleteQuery}
     */
    static deleteFrom(table) {
        return new DeleteQuery(table);
    }
    /**
     * Create an SQLFunc
     *
     * @param {string} funcName
     * @param {Array} params
     * @return
     * @return {SQLFunc}
     */
    static f(funcName, ...params) {
        if (Query.funcEvaluatorMap_$LI$().containsKey(funcName)) {
            let evaluator = Query.funcEvaluatorMap_$LI$().get(funcName);
            return new JavaSQLFunc(funcName, params, evaluator);
        }
        else {
            return new (__Function.prototype.bind.apply(SQLFunc, [null, funcName].concat(params)));
        }
    }
    /**
     * Create a Column
     *
     * @param {string} name
     * @return
     * @return {Column}
     */
    static c(name) {
        return new Column(name);
    }
    static e$com_octo_java_sql_exp_Column(columnName) {
        return new OpExp(columnName);
    }
    /**
     * Create a new OpExp
     *
     * @param {Column} columnName
     * @return
     * @return {OpExp}
     */
    static e(columnName) {
        if (((columnName != null && columnName instanceof Column) || columnName === null)) {
            return Query.e$com_octo_java_sql_exp_Column(columnName);
        }
        else if (((columnName != null && columnName instanceof SQLFunc) || columnName === null)) {
            return Query.e$com_octo_java_sql_exp_SQLFunc(columnName);
        }
        else
            throw new Error('invalid overload');
    }
    static e$com_octo_java_sql_exp_SQLFunc(func) {
        return new OpExp(func);
    }
    toSql$() {
        return this.toSql$com_octo_java_sql_query_visitor_DefaultQueryBuilder(this.getQueryBuilder());
    }
    toSql$com_octo_java_sql_query_visitor_DefaultQueryBuilder(queryBuilder) {
        this.runVisitors();
        this.builder = queryBuilder;
        this.accept(this.builder);
        let sqlQuery = this.builder.getResult().toString();
        return sqlQuery;
    }
    toSql(queryBuilder) {
        if (((queryBuilder != null && queryBuilder instanceof DefaultQueryBuilder) || queryBuilder === null)) {
            return this.toSql$com_octo_java_sql_query_visitor_DefaultQueryBuilder(queryBuilder);
        }
        else if (queryBuilder === undefined) {
            return this.toSql$();
        }
        else
            throw new Error('invalid overload');
    }
    getQueryBuilder() {
        return eval(' new ' + Query.querybuilderClassName + '();');
    }
    /*private*/ runVisitors() {
        for (let index122 = Query.visitors_$LI$().iterator(); index122.hasNext();) {
            let visitor = index122.next();
            {
                this.accept(visitor);
            }
        }
    }
    getParams() {
        return this.builder.getParams();
    }
    static addVisitor(visitor) {
        Query.visitors_$LI$().add(visitor);
    }
    static clearVisitors() {
        Query.visitors_$LI$().clear();
    }
    whereReset() {
        this.whereClause = null;
        return this;
    }
    where$com_octo_java_sql_exp_Column(column) {
        this.whereClause = new OpExp(column);
        return this;
    }
    where$com_octo_java_sql_exp_Exp(newWhereClause) {
        this.whereClause = newWhereClause;
        return this;
    }
    where$com_octo_java_sql_exp_Column$com_octo_java_sql_exp_Operator$java_lang_Object(column, operator, value) {
        if (value != null)
            this.whereClause = new OpExp(column, operator, value);
        return this;
    }
    where(column, operator, value) {
        if (((column != null && column instanceof Column) || column === null) && ((typeof operator === 'number') || operator === null) && ((value != null) || value === null)) {
            return this.where$com_octo_java_sql_exp_Column$com_octo_java_sql_exp_Operator$java_lang_Object(column, operator, value);
        }
        else if (((column != null && column instanceof Column) || column === null) && operator === undefined && value === undefined) {
            return this.where$com_octo_java_sql_exp_Column(column);
        }
        else if (((column != null && column instanceof Exp) || column === null) && operator === undefined && value === undefined) {
            return this.where$com_octo_java_sql_exp_Exp(column);
        }
        else if (((column != null && column instanceof SQLFunc) || column === null) && operator === undefined && value === undefined) {
            return this.where$com_octo_java_sql_exp_SQLFunc(column);
        }
        else
            throw new Error('invalid overload');
    }
    where$com_octo_java_sql_exp_SQLFunc(func) {
        this.whereClause = new OpExp(func);
        return this;
    }
    eq(value) {
        this.assertWhereClauseIsInitialized("eq");
        this.whereClause = this.whereClause.eq(value);
        return this;
    }
    eqOrIsNull(value) {
        this.assertWhereClauseIsInitialized("eq");
        this.whereClause = this.whereClause.eq(new Nullable(value));
        return this;
    }
    neq(value) {
        this.assertWhereClauseIsInitialized("neq");
        this.whereClause = this.whereClause.neq(value);
        return this;
    }
    neqNullable(value) {
        this.assertWhereClauseIsInitialized("neq");
        this.whereClause = this.whereClause.neq(new Nullable(value));
        return this;
    }
    geq(value) {
        this.assertWhereClauseIsInitialized("geq");
        this.whereClause = this.whereClause.geq(value);
        return this;
    }
    leq(value) {
        this.assertWhereClauseIsInitialized("leq");
        this.whereClause = this.whereClause.leq(value);
        return this;
    }
    like(value) {
        this.assertWhereClauseIsInitialized("like");
        this.whereClause = this.whereClause.like(value);
        return this;
    }
    in(...values) {
        this.assertWhereClauseIsInitialized("in");
        this.whereClause = (o => o.in.apply(o, values))(this.whereClause);
        return this;
    }
    notIn(...values) {
        this.assertWhereClauseIsInitialized("not in");
        this.whereClause = (o => o.notIn.apply(o, values))(this.whereClause);
        return this;
    }
    and$com_octo_java_sql_exp_Column(column) {
        this.assertWhereClauseIsInitialized("and");
        this.whereClause = this.whereClause.and$com_octo_java_sql_exp_Column(column);
        return this;
    }
    and(column) {
        if (((column != null && column instanceof Column) || column === null)) {
            return this.and$com_octo_java_sql_exp_Column(column);
        }
        else if (((column != null && column instanceof SQLFunc) || column === null)) {
            return this.and$com_octo_java_sql_exp_SQLFunc(column);
        }
        else if (((column != null && column instanceof Exp) || column === null)) {
            return this.and$com_octo_java_sql_exp_Exp(column);
        }
        else
            throw new Error('invalid overload');
    }
    and$com_octo_java_sql_exp_SQLFunc(func) {
        this.assertWhereClauseIsInitialized("and");
        this.whereClause = this.whereClause.and$com_octo_java_sql_exp_SQLFunc(func);
        return this;
    }
    and$com_octo_java_sql_exp_Exp(exp) {
        this.assertWhereClauseIsInitialized("and");
        this.whereClause = this.whereClause.and$com_octo_java_sql_exp_Exp(exp);
        return this;
    }
    isNull() {
        this.assertWhereClauseIsInitialized("isNull");
        this.whereClause = this.whereClause.isNull();
        return this;
    }
    isNotNull() {
        this.assertWhereClauseIsInitialized("isNotNull");
        this.whereClause = this.whereClause.isNotNull();
        return this;
    }
    /**
     * @param {Operator} op
     * @param {*} valueStart
     * @param {*} valueEnd
     * @return {Query} If operator is "between" do a between operation, else apply
     * operation with op on valueStart.
     * @throws QueryGrammarException
     */
    betweenOrOp(op, valueStart, valueEnd) {
        this.assertWhereClauseIsInitialized(op == null ? null : Operator["_$wrappers"][op].getValue());
        this.whereClause = this.whereClause.betweenOrOp(op, valueStart, valueEnd);
        return this;
    }
    between(valueStart, valueEnd) {
        this.assertWhereClauseIsInitialized("between");
        this.whereClause = this.whereClause.between(valueStart, valueEnd);
        return this;
    }
    op(op, value) {
        this.assertWhereClauseIsInitialized(op == null ? null : Operator["_$wrappers"][op].getValue());
        this.whereClause = this.whereClause.applyOperation(op, value);
        return this;
    }
    startWith(value) {
        this.assertWhereClauseIsInitialized("startWith");
        this.whereClause = this.whereClause.startWith(value);
        return this;
    }
    contains(value) {
        this.assertWhereClauseIsInitialized("contains");
        this.whereClause = this.whereClause.contains(value);
        return this;
    }
    static addFuncEvaluator(funcName, evaluator) {
        Query.funcEvaluatorMap_$LI$().put(funcName, evaluator);
    }
    static clearFuncEvaluatorMap() {
        Query.funcEvaluatorMap_$LI$().clear();
    }
    /*private*/ assertWhereClauseIsInitialized(operation) {
        if (this.whereClause == null)
            throw new QueryGrammarException("Cannot apply \'" + operation + "\' operator if no where clause exist");
    }
}
/**
 * Set it to false when using HSQLDB
 */
Query.oracleDialect = true;
Query["__class"] = "com.octo.java.sql.query.Query";
Query["__interfaces"] = ["com.octo.java.sql.query.visitor.Visitable"];
var __Function = Function;
Query.visitors_$LI$();
Query.querybuilderClassName_$LI$();
Query.funcEvaluatorMap_$LI$();
/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export class DeleteQuery extends Query {
    constructor(...tables) {
        super();
        if (this.tables === undefined)
            this.tables = null;
        this.tables = tables;
    }
    accept(visitor) {
        visitor['visit$com_octo_java_sql_query_DeleteQuery'](this);
    }
    getTables() {
        return this.tables;
    }
}
DeleteQuery["__class"] = "com.octo.java.sql.query.DeleteQuery";
DeleteQuery["__interfaces"] = ["com.octo.java.sql.query.visitor.Visitable"];
var __Function = Function;
/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export class InsertQuery extends Query {
    constructor(table) {
        super();
        /*private*/ this.columnsValues = new java.util.LinkedHashMap();
        if (this.table === undefined)
            this.table = null;
        this.table = table;
    }
    set$java_lang_String$java_lang_Object(column, value) {
        if (this.columnsValues.containsKey(column))
            throw new QueryGrammarException("Column \'" + column + "\' has already been set.");
        this.columnsValues.put(column, value);
        return this;
    }
    set$java_lang_String$java_lang_Object$java_lang_Object(column, value, defaultValueIfNull) {
        if (value == null)
            return this.set$java_lang_String$java_lang_Object(column, defaultValueIfNull);
        else
            return this.set$java_lang_String$java_lang_Object(column, value);
    }
    set(column, value, defaultValueIfNull) {
        if (((typeof column === 'string') || column === null) && ((value != null) || value === null) && ((defaultValueIfNull != null) || defaultValueIfNull === null)) {
            return this.set$java_lang_String$java_lang_Object$java_lang_Object(column, value, defaultValueIfNull);
        }
        else if (((typeof column === 'string') || column === null) && ((value != null) || value === null) && defaultValueIfNull === undefined) {
            return this.set$java_lang_String$java_lang_Object(column, value);
        }
        else
            throw new Error('invalid overload');
    }
    accept(visitor) {
        visitor['visit$com_octo_java_sql_query_InsertQuery'](this);
    }
    getColumnsValues() {
        return this.columnsValues;
    }
    getTable() {
        return this.table;
    }
}
InsertQuery["__class"] = "com.octo.java.sql.query.InsertQuery";
InsertQuery["__interfaces"] = ["com.octo.java.sql.query.visitor.Visitable"];
var __Function = Function;
/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export class QueryException extends Error {
    constructor(message) {
        super(message);
        this.message = message;
        Object.setPrototypeOf(this, QueryException.prototype);
    }
}
QueryException.serialVersionUID = -2306972223647011582;
QueryException["__class"] = "com.octo.java.sql.query.QueryException";
QueryException["__interfaces"] = ["java.io.Serializable"];
var __Function = Function;
/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export class QueryGrammarException extends QueryException {
    constructor(message) {
        super(message);
        Object.setPrototypeOf(this, QueryGrammarException.prototype);
    }
}
QueryGrammarException.__com_octo_java_sql_query_QueryGrammarException_serialVersionUID = 562421290186643510;
QueryGrammarException["__class"] = "com.octo.java.sql.query.QueryGrammarException";
QueryGrammarException["__interfaces"] = ["java.io.Serializable"];
var __Function = Function;
/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export class SelectQuery extends Query {
    constructor(...columns) {
        super();
        /*private*/ this.joinClauses = new java.util.ArrayList();
        /*private*/ this.__orderBy = new java.util.LinkedHashMap();
        /*private*/ this.__limit = null;
        /*private*/ this.lastOrderByColumn = null;
        /*private*/ this.lastOrderByNeeded = true;
        /*private*/ this.unions = new java.util.ArrayList();
        if (this.columns === undefined)
            this.columns = null;
        if (this.tables === undefined)
            this.tables = null;
        if (this.alias === undefined)
            this.alias = null;
        if ((columns != null) && (columns.length === 1) && ((o1, o2) => { if (o1 && o1.equals) {
            return o1.equals(o2);
        }
        else {
            return o1 === o2;
        } })(Constant.STAR_$LI$().getValue(), columns[0]))
            this.columns = [Constant.STAR_$LI$()];
        else
            this.columns = columns;
    }
    from(...newTables) {
        this.tables = newTables;
        return this;
    }
    innerJoin(table) {
        let result = new JoinClause(table, JoinClause.JoinType.INNER_JOIN, this);
        this.joinClauses.add(result);
        return result;
    }
    leftOuterJoin(table) {
        let result = new JoinClause(table, JoinClause.JoinType.LEFT_OUTER_JOIN, this);
        this.joinClauses.add(result);
        return result;
    }
    orderBy$java_lang_String(value) {
        this.__orderBy.put(value, null);
        this.lastOrderByColumn = value;
        return this;
    }
    orderByReset() {
        this.__orderBy = new java.util.LinkedHashMap();
        this.lastOrderByColumn = null;
        return this;
    }
    orderBy$java_lang_String$boolean(value, isOrderByNeeded) {
        this.lastOrderByNeeded = isOrderByNeeded;
        if (isOrderByNeeded) {
            return this.orderBy$java_lang_String(value);
        }
        return this;
    }
    orderBy(value, isOrderByNeeded) {
        if (((typeof value === 'string') || value === null) && ((typeof isOrderByNeeded === 'boolean') || isOrderByNeeded === null)) {
            return this.orderBy$java_lang_String$boolean(value, isOrderByNeeded);
        }
        else if (((typeof value === 'string') || value === null) && isOrderByNeeded === undefined) {
            return this.orderBy$java_lang_String(value);
        }
        else
            throw new Error('invalid overload');
    }
    desc() {
        if (!this.lastOrderByNeeded) {
            return this;
        }
        this.assertOrderBySpecified("desc");
        this.__orderBy.put(this.lastOrderByColumn, SelectQuery.Order.DESC);
        return this;
    }
    assertOrderBySpecified(operation) {
        if (this.lastOrderByColumn == null) {
            throw new QueryGrammarException("Cannot apply \'" + operation + "\' operator without order by column.");
        }
    }
    asc() {
        if (!this.lastOrderByNeeded) {
            return this;
        }
        this.assertOrderBySpecified("asc");
        this.__orderBy.put(this.lastOrderByColumn, SelectQuery.Order.ASC);
        return this;
    }
    limit(newLimit) {
        this.__limit = newLimit;
        return this;
    }
    as(alias) {
        this.alias = alias;
        return this;
    }
    union(innerQuery) {
        this.unions.add(innerQuery);
        return this;
    }
    setColumns(...columns) {
        if ((columns != null) && (columns.length === 1) && ((o1, o2) => { if (o1 && o1.equals) {
            return o1.equals(o2);
        }
        else {
            return o1 === o2;
        } })(Constant.STAR_$LI$().getValue(), columns[0]))
            this.columns = [Constant.STAR_$LI$()];
        else
            this.columns = columns;
        return this;
    }
    accept(visitor) {
        visitor['visit$com_octo_java_sql_query_SelectQuery'](this);
    }
    getColumns() {
        return this.columns;
    }
    getTables() {
        return this.tables;
    }
    getJoinClauses() {
        return this.joinClauses;
    }
    getAlias() {
        return this.alias;
    }
    getOrderBy() {
        return this.__orderBy;
    }
    getLimit() {
        return this.__limit;
    }
    getUnions() {
        return this.unions;
    }
}
SelectQuery["__class"] = "com.octo.java.sql.query.SelectQuery";
SelectQuery["__interfaces"] = ["com.octo.java.sql.query.visitor.Visitable"];
(function (SelectQuery) {
    var Order;
    (function (Order) {
        Order[Order["DESC"] = 0] = "DESC";
        Order[Order["ASC"] = 1] = "ASC";
    })(Order = SelectQuery.Order || (SelectQuery.Order = {}));
    /** @ignore */
    class Order_$WRAPPER {
        constructor(_$ordinal, _$name, value) {
            this._$ordinal = _$ordinal;
            this._$name = _$name;
            if (this.value === undefined)
                this.value = null;
            this.value = value;
        }
        getVlue() {
            return this.value;
        }
        name() { return this._$name; }
        ordinal() { return this._$ordinal; }
    }
    SelectQuery.Order_$WRAPPER = Order_$WRAPPER;
    Order["__class"] = "com.octo.java.sql.query.SelectQuery.Order";
    Order["__interfaces"] = ["java.lang.Comparable", "java.io.Serializable"];
    Order["_$wrappers"] = [new Order_$WRAPPER(0, "DESC", "DESC"), new Order_$WRAPPER(1, "ASC", "ASC")];
})(SelectQuery || (SelectQuery = {}));
var __Function = Function;
/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export class UpdateQuery extends Query {
    constructor(table) {
        super();
        /*private*/ this.setClauses = new java.util.ArrayList();
        if (this.table === undefined)
            this.table = null;
        this.table = table;
    }
    set(column, value) {
        this.setClauses.add(new SetClause(column, value));
        return this;
    }
    accept(visitor) {
        visitor['visit$com_octo_java_sql_query_UpdateQuery'](this);
    }
    getTable() {
        return this.table;
    }
    getSetClauses() {
        return this.setClauses;
    }
}
UpdateQuery["__class"] = "com.octo.java.sql.query.UpdateQuery";
UpdateQuery["__interfaces"] = ["com.octo.java.sql.query.visitor.Visitable"];
var __Function = Function;
/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export class DefaultQueryBuilder extends BaseVisitor {
    constructor() {
        super();
        this.result = new java.lang.StringBuilder();
        /*private*/ this.variableIndex = 1;
        /*private*/ this.params = new java.util.HashMap();
        this.addBracketToNextSelectQuery = false;
        /*private*/ this.functions = new java.util.HashMap();
    }
    addFunction(functionName, __function) {
        this.functions.put(functionName, __function);
    }
    getResult() {
        return this.result;
    }
    getParams() {
        return this.params;
    }
    /**
     * Add a variable to parameters map and return its name
     *
     * @param columnName
     * @return
     * @param {*} value
     * @param {string} baseColumnName
     * @return {string}
     */
    addVariable(value, baseColumnName) {
        let columnName = "p" + this.variableIndex++;
        this.params.put(columnName, value);
        return columnName;
    }
    /*private*/ getVariableName(obj, defaultName) {
        if (obj != null && obj instanceof Column)
            return obj.getName();
        else if (obj != null && obj instanceof SQLFunc)
            return obj.getName();
        else
            return defaultName;
    }
    acceptOrVisitValue$java_lang_Object$java_lang_String(value, baseName) {
        if (value != null && (value["__interfaces"] != null && value["__interfaces"].indexOf("com.octo.java.sql.query.visitor.Visitable") >= 0 || value.constructor != null && value.constructor["__interfaces"] != null && value.constructor["__interfaces"].indexOf("com.octo.java.sql.query.visitor.Visitable") >= 0))
            value.accept(this);
        else {
            let variableName = this.addVariable(value, baseName);
            this.result.append(":").append(variableName);
        }
    }
    acceptOrVisitValue(value, baseName) {
        if (((value != null) || value === null) && ((typeof baseName === 'string') || baseName === null)) {
            return this.acceptOrVisitValue$java_lang_Object$java_lang_String(value, baseName);
        }
        else if (((value != null) || value === null) && baseName === undefined) {
            return this.acceptOrVisitValue$java_lang_Object(value);
        }
        else
            throw new Error('invalid overload');
    }
    visitValue(value) {
        let variableName = this.addVariable(value, DefaultQueryBuilder.DEFAULT_BASE_VARIABLE_NAME);
        this.result.append(":").append(variableName);
    }
    buildWhereClause(whereClause) {
        if (whereClause.isValid()) {
            this.result.append(" ").append(DefaultQueryBuilder.WHERE).append(" ");
            whereClause.accept(this);
        }
    }
    buildLimitClause(query) {
        this.result.append(" ").append("LIMIT").append(" ");
        this.result.append(":").append(this.addVariable(query.getLimit(), "limit"));
    }
    visit$com_octo_java_sql_exp_Column(column) {
        this.result.append(column.getName());
    }
    /**
     * Visit methods
     * @param {Column} column
     */
    visit(column) {
        if (((column != null && column instanceof Column) || column === null)) {
            return this.visit$com_octo_java_sql_exp_Column(column);
        }
        else if (((column != null && column instanceof OpExp) || column === null)) {
            return this.visit$com_octo_java_sql_exp_OpExp(column);
        }
        else if (((column != null && column instanceof BetweenExp) || column === null)) {
            return this.visit$com_octo_java_sql_exp_BetweenExp(column);
        }
        else if (((column != null && column instanceof ExpSeq) || column === null)) {
            return this.visit$com_octo_java_sql_exp_ExpSeq(column);
        }
        else if (((column != null && column instanceof InExp) || column === null)) {
            return this.visit$com_octo_java_sql_exp_InExp(column);
        }
        else if (((column != null && column instanceof JoinClause) || column === null)) {
            return this.visit$com_octo_java_sql_exp_JoinClause(column);
        }
        else if (((column != null && column instanceof SetClause) || column === null)) {
            return this.visit$com_octo_java_sql_exp_SetClause(column);
        }
        else if (((column != null && column instanceof SQLFunc) || column === null)) {
            return this.visit$com_octo_java_sql_exp_SQLFunc(column);
        }
        else if (((column != null && column instanceof Constant) || column === null)) {
            return this.visit$com_octo_java_sql_exp_Constant(column);
        }
        else if (((column != null && column instanceof SelectQuery) || column === null)) {
            return this.visit$com_octo_java_sql_query_SelectQuery(column);
        }
        else if (((column != null && column instanceof UpdateQuery) || column === null)) {
            return this.visit$com_octo_java_sql_query_UpdateQuery(column);
        }
        else if (((column != null && column instanceof InsertQuery) || column === null)) {
            return this.visit$com_octo_java_sql_query_InsertQuery(column);
        }
        else if (((column != null && column instanceof DeleteQuery) || column === null)) {
            return this.visit$com_octo_java_sql_query_DeleteQuery(column);
        }
        else if (((column != null && column instanceof Nullable) || column === null)) {
            return this.visit$com_octo_java_sql_exp_Nullable(column);
        }
        else
            throw new Error('invalid overload');
    }
    visit$com_octo_java_sql_exp_OpExp(exp) {
        let baseVariableName = this.getVariableName(exp.getLhsValue(), null);
        if (baseVariableName == null)
            baseVariableName = this.getVariableName(exp.getRhsValue(), "var");
        this.result.append(DefaultQueryBuilder.OPEN_BRACKET);
        this.acceptOrVisitValue$java_lang_Object$java_lang_String(exp.getLhsValue(), baseVariableName);
        if ((exp.getRhsValue() == null) || ((exp.getRhsValue() != null && exp.getRhsValue() instanceof Nullable) && exp.getRhsValue().isNull())) {
            if (!((Operator.EQ) === (exp.getOperator())))
                throw new QueryGrammarException("Cannot use NULL value with operator " + Operator["_$wrappers"][exp.getOperator()].getValue());
            this.result.append(" ").append(Operator["_$wrappers"][Operator.IS].getValue());
            this.result.append(" ").append(Constant.NULL_$LI$().getValue());
        }
        else {
            this.result.append(" ").append(Operator["_$wrappers"][exp.getOperator()].getValue()).append(" ");
            this.acceptOrVisitValue$java_lang_Object$java_lang_String(exp.getRhsValue(), baseVariableName);
        }
        this.result.append(DefaultQueryBuilder.CLOSE_BRACKET);
    }
    visit$com_octo_java_sql_exp_BetweenExp(betweenExp) {
        let column = betweenExp.getColumn();
        if ((betweenExp.getValueStart() == null) || (betweenExp.getValueEnd() == null))
            throw new QueryGrammarException("Cannot apply BETWEEN with one NULL value");
        this.result.append(DefaultQueryBuilder.OPEN_BRACKET);
        this.visit$com_octo_java_sql_exp_Column(column);
        this.result.append(" ").append(DefaultQueryBuilder.BETWEEN).append(" ");
        this.acceptOrVisitValue$java_lang_Object$java_lang_String(betweenExp.getValueStart(), column.getName());
        this.result.append(" ").append(Operator["_$wrappers"][Operator.AND].getValue()).append(" ");
        this.acceptOrVisitValue$java_lang_Object$java_lang_String(betweenExp.getValueEnd(), column.getName());
        this.result.append(DefaultQueryBuilder.CLOSE_BRACKET);
    }
    visit$com_octo_java_sql_exp_ExpSeq(expSeq) {
        this.result.append(DefaultQueryBuilder.OPEN_BRACKET);
        let operator = expSeq.getOperator();
        let firstClause = true;
        for (let index123 = expSeq.getClauses().iterator(); index123.hasNext();) {
            let clause = index123.next();
            {
                if (clause.isValid()) {
                    if (firstClause)
                        firstClause = false;
                    else
                        this.result.append(" ").append(Operator["_$wrappers"][operator].getValue()).append(" ");
                    clause.accept(this);
                }
            }
        }
        this.result.append(DefaultQueryBuilder.CLOSE_BRACKET);
    }
    visit$com_octo_java_sql_exp_InExp(inExp) {
        if (ArrayUtils.isEmpty(inExp.getValues()))
            throw new QueryGrammarException("IN values cannot be empty or null");
        this.result.append(DefaultQueryBuilder.OPEN_BRACKET);
        inExp.getColumn().accept(this);
        this.result.append(" ");
        if (inExp.isNegative())
            this.result.append(Operator["_$wrappers"][Operator.NOT].getValue()).append(" ");
        this.result.append(Operator["_$wrappers"][Operator.IN].getValue()).append(" ").append(DefaultQueryBuilder.OPEN_BRACKET);
        let firstValue = true;
        {
            let array125 = inExp.getValues();
            for (let index124 = 0; index124 < array125.length; index124++) {
                let value = array125[index124];
                {
                    if (firstValue)
                        firstValue = false;
                    else
                        this.result.append(",");
                    this.acceptOrVisitValue$java_lang_Object$java_lang_String(value, inExp.getColumn().getName());
                }
            }
        }
        this.result.append(DefaultQueryBuilder.CLOSE_BRACKET);
        this.result.append(DefaultQueryBuilder.CLOSE_BRACKET);
    }
    visit$com_octo_java_sql_exp_JoinClause(joinClause) {
        this.result.append(" ").append(JoinClause.JoinType["_$wrappers"][joinClause.getType()].value).append(" ");
        this.result.append(joinClause.getTable());
        this.result.append(" ").append(DefaultQueryBuilder.ON).append(" ");
        joinClause.getOnClause().accept(this);
    }
    visit$com_octo_java_sql_exp_SetClause(setClause) {
        let column = setClause.getColumn();
        column.accept(this);
        this.result.append(" ").append(Operator["_$wrappers"][Operator.EQ].getValue()).append(" ");
        this.acceptOrVisitValue$java_lang_Object$java_lang_String(setClause.getValue(), column.getName());
    }
    visit$com_octo_java_sql_exp_SQLFunc(sqlFunc) {
        let functionName = sqlFunc.getName();
        if (this.functions.containsKey(functionName)) {
            let functionPlaceHolder = this.functions.get(functionName);
            this.result.append((o => o.eval.apply(o, sqlFunc.getParams()))(functionPlaceHolder));
        }
        else {
            this.result.append(functionName).append(DefaultQueryBuilder.OPEN_BRACKET);
            let firstParam = true;
            {
                let array127 = sqlFunc.getParams();
                for (let index126 = 0; index126 < array127.length; index126++) {
                    let param = array127[index126];
                    {
                        if (firstParam)
                            firstParam = false;
                        else
                            this.result.append(",");
                        this.acceptOrVisitValue$java_lang_Object$java_lang_String(param, functionName);
                    }
                }
            }
            this.result.append(DefaultQueryBuilder.CLOSE_BRACKET);
            if (!StringUtils.isEmpty(sqlFunc.getAlias()))
                this.result.append(" ").append(DefaultQueryBuilder.AS).append(" ").append(sqlFunc.getAlias());
        }
    }
    visit$com_octo_java_sql_exp_Constant(constant) {
        this.result.append(constant.getValue());
    }
    visit$com_octo_java_sql_query_SelectQuery(query) {
        let innerQuery = this.addBracketToNextSelectQuery;
        if (innerQuery)
            this.result.append(DefaultQueryBuilder.OPEN_BRACKET);
        else
            this.addBracketToNextSelectQuery = true;
        this.result.append(DefaultQueryBuilder.SELECT).append(" ");
        let firstColumn = true;
        {
            let array129 = query.getColumns();
            for (let index128 = 0; index128 < array129.length; index128++) {
                let column = array129[index128];
                {
                    if (firstColumn)
                        firstColumn = false;
                    else
                        this.result.append(",");
                    this.acceptOrVisitValue$java_lang_Object(column);
                }
            }
        }
        this.result.append(" ").append(DefaultQueryBuilder.FROM).append(" ");
        this.result.append(StringUtils.join$java_lang_Object_A$char(query.getTables(), ','));
        for (let index130 = query.getJoinClauses().iterator(); index130.hasNext();) {
            let clause = index130.next();
            if (clause.isValid())
                clause.accept(this);
        }
        if (!StringUtils.isEmpty(query.getAlias())) {
            this.result.append(" ");
            this.result.append(query.getAlias());
        }
        let whereClause = query.getWhereClause();
        if ((whereClause != null) && (whereClause.isValid()))
            this.buildWhereClause(whereClause);
        let firstOrderBy = true;
        let orderBy = query.getOrderBy();
        for (let index131 = orderBy.keySet().iterator(); index131.hasNext();) {
            let orderByColumn = index131.next();
            {
                if (firstOrderBy) {
                    this.result.append(" ").append(DefaultQueryBuilder.ORDER_BY).append(" ");
                    firstOrderBy = false;
                }
                else
                    this.result.append(", ");
                this.result.append(orderByColumn);
                let columnOrder = orderBy.get(orderByColumn);
                if (columnOrder != null)
                    this.result.append(" ").append(SelectQuery.Order["_$wrappers"][columnOrder].getVlue());
            }
        }
        if (query.getLimit() != null)
            this.buildLimitClause(query);
        if (!CollectionUtils.isEmpty(query.getUnions())) {
            this.result.append(" ").append(DefaultQueryBuilder.UNION).append(" ");
            for (let index132 = query.getUnions().iterator(); index132.hasNext();) {
                let union = index132.next();
                {
                    this.addBracketToNextSelectQuery = false;
                    union.accept(this);
                }
            }
        }
        if (innerQuery)
            this.result.append(DefaultQueryBuilder.CLOSE_BRACKET);
    }
    visit$com_octo_java_sql_query_UpdateQuery(updateQuery) {
        this.addBracketToNextSelectQuery = true;
        this.result.append(DefaultQueryBuilder.UPDATE).append(" ");
        this.result.append(updateQuery.getTable());
        this.result.append(" ").append(DefaultQueryBuilder.SET).append(" ");
        let firstClause = true;
        for (let index133 = updateQuery.getSetClauses().iterator(); index133.hasNext();) {
            let clause = index133.next();
            {
                if (firstClause) {
                    firstClause = false;
                }
                else {
                    this.result.append(", ");
                }
                clause.accept(this);
            }
        }
        let whereClause = updateQuery.getWhereClause();
        if ((whereClause != null) && (whereClause.isValid()))
            this.buildWhereClause(whereClause);
    }
    visit$com_octo_java_sql_query_InsertQuery(insertQuery) {
        this.addBracketToNextSelectQuery = true;
        this.result.append(DefaultQueryBuilder.INSERT).append(" ");
        this.result.append(insertQuery.getTable()).append(" ");
        this.result.append(DefaultQueryBuilder.OPEN_BRACKET);
        let columnValues = insertQuery.getColumnsValues();
        this.result.append(StringUtils.join$java_util_Collection$java_lang_String(columnValues.keySet(), ", "));
        this.result.append(DefaultQueryBuilder.CLOSE_BRACKET).append(" ");
        this.result.append(DefaultQueryBuilder.VALUES).append(" ").append(DefaultQueryBuilder.OPEN_BRACKET);
        let firstClause = true;
        for (let index134 = columnValues.keySet().iterator(); index134.hasNext();) {
            let column = index134.next();
            {
                if (firstClause) {
                    firstClause = false;
                }
                else {
                    this.result.append(", ");
                }
                this.acceptOrVisitValue$java_lang_Object$java_lang_String(columnValues.get(column), column);
            }
        }
        this.result.append(DefaultQueryBuilder.CLOSE_BRACKET);
    }
    visit$com_octo_java_sql_query_DeleteQuery(deleteQuery) {
        this.addBracketToNextSelectQuery = true;
        this.result.append(DefaultQueryBuilder.DELETE_FROM).append(" ");
        this.result.append(StringUtils.join$java_lang_Object_A$char(deleteQuery.getTables(), ','));
        let whereClause = deleteQuery.getWhereClause();
        if ((whereClause != null) && (whereClause.isValid()))
            this.buildWhereClause(whereClause);
    }
    visit$com_octo_java_sql_exp_Nullable(nullable) {
        this.acceptOrVisitValue$java_lang_Object(nullable.getValue());
    }
}
DefaultQueryBuilder.DEFAULT_BASE_VARIABLE_NAME = "param";
DefaultQueryBuilder.OPEN_BRACKET = "(";
DefaultQueryBuilder.BETWEEN = "BETWEEN";
DefaultQueryBuilder.CLOSE_BRACKET = ")";
DefaultQueryBuilder.ON = "ON";
DefaultQueryBuilder.AS = "AS";
DefaultQueryBuilder.SELECT = "SELECT";
DefaultQueryBuilder.FROM = "FROM";
DefaultQueryBuilder.WHERE = "WHERE";
DefaultQueryBuilder.ORDER_BY = "ORDER BY";
DefaultQueryBuilder.UNION = "UNION";
DefaultQueryBuilder.INSERT = "INSERT INTO";
DefaultQueryBuilder.VALUES = "VALUES";
DefaultQueryBuilder.UPDATE = "UPDATE";
DefaultQueryBuilder.SET = "SET";
DefaultQueryBuilder.DELETE_FROM = "DELETE FROM";
DefaultQueryBuilder["__class"] = "com.octo.java.sql.query.visitor.DefaultQueryBuilder";
DefaultQueryBuilder["__interfaces"] = ["com.octo.java.sql.query.visitor.QueryVisitor"];
var __Function = Function;
/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export class OracleQueryBuilder extends DefaultQueryBuilder {
    /**
     *
     * @param {SelectQuery} query
     */
    buildLimitClause(query) {
        this.result.insert(0, "SELECT * FROM (");
        this.result.append(") WHERE (rownum<=:");
        this.result.append(this.addVariable(query.getLimit(), "limit")).append(")");
    }
    constructor() {
        super();
    }
}
OracleQueryBuilder["__class"] = "com.octo.java.sql.query.visitor.OracleQueryBuilder";
OracleQueryBuilder["__interfaces"] = ["com.octo.java.sql.query.visitor.QueryVisitor"];
var __Function = Function;
var __Function = Function;
/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export class ArrayUtils {
    static isEmpty(array) {
        if (array == null || array.length === 0) {
            return true;
        }
        return false;
    }
}
ArrayUtils["__class"] = "util.ArrayUtils";
var __Function = Function;
/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export class CollectionUtils {
    static isEmpty(coll) {
        return (coll == null || coll.isEmpty());
    }
    static exists(collection, predicate) {
        if (collection != null && predicate != null) {
            for (let it = collection.iterator(); it.hasNext();) {
                if (predicate.evaluate(it.next())) {
                    return true;
                }
            }
            ;
        }
        return false;
    }
}
CollectionUtils["__class"] = "util.CollectionUtils";
var __Function = Function;
/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export class ObjectUtils {
    static toString(obj) {
        return obj == null ? "" : obj.toString();
    }
}
ObjectUtils["__class"] = "util.ObjectUtils";
var __Function = Function;
var __Function = Function;
/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export class StringUtils {
    static isEmpty(str) {
        return str == null || str.length === 0;
    }
    static join$java_lang_Object_A$char(array, separator) {
        if (array == null) {
            return null;
        }
        return StringUtils.join$java_lang_Object_A$char$int$int(array, separator, 0, array.length);
    }
    static join$java_lang_Object_A$char$int$int(array, separator, startIndex, endIndex) {
        if (array == null) {
            return null;
        }
        let bufSize = (endIndex - startIndex);
        if (bufSize <= 0) {
            return StringUtils.EMPTY;
        }
        bufSize *= ((array[startIndex] == null ? 16 : array[startIndex].toString().length) + 1);
        let buf = new java.lang.StringBuffer(bufSize);
        for (let i = startIndex; i < endIndex; i++) {
            if (i > startIndex) {
                buf.append(separator);
            }
            if (array[i] != null) {
                buf.append(array[i]);
            }
        }
        ;
        return buf.toString();
    }
    static join(array, separator, startIndex, endIndex) {
        if (((array != null && array instanceof Array && (array.length == 0 || array[0] == null || (array[0] != null))) || array === null) && ((typeof separator === 'string') || separator === null) && ((typeof startIndex === 'number') || startIndex === null) && ((typeof endIndex === 'number') || endIndex === null)) {
            return StringUtils.join$java_lang_Object_A$char$int$int(array, separator, startIndex, endIndex);
        }
        else if (((array != null && (array["__interfaces"] != null && array["__interfaces"].indexOf("java.util.Collection") >= 0 || array.constructor != null && array.constructor["__interfaces"] != null && array.constructor["__interfaces"].indexOf("java.util.Collection") >= 0)) || array === null) && ((typeof separator === 'string') || separator === null) && startIndex === undefined && endIndex === undefined) {
            return StringUtils.join$java_util_Collection$java_lang_String(array, separator);
        }
        else if (((array != null && (array["__interfaces"] != null && array["__interfaces"].indexOf("java.util.Iterator") >= 0 || array.constructor != null && array.constructor["__interfaces"] != null && array.constructor["__interfaces"].indexOf("java.util.Iterator") >= 0)) || array === null) && ((typeof separator === 'string') || separator === null) && startIndex === undefined && endIndex === undefined) {
            return StringUtils.join$java_util_Iterator$java_lang_String(array, separator);
        }
        else if (((array != null && array instanceof Array && (array.length == 0 || array[0] == null || (array[0] != null))) || array === null) && ((typeof separator === 'string') || separator === null) && startIndex === undefined && endIndex === undefined) {
            return StringUtils.join$java_lang_Object_A$char(array, separator);
        }
        else
            throw new Error('invalid overload');
    }
    static join$java_util_Collection$java_lang_String(collection, separator) {
        if (collection == null) {
            return null;
        }
        return StringUtils.join$java_util_Iterator$java_lang_String(collection.iterator(), separator);
    }
    static join$java_util_Iterator$java_lang_String(iterator, separator) {
        if (iterator == null) {
            return null;
        }
        if (!iterator.hasNext()) {
            return StringUtils.EMPTY;
        }
        let first = iterator.next();
        if (!iterator.hasNext()) {
            return ObjectUtils.toString(first);
        }
        let buf = new java.lang.StringBuffer(256);
        if (first != null) {
            buf.append(first);
        }
        while ((iterator.hasNext())) {
            if (separator != null) {
                buf.append(separator);
            }
            let obj = iterator.next();
            if (obj != null) {
                buf.append(obj);
            }
        }
        ;
        return buf.toString();
    }
}
StringUtils.EMPTY = "";
StringUtils["__class"] = "util.StringUtils";
var __Function = Function;
//# sourceMappingURL=ts-sql-dsl.js.map