/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export interface Visitable {
    accept(visitor : QueryVisitor);
}


var __Function = Function;
/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export abstract class Exp implements Visitable {
    /*private*/ valid : boolean = true;

    public invalidate() {
        this.valid = false;
    }

    public isValid() : boolean {
        return this.valid;
    }

    public and$com_octo_java_sql_exp_Column$com_octo_java_sql_exp_Operator$java_lang_Object(andColumn : Column, andOperator : Operator, andValue : any) : AndExp {
        return new AndExp(this, new OpExp(andColumn, andOperator, andValue));
    }

    public and(andColumn? : any, andOperator? : any, andValue? : any) : any {
        if(((andColumn != null && andColumn instanceof <any>Column) || andColumn === null) && ((typeof andOperator === 'number') || andOperator === null) && ((andValue != null) || andValue === null)) {
            return <any>this.and$com_octo_java_sql_exp_Column$com_octo_java_sql_exp_Operator$java_lang_Object(andColumn, andOperator, andValue);
        } else if(((andColumn != null && andColumn instanceof <any>Column) || andColumn === null) && andOperator === undefined && andValue === undefined) {
            return <any>this.and$com_octo_java_sql_exp_Column(andColumn);
        } else if(((andColumn != null && andColumn instanceof <any>SQLFunc) || andColumn === null) && andOperator === undefined && andValue === undefined) {
            return <any>this.and$com_octo_java_sql_exp_SQLFunc(andColumn);
        } else if(((andColumn != null && andColumn instanceof <any>Exp) || andColumn === null) && andOperator === undefined && andValue === undefined) {
            return <any>this.and$com_octo_java_sql_exp_Exp(andColumn);
        } else throw new Error('invalid overload');
    }

    public and$com_octo_java_sql_exp_Column(andColumn : Column) : AndExp {
        return new AndExp(this, new OpExp(andColumn));
    }

    public and$com_octo_java_sql_exp_SQLFunc(func : SQLFunc) : AndExp {
        return new AndExp(this, new OpExp(func));
    }

    public and$com_octo_java_sql_exp_Exp(exp : Exp) : AndExp {
        return new AndExp(this, exp);
    }

    public or$com_octo_java_sql_exp_Column$com_octo_java_sql_exp_Operator$java_lang_Object$boolean(orColumn : Column, orOperator : Operator, orValue : any, orValueIsColumnName : boolean) : OrExp {
        return new OrExp(this, new OpExp(orColumn, orOperator, orValue));
    }

    public or(orColumn? : any, orOperator? : any, orValue? : any, orValueIsColumnName? : any) : any {
        if(((orColumn != null && orColumn instanceof <any>Column) || orColumn === null) && ((typeof orOperator === 'number') || orOperator === null) && ((orValue != null) || orValue === null) && ((typeof orValueIsColumnName === 'boolean') || orValueIsColumnName === null)) {
            return <any>this.or$com_octo_java_sql_exp_Column$com_octo_java_sql_exp_Operator$java_lang_Object$boolean(orColumn, orOperator, orValue, orValueIsColumnName);
        } else if(((orColumn != null && orColumn instanceof <any>Column) || orColumn === null) && orOperator === undefined && orValue === undefined && orValueIsColumnName === undefined) {
            return <any>this.or$com_octo_java_sql_exp_Column(orColumn);
        } else if(((orColumn != null && orColumn instanceof <any>Exp) || orColumn === null) && orOperator === undefined && orValue === undefined && orValueIsColumnName === undefined) {
            return <any>this.or$com_octo_java_sql_exp_Exp(orColumn);
        } else throw new Error('invalid overload');
    }

    public or$com_octo_java_sql_exp_Column(orColumn : Column) : OrExp {
        return new OrExp(this, new OpExp(orColumn));
    }

    public or$com_octo_java_sql_exp_Exp(exp : Exp) : OrExp {
        return new OrExp(this, exp);
    }

    public eq(value : any) : Exp {
        return this.applyOperation(Operator.EQ, value);
    }

    public neq(value : any) : Exp {
        return this.applyOperation(Operator.NEQ, value);
    }

    public geq(value : number) : Exp {
        return this.applyOperation(Operator.GEQ, value);
    }

    public leq(value : number) : Exp {
        return this.applyOperation(Operator.LEQ, value);
    }

    public like(value : string) : Exp {
        return this.applyOperation(Operator.LIKE, value);
    }

    public between(valueStart : any, valueEnd : any) : Exp {
        return this.applyBetweenOperation(valueStart, valueEnd);
    }

    public startWith(value : string) : Exp {
        value = StringUtils.isEmpty(value)?null:value.concat("%");
        return this.applyOperation(Operator.LIKE, value);
    }

    public contains(value : string) : Exp {
        value = StringUtils.isEmpty(value)?null:"%".concat(value.concat("%"));
        return this.applyOperation(Operator.LIKE, value);
    }

    public in$java_lang_Object_A(...values : any[]) : Exp {
        return this.applyInOperation.apply(this, values);
    }

    public in(...values : any[]) : any {
        if(((values != null && values instanceof <any>Array && (values.length==0 || values[0] == null ||(values[0] != null))) || values === null)) {
            return <any>this.in$java_lang_Object_A(values);
        } else if(((values != null && (values instanceof Array)) || values === null)) {
            return <any>this.in$java_util_Collection(values);
        } else throw new Error('invalid overload');
    }

    public in$java_util_Collection(values : Array<any>) : Exp {
        if(values == null) {
            return this;
        } else {
            return this.applyInOperation.apply(this, /* toArray */values.slice(0));
        }
    }

    public notIn$java_lang_Object_A(...values : any[]) : Exp {
        return this.applyNotInOperation.apply(this, values);
    }

    public notIn(...values : any[]) : any {
        if(((values != null && values instanceof <any>Array && (values.length==0 || values[0] == null ||(values[0] != null))) || values === null)) {
            return <any>this.notIn$java_lang_Object_A(values);
        } else if(((values != null && (values instanceof Array)) || values === null)) {
            return <any>this.notIn$java_util_Collection(values);
        } else throw new Error('invalid overload');
    }

    public notIn$java_util_Collection(values : Array<any>) : Exp {
        if(values == null) {
            return this;
        } else {
            return this.applyNotInOperation.apply(this, /* toArray */values.slice(0));
        }
    }

    public isNull() : Exp {
        return this.applyOperation(Operator.IS, Constant.NULL);
    }

    public isNotNull() : Exp {
        return this.applyOperation(Operator.IS_NOT, Constant.NULL);
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
    public betweenOrOp(op : Operator, valueStart : any, valueEnd : any) : Exp {
        if(/* Enum.equals */(<any>(Operator.BTW) === <any>(op))) {
            return this.applyBetweenOperation(valueStart, valueEnd);
        } else {
            return this.applyOperation(op, valueStart);
        }
    }

    public abstract applyOperation(operator : Operator, value : any) : Exp;

    public abstract applyInOperation(...values : any[]) : Exp;

    public abstract applyNotInOperation(...values : any[]) : Exp;

    public abstract applyBetweenOperation(valueStart : any, valueEnd : any) : Exp;

    public abstract accept(visitor?: any): any;
    constructor() {
    }
}
Exp["__class"] = "com.octo.java.sql.exp.Exp";
Exp["__interfaces"] = ["com.octo.java.sql.query.visitor.Visitable"];




/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export abstract class ExpSeq extends Exp {
    clauses : Array<Exp>;

    constructor(...clauses : Exp[]) {
        super();
        this.clauses = null;
        this.clauses = /* asList */clauses.slice(0);
    }

    /**
     * 
     * @param {Operator} operator
     * @param {*} value
     * @return {Exp}
     */
    public applyOperation(operator : Operator, value : any) : Exp {
        let lastIndex : number = /* size */(<number>this.clauses.length) - 1;
        let lastClause : Exp = /* get */this.clauses[lastIndex];
        /* set */(this.clauses[lastIndex] = lastClause.applyOperation(operator, value));
        return this;
    }

    /**
     * 
     * @param {*} valueStart
     * @param {*} valueEnd
     * @return {Exp}
     */
    public applyBetweenOperation(valueStart : any, valueEnd : any) : Exp {
        let lastIndex : number = /* size */(<number>this.clauses.length) - 1;
        let lastClause : Exp = /* get */this.clauses[lastIndex];
        /* set */(this.clauses[lastIndex] = lastClause.applyBetweenOperation(valueStart, valueEnd));
        return this;
    }

    /**
     * 
     * @param {Array} values
     * @return {Exp}
     */
    public applyInOperation(...values : any[]) : Exp {
        let lastIndex : number = /* size */(<number>this.clauses.length) - 1;
        let lastClause : Exp = /* get */this.clauses[lastIndex];
        /* set */(this.clauses[lastIndex] = (o => o.applyInOperation.apply(o, values))(lastClause));
        return this;
    }

    /**
     * 
     * @param {Array} values
     * @return {Exp}
     */
    public applyNotInOperation(...values : any[]) : Exp {
        let lastIndex : number = /* size */(<number>this.clauses.length) - 1;
        let lastClause : Exp = /* get */this.clauses[lastIndex];
        /* set */(this.clauses[lastIndex] = (o => o.applyNotInOperation.apply(o, values))(lastClause));
        return this;
    }

    public accept(visitor : QueryVisitor) {
        visitor['visit$com_octo_java_sql_exp_ExpSeq'](this);
    }

    public abstract getOperator() : Operator;

    public getClauses() : Array<Exp> {
        return this.clauses;
    }
}
ExpSeq["__class"] = "com.octo.java.sql.exp.ExpSeq";
ExpSeq["__interfaces"] = ["com.octo.java.sql.query.visitor.Visitable"];




/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export class SQLFunc implements Visitable {
    funcName : string;

    params : any[];

    alias : string;

    public constructor(funcName? : any, ...params : any[]) {
        if(((typeof funcName === 'string') || funcName === null) && ((params != null && params instanceof <any>Array && (params.length==0 || params[0] == null ||(params[0] != null))) || params === null)) {
            let __args = Array.prototype.slice.call(arguments);
            this.funcName = null;
            this.params = null;
            this.alias = null;
            this.funcName = null;
            this.params = null;
            this.alias = null;
            (() => {
                this.funcName = funcName;
                this.params = params;
            })();
        } else if(((typeof funcName === 'string') || funcName === null) && params === undefined) {
            let __args = Array.prototype.slice.call(arguments);
            this.funcName = null;
            this.params = null;
            this.alias = null;
            this.funcName = null;
            this.params = null;
            this.alias = null;
            (() => {
                this.funcName = funcName;
            })();
        } else throw new Error('invalid overload');
    }

    public getName() : string {
        return this.funcName;
    }

    public as(alias : string) : SQLFunc {
        this.alias = alias;
        return this;
    }

    public accept(visitor : QueryVisitor) {
        visitor['visit$com_octo_java_sql_exp_SQLFunc'](this);
    }

    public getParams() : any[] {
        return this.params;
    }

    public getAlias() : string {
        return this.alias;
    }
}
SQLFunc["__class"] = "com.octo.java.sql.exp.SQLFunc";
SQLFunc["__interfaces"] = ["com.octo.java.sql.query.visitor.Visitable"];




var __Function = Function;
/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export class AndExp extends ExpSeq {
    constructor(...clauses : Exp[]) {
        super(...clauses);
    }

    /**
     * 
     * @return {Operator}
     */
    public getOperator() : Operator {
        return Operator.AND;
    }
}
AndExp["__class"] = "com.octo.java.sql.exp.AndExp";
AndExp["__interfaces"] = ["com.octo.java.sql.query.visitor.Visitable"];




/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export class BetweenExp extends Exp {
    /*private*/ column : Column;

    /*private*/ valueStart : any;

    /*private*/ valueEnd : any;

    constructor(column : Column, valueStart : any, valueEnd : any) {
        super();
        this.column = null;
        this.valueStart = null;
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
    public applyInOperation(...newValues : any[]) : Exp {
        throw new QueryGrammarException("Cannot apply IN operation on an BETWEEN expression.");
    }

    /**
     * 
     * @param {Array} values
     * @return {Exp}
     */
    public applyNotInOperation(...values : any[]) : Exp {
        throw new QueryGrammarException("Cannot apply NOT IN operation on an BETWEEN expression.");
    }

    /**
     * 
     * @param {Operator} operator
     * @param {*} value
     * @return {Exp}
     */
    public applyOperation(operator : Operator, value : any) : Exp {
        throw new QueryGrammarException("Cannot apply " + operator + " operation on an BETWEEN expression.");
    }

    /**
     * 
     * @param {*} start
     * @param {*} end
     * @return {Exp}
     */
    public applyBetweenOperation(start : any, end : any) : Exp {
        throw new QueryGrammarException("Cannot apply BETWEEN on a BETWEEN expression.");
    }

    public accept(visitor : QueryVisitor) {
        visitor['visit$com_octo_java_sql_exp_BetweenExp'](this);
    }

    public getColumn() : Column {
        return this.column;
    }

    public getValueStart() : any {
        return this.valueStart;
    }

    public getValueEnd() : any {
        return this.valueEnd;
    }
}
BetweenExp["__class"] = "com.octo.java.sql.exp.BetweenExp";
BetweenExp["__interfaces"] = ["com.octo.java.sql.query.visitor.Visitable"];




/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export class Column implements Visitable {
    /*private*/ name : string;

    public constructor(name : string) {
        this.name = null;
        this.name = name;
    }

    public getName() : string {
        return this.name;
    }

    /**
     * 
     * @return {number}
     */
    public hashCode() : number {
        return /* hashCode */(<any>((o: any) => { if(o.hashCode) { return o.hashCode(); } else { return o.toString(); } })(this.name));
    }

    /**
     * 
     * @param {*} obj
     * @return {boolean}
     */
    public equals(obj : any) : boolean {
        if(this === obj) return true;
        if(!(obj != null && obj instanceof <any>Column)) return false;
        let otherObj : Column = <Column>obj;
        if(this.name == null) return otherObj.getName() == null; else return /* equals */(<any>((o1: any, o2: any) => { if(o1 && o1.equals) { return o1.equals(o2); } else { return o1 === o2; } })(this.name,otherObj.getName()));
    }

    /**
     * 
     * @return {string}
     */
    public toString() : string {
        return this.name;
    }

    public accept(visitor : QueryVisitor) {
        visitor['visit$com_octo_java_sql_exp_Column'](this);
    }

    public getTableName() : string {
        if(this.name.indexOf(".") > 0) return this.name.split("\.")[0]; else return null; 
    }
}
Column["__class"] = "com.octo.java.sql.exp.Column";
Column["__interfaces"] = ["com.octo.java.sql.query.visitor.Visitable"];




/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export enum Constant {
    NULL, STAR
}

/** @ignore */
export class Constant_$WRAPPER implements Visitable {
    /*private*/ value;

    constructor(protected _$ordinal : number, protected _$name : string, value) {
        this.value = null;
        this.value = value;
    }

    public getValue() : string {
        return this.value;
    }

    public accept(visitor) {
        visitor['visit$com_octo_java_sql_exp_Constant'](this);
    }
    public name() : string { return this._$name; }
    public ordinal() : number { return this._$ordinal; }
}
Constant["__class"] = "com.octo.java.sql.exp.Constant";
Constant["__interfaces"] = ["com.octo.java.sql.query.visitor.Visitable","java.lang.Comparable","java.io.Serializable"];

Constant["_$wrappers"] = [new Constant_$WRAPPER(0, "NULL", "NULL"), new Constant_$WRAPPER(1, "STAR", "*")];



/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export class InExp extends Exp {
    /*private*/ column : Column;

    /*private*/ values : any[];

    /*private*/ negative : boolean;

    constructor(column : Column, negative : boolean, ...values : any[]) {
        super();
        this.column = null;
        this.values = null;
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
    public applyInOperation(...newValues : any[]) : Exp {
        throw new QueryGrammarException("Cannot apply IN operation on an IN expression.");
    }

    /**
     * 
     * @param {Array} values
     * @return {Exp}
     */
    public applyNotInOperation(...values : any[]) : Exp {
        throw new QueryGrammarException("Cannot apply NOT IN operation on an IN expression.");
    }

    /**
     * 
     * @param {Operator} operator
     * @param {*} value
     * @return {Exp}
     */
    public applyOperation(operator : Operator, value : any) : Exp {
        throw new QueryGrammarException("Cannot apply " + operator + " operation on an IN expression.");
    }

    /**
     * 
     * @param {*} valueStart
     * @param {*} valueEnd
     * @return {Exp}
     */
    public applyBetweenOperation(valueStart : any, valueEnd : any) : Exp {
        throw new QueryGrammarException("Cannot apply IN on a BETWEEN expression.");
    }

    public accept(visitor : QueryVisitor) {
        visitor['visit$com_octo_java_sql_exp_InExp'](this);
    }

    public getColumn() : Column {
        return this.column;
    }

    public getValues() : any[] {
        return this.values;
    }

    public isNegative() : boolean {
        return this.negative;
    }
}
InExp["__class"] = "com.octo.java.sql.exp.InExp";
InExp["__interfaces"] = ["com.octo.java.sql.query.visitor.Visitable"];




/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export class JavaSQLFunc extends SQLFunc {
    /*private*/ evaluator : JavaSQLFunc.Evaluable<string>;

    public constructor(funcName : string, params : any[], evaluator : JavaSQLFunc.Evaluable<string>) {
        super(funcName);
        this.evaluator = null;
        this.params = params;
        this.evaluator = evaluator;
    }

    public getEvaluator() : JavaSQLFunc.Evaluable<string> {
        return this.evaluator;
    }
}
JavaSQLFunc["__class"] = "com.octo.java.sql.exp.JavaSQLFunc";
JavaSQLFunc["__interfaces"] = ["com.octo.java.sql.query.visitor.Visitable"];



export namespace JavaSQLFunc {

    export interface Evaluable<T> {
        eval(...params : any[]) : T;
    }
}



/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export class JoinClause implements Visitable {
    /*private*/ table : string;

    /*private*/ joinType : JoinClause.JoinType;

    /*private*/ onClause : Exp;

    /*private*/ query : SelectQuery;

    /*private*/ valid : boolean = true;

    public constructor(table : string, joinType : JoinClause.JoinType, query : SelectQuery) {
        this.table = null;
        this.joinType = null;
        this.onClause = null;
        this.query = null;
        this.table = table;
        this.joinType = joinType;
        this.query = query;
    }

    public on$com_octo_java_sql_exp_Column$com_octo_java_sql_exp_Operator$java_lang_Object(column : Column, operator : Operator, value : any) : SelectQuery {
        this.onClause = new OpExp(column, operator, value);
        return this.query;
    }

    public on(column? : any, operator? : any, value? : any) : any {
        if(((column != null && column instanceof <any>Column) || column === null) && ((typeof operator === 'number') || operator === null) && ((value != null) || value === null)) {
            return <any>this.on$com_octo_java_sql_exp_Column$com_octo_java_sql_exp_Operator$java_lang_Object(column, operator, value);
        } else if(((column != null && column instanceof <any>Exp) || column === null) && operator === undefined && value === undefined) {
            return <any>this.on$com_octo_java_sql_exp_Exp(column);
        } else if(((column != null && column instanceof <any>Column) || column === null) && operator === undefined && value === undefined) {
            return <any>this.on$com_octo_java_sql_exp_Column(column);
        } else throw new Error('invalid overload');
    }

    public on$com_octo_java_sql_exp_Exp(exp : Exp) : SelectQuery {
        this.onClause = exp;
        return this.query;
    }

    public on$com_octo_java_sql_exp_Column(column : Column) : JoinClause {
        this.onClause = new OpExp(column);
        return this;
    }

    public eq(value : any) : SelectQuery {
        this.assertOnClauseIsInitialized("eq");
        this.onClause = this.onClause.eq(value);
        return this.query;
    }

    assertOnClauseIsInitialized(operation : string) {
        if(this.onClause == null) throw new QueryGrammarException("Cannot apply \'" + operation + "\' operation without an initialized join clause.");
    }

    public accept(visitor : QueryVisitor) {
        visitor['visit$com_octo_java_sql_exp_JoinClause'](this);
    }

    public getOnClause() : Exp {
        return this.onClause;
    }

    public getType() : JoinClause.JoinType {
        return this.joinType;
    }

    public getTable() : string {
        return this.table;
    }

    public isValid() : boolean {
        return this.valid;
    }

    public invalidate() {
        this.valid = false;
    }
}
JoinClause["__class"] = "com.octo.java.sql.exp.JoinClause";
JoinClause["__interfaces"] = ["com.octo.java.sql.query.visitor.Visitable"];



export namespace JoinClause {

    export enum JoinType {
        LEFT_OUTER_JOIN, RIGHT_OUTER_JOIN, INNER_JOIN
    }

    /** @ignore */
    export class JoinType_$WRAPPER {
        public value;

        constructor(protected _$ordinal : number, protected _$name : string, value) {
            this.value = null;
            this.value = value;
        }
        public name() : string { return this._$name; }
        public ordinal() : number { return this._$ordinal; }
    }
    JoinType["__class"] = "com.octo.java.sql.exp.JoinClause.JoinType";
    JoinType["__interfaces"] = ["java.lang.Comparable","java.io.Serializable"];

    JoinType["_$wrappers"] = [new JoinType_$WRAPPER(0, "LEFT_OUTER_JOIN", "LEFT OUTER JOIN"), new JoinType_$WRAPPER(1, "RIGHT_OUTER_JOIN", "RIGHT OUTER JOIN"), new JoinType_$WRAPPER(2, "INNER_JOIN", "INNER JOIN")];

}



/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export class Nullable implements Visitable {
    /*private*/ value : any;

    public constructor(value : any) {
        this.value = null;
        this.value = value;
    }

    public getValue() : any {
        return this.value;
    }

    public isNull() : boolean {
        return this.value == null;
    }

    /**
     * 
     * @param {*} obj
     * @return {boolean}
     */
    public equals(obj : any) : boolean {
        if(obj == null) return false;
        if(!(obj != null && obj instanceof <any>Nullable)) return false;
        let otherObj : Nullable = <Nullable>obj;
        if(this.value == null) return otherObj.getValue() == null; else return /* equals */(<any>((o1: any, o2: any) => { if(o1 && o1.equals) { return o1.equals(o2); } else { return o1 === o2; } })(this.value,otherObj.getValue()));
    }

    public accept(visitor : QueryVisitor) {
        visitor['visit$com_octo_java_sql_exp_Nullable'](this);
    }
}
Nullable["__class"] = "com.octo.java.sql.exp.Nullable";
Nullable["__interfaces"] = ["com.octo.java.sql.query.visitor.Visitable"];




/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export enum Operator {
    IS, BTW, LIKE, EQ, NEQ, GT, GEQ, LT, LEQ, NOT, IN, IS_NOT, AND, OR
}

/** @ignore */
export class Operator_$WRAPPER {
    /*private*/ value;

    constructor(protected _$ordinal : number, protected _$name : string, value) {
        this.value = null;
        this.value = value;
    }

    public getValue() : string {
        return this.value;
    }
    public name() : string { return this._$name; }
    public ordinal() : number { return this._$ordinal; }
}
Operator["__class"] = "com.octo.java.sql.exp.Operator";
Operator["__interfaces"] = ["java.lang.Comparable","java.io.Serializable"];

Operator["_$wrappers"] = [new Operator_$WRAPPER(0, "IS", "IS"), new Operator_$WRAPPER(1, "BTW", "BETWEEN"), new Operator_$WRAPPER(2, "LIKE", "LIKE"), new Operator_$WRAPPER(3, "EQ", "="), new Operator_$WRAPPER(4, "NEQ", "!="), new Operator_$WRAPPER(5, "GT", ">"), new Operator_$WRAPPER(6, "GEQ", ">="), new Operator_$WRAPPER(7, "LT", "<"), new Operator_$WRAPPER(8, "LEQ", "<="), new Operator_$WRAPPER(9, "NOT", "NOT"), new Operator_$WRAPPER(10, "IN", "IN"), new Operator_$WRAPPER(11, "IS_NOT", "IS NOT"), new Operator_$WRAPPER(12, "AND", "AND"), new Operator_$WRAPPER(13, "OR", "OR")];



/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export class OpExp extends Exp {
    /*private*/ lhsValue : any;

    /*private*/ rhsValue : any;

    /*private*/ operator : Operator;

    public constructor(lhsValue? : any, operator? : any, rhsValue? : any) {
        if(((lhsValue != null) || lhsValue === null) && ((typeof operator === 'number') || operator === null) && ((rhsValue != null) || rhsValue === null)) {
            let __args = Array.prototype.slice.call(arguments);
            super();
            this.lhsValue = null;
            this.rhsValue = null;
            this.operator = null;
            this.lhsValue = null;
            this.rhsValue = null;
            this.operator = null;
            (() => {
                this.lhsValue = lhsValue;
                this.rhsValue = rhsValue;
                this.operator = operator;
            })();
        } else if(((lhsValue != null) || lhsValue === null) && operator === undefined && rhsValue === undefined) {
            let __args = Array.prototype.slice.call(arguments);
            super();
            this.lhsValue = null;
            this.rhsValue = null;
            this.operator = null;
            this.lhsValue = null;
            this.rhsValue = null;
            this.operator = null;
            (() => {
                this.lhsValue = lhsValue;
                this.rhsValue = null;
                this.operator = null;
            })();
        } else throw new Error('invalid overload');
    }

    /**
     * 
     * @param {Operator} newOperator
     * @param {*} newRhsValue
     * @return {Exp}
     */
    public applyOperation(newOperator : Operator, newRhsValue : any) : Exp {
        if(this.operator != null) {
            throw new QueryGrammarException("Cannot apply " + Operator["_$wrappers"][newOperator].getValue() + " operation on an " + Operator["_$wrappers"][this.operator].getValue() + " expression.");
        }
        return new OpExp(this.lhsValue, newOperator, newRhsValue);
    }

    /**
     * 
     * @param {Array} values
     * @return {Exp}
     */
    public applyInOperation(...values : any[]) : Exp {
        if(!(this.lhsValue != null && this.lhsValue instanceof <any>Column)) throw new QueryGrammarException("Can only apply \'in\' operation on a Column");
        return <any>new (__Function.prototype.bind.apply(InExp, [null, <Column>this.lhsValue, false].concat(<any[]>values)));
    }

    /**
     * 
     * @param {Array} values
     * @return {Exp}
     */
    public applyNotInOperation(...values : any[]) : Exp {
        if(!(this.lhsValue != null && this.lhsValue instanceof <any>Column)) throw new QueryGrammarException("Can only apply \'in\' operation on a Column");
        return <any>new (__Function.prototype.bind.apply(InExp, [null, <Column>this.lhsValue, true].concat(<any[]>values)));
    }

    /**
     * 
     * @param {*} valueStart
     * @param {*} valueEnd
     * @return {Exp}
     */
    public applyBetweenOperation(valueStart : any, valueEnd : any) : Exp {
        if(!(this.lhsValue != null && this.lhsValue instanceof <any>Column)) throw new QueryGrammarException("Can only apply \'between\' operation on a Column");
        return new BetweenExp(<Column>this.lhsValue, valueStart, valueEnd);
    }

    public accept(visitor : QueryVisitor) {
        visitor['visit$com_octo_java_sql_exp_OpExp'](this);
    }

    public getLhsValue() : any {
        return this.lhsValue;
    }

    public getOperator() : Operator {
        return this.operator;
    }

    public getRhsValue() : any {
        return this.rhsValue;
    }

    public setLhsValue(lhsValue : any) {
        this.lhsValue = lhsValue;
    }

    public setRhsValue(rhsValue : any) {
        this.rhsValue = rhsValue;
    }
}
OpExp["__class"] = "com.octo.java.sql.exp.OpExp";
OpExp["__interfaces"] = ["com.octo.java.sql.query.visitor.Visitable"];




var __Function = Function;
/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export class OrExp extends ExpSeq {
    constructor(...clauses : Exp[]) {
        super(...clauses);
    }

    /**
     * 
     * @return {Operator}
     */
    public getOperator() : Operator {
        return Operator.OR;
    }
}
OrExp["__class"] = "com.octo.java.sql.exp.OrExp";
OrExp["__interfaces"] = ["com.octo.java.sql.query.visitor.Visitable"];




var __Function = Function;
/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export class SetClause implements Visitable {
    /*private*/ column : Column;

    /*private*/ value : any;

    public constructor(column : Column, value : any) {
        this.column = null;
        this.value = null;
        this.column = column;
        this.value = value;
    }

    public accept(visitor : QueryVisitor) {
        visitor['visit$com_octo_java_sql_exp_SetClause'](this);
    }

    public getColumn() : Column {
        return this.column;
    }

    public getValue() : any {
        return this.value;
    }
}
SetClause["__class"] = "com.octo.java.sql.exp.SetClause";
SetClause["__interfaces"] = ["com.octo.java.sql.query.visitor.Visitable"];




var __Function = Function;
/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export abstract class BaseVisitor implements QueryVisitor {
    public acceptOrVisitValue(value? : any, baseName? : any) : any {
        if(((value != null) || value === null) && baseName === undefined) {
            return <any>this.acceptOrVisitValue$java_lang_Object(value);
        } else throw new Error('invalid overload');
    }

    public acceptOrVisitValue$java_lang_Object(param : any) {
        if(param != null && (param["__interfaces"] != null && param["__interfaces"].indexOf("com.octo.java.sql.query.visitor.Visitable") >= 0 || param.constructor != null && param.constructor["__interfaces"] != null && param.constructor["__interfaces"].indexOf("com.octo.java.sql.query.visitor.Visitable") >= 0)) (<Visitable><any>param).accept(this); else this.visitValue(param);
    }

    public abstract visitValue(value?: any): any;
    public abstract visit(column?: any): any;
    public abstract visit(exp?: any): any;
    public abstract visit(betweenExp?: any): any;
    public abstract visit(expSeq?: any): any;
    public abstract visit(inExp?: any): any;
    public abstract visit(joinClause?: any): any;
    public abstract visit(setClause?: any): any;
    public abstract visit(sqlFunc?: any): any;
    public abstract visit(constant?: any): any;
    public abstract visit(query?: any): any;
    public abstract visit(updateQuery?: any): any;
    public abstract visit(insertQuery?: any): any;
    public abstract visit(deleteQuery?: any): any;
    public abstract visit(nullable?: any): any;
    constructor() {
    }
}
BaseVisitor["__class"] = "com.octo.java.sql.query.visitor.BaseVisitor";
BaseVisitor["__interfaces"] = ["com.octo.java.sql.query.visitor.QueryVisitor"];




var __Function = Function;
/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export class DefaultVisitor extends BaseVisitor {
    public visitValue(value : any) {
    }

    public visit$com_octo_java_sql_exp_SQLFunc(func : SQLFunc) {
        {
            let array143 = func.getParams();
            for(let index142=0; index142 < array143.length; index142++) {
                let param = array143[index142];
                this.acceptOrVisitValue$java_lang_Object(param)
            }
        }
    }

    public visit$com_octo_java_sql_exp_JavaSQLFunc(javaSQLFunc : JavaSQLFunc) {
    }

    public visit(javaSQLFunc? : any) : any {
        if(((javaSQLFunc != null && javaSQLFunc instanceof <any>JavaSQLFunc) || javaSQLFunc === null)) {
            return <any>this.visit$com_octo_java_sql_exp_JavaSQLFunc(javaSQLFunc);
        } else if(((javaSQLFunc != null && javaSQLFunc instanceof <any>SQLFunc) || javaSQLFunc === null)) {
            return <any>this.visit$com_octo_java_sql_exp_SQLFunc(javaSQLFunc);
        } else if(((javaSQLFunc != null && javaSQLFunc instanceof <any>Column) || javaSQLFunc === null)) {
            return <any>this.visit$com_octo_java_sql_exp_Column(javaSQLFunc);
        } else if(((javaSQLFunc != null && javaSQLFunc instanceof <any>OpExp) || javaSQLFunc === null)) {
            return <any>this.visit$com_octo_java_sql_exp_OpExp(javaSQLFunc);
        } else if(((javaSQLFunc != null && javaSQLFunc instanceof <any>BetweenExp) || javaSQLFunc === null)) {
            return <any>this.visit$com_octo_java_sql_exp_BetweenExp(javaSQLFunc);
        } else if(((javaSQLFunc != null && javaSQLFunc instanceof <any>ExpSeq) || javaSQLFunc === null)) {
            return <any>this.visit$com_octo_java_sql_exp_ExpSeq(javaSQLFunc);
        } else if(((javaSQLFunc != null && javaSQLFunc instanceof <any>InExp) || javaSQLFunc === null)) {
            return <any>this.visit$com_octo_java_sql_exp_InExp(javaSQLFunc);
        } else if(((javaSQLFunc != null && javaSQLFunc instanceof <any>JoinClause) || javaSQLFunc === null)) {
            return <any>this.visit$com_octo_java_sql_exp_JoinClause(javaSQLFunc);
        } else if(((javaSQLFunc != null && javaSQLFunc instanceof <any>SetClause) || javaSQLFunc === null)) {
            return <any>this.visit$com_octo_java_sql_exp_SetClause(javaSQLFunc);
        } else if(((typeof javaSQLFunc === 'number') || javaSQLFunc === null)) {
            return <any>this.visit$com_octo_java_sql_exp_Constant(javaSQLFunc);
        } else if(((javaSQLFunc != null && javaSQLFunc instanceof <any>SelectQuery) || javaSQLFunc === null)) {
            return <any>this.visit$com_octo_java_sql_query_SelectQuery(javaSQLFunc);
        } else if(((javaSQLFunc != null && javaSQLFunc instanceof <any>UpdateQuery) || javaSQLFunc === null)) {
            return <any>this.visit$com_octo_java_sql_query_UpdateQuery(javaSQLFunc);
        } else if(((javaSQLFunc != null && javaSQLFunc instanceof <any>InsertQuery) || javaSQLFunc === null)) {
            return <any>this.visit$com_octo_java_sql_query_InsertQuery(javaSQLFunc);
        } else if(((javaSQLFunc != null && javaSQLFunc instanceof <any>DeleteQuery) || javaSQLFunc === null)) {
            return <any>this.visit$com_octo_java_sql_query_DeleteQuery(javaSQLFunc);
        } else if(((javaSQLFunc != null && javaSQLFunc instanceof <any>Nullable) || javaSQLFunc === null)) {
            return <any>this.visit$com_octo_java_sql_exp_Nullable(javaSQLFunc);
        } else throw new Error('invalid overload');
    }

    public visit$com_octo_java_sql_exp_Column(column : Column) {
    }

    public visit$com_octo_java_sql_exp_OpExp(exp : OpExp) {
        this.acceptOrVisitValue$java_lang_Object(exp.getLhsValue());
        this.acceptOrVisitValue$java_lang_Object(exp.getRhsValue());
    }

    public visit$com_octo_java_sql_exp_BetweenExp(betweenExp : BetweenExp) {
        betweenExp.getColumn().accept(this);
        this.acceptOrVisitValue$java_lang_Object(betweenExp.getValueStart());
        this.acceptOrVisitValue$java_lang_Object(betweenExp.getValueEnd());
    }

    public visit$com_octo_java_sql_exp_ExpSeq(expSeq : ExpSeq) {
        {
            let array145 = expSeq.getClauses();
            for(let index144=0; index144 < array145.length; index144++) {
                let clause = array145[index144];
                clause.accept(this)
            }
        }
    }

    public visit$com_octo_java_sql_exp_InExp(inExp : InExp) {
        inExp.getColumn().accept(this);
        if(!ArrayUtils.isEmpty(inExp.getValues())) {
            let array147 = inExp.getValues();
            for(let index146=0; index146 < array147.length; index146++) {
                let value = array147[index146];
                this.acceptOrVisitValue$java_lang_Object(value)
            }
        }
    }

    public visit$com_octo_java_sql_exp_JoinClause(joinClause : JoinClause) {
        joinClause.getOnClause().accept(this);
    }

    public visit$com_octo_java_sql_exp_SetClause(setClause : SetClause) {
        setClause.getColumn().accept(this);
        this.acceptOrVisitValue$java_lang_Object(setClause.getValue());
    }

    public visit$com_octo_java_sql_exp_Constant(constant : Constant) {
    }

    public visit$com_octo_java_sql_query_SelectQuery(query : SelectQuery) {
        {
            let array149 = query.getColumns();
            for(let index148=0; index148 < array149.length; index148++) {
                let column = array149[index148];
                this.acceptOrVisitValue$java_lang_Object(column)
            }
        }
        {
            let array151 = query.getJoinClauses();
            for(let index150=0; index150 < array151.length; index150++) {
                let clause = array151[index150];
                clause.accept(this)
            }
        }
        let whereClause : Exp = query.getWhereClause();
        if(whereClause != null) whereClause.accept(this);
        {
            let array153 = query.getUnions();
            for(let index152=0; index152 < array153.length; index152++) {
                let union = array153[index152];
                union.accept(this)
            }
        }
    }

    public visit$com_octo_java_sql_query_UpdateQuery(updateQuery : UpdateQuery) {
        {
            let array155 = updateQuery.getSetClauses();
            for(let index154=0; index154 < array155.length; index154++) {
                let clause = array155[index154];
                clause.accept(this)
            }
        }
        let whereClause : Exp = updateQuery.getWhereClause();
        if(whereClause != null) whereClause.accept(this);
    }

    public visit$com_octo_java_sql_query_InsertQuery(insertQuery : InsertQuery) {
        let columnValues : any = insertQuery.getColumnsValues();
        {
            let array157 = /* keySet */Object.keys(columnValues);
            for(let index156=0; index156 < array157.length; index156++) {
                let column = array157[index156];
                this.acceptOrVisitValue$java_lang_Object(/* get */((m,k) => m[k]?m[k]:null)(columnValues, column))
            }
        }
    }

    public visit$com_octo_java_sql_query_DeleteQuery(deleteQuery : DeleteQuery) {
        let whereClause : Exp = deleteQuery.getWhereClause();
        if(whereClause != null) whereClause.accept(this);
    }

    public visit$com_octo_java_sql_exp_Nullable(nullable : Nullable) {
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
    /*private*/ usedTables : Array<string> = <any>([]);

    /*private*/ tableReverseDependency : any = <any>({});

    /*private*/ tableJoin : any = <any>({});

    /*private*/ currentJoinedTable : string;

    public visit$com_octo_java_sql_exp_BetweenExp(betweenExp : BetweenExp) {
        super.visit$com_octo_java_sql_exp_BetweenExp(betweenExp);
        if((betweenExp.getValueStart() == null) || (betweenExp.getValueEnd() == null)) betweenExp.invalidate();
    }

    /**
     * 
     * @param {BetweenExp} betweenExp
     */
    public visit(betweenExp? : any) : any {
        if(((betweenExp != null && betweenExp instanceof <any>BetweenExp) || betweenExp === null)) {
            return <any>this.visit$com_octo_java_sql_exp_BetweenExp(betweenExp);
        } else if(((betweenExp != null && betweenExp instanceof <any>InExp) || betweenExp === null)) {
            return <any>this.visit$com_octo_java_sql_exp_InExp(betweenExp);
        } else if(((betweenExp != null && betweenExp instanceof <any>OpExp) || betweenExp === null)) {
            return <any>this.visit$com_octo_java_sql_exp_OpExp(betweenExp);
        } else if(((betweenExp != null && betweenExp instanceof <any>ExpSeq) || betweenExp === null)) {
            return <any>this.visit$com_octo_java_sql_exp_ExpSeq(betweenExp);
        } else if(((betweenExp != null && betweenExp instanceof <any>Column) || betweenExp === null)) {
            return <any>this.visit$com_octo_java_sql_exp_Column(betweenExp);
        } else if(((betweenExp != null && betweenExp instanceof <any>JoinClause) || betweenExp === null)) {
            return <any>this.visit$com_octo_java_sql_exp_JoinClause(betweenExp);
        } else if(((betweenExp != null && betweenExp instanceof <any>SelectQuery) || betweenExp === null)) {
            return <any>this.visit$com_octo_java_sql_query_SelectQuery(betweenExp);
        } else if(((typeof betweenExp === 'number') || betweenExp === null)) {
            return <any>this.visit$com_octo_java_sql_exp_Constant(betweenExp);
        } else if(((betweenExp != null && betweenExp instanceof <any>JavaSQLFunc) || betweenExp === null)) {
            super.visit(betweenExp);
        } else if(((betweenExp != null && betweenExp instanceof <any>SQLFunc) || betweenExp === null)) {
            return <any>this.visit$com_octo_java_sql_exp_SQLFunc(betweenExp);
        } else if(((betweenExp != null && betweenExp instanceof <any>SetClause) || betweenExp === null)) {
            return <any>this.visit$com_octo_java_sql_exp_SetClause(betweenExp);
        } else if(((betweenExp != null && betweenExp instanceof <any>UpdateQuery) || betweenExp === null)) {
            return <any>this.visit$com_octo_java_sql_query_UpdateQuery(betweenExp);
        } else if(((betweenExp != null && betweenExp instanceof <any>InsertQuery) || betweenExp === null)) {
            return <any>this.visit$com_octo_java_sql_query_InsertQuery(betweenExp);
        } else if(((betweenExp != null && betweenExp instanceof <any>DeleteQuery) || betweenExp === null)) {
            return <any>this.visit$com_octo_java_sql_query_DeleteQuery(betweenExp);
        } else if(((betweenExp != null && betweenExp instanceof <any>Nullable) || betweenExp === null)) {
            return <any>this.visit$com_octo_java_sql_exp_Nullable(betweenExp);
        } else throw new Error('invalid overload');
    }

    public visit$com_octo_java_sql_exp_InExp(inExp : InExp) {
        super.visit$com_octo_java_sql_exp_InExp(inExp);
        if(ArrayUtils.isEmpty(inExp.getValues())) inExp.invalidate(); else {
            let atLeastOneInValueIsNull : boolean = CollectionUtils.exists(/* asList */inExp.getValues().slice(0), new BasicQueryOptimizer.BasicQueryOptimizer$0(this));
            if(atLeastOneInValueIsNull) inExp.invalidate();
        }
    }

    public visit$com_octo_java_sql_exp_OpExp(exp : OpExp) {
        super.visit$com_octo_java_sql_exp_OpExp(exp);
        if((exp.getLhsValue() == null) || (exp.getRhsValue() == null)) exp.invalidate();
    }

    public visit$com_octo_java_sql_exp_ExpSeq(expSeq : ExpSeq) {
        super.visit$com_octo_java_sql_exp_ExpSeq(expSeq);
        let atLeastOneExpIsValid : boolean = CollectionUtils.exists(expSeq.getClauses(), new BasicQueryOptimizer.BasicQueryOptimizer$1(this));
        if(!atLeastOneExpIsValid) expSeq.invalidate();
    }

    public visit$com_octo_java_sql_exp_Column(column : Column) {
        super.visit$com_octo_java_sql_exp_Column(column);
        let tableName : string = column.getTableName();
        if(!StringUtils.isEmpty(tableName)) {
            if(this.currentJoinedTable == null) /* add */((s, e) => { if(s.indexOf(e)==-1) { s.push(e); return true; } else { return false; } })(this.usedTables, tableName); else if(!/* equals */(<any>((o1: any, o2: any) => { if(o1 && o1.equals) { return o1.equals(o2); } else { return o1 === o2; } })(this.currentJoinedTable,tableName))) this.addTableReverseDependency(this.currentJoinedTable, tableName);
        }
    }

    public visit$com_octo_java_sql_exp_JoinClause(joinClause : JoinClause) {
        this.currentJoinedTable = joinClause.getTable();
        super.visit$com_octo_java_sql_exp_JoinClause(joinClause);
        /* put */(this.tableJoin[this.currentJoinedTable] = joinClause);
        this.currentJoinedTable = null;
    }

    public visit$com_octo_java_sql_query_SelectQuery(query : SelectQuery) {
        super.visit$com_octo_java_sql_query_SelectQuery(query);
        {
            let array122 = /* keySet */Object.keys(this.tableJoin);
            for(let index121=0; index121 < array122.length; index121++) {
                let table = array122[index121];
                if(!this.isJoinNecessary(table)) /* get */((m,k) => m[k]?m[k]:null)(this.tableJoin, table).invalidate();
            }
        }
    }

    public visit$com_octo_java_sql_exp_Constant(constant : Constant) {
        super.visit$com_octo_java_sql_exp_Constant(constant);
        if(/* Enum.equals */(<any>(Constant.STAR) === <any>(constant))) /* add */((s, e) => { if(s.indexOf(e)==-1) { s.push(e); return true; } else { return false; } })(this.usedTables, null);
    }

    /**
     * Add table1 as a reverse dependency of table2 (ie. table1 depends on table2)
     * 
     * @param {string} table1
     * @param {string} table2
     * @private
     */
    /*private*/ addTableReverseDependency(table1 : string, table2 : string) {
        let reverseDependencies : Array<string>;
        if(!/* containsKey */this.tableReverseDependency.hasOwnProperty(table2)) {
            reverseDependencies = <any>([]);
            /* put */(this.tableReverseDependency[table2] = reverseDependencies);
        } else reverseDependencies = /* get */((m,k) => m[k]?m[k]:null)(this.tableReverseDependency, table2);
        /* add */((s, e) => { if(s.indexOf(e)==-1) { s.push(e); return true; } else { return false; } })(reverseDependencies, table1);
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
    isJoinNecessary(table : string) : boolean {
        return /* contains */(this.usedTables.indexOf(<any>(null)) >= 0) || /* contains */(this.usedTables.indexOf(<any>(Constant["_$wrappers"][Constant.STAR].getValue())) >= 0) || /* contains */(this.usedTables.indexOf(<any>(table)) >= 0) || (/* containsKey */this.tableReverseDependency.hasOwnProperty(table) && CollectionUtils.exists(/* get */((m,k) => m[k]?m[k]:null)(this.tableReverseDependency, table), new BasicQueryOptimizer.BasicQueryOptimizer$2(this)));
    }

    constructor() {
        super();
        this.currentJoinedTable = null;
    }
}
BasicQueryOptimizer["__class"] = "com.octo.java.sql.query.BasicQueryOptimizer";
BasicQueryOptimizer["__interfaces"] = ["com.octo.java.sql.query.visitor.QueryVisitor"];



export namespace BasicQueryOptimizer {

    export class BasicQueryOptimizer$0 implements Predicate {
        public __parent: any;
        public evaluate(object : any) : boolean {
            return object == null;
        }

        constructor(__parent: any) {
            this.__parent = __parent;
        }
    }
    BasicQueryOptimizer$0["__interfaces"] = ["util.Predicate"];



    export class BasicQueryOptimizer$1 implements Predicate {
        public __parent: any;
        public evaluate(exp : any) : boolean {
            return (<Exp>exp).isValid();
        }

        constructor(__parent: any) {
            this.__parent = __parent;
        }
    }
    BasicQueryOptimizer$1["__interfaces"] = ["util.Predicate"];



    export class BasicQueryOptimizer$2 implements Predicate {
        public __parent: any;
        public evaluate(dependency : any) : boolean {
            return this.__parent.isJoinNecessary(<string>dependency);
        }

        constructor(__parent: any) {
            this.__parent = __parent;
        }
    }
    BasicQueryOptimizer$2["__interfaces"] = ["util.Predicate"];


}



var __Function = Function;
/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export abstract class Query<T extends Query<T>> implements Visitable {
    /**
     * Set it to false when using HSQLDB
     */
    public static oracleDialect : boolean = true;

    static funcEvaluatorMap : any; public static funcEvaluatorMap_$LI$() : any { if(Query.funcEvaluatorMap == null) Query.funcEvaluatorMap = <any>({}); return Query.funcEvaluatorMap; };

    whereClause : Exp;

    static querybuilderClassName : string = "com.octo.java.sql.query.visitor.DefaultQueryBuilder";

    static visitors : Array<QueryVisitor>; public static visitors_$LI$() : Array<QueryVisitor> { if(Query.visitors == null) Query.visitors = <any>([]); return Query.visitors; };

    /*private*/ builder : DefaultQueryBuilder;

    public static setDefaultQueryBuilder(className : string) {
        Query.querybuilderClassName = className;
    }

    public static resetDefaultQueryBuilder() {
        Query.querybuilderClassName = "com.octo.java.sql.query.visitor.DefaultQueryBuilder";
    }

    public getWhereClause() : Exp {
        return this.whereClause;
    }

    /**
     * @param columns
     * to put both SQLFunc & Colsname
     * @param {Array} columnsAndFunc
     * @return {SelectQuery}
     */
    public static select(...columnsAndFunc : any[]) : SelectQuery {
        return <any>new (__Function.prototype.bind.apply(SelectQuery, [null].concat(<any[]>columnsAndFunc)));
    }

    /**
     * Create an UPDATE Query
     * 
     * @param {string} table
     * @return
     * @return {UpdateQuery}
     */
    public static update(table : string) : UpdateQuery {
        return new UpdateQuery(table);
    }

    /**
     * Create an INSERT Query
     * 
     * @param {string} table
     * @return
     * @return {InsertQuery}
     */
    public static insertInto(table : string) : InsertQuery {
        return new InsertQuery(table);
    }

    /**
     * Create an DELETE Query
     * 
     * @param {string} table
     * @return
     * @return {DeleteQuery}
     */
    public static deleteFrom(table : string) : DeleteQuery {
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
    public static f(funcName : string, ...params : any[]) : SQLFunc {
        if(/* containsKey */Query.funcEvaluatorMap_$LI$().hasOwnProperty(funcName)) {
            let evaluator : JavaSQLFunc.Evaluable<string> = /* get */((m,k) => m[k]?m[k]:null)(Query.funcEvaluatorMap_$LI$(), funcName);
            return new JavaSQLFunc(funcName, params, evaluator);
        } else {
            return <any>new (__Function.prototype.bind.apply(SQLFunc, [null, funcName].concat(<any[]>params)));
        }
    }

    /**
     * Create a Column
     * 
     * @param {string} name
     * @return
     * @return {Column}
     */
    public static c(name : string) : Column {
        return new Column(name);
    }

    public static e$com_octo_java_sql_exp_Column(columnName : Column) : OpExp {
        return new OpExp(columnName);
    }

    /**
     * Create a new OpExp
     * 
     * @param {Column} columnName
     * @return
     * @return {OpExp}
     */
    public static e(columnName? : any) : any {
        if(((columnName != null && columnName instanceof <any>Column) || columnName === null)) {
            return <any>Query.e$com_octo_java_sql_exp_Column(columnName);
        } else if(((columnName != null && columnName instanceof <any>SQLFunc) || columnName === null)) {
            return <any>Query.e$com_octo_java_sql_exp_SQLFunc(columnName);
        } else throw new Error('invalid overload');
    }

    public static e$com_octo_java_sql_exp_SQLFunc(func : SQLFunc) : OpExp {
        return new OpExp(func);
    }

    public toSql$() : string {
        return this.toSql$com_octo_java_sql_query_visitor_DefaultQueryBuilder(this.getQueryBuilder());
    }

    public toSql$com_octo_java_sql_query_visitor_DefaultQueryBuilder(queryBuilder : DefaultQueryBuilder) : string {
        this.runVisitors();
        this.builder = queryBuilder;
        this.accept(this.builder);
        let sqlQuery : string = /* toString */this.builder.getResult().str;
        return sqlQuery;
    }

    public toSql(queryBuilder? : any) : any {
        if(((queryBuilder != null && queryBuilder instanceof <any>DefaultQueryBuilder) || queryBuilder === null)) {
            return <any>this.toSql$com_octo_java_sql_query_visitor_DefaultQueryBuilder(queryBuilder);
        } else if(queryBuilder === undefined) {
            return <any>this.toSql$();
        } else throw new Error('invalid overload');
    }

    public getQueryBuilder() : DefaultQueryBuilder {
         return eval(' new '+ Query.querybuilderClassName +'();');
    }

    /*private*/ runVisitors() {
        for(let index123=0; index123 < Query.visitors_$LI$().length; index123++) {
            let visitor = Query.visitors_$LI$()[index123];
            {
                this.accept(visitor);
            }
        }
    }

    public getParams() : any {
        return this.builder.getParams();
    }

    public static addVisitor(visitor : QueryVisitor) {
        /* add */((s, e) => { if(s.indexOf(e)==-1) { s.push(e); return true; } else { return false; } })(Query.visitors_$LI$(), visitor);
    }

    public static clearVisitors() {
        /* clear */(Query.visitors_$LI$().length = 0);
    }

    public whereReset() : T {
        this.whereClause = null;
        return <T><any>this;
    }

    public where$com_octo_java_sql_exp_Column(column : Column) : T {
        this.whereClause = new OpExp(column);
        return <T><any>this;
    }

    public where$com_octo_java_sql_exp_Exp(newWhereClause : Exp) : T {
        this.whereClause = newWhereClause;
        return <T><any>this;
    }

    public where$com_octo_java_sql_exp_Column$com_octo_java_sql_exp_Operator$java_lang_Object(column : Column, operator : Operator, value : any) : T {
        if(value != null) this.whereClause = new OpExp(column, operator, value);
        return <T><any>this;
    }

    public where(column? : any, operator? : any, value? : any) : any {
        if(((column != null && column instanceof <any>Column) || column === null) && ((typeof operator === 'number') || operator === null) && ((value != null) || value === null)) {
            return <any>this.where$com_octo_java_sql_exp_Column$com_octo_java_sql_exp_Operator$java_lang_Object(column, operator, value);
        } else if(((column != null && column instanceof <any>Column) || column === null) && operator === undefined && value === undefined) {
            return <any>this.where$com_octo_java_sql_exp_Column(column);
        } else if(((column != null && column instanceof <any>Exp) || column === null) && operator === undefined && value === undefined) {
            return <any>this.where$com_octo_java_sql_exp_Exp(column);
        } else if(((column != null && column instanceof <any>SQLFunc) || column === null) && operator === undefined && value === undefined) {
            return <any>this.where$com_octo_java_sql_exp_SQLFunc(column);
        } else throw new Error('invalid overload');
    }

    public where$com_octo_java_sql_exp_SQLFunc(func : SQLFunc) : T {
        this.whereClause = new OpExp(func);
        return <T><any>this;
    }

    public eq(value : any) : T {
        this.assertWhereClauseIsInitialized("eq");
        this.whereClause = this.whereClause.eq(value);
        return <T><any>this;
    }

    public eqOrIsNull(value : any) : T {
        this.assertWhereClauseIsInitialized("eq");
        this.whereClause = this.whereClause.eq(new Nullable(value));
        return <T><any>this;
    }

    public neq(value : any) : T {
        this.assertWhereClauseIsInitialized("neq");
        this.whereClause = this.whereClause.neq(value);
        return <T><any>this;
    }

    public neqNullable(value : any) : T {
        this.assertWhereClauseIsInitialized("neq");
        this.whereClause = this.whereClause.neq(new Nullable(value));
        return <T><any>this;
    }

    public geq(value : number) : T {
        this.assertWhereClauseIsInitialized("geq");
        this.whereClause = this.whereClause.geq(value);
        return <T><any>this;
    }

    public leq(value : number) : T {
        this.assertWhereClauseIsInitialized("leq");
        this.whereClause = this.whereClause.leq(value);
        return <T><any>this;
    }

    public like(value : string) : T {
        this.assertWhereClauseIsInitialized("like");
        this.whereClause = this.whereClause.like(value);
        return <T><any>this;
    }

    public in(...values : any[]) : T {
        this.assertWhereClauseIsInitialized("in");
        this.whereClause = (o => o.in.apply(o, values))(this.whereClause);
        return <T><any>this;
    }

    public notIn(...values : any[]) : T {
        this.assertWhereClauseIsInitialized("not in");
        this.whereClause = (o => o.notIn.apply(o, values))(this.whereClause);
        return <T><any>this;
    }

    public and$com_octo_java_sql_exp_Column(column : Column) : T {
        this.assertWhereClauseIsInitialized("and");
        this.whereClause = this.whereClause.and$com_octo_java_sql_exp_Column(column);
        return <T><any>this;
    }

    public and(column? : any) : any {
        if(((column != null && column instanceof <any>Column) || column === null)) {
            return <any>this.and$com_octo_java_sql_exp_Column(column);
        } else if(((column != null && column instanceof <any>SQLFunc) || column === null)) {
            return <any>this.and$com_octo_java_sql_exp_SQLFunc(column);
        } else if(((column != null && column instanceof <any>Exp) || column === null)) {
            return <any>this.and$com_octo_java_sql_exp_Exp(column);
        } else throw new Error('invalid overload');
    }

    public and$com_octo_java_sql_exp_SQLFunc(func : SQLFunc) : T {
        this.assertWhereClauseIsInitialized("and");
        this.whereClause = this.whereClause.and$com_octo_java_sql_exp_SQLFunc(func);
        return <T><any>this;
    }

    public and$com_octo_java_sql_exp_Exp(exp : Exp) : T {
        this.assertWhereClauseIsInitialized("and");
        this.whereClause = this.whereClause.and$com_octo_java_sql_exp_Exp(exp);
        return <T><any>this;
    }

    public isNull() : T {
        this.assertWhereClauseIsInitialized("isNull");
        this.whereClause = this.whereClause.isNull();
        return <T><any>this;
    }

    public isNotNull() : T {
        this.assertWhereClauseIsInitialized("isNotNull");
        this.whereClause = this.whereClause.isNotNull();
        return <T><any>this;
    }

    /**
     * @param {Operator} op
     * @param {*} valueStart
     * @param {*} valueEnd
     * @return {Query} If operator is "between" do a between operation, else apply
     * operation with op on valueStart.
     * @throws QueryGrammarException
     */
    public betweenOrOp(op : Operator, valueStart : any, valueEnd : any) : T {
        this.assertWhereClauseIsInitialized(op == null?null:Operator["_$wrappers"][op].getValue());
        this.whereClause = this.whereClause.betweenOrOp(op, valueStart, valueEnd);
        return <T><any>this;
    }

    public between(valueStart : any, valueEnd : any) : T {
        this.assertWhereClauseIsInitialized("between");
        this.whereClause = this.whereClause.between(valueStart, valueEnd);
        return <T><any>this;
    }

    public op(op : Operator, value : any) : T {
        this.assertWhereClauseIsInitialized(op == null?null:Operator["_$wrappers"][op].getValue());
        this.whereClause = this.whereClause.applyOperation(op, value);
        return <T><any>this;
    }

    public startWith(value : string) : T {
        this.assertWhereClauseIsInitialized("startWith");
        this.whereClause = this.whereClause.startWith(value);
        return <T><any>this;
    }

    public contains(value : string) : T {
        this.assertWhereClauseIsInitialized("contains");
        this.whereClause = this.whereClause.contains(value);
        return <T><any>this;
    }

    public static addFuncEvaluator(funcName : string, evaluator : JavaSQLFunc.Evaluable<string>) {
        /* put */(Query.funcEvaluatorMap_$LI$()[funcName] = evaluator);
    }

    public static clearFuncEvaluatorMap() {
        /* clear */(obj => { for (let member in obj) delete obj[member]; })(Query.funcEvaluatorMap_$LI$());
    }

    /*private*/ assertWhereClauseIsInitialized(operation : string) {
        if(this.whereClause == null) throw new QueryGrammarException("Cannot apply \'" + operation + "\' operator if no where clause exist");
    }

    public abstract accept(visitor?: any): any;
    constructor() {
        this.whereClause = null;
        this.builder = null;
    }
}
Query["__class"] = "com.octo.java.sql.query.Query";
Query["__interfaces"] = ["com.octo.java.sql.query.visitor.Visitable"];




var __Function = Function;

Query.visitors_$LI$();

Query.funcEvaluatorMap_$LI$();
/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export class DeleteQuery extends Query<DeleteQuery> {
    /*private*/ tables : string[];

    constructor(...tables : string[]) {
        super();
        this.tables = null;
        this.tables = tables;
    }

    public accept(visitor : QueryVisitor) {
        visitor['visit$com_octo_java_sql_query_DeleteQuery'](this);
    }

    public getTables() : string[] {
        return this.tables;
    }
}
DeleteQuery["__class"] = "com.octo.java.sql.query.DeleteQuery";
DeleteQuery["__interfaces"] = ["com.octo.java.sql.query.visitor.Visitable"];




var __Function = Function;
/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export class InsertQuery extends Query<InsertQuery> {
    /*private*/ columnsValues : any = <any>({});

    /*private*/ table : string;

    constructor(table : string) {
        super();
        this.table = null;
        this.table = table;
    }

    public set$java_lang_String$java_lang_Object(column : string, value : any) : InsertQuery {
        if(/* containsKey */this.columnsValues.hasOwnProperty(column)) throw new QueryGrammarException("Column \'" + column + "\' has already been set.");
        /* put */(this.columnsValues[column] = value);
        return this;
    }

    public set$java_lang_String$java_lang_Object$java_lang_Object(column : string, value : any, defaultValueIfNull : any) : InsertQuery {
        if(value == null) return this.set$java_lang_String$java_lang_Object(column, defaultValueIfNull); else return this.set$java_lang_String$java_lang_Object(column, value);
    }

    public set(column? : any, value? : any, defaultValueIfNull? : any) : any {
        if(((typeof column === 'string') || column === null) && ((value != null) || value === null) && ((defaultValueIfNull != null) || defaultValueIfNull === null)) {
            return <any>this.set$java_lang_String$java_lang_Object$java_lang_Object(column, value, defaultValueIfNull);
        } else if(((typeof column === 'string') || column === null) && ((value != null) || value === null) && defaultValueIfNull === undefined) {
            return <any>this.set$java_lang_String$java_lang_Object(column, value);
        } else throw new Error('invalid overload');
    }

    public accept(visitor : QueryVisitor) {
        visitor['visit$com_octo_java_sql_query_InsertQuery'](this);
    }

    public getColumnsValues() : any {
        return this.columnsValues;
    }

    public getTable() : string {
        return this.table;
    }
}
InsertQuery["__class"] = "com.octo.java.sql.query.InsertQuery";
InsertQuery["__interfaces"] = ["com.octo.java.sql.query.visitor.Visitable"];




var __Function = Function;
/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export class QueryException extends Error {
    static serialVersionUID : number = -2306972223647011582;

    public constructor(message : string) {
        super(message); this.message=message;
        (<any>Object).setPrototypeOf(this, QueryException.prototype);
    }
}
QueryException["__class"] = "com.octo.java.sql.query.QueryException";
QueryException["__interfaces"] = ["java.io.Serializable"];




var __Function = Function;
/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export class QueryGrammarException extends QueryException {
    static __com_octo_java_sql_query_QueryGrammarException_serialVersionUID : number = 562421290186643510;

    public constructor(message : string) {
        super(message);
        (<any>Object).setPrototypeOf(this, QueryGrammarException.prototype);
    }
}
QueryGrammarException["__class"] = "com.octo.java.sql.query.QueryGrammarException";
QueryGrammarException["__interfaces"] = ["java.io.Serializable"];




var __Function = Function;
/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export class SelectQuery extends Query<SelectQuery> {
    /**
     * Contains String or SQLFunc
     */
    columns : any[];

    tables : string[];

    /*private*/ joinClauses : Array<JoinClause> = <any>([]);

    /*private*/ __orderBy : any = <any>({});

    /*private*/ __limit : number = null;

    /*private*/ lastOrderByColumn : string = null;

    /*private*/ lastOrderByNeeded : boolean = true;

    /*private*/ unions : Array<SelectQuery> = <any>([]);

    /*private*/ alias : string;

    constructor(...columns : any[]) {
        super();
        this.columns = null;
        this.tables = null;
        this.alias = null;
        if((columns != null) && (columns.length === 1) && /* equals */(<any>((o1: any, o2: any) => { if(o1 && o1.equals) { return o1.equals(o2); } else { return o1 === o2; } })(Constant["_$wrappers"][Constant.STAR].getValue(),columns[0]))) this.columns = [Constant.STAR]; else this.columns = columns;
    }

    public from(...newTables : string[]) : SelectQuery {
        this.tables = newTables;
        return this;
    }

    public innerJoin(table : string) : JoinClause {
        let result : JoinClause = new JoinClause(table, JoinClause.JoinType.INNER_JOIN, this);
        /* add */(this.joinClauses.push(result)>0);
        return result;
    }

    public leftOuterJoin(table : string) : JoinClause {
        let result : JoinClause = new JoinClause(table, JoinClause.JoinType.LEFT_OUTER_JOIN, this);
        /* add */(this.joinClauses.push(result)>0);
        return result;
    }

    public orderBy$java_lang_String(value : string) : SelectQuery {
        /* put */(this.__orderBy[value] = null);
        this.lastOrderByColumn = value;
        return this;
    }

    public orderByReset() : SelectQuery {
        this.__orderBy = <any>({});
        this.lastOrderByColumn = null;
        return this;
    }

    public orderBy$java_lang_String$boolean(value : string, isOrderByNeeded : boolean) : SelectQuery {
        this.lastOrderByNeeded = isOrderByNeeded;
        if(isOrderByNeeded) {
            return this.orderBy$java_lang_String(value);
        }
        return this;
    }

    public orderBy(value? : any, isOrderByNeeded? : any) : any {
        if(((typeof value === 'string') || value === null) && ((typeof isOrderByNeeded === 'boolean') || isOrderByNeeded === null)) {
            return <any>this.orderBy$java_lang_String$boolean(value, isOrderByNeeded);
        } else if(((typeof value === 'string') || value === null) && isOrderByNeeded === undefined) {
            return <any>this.orderBy$java_lang_String(value);
        } else throw new Error('invalid overload');
    }

    public desc() : SelectQuery {
        if(!this.lastOrderByNeeded) {
            return this;
        }
        this.assertOrderBySpecified("desc");
        /* put */(this.__orderBy[this.lastOrderByColumn] = SelectQuery.Order.DESC);
        return this;
    }

    assertOrderBySpecified(operation : string) {
        if(this.lastOrderByColumn == null) {
            throw new QueryGrammarException("Cannot apply \'" + operation + "\' operator without order by column.");
        }
    }

    public asc() : SelectQuery {
        if(!this.lastOrderByNeeded) {
            return this;
        }
        this.assertOrderBySpecified("asc");
        /* put */(this.__orderBy[this.lastOrderByColumn] = SelectQuery.Order.ASC);
        return this;
    }

    public limit(newLimit : number) : SelectQuery {
        this.__limit = newLimit;
        return this;
    }

    public as(alias : string) : SelectQuery {
        this.alias = alias;
        return this;
    }

    public union(innerQuery : SelectQuery) : SelectQuery {
        /* add */(this.unions.push(innerQuery)>0);
        return this;
    }

    public setColumns(...columns : any[]) : SelectQuery {
        if((columns != null) && (columns.length === 1) && /* equals */(<any>((o1: any, o2: any) => { if(o1 && o1.equals) { return o1.equals(o2); } else { return o1 === o2; } })(Constant["_$wrappers"][Constant.STAR].getValue(),columns[0]))) this.columns = [Constant.STAR]; else this.columns = columns;
        return this;
    }

    public accept(visitor : QueryVisitor) {
        visitor['visit$com_octo_java_sql_query_SelectQuery'](this);
    }

    public getColumns() : any[] {
        return this.columns;
    }

    public getTables() : string[] {
        return this.tables;
    }

    public getJoinClauses() : Array<JoinClause> {
        return this.joinClauses;
    }

    public getAlias() : string {
        return this.alias;
    }

    public getOrderBy() : any {
        return this.__orderBy;
    }

    public getLimit() : number {
        return this.__limit;
    }

    public getUnions() : Array<SelectQuery> {
        return this.unions;
    }
}
SelectQuery["__class"] = "com.octo.java.sql.query.SelectQuery";
SelectQuery["__interfaces"] = ["com.octo.java.sql.query.visitor.Visitable"];



export namespace SelectQuery {

    export enum Order {
        DESC, ASC
    }
}



var __Function = Function;
/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export class UpdateQuery extends Query<UpdateQuery> {
    /*private*/ setClauses : Array<SetClause> = <any>([]);

    /*private*/ table : string;

    constructor(table : string) {
        super();
        this.table = null;
        this.table = table;
    }

    public set(column : Column, value : any) : UpdateQuery {
        /* add */(this.setClauses.push(new SetClause(column, value))>0);
        return this;
    }

    public accept(visitor : QueryVisitor) {
        visitor['visit$com_octo_java_sql_query_UpdateQuery'](this);
    }

    public getTable() : string {
        return this.table;
    }

    public getSetClauses() : Array<SetClause> {
        return this.setClauses;
    }
}
UpdateQuery["__class"] = "com.octo.java.sql.query.UpdateQuery";
UpdateQuery["__interfaces"] = ["com.octo.java.sql.query.visitor.Visitable"];




var __Function = Function;
/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export class DefaultQueryBuilder extends BaseVisitor {
    public static DEFAULT_BASE_VARIABLE_NAME : string = "param";

    static OPEN_BRACKET : string = "(";

    static BETWEEN : string = "BETWEEN";

    static CLOSE_BRACKET : string = ")";

    static ON : string = "ON";

    static AS : string = "AS";

    static SELECT : string = "SELECT";

    static FROM : string = "FROM";

    static WHERE : string = "WHERE";

    static ORDER_BY : string = "ORDER BY";

    static UNION : string = "UNION";

    static INSERT : string = "INSERT INTO";

    static VALUES : string = "VALUES";

    static UPDATE : string = "UPDATE";

    static SET : string = "SET";

    static DELETE_FROM : string = "DELETE FROM";

    result : { str: string } = { str: "", toString: function() { return this.str; } };

    /*private*/ variableIndex : number = 1;

    /*private*/ params : any = <any>({});

    addBracketToNextSelectQuery : boolean = false;

    /*private*/ functions : any = <any>({});

    public addFunction(functionName : string, __function : JavaSQLFunc.Evaluable<string>) {
        /* put */(this.functions[functionName] = __function);
    }

    public getResult() : { str: string } {
        return this.result;
    }

    public getParams() : any {
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
    addVariable(value : any, baseColumnName : string) : string {
        let columnName : string = "p" + this.variableIndex++;
        /* put */(this.params[columnName] = value);
        return columnName;
    }

    /*private*/ getVariableName(obj : any, defaultName : string) : string {
        if(obj != null && obj instanceof <any>Column) return (<Column>obj).getName(); else if(obj != null && obj instanceof <any>SQLFunc) return (<SQLFunc>obj).getName(); else return defaultName;
    }

    public acceptOrVisitValue$java_lang_Object$java_lang_String(value : any, baseName : string) {
        if(value != null && (value["__interfaces"] != null && value["__interfaces"].indexOf("com.octo.java.sql.query.visitor.Visitable") >= 0 || value.constructor != null && value.constructor["__interfaces"] != null && value.constructor["__interfaces"].indexOf("com.octo.java.sql.query.visitor.Visitable") >= 0)) (<Visitable><any>value).accept(this); else {
            let variableName : string = this.addVariable(value, baseName);
            /* append */(sb => { sb.str = sb.str.concat(<any>variableName); return sb; })(/* append */(sb => { sb.str = sb.str.concat(<any>":"); return sb; })(this.result));
        }
    }

    public acceptOrVisitValue(value? : any, baseName? : any) : any {
        if(((value != null) || value === null) && ((typeof baseName === 'string') || baseName === null)) {
            return <any>this.acceptOrVisitValue$java_lang_Object$java_lang_String(value, baseName);
        } else if(((value != null) || value === null) && baseName === undefined) {
            return <any>this.acceptOrVisitValue$java_lang_Object(value);
        } else throw new Error('invalid overload');
    }

    public visitValue(value : any) {
        let variableName : string = this.addVariable(value, DefaultQueryBuilder.DEFAULT_BASE_VARIABLE_NAME);
        /* append */(sb => { sb.str = sb.str.concat(<any>variableName); return sb; })(/* append */(sb => { sb.str = sb.str.concat(<any>":"); return sb; })(this.result));
    }

    buildWhereClause(whereClause : Exp) {
        if(whereClause.isValid()) {
            /* append */(sb => { sb.str = sb.str.concat(<any>" "); return sb; })(/* append */(sb => { sb.str = sb.str.concat(<any>DefaultQueryBuilder.WHERE); return sb; })(/* append */(sb => { sb.str = sb.str.concat(<any>" "); return sb; })(this.result)));
            whereClause.accept(this);
        }
    }

    buildLimitClause(query : SelectQuery) {
        /* append */(sb => { sb.str = sb.str.concat(<any>" "); return sb; })(/* append */(sb => { sb.str = sb.str.concat(<any>"LIMIT"); return sb; })(/* append */(sb => { sb.str = sb.str.concat(<any>" "); return sb; })(this.result)));
        /* append */(sb => { sb.str = sb.str.concat(<any>this.addVariable(query.getLimit(), "limit")); return sb; })(/* append */(sb => { sb.str = sb.str.concat(<any>":"); return sb; })(this.result));
    }

    public visit$com_octo_java_sql_exp_Column(column : Column) {
        /* append */(sb => { sb.str = sb.str.concat(<any>column.getName()); return sb; })(this.result);
    }

    /**
     * Visit methods
     * @param {Column} column
     */
    public visit(column? : any) : any {
        if(((column != null && column instanceof <any>Column) || column === null)) {
            return <any>this.visit$com_octo_java_sql_exp_Column(column);
        } else if(((column != null && column instanceof <any>OpExp) || column === null)) {
            return <any>this.visit$com_octo_java_sql_exp_OpExp(column);
        } else if(((column != null && column instanceof <any>BetweenExp) || column === null)) {
            return <any>this.visit$com_octo_java_sql_exp_BetweenExp(column);
        } else if(((column != null && column instanceof <any>ExpSeq) || column === null)) {
            return <any>this.visit$com_octo_java_sql_exp_ExpSeq(column);
        } else if(((column != null && column instanceof <any>InExp) || column === null)) {
            return <any>this.visit$com_octo_java_sql_exp_InExp(column);
        } else if(((column != null && column instanceof <any>JoinClause) || column === null)) {
            return <any>this.visit$com_octo_java_sql_exp_JoinClause(column);
        } else if(((column != null && column instanceof <any>SetClause) || column === null)) {
            return <any>this.visit$com_octo_java_sql_exp_SetClause(column);
        } else if(((column != null && column instanceof <any>SQLFunc) || column === null)) {
            return <any>this.visit$com_octo_java_sql_exp_SQLFunc(column);
        } else if(((typeof column === 'number') || column === null)) {
            return <any>this.visit$com_octo_java_sql_exp_Constant(column);
        } else if(((column != null && column instanceof <any>SelectQuery) || column === null)) {
            return <any>this.visit$com_octo_java_sql_query_SelectQuery(column);
        } else if(((column != null && column instanceof <any>UpdateQuery) || column === null)) {
            return <any>this.visit$com_octo_java_sql_query_UpdateQuery(column);
        } else if(((column != null && column instanceof <any>InsertQuery) || column === null)) {
            return <any>this.visit$com_octo_java_sql_query_InsertQuery(column);
        } else if(((column != null && column instanceof <any>DeleteQuery) || column === null)) {
            return <any>this.visit$com_octo_java_sql_query_DeleteQuery(column);
        } else if(((column != null && column instanceof <any>Nullable) || column === null)) {
            return <any>this.visit$com_octo_java_sql_exp_Nullable(column);
        } else throw new Error('invalid overload');
    }

    public visit$com_octo_java_sql_exp_OpExp(exp : OpExp) {
        let baseVariableName : string = this.getVariableName(exp.getLhsValue(), null);
        if(baseVariableName == null) baseVariableName = this.getVariableName(exp.getRhsValue(), "var");
        /* append */(sb => { sb.str = sb.str.concat(<any>DefaultQueryBuilder.OPEN_BRACKET); return sb; })(this.result);
        this.acceptOrVisitValue$java_lang_Object$java_lang_String(exp.getLhsValue(), baseVariableName);
        if((exp.getRhsValue() == null) || ((exp.getRhsValue() != null && exp.getRhsValue() instanceof <any>Nullable) && (<Nullable>exp.getRhsValue()).isNull())) {
            if(!/* Enum.equals */(<any>(Operator.EQ) === <any>(exp.getOperator()))) throw new QueryGrammarException("Cannot use NULL value with operator " + Operator["_$wrappers"][exp.getOperator()].getValue());
            /* append */(sb => { sb.str = sb.str.concat(<any>Operator["_$wrappers"][Operator.IS].getValue()); return sb; })(/* append */(sb => { sb.str = sb.str.concat(<any>" "); return sb; })(this.result));
            /* append */(sb => { sb.str = sb.str.concat(<any>Constant.NULL); return sb; })(/* append */(sb => { sb.str = sb.str.concat(<any>" "); return sb; })(this.result));
        } else {
            /* append */(sb => { sb.str = sb.str.concat(<any>" "); return sb; })(/* append */(sb => { sb.str = sb.str.concat(<any>Operator["_$wrappers"][exp.getOperator()].getValue()); return sb; })(/* append */(sb => { sb.str = sb.str.concat(<any>" "); return sb; })(this.result)));
            this.acceptOrVisitValue$java_lang_Object$java_lang_String(exp.getRhsValue(), baseVariableName);
        }
        /* append */(sb => { sb.str = sb.str.concat(<any>DefaultQueryBuilder.CLOSE_BRACKET); return sb; })(this.result);
    }

    public visit$com_octo_java_sql_exp_BetweenExp(betweenExp : BetweenExp) {
        let column : Column = betweenExp.getColumn();
        if((betweenExp.getValueStart() == null) || (betweenExp.getValueEnd() == null)) throw new QueryGrammarException("Cannot apply BETWEEN with one NULL value");
        /* append */(sb => { sb.str = sb.str.concat(<any>DefaultQueryBuilder.OPEN_BRACKET); return sb; })(this.result);
        this.visit$com_octo_java_sql_exp_Column(column);
        /* append */(sb => { sb.str = sb.str.concat(<any>" "); return sb; })(/* append */(sb => { sb.str = sb.str.concat(<any>DefaultQueryBuilder.BETWEEN); return sb; })(/* append */(sb => { sb.str = sb.str.concat(<any>" "); return sb; })(this.result)));
        this.acceptOrVisitValue$java_lang_Object$java_lang_String(betweenExp.getValueStart(), column.getName());
        /* append */(sb => { sb.str = sb.str.concat(<any>" "); return sb; })(/* append */(sb => { sb.str = sb.str.concat(<any>Operator.AND); return sb; })(/* append */(sb => { sb.str = sb.str.concat(<any>" "); return sb; })(this.result)));
        this.acceptOrVisitValue$java_lang_Object$java_lang_String(betweenExp.getValueEnd(), column.getName());
        /* append */(sb => { sb.str = sb.str.concat(<any>DefaultQueryBuilder.CLOSE_BRACKET); return sb; })(this.result);
    }

    public visit$com_octo_java_sql_exp_ExpSeq(expSeq : ExpSeq) {
        /* append */(sb => { sb.str = sb.str.concat(<any>DefaultQueryBuilder.OPEN_BRACKET); return sb; })(this.result);
        let operator : Operator = expSeq.getOperator();
        let firstClause : boolean = true;
        {
            let array125 = expSeq.getClauses();
            for(let index124=0; index124 < array125.length; index124++) {
                let clause = array125[index124];
                {
                    if(clause.isValid()) {
                        if(firstClause) firstClause = false; else /* append */(sb => { sb.str = sb.str.concat(<any>" "); return sb; })(/* append */(sb => { sb.str = sb.str.concat(<any>Operator["_$wrappers"][operator].getValue()); return sb; })(/* append */(sb => { sb.str = sb.str.concat(<any>" "); return sb; })(this.result)));
                        clause.accept(this);
                    }
                }
            }
        }
        /* append */(sb => { sb.str = sb.str.concat(<any>DefaultQueryBuilder.CLOSE_BRACKET); return sb; })(this.result);
    }

    public visit$com_octo_java_sql_exp_InExp(inExp : InExp) {
        if(ArrayUtils.isEmpty(inExp.getValues())) throw new QueryGrammarException("IN values cannot be empty or null");
        /* append */(sb => { sb.str = sb.str.concat(<any>DefaultQueryBuilder.OPEN_BRACKET); return sb; })(this.result);
        inExp.getColumn().accept(this);
        /* append */(sb => { sb.str = sb.str.concat(<any>" "); return sb; })(this.result);
        if(inExp.isNegative()) /* append */(sb => { sb.str = sb.str.concat(<any>" "); return sb; })(/* append */(sb => { sb.str = sb.str.concat(<any>Operator["_$wrappers"][Operator.NOT].getValue()); return sb; })(this.result));
        /* append */(sb => { sb.str = sb.str.concat(<any>DefaultQueryBuilder.OPEN_BRACKET); return sb; })(/* append */(sb => { sb.str = sb.str.concat(<any>" "); return sb; })(/* append */(sb => { sb.str = sb.str.concat(<any>Operator["_$wrappers"][Operator.IN].getValue()); return sb; })(this.result)));
        let firstValue : boolean = true;
        {
            let array127 = inExp.getValues();
            for(let index126=0; index126 < array127.length; index126++) {
                let value = array127[index126];
                {
                    if(firstValue) firstValue = false; else /* append */(sb => { sb.str = sb.str.concat(<any>","); return sb; })(this.result);
                    this.acceptOrVisitValue$java_lang_Object$java_lang_String(value, inExp.getColumn().getName());
                }
            }
        }
        /* append */(sb => { sb.str = sb.str.concat(<any>DefaultQueryBuilder.CLOSE_BRACKET); return sb; })(this.result);
        /* append */(sb => { sb.str = sb.str.concat(<any>DefaultQueryBuilder.CLOSE_BRACKET); return sb; })(this.result);
    }

    public visit$com_octo_java_sql_exp_JoinClause(joinClause : JoinClause) {
        /* append */(sb => { sb.str = sb.str.concat(<any>" "); return sb; })(/* append */(sb => { sb.str = sb.str.concat(<any>JoinClause.JoinType["_$wrappers"][joinClause.getType()].value); return sb; })(/* append */(sb => { sb.str = sb.str.concat(<any>" "); return sb; })(this.result)));
        /* append */(sb => { sb.str = sb.str.concat(<any>joinClause.getTable()); return sb; })(this.result);
        /* append */(sb => { sb.str = sb.str.concat(<any>" "); return sb; })(/* append */(sb => { sb.str = sb.str.concat(<any>DefaultQueryBuilder.ON); return sb; })(/* append */(sb => { sb.str = sb.str.concat(<any>" "); return sb; })(this.result)));
        joinClause.getOnClause().accept(this);
    }

    public visit$com_octo_java_sql_exp_SetClause(setClause : SetClause) {
        let column : Column = setClause.getColumn();
        column.accept(this);
        /* append */(sb => { sb.str = sb.str.concat(<any>" "); return sb; })(/* append */(sb => { sb.str = sb.str.concat(<any>Operator["_$wrappers"][Operator.EQ].getValue()); return sb; })(/* append */(sb => { sb.str = sb.str.concat(<any>" "); return sb; })(this.result)));
        this.acceptOrVisitValue$java_lang_Object$java_lang_String(setClause.getValue(), column.getName());
    }

    public visit$com_octo_java_sql_exp_SQLFunc(sqlFunc : SQLFunc) {
        let functionName : string = sqlFunc.getName();
        if(/* containsKey */this.functions.hasOwnProperty(functionName)) {
            let functionPlaceHolder : JavaSQLFunc.Evaluable<any> = /* get */((m,k) => m[k]?m[k]:null)(this.functions, functionName);
            /* append */(sb => { sb.str = sb.str.concat(<any>(o => o.eval.apply(o, sqlFunc.getParams()))(functionPlaceHolder)); return sb; })(this.result);
        } else {
            /* append */(sb => { sb.str = sb.str.concat(<any>DefaultQueryBuilder.OPEN_BRACKET); return sb; })(/* append */(sb => { sb.str = sb.str.concat(<any>functionName); return sb; })(this.result));
            let firstParam : boolean = true;
            {
                let array129 = sqlFunc.getParams();
                for(let index128=0; index128 < array129.length; index128++) {
                    let param = array129[index128];
                    {
                        if(firstParam) firstParam = false; else /* append */(sb => { sb.str = sb.str.concat(<any>","); return sb; })(this.result);
                        this.acceptOrVisitValue$java_lang_Object$java_lang_String(param, functionName);
                    }
                }
            }
            /* append */(sb => { sb.str = sb.str.concat(<any>DefaultQueryBuilder.CLOSE_BRACKET); return sb; })(this.result);
            if(!StringUtils.isEmpty(sqlFunc.getAlias())) /* append */(sb => { sb.str = sb.str.concat(<any>sqlFunc.getAlias()); return sb; })(/* append */(sb => { sb.str = sb.str.concat(<any>" "); return sb; })(/* append */(sb => { sb.str = sb.str.concat(<any>DefaultQueryBuilder.AS); return sb; })(/* append */(sb => { sb.str = sb.str.concat(<any>" "); return sb; })(this.result))));
        }
    }

    public visit$com_octo_java_sql_exp_Constant(constant : Constant) {
        /* append */(sb => { sb.str = sb.str.concat(<any>Constant["_$wrappers"][constant].getValue()); return sb; })(this.result);
    }

    public visit$com_octo_java_sql_query_SelectQuery(query : SelectQuery) {
        let innerQuery : boolean = this.addBracketToNextSelectQuery;
        if(innerQuery) /* append */(sb => { sb.str = sb.str.concat(<any>DefaultQueryBuilder.OPEN_BRACKET); return sb; })(this.result); else this.addBracketToNextSelectQuery = true;
        /* append */(sb => { sb.str = sb.str.concat(<any>" "); return sb; })(/* append */(sb => { sb.str = sb.str.concat(<any>DefaultQueryBuilder.SELECT); return sb; })(this.result));
        let firstColumn : boolean = true;
        {
            let array131 = query.getColumns();
            for(let index130=0; index130 < array131.length; index130++) {
                let column = array131[index130];
                {
                    if(firstColumn) firstColumn = false; else /* append */(sb => { sb.str = sb.str.concat(<any>","); return sb; })(this.result);
                    this.acceptOrVisitValue$java_lang_Object(column);
                }
            }
        }
        /* append */(sb => { sb.str = sb.str.concat(<any>" "); return sb; })(/* append */(sb => { sb.str = sb.str.concat(<any>DefaultQueryBuilder.FROM); return sb; })(/* append */(sb => { sb.str = sb.str.concat(<any>" "); return sb; })(this.result)));
        /* append */(sb => { sb.str = sb.str.concat(<any>StringUtils.join$java_lang_Object_A$char(query.getTables(), ',')); return sb; })(this.result);
        {
            let array133 = query.getJoinClauses();
            for(let index132=0; index132 < array133.length; index132++) {
                let clause = array133[index132];
                if(clause.isValid()) clause.accept(this);
            }
        }
        if(!StringUtils.isEmpty(query.getAlias())) {
            /* append */(sb => { sb.str = sb.str.concat(<any>" "); return sb; })(this.result);
            /* append */(sb => { sb.str = sb.str.concat(<any>query.getAlias()); return sb; })(this.result);
        }
        let whereClause : Exp = query.getWhereClause();
        if((whereClause != null) && (whereClause.isValid())) this.buildWhereClause(whereClause);
        let firstOrderBy : boolean = true;
        let orderBy : any = query.getOrderBy();
        {
            let array135 = /* keySet */Object.keys(orderBy);
            for(let index134=0; index134 < array135.length; index134++) {
                let orderByColumn = array135[index134];
                {
                    if(firstOrderBy) {
                        /* append */(sb => { sb.str = sb.str.concat(<any>" "); return sb; })(/* append */(sb => { sb.str = sb.str.concat(<any>DefaultQueryBuilder.ORDER_BY); return sb; })(/* append */(sb => { sb.str = sb.str.concat(<any>" "); return sb; })(this.result)));
                        firstOrderBy = false;
                    } else /* append */(sb => { sb.str = sb.str.concat(<any>", "); return sb; })(this.result);
                    /* append */(sb => { sb.str = sb.str.concat(<any>orderByColumn); return sb; })(this.result);
                    let columnOrder : SelectQuery.Order = /* get */((m,k) => m[k]?m[k]:null)(orderBy, orderByColumn);
                    if(columnOrder != null) /* append */(sb => { sb.str = sb.str.concat(<any>SelectQuery.Order["_$wrappers"][columnOrder].toString()); return sb; })(/* append */(sb => { sb.str = sb.str.concat(<any>" "); return sb; })(this.result));
                }
            }
        }
        if(query.getLimit() != null) this.buildLimitClause(query);
        if(!CollectionUtils.isEmpty(query.getUnions())) {
            /* append */(sb => { sb.str = sb.str.concat(<any>" "); return sb; })(/* append */(sb => { sb.str = sb.str.concat(<any>DefaultQueryBuilder.UNION); return sb; })(/* append */(sb => { sb.str = sb.str.concat(<any>" "); return sb; })(this.result)));
            {
                let array137 = query.getUnions();
                for(let index136=0; index136 < array137.length; index136++) {
                    let union = array137[index136];
                    {
                        this.addBracketToNextSelectQuery = false;
                        union.accept(this);
                    }
                }
            }
        }
        if(innerQuery) /* append */(sb => { sb.str = sb.str.concat(<any>DefaultQueryBuilder.CLOSE_BRACKET); return sb; })(this.result);
    }

    public visit$com_octo_java_sql_query_UpdateQuery(updateQuery : UpdateQuery) {
        this.addBracketToNextSelectQuery = true;
        /* append */(sb => { sb.str = sb.str.concat(<any>" "); return sb; })(/* append */(sb => { sb.str = sb.str.concat(<any>DefaultQueryBuilder.UPDATE); return sb; })(this.result));
        /* append */(sb => { sb.str = sb.str.concat(<any>updateQuery.getTable()); return sb; })(this.result);
        /* append */(sb => { sb.str = sb.str.concat(<any>" "); return sb; })(/* append */(sb => { sb.str = sb.str.concat(<any>DefaultQueryBuilder.SET); return sb; })(/* append */(sb => { sb.str = sb.str.concat(<any>" "); return sb; })(this.result)));
        let firstClause : boolean = true;
        {
            let array139 = updateQuery.getSetClauses();
            for(let index138=0; index138 < array139.length; index138++) {
                let clause = array139[index138];
                {
                    if(firstClause) {
                        firstClause = false;
                    } else {
                        /* append */(sb => { sb.str = sb.str.concat(<any>", "); return sb; })(this.result);
                    }
                    clause.accept(this);
                }
            }
        }
        let whereClause : Exp = updateQuery.getWhereClause();
        if((whereClause != null) && (whereClause.isValid())) this.buildWhereClause(whereClause);
    }

    public visit$com_octo_java_sql_query_InsertQuery(insertQuery : InsertQuery) {
        this.addBracketToNextSelectQuery = true;
        /* append */(sb => { sb.str = sb.str.concat(<any>" "); return sb; })(/* append */(sb => { sb.str = sb.str.concat(<any>DefaultQueryBuilder.INSERT); return sb; })(this.result));
        /* append */(sb => { sb.str = sb.str.concat(<any>" "); return sb; })(/* append */(sb => { sb.str = sb.str.concat(<any>insertQuery.getTable()); return sb; })(this.result));
        /* append */(sb => { sb.str = sb.str.concat(<any>DefaultQueryBuilder.OPEN_BRACKET); return sb; })(this.result);
        let columnValues : any = insertQuery.getColumnsValues();
        /* append */(sb => { sb.str = sb.str.concat(<any>StringUtils.join$java_util_Collection$java_lang_String(/* keySet */Object.keys(columnValues), ", ")); return sb; })(this.result);
        /* append */(sb => { sb.str = sb.str.concat(<any>" "); return sb; })(/* append */(sb => { sb.str = sb.str.concat(<any>DefaultQueryBuilder.CLOSE_BRACKET); return sb; })(this.result));
        /* append */(sb => { sb.str = sb.str.concat(<any>DefaultQueryBuilder.OPEN_BRACKET); return sb; })(/* append */(sb => { sb.str = sb.str.concat(<any>" "); return sb; })(/* append */(sb => { sb.str = sb.str.concat(<any>DefaultQueryBuilder.VALUES); return sb; })(this.result)));
        let firstClause : boolean = true;
        {
            let array141 = /* keySet */Object.keys(columnValues);
            for(let index140=0; index140 < array141.length; index140++) {
                let column = array141[index140];
                {
                    if(firstClause) {
                        firstClause = false;
                    } else {
                        /* append */(sb => { sb.str = sb.str.concat(<any>", "); return sb; })(this.result);
                    }
                    this.acceptOrVisitValue$java_lang_Object$java_lang_String(/* get */((m,k) => m[k]?m[k]:null)(columnValues, column), <string>column);
                }
            }
        }
        /* append */(sb => { sb.str = sb.str.concat(<any>DefaultQueryBuilder.CLOSE_BRACKET); return sb; })(this.result);
    }

    public visit$com_octo_java_sql_query_DeleteQuery(deleteQuery : DeleteQuery) {
        this.addBracketToNextSelectQuery = true;
        /* append */(sb => { sb.str = sb.str.concat(<any>" "); return sb; })(/* append */(sb => { sb.str = sb.str.concat(<any>DefaultQueryBuilder.DELETE_FROM); return sb; })(this.result));
        /* append */(sb => { sb.str = sb.str.concat(<any>StringUtils.join$java_lang_Object_A$char(deleteQuery.getTables(), ',')); return sb; })(this.result);
        let whereClause : Exp = deleteQuery.getWhereClause();
        if((whereClause != null) && (whereClause.isValid())) this.buildWhereClause(whereClause);
    }

    public visit$com_octo_java_sql_exp_Nullable(nullable : Nullable) {
        this.acceptOrVisitValue$java_lang_Object(nullable.getValue());
    }

    constructor() {
        super();
    }
}
DefaultQueryBuilder["__class"] = "com.octo.java.sql.query.visitor.DefaultQueryBuilder";
DefaultQueryBuilder["__interfaces"] = ["com.octo.java.sql.query.visitor.QueryVisitor"];




var __Function = Function;
/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export class OracleQueryBuilder extends DefaultQueryBuilder {
    /**
     * 
     * @param {SelectQuery} query
     */
    buildLimitClause(query : SelectQuery) {
        /* insert */((sb, index, c) => { sb.str = sb.str.substr(0, index) + c + sb.str.substr(index); return sb; })(this.result, 0, "SELECT * FROM (");
        /* append */(sb => { sb.str = sb.str.concat(<any>") WHERE (rownum<=:"); return sb; })(this.result);
        /* append */(sb => { sb.str = sb.str.concat(<any>")"); return sb; })(/* append */(sb => { sb.str = sb.str.concat(<any>this.addVariable(query.getLimit(), "limit")); return sb; })(this.result));
    }

    constructor() {
        super();
    }
}
OracleQueryBuilder["__class"] = "com.octo.java.sql.query.visitor.OracleQueryBuilder";
OracleQueryBuilder["__interfaces"] = ["com.octo.java.sql.query.visitor.QueryVisitor"];




var __Function = Function;
/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export interface QueryVisitor {
    visit(javaSQLFunc? : any) : any;

    visitValue(value : any);
}


var __Function = Function;
/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export class ArrayUtils {
    public static isEmpty(array : any[]) : boolean {
        if(array == null || array.length === 0) {
            return true;
        }
        return false;
    }
}
ArrayUtils["__class"] = "util.ArrayUtils";



var __Function = Function;
/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export class CollectionUtils {
    public static isEmpty(coll : Array<any>) : boolean {
        return (coll == null || /* isEmpty */(coll.length == 0));
    }

    public static exists(collection : Array<any>, predicate : Predicate) : boolean {
        if(collection != null && predicate != null) {
            for(let it : any = /* iterator */((a) => { var i = 0; return { next: function() { return i<a.length?a[i++]:null; }, hasNext: function() { return i<a.length; }}})(collection); it.hasNext(); ) {
                if(predicate.evaluate(it.next())) {
                    return true;
                }
            };
        }
        return false;
    }
}
CollectionUtils["__class"] = "util.CollectionUtils";



var __Function = Function;
/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export class ObjectUtils {
    public static toString(obj : any) : string {
        return obj == null?"":obj.toString();
    }
}
ObjectUtils["__class"] = "util.ObjectUtils";



var __Function = Function;
/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
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
    evaluate(object : any) : boolean;
}


var __Function = Function;
/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export class StringUtils {
    public static EMPTY : string = "";

    public static isEmpty(str : string) : boolean {
        return str == null || str.length === 0;
    }

    public static join$java_lang_Object_A$char(array : any[], separator : string) : string {
        if(array == null) {
            return null;
        }
        return StringUtils.join$java_lang_Object_A$char$int$int(array, separator, 0, array.length);
    }

    public static join$java_lang_Object_A$char$int$int(array : any[], separator : string, startIndex : number, endIndex : number) : string {
        if(array == null) {
            return null;
        }
        let bufSize : number = (endIndex - startIndex);
        if(bufSize <= 0) {
            return StringUtils.EMPTY;
        }
        bufSize *= ((array[startIndex] == null?16:array[startIndex].toString().length) + 1);
        let buf : { str: string } = { str: "", toString: function() { return this.str; } };
        for(let i : number = startIndex; i < endIndex; i++) {
            if(i > startIndex) {
                /* append */(sb => { sb.str = sb.str.concat(<any>separator); return sb; })(buf);
            }
            if(array[i] != null) {
                /* append */(sb => { sb.str = sb.str.concat(<any>array[i]); return sb; })(buf);
            }
        };
        return /* toString */buf.str;
    }

    public static join(array? : any, separator? : any, startIndex? : any, endIndex? : any) : any {
        if(((array != null && array instanceof <any>Array && (array.length==0 || array[0] == null ||(array[0] != null))) || array === null) && ((typeof separator === 'string') || separator === null) && ((typeof startIndex === 'number') || startIndex === null) && ((typeof endIndex === 'number') || endIndex === null)) {
            return <any>StringUtils.join$java_lang_Object_A$char$int$int(array, separator, startIndex, endIndex);
        } else if(((array != null && (array instanceof Array)) || array === null) && ((typeof separator === 'string') || separator === null) && startIndex === undefined && endIndex === undefined) {
            return <any>StringUtils.join$java_util_Collection$java_lang_String(array, separator);
        } else if(((array != null && (array instanceof Object)) || array === null) && ((typeof separator === 'string') || separator === null) && startIndex === undefined && endIndex === undefined) {
            return <any>StringUtils.join$java_util_Iterator$java_lang_String(array, separator);
        } else if(((array != null && array instanceof <any>Array && (array.length==0 || array[0] == null ||(array[0] != null))) || array === null) && ((typeof separator === 'string') || separator === null) && startIndex === undefined && endIndex === undefined) {
            return <any>StringUtils.join$java_lang_Object_A$char(array, separator);
        } else throw new Error('invalid overload');
    }

    public static join$java_util_Collection$java_lang_String(collection : Array<any>, separator : string) : string {
        if(collection == null) {
            return null;
        }
        return StringUtils.join$java_util_Iterator$java_lang_String(/* iterator */((a) => { var i = 0; return { next: function() { return i<a.length?a[i++]:null; }, hasNext: function() { return i<a.length; }}})(collection), separator);
    }

    public static join$java_util_Iterator$java_lang_String(iterator : any, separator : string) : string {
        if(iterator == null) {
            return null;
        }
        if(!iterator.hasNext()) {
            return StringUtils.EMPTY;
        }
        let first : any = iterator.next();
        if(!iterator.hasNext()) {
            return ObjectUtils.toString(first);
        }
        let buf : { str: string } = { str: "", toString: function() { return this.str; } };
        if(first != null) {
            /* append */(sb => { sb.str = sb.str.concat(<any>first); return sb; })(buf);
        }
        while((iterator.hasNext())) {
            if(separator != null) {
                /* append */(sb => { sb.str = sb.str.concat(<any>separator); return sb; })(buf);
            }
            let obj : any = iterator.next();
            if(obj != null) {
                /* append */(sb => { sb.str = sb.str.concat(<any>obj); return sb; })(buf);
            }
        };
        return /* toString */buf.str;
    }
}
StringUtils["__class"] = "util.StringUtils";



var __Function = Function;
