/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
import  {Query} from "sql-dsl/ts-sql-dsl";
import {SelectQuery} from "sql-dsl/ts-sql-dsl";
import {Operator} from "sql-dsl/ts-sql-dsl";

export enum ConditionConverter {
    WHERE, AND
}

/** @ignore */
export class ConditionConverter_$WRAPPER {
    /*private*/ condition;

    constructor(protected _$ordinal : number, protected _$name : string, condition) {
        if(this.condition===undefined) this.condition = null;
        this.condition = condition;
    }

    public getRestriction(query, column) : Query<any> {
         return eval(' query.'+this.condition+'(column); ');  
    }
    public name() : string { return this._$name; }
    public ordinal() : number { return this._$ordinal; }
}
ConditionConverter["__class"] = "org.tura.platform.datacontrol.commons.ConditionConverter";
ConditionConverter["__interfaces"] = ["java.lang.Comparable","java.io.Serializable"];

ConditionConverter["_$wrappers"] = [new ConditionConverter_$WRAPPER(0, "WHERE", "where"), new ConditionConverter_$WRAPPER(1, "AND", "and")];



/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export class Constants {
    public static UNDEFINED_PARAMETER : string = "@@ARSENIY@UNDEFINED_PARAMETER";

    public static POST_QUERY_TRIGGER_COMPLETED : string = "POST_QUERY_TRIGGER_COMPLETED";

    public static DATA_CONTROL : string = "Data control";

    public static PARENT_OBJECT : string = "Parent object";

    public static TURA_EXT_QUERY : string = "TURA_EXTENDED_PARAMETER";
}
Constants["__class"] = "org.tura.platform.datacontrol.commons.Constants";



/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export class DefaulQueryFactory {
    public static builder(searchCriteria : java.util.List<SearchCriteria>, orderCriteria : java.util.List<OrderCriteria>, baseClass : any) : SelectQuery {
        try {
            let query : SelectQuery = Query.select(Query.c("x")).from(baseClass.getCanonicalName()).as("x");
            let condition : string = "WHERE";
            for(let index146=searchCriteria.iterator();index146.hasNext();) {
                let criteria = index146.next();
                {
                    ConditionConverter["_$wrappers"][/* Enum.valueOf */<any>ConditionConverter[condition]].getRestriction(query, Query.c(criteria.getName()));
                    query.op(/* Enum.valueOf */<any>Operator[criteria.getComparator()], criteria.getValue());
                    condition = "AND";
                }
            }
            for(let index147=orderCriteria.iterator();index147.hasNext();) {
                let order = index147.next();
                {
                    query.orderBy(order.getName());
                    if(/* equals */(<any>((o1: any, o2: any) => { if(o1 && o1.equals) { return o1.equals(o2); } else { return o1 === o2; } })(order.getOrder(),/* Enum.name */SelectQuery.Order[SelectQuery.Order.ASC]))) query.asc(); else query.desc();
                }
            }
            return query;
        } catch(e) {
            throw new TuraException(e);
        };
    }
}
DefaulQueryFactory["__class"] = "org.tura.platform.datacontrol.commons.DefaulQueryFactory";



/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export class LazyList<T> extends java.util.AbstractList<T> {
    /*private*/ loaded : java.util.Map<number, T>;

    /*private*/ numResults : number;

    /*private*/ startIndex : number;

    /*private*/ actualRowNumber : number;

    public constructor(data? : any, numResults? : any, startIndex? : any) {
        if(((data != null && (data["__interfaces"] != null && data["__interfaces"].indexOf("java.util.List") >= 0 || data.constructor != null && data.constructor["__interfaces"] != null && data.constructor["__interfaces"].indexOf("java.util.List") >= 0)) || data === null) && ((typeof numResults === 'number') || numResults === null) && ((typeof startIndex === 'number') || startIndex === null)) {
            let __args = Array.prototype.slice.call(arguments);
            {
                let __args = Array.prototype.slice.call(arguments);
                super();
                if(this.loaded===undefined) this.loaded = null;
                if(this.numResults===undefined) this.numResults = 0;
                if(this.startIndex===undefined) this.startIndex = 0;
                if(this.actualRowNumber===undefined) this.actualRowNumber = 0;
                if(this.loaded===undefined) this.loaded = null;
                if(this.numResults===undefined) this.numResults = 0;
                if(this.startIndex===undefined) this.startIndex = 0;
                if(this.actualRowNumber===undefined) this.actualRowNumber = 0;
                (() => {
                    this.loaded = <any>(<java.util.HashMap<number, T>>new java.util.HashMap<number, T>());
                    this.numResults = -1;
                    this.actualRowNumber = -1;
                })();
            }
            (() => {
                this.numResults = numResults;
                this.actualRowNumber = numResults;
                this.startIndex = startIndex;
                for(let j : number = 0; j < data.size(); j++) {
                    this.loaded.put(startIndex + j, data.get(j));
                };
            })();
        } else if(data === undefined && numResults === undefined && startIndex === undefined) {
            let __args = Array.prototype.slice.call(arguments);
            super();
            if(this.loaded===undefined) this.loaded = null;
            if(this.numResults===undefined) this.numResults = 0;
            if(this.startIndex===undefined) this.startIndex = 0;
            if(this.actualRowNumber===undefined) this.actualRowNumber = 0;
            if(this.loaded===undefined) this.loaded = null;
            if(this.numResults===undefined) this.numResults = 0;
            if(this.startIndex===undefined) this.startIndex = 0;
            if(this.actualRowNumber===undefined) this.actualRowNumber = 0;
            (() => {
                this.loaded = <any>(<java.util.HashMap<number, T>>new java.util.HashMap<number, T>());
                this.numResults = -1;
                this.actualRowNumber = -1;
            })();
        } else throw new Error('invalid overload');
    }

    public reindex(index : number) {
        let map : java.util.HashMap<number, T> = <any>(<java.util.HashMap<number, T>>new java.util.HashMap<number, T>());
        for(let index148=this.loaded.keySet().iterator();index148.hasNext();) {
            let i = index148.next();
            {
                let ni : number = i - this.startIndex + index;
                map.put(<number>new Number(ni), this.loaded.get(i));
            }
        }
        this.loaded = map;
    }

    public getKeys() : java.util.Set<number> {
        return this.loaded.keySet();
    }

    /**
     * 
     * @param {number} index
     * @param {*} t
     */
    public add(index : number, t : T) {
        throw new java.lang.RuntimeException("Unsupported operation");
    }

    /**
     * 
     * @param {number} index
     * @param {*} t
     * @return {*}
     */
    public set(index : number, t : T) : T {
        this.loaded.put(index, t);
        return t;
    }

    /**
     * 
     * @param {number} index
     * @return {*}
     */
    public remove(index : number) : T {
        throw new java.lang.RuntimeException("Unsupported operation");
    }

    /**
     * 
     * @param {number} index
     * @return {*}
     */
    public get(index : number) : T {
        let obj : T = this.loaded.get(index);
        if(obj == null) throw new java.lang.IndexOutOfBoundsException();
        return obj;
    }

    /**
     * 
     * @return {number}
     */
    public size() : number {
        return (<number>this.numResults|0);
    }

    public correctRowsNumber(correction : number) {
        this.numResults = this.numResults + correction;
    }

    public getStartIndex() : number {
        return this.startIndex;
    }

    public getFragmentSize() : number {
        return this.loaded.size();
    }

    public getActualRowNumber() : number {
        return this.actualRowNumber;
    }
}
LazyList["__class"] = "org.tura.platform.datacontrol.commons.LazyList";
LazyList["__interfaces"] = ["java.util.List","java.util.Collection","java.lang.Iterable"];




/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export class OrderCriteria {
    /*private*/ name : string;

    /*private*/ order : string;

    public constructor(name? : any, order? : any) {
        if(((typeof name === 'string') || name === null) && ((typeof order === 'string') || order === null)) {
            let __args = Array.prototype.slice.call(arguments);
            if(this.name===undefined) this.name = null;
            if(this.order===undefined) this.order = null;
            if(this.name===undefined) this.name = null;
            if(this.order===undefined) this.order = null;
            (() => {
                this.name = name;
                this.order = order;
            })();
        } else if(name === undefined && order === undefined) {
            let __args = Array.prototype.slice.call(arguments);
            if(this.name===undefined) this.name = null;
            if(this.order===undefined) this.order = null;
            if(this.name===undefined) this.name = null;
            if(this.order===undefined) this.order = null;
        } else throw new Error('invalid overload');
    }

    public getName() : string {
        return this.name;
    }

    public setName(name : string) {
        this.name = name;
    }

    public getOrder() : string {
        return this.order;
    }

    public setOrder(order : string) {
        this.order = order;
    }
}
OrderCriteria["__class"] = "org.tura.platform.datacontrol.commons.OrderCriteria";



/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export class PlatformConfig {
    public static LOADSTEP : number = 40;
}
PlatformConfig["__class"] = "org.tura.platform.datacontrol.commons.PlatformConfig";



/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export class SearchCriteria {
    /*private*/ name : string;

    /*private*/ comparator : string;

    /*private*/ value : any;

    /*private*/ className : string;

    public constructor(name? : any, comparator? : any, value? : any, className? : any) {
        if(((typeof name === 'string') || name === null) && ((typeof comparator === 'string') || comparator === null) && ((value != null) || value === null) && ((typeof className === 'string') || className === null)) {
            let __args = Array.prototype.slice.call(arguments);
            if(this.name===undefined) this.name = null;
            if(this.comparator===undefined) this.comparator = null;
            if(this.value===undefined) this.value = null;
            if(this.className===undefined) this.className = null;
            if(this.name===undefined) this.name = null;
            if(this.comparator===undefined) this.comparator = null;
            if(this.value===undefined) this.value = null;
            if(this.className===undefined) this.className = null;
            (() => {
                this.name = name;
                this.comparator = comparator;
                this.value = value;
                this.className = className;
            })();
        } else if(name === undefined && comparator === undefined && value === undefined && className === undefined) {
            let __args = Array.prototype.slice.call(arguments);
            if(this.name===undefined) this.name = null;
            if(this.comparator===undefined) this.comparator = null;
            if(this.value===undefined) this.value = null;
            if(this.className===undefined) this.className = null;
            if(this.name===undefined) this.name = null;
            if(this.comparator===undefined) this.comparator = null;
            if(this.value===undefined) this.value = null;
            if(this.className===undefined) this.className = null;
        } else throw new Error('invalid overload');
    }

    public getName() : string {
        return this.name;
    }

    public setName(name : string) {
        this.name = name;
    }

    public getValue() : any {
        return this.value;
    }

    public setValue(value : any) {
        this.value = value;
    }

    public getClassName() : string {
        return this.className;
    }

    public setClassName(className : string) {
        this.className = className;
    }

    public getComparator() : string {
        return this.comparator;
    }

    public setComparator(comparator : string) {
        this.comparator = comparator;
    }
}
SearchCriteria["__class"] = "org.tura.platform.datacontrol.commons.SearchCriteria";



/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export class TuraException extends Error {
    public constructor(e? : any) {
        if(((e != null && e instanceof <any>Error) || e === null)) {
            let __args = Array.prototype.slice.call(arguments);
            super(e); this.message=e;
            (<any>Object).setPrototypeOf(this, TuraException.prototype);
        } else if(((typeof e === 'string') || e === null)) {
            let __args = Array.prototype.slice.call(arguments);
            let message : any = __args[0];
            super(message); this.message=message;
            (<any>Object).setPrototypeOf(this, TuraException.prototype);
        } else throw new Error('invalid overload');
    }

    static serialVersionUID : number = 1;
}
TuraException["__class"] = "org.tura.platform.datacontrol.commons.TuraException";
TuraException["__interfaces"] = ["java.io.Serializable"];




