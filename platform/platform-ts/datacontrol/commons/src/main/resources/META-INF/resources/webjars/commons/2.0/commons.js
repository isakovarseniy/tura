var g; if (typeof window === 'undefined') { g = global;}else{ g = window;}  
var java =  g['java'];
/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
import { Query } from "sql-dsl/ts-sql-dsl";
import { SelectQuery } from "sql-dsl/ts-sql-dsl";
import { Operator } from "sql-dsl/ts-sql-dsl";
export var ConditionConverter;
(function (ConditionConverter) {
    ConditionConverter[ConditionConverter["WHERE"] = 0] = "WHERE";
    ConditionConverter[ConditionConverter["AND"] = 1] = "AND";
})(ConditionConverter || (ConditionConverter = {}));
/** @ignore */
export class ConditionConverter_$WRAPPER {
    constructor(_$ordinal, _$name, condition) {
        this._$ordinal = _$ordinal;
        this._$name = _$name;
        if (this.condition === undefined)
            this.condition = null;
        this.condition = condition;
    }
    getRestriction(query, column) {
        return eval(' query.' + this.condition + '(column); ');
    }
    name() { return this._$name; }
    ordinal() { return this._$ordinal; }
}
ConditionConverter["__class"] = "org.tura.platform.datacontrol.commons.ConditionConverter";
ConditionConverter["__interfaces"] = ["java.lang.Comparable", "java.io.Serializable"];
ConditionConverter["_$wrappers"] = [new ConditionConverter_$WRAPPER(0, "WHERE", "where"), new ConditionConverter_$WRAPPER(1, "AND", "and")];
/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export class Constants {
}
Constants.UNDEFINED_PARAMETER = "@@ARSENIY@UNDEFINED_PARAMETER";
Constants.POST_QUERY_TRIGGER_COMPLETED = "POST_QUERY_TRIGGER_COMPLETED";
Constants.DATA_CONTROL = "Data control";
Constants.PARENT_OBJECT = "Parent object";
Constants.TURA_EXT_QUERY = "TURA_EXTENDED_PARAMETER";
Constants["__class"] = "org.tura.platform.datacontrol.commons.Constants";
/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export class DefaulQueryFactory {
    static builder(searchCriteria, orderCriteria, baseClass) {
        try {
            let query = Query.select(Query.c("x")).from(baseClass.getCanonicalName()).as("x");
            let condition = "WHERE";
            for (let index146 = searchCriteria.iterator(); index146.hasNext();) {
                let criteria = index146.next();
                {
                    ConditionConverter["_$wrappers"][ConditionConverter[condition]].getRestriction(query, Query.c(criteria.getName()));
                    query.op(/* Enum.valueOf */ Operator[criteria.getComparator()], criteria.getValue());
                    condition = "AND";
                }
            }
            for (let index147 = orderCriteria.iterator(); index147.hasNext();) {
                let order = index147.next();
                {
                    query.orderBy(order.getName());
                    if (((o1, o2) => { if (o1 && o1.equals) {
                        return o1.equals(o2);
                    }
                    else {
                        return o1 === o2;
                    } })(order.getOrder(), /* Enum.name */ SelectQuery.Order[SelectQuery.Order.ASC]))
                        query.asc();
                    else
                        query.desc();
                }
            }
            return query;
        }
        catch (e) {
            throw new TuraException(e);
        }
        ;
    }
}
DefaulQueryFactory["__class"] = "org.tura.platform.datacontrol.commons.DefaulQueryFactory";
/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export class LazyList extends java.util.AbstractList {
    constructor(data, numResults, startIndex) {
        if (((data != null && (data["__interfaces"] != null && data["__interfaces"].indexOf("java.util.List") >= 0 || data.constructor != null && data.constructor["__interfaces"] != null && data.constructor["__interfaces"].indexOf("java.util.List") >= 0)) || data === null) && ((typeof numResults === 'number') || numResults === null) && ((typeof startIndex === 'number') || startIndex === null)) {
            let __args = Array.prototype.slice.call(arguments);
            {
                let __args = Array.prototype.slice.call(arguments);
                super();
                if (this.loaded === undefined)
                    this.loaded = null;
                if (this.numResults === undefined)
                    this.numResults = 0;
                if (this.startIndex === undefined)
                    this.startIndex = 0;
                if (this.actualRowNumber === undefined)
                    this.actualRowNumber = 0;
                if (this.loaded === undefined)
                    this.loaded = null;
                if (this.numResults === undefined)
                    this.numResults = 0;
                if (this.startIndex === undefined)
                    this.startIndex = 0;
                if (this.actualRowNumber === undefined)
                    this.actualRowNumber = 0;
                (() => {
                    this.loaded = new java.util.HashMap();
                    this.numResults = -1;
                    this.actualRowNumber = -1;
                })();
            }
            (() => {
                this.numResults = numResults;
                this.actualRowNumber = numResults;
                this.startIndex = startIndex;
                for (let j = 0; j < data.size(); j++) {
                    this.loaded.put(startIndex + j, data.get(j));
                }
                ;
            })();
        }
        else if (data === undefined && numResults === undefined && startIndex === undefined) {
            let __args = Array.prototype.slice.call(arguments);
            super();
            if (this.loaded === undefined)
                this.loaded = null;
            if (this.numResults === undefined)
                this.numResults = 0;
            if (this.startIndex === undefined)
                this.startIndex = 0;
            if (this.actualRowNumber === undefined)
                this.actualRowNumber = 0;
            if (this.loaded === undefined)
                this.loaded = null;
            if (this.numResults === undefined)
                this.numResults = 0;
            if (this.startIndex === undefined)
                this.startIndex = 0;
            if (this.actualRowNumber === undefined)
                this.actualRowNumber = 0;
            (() => {
                this.loaded = new java.util.HashMap();
                this.numResults = -1;
                this.actualRowNumber = -1;
            })();
        }
        else
            throw new Error('invalid overload');
    }
    reindex(index) {
        let map = new java.util.HashMap();
        for (let index148 = this.loaded.keySet().iterator(); index148.hasNext();) {
            let i = index148.next();
            {
                let ni = i - this.startIndex + index;
                map.put(new Number(ni), this.loaded.get(i));
            }
        }
        this.loaded = map;
    }
    getKeys() {
        return this.loaded.keySet();
    }
    /**
     *
     * @param {number} index
     * @param {*} t
     */
    add(index, t) {
        throw new java.lang.RuntimeException("Unsupported operation");
    }
    /**
     *
     * @param {number} index
     * @param {*} t
     * @return {*}
     */
    set(index, t) {
        this.loaded.put(index, t);
        return t;
    }
    /**
     *
     * @param {number} index
     * @return {*}
     */
    remove(index) {
        throw new java.lang.RuntimeException("Unsupported operation");
    }
    /**
     *
     * @param {number} index
     * @return {*}
     */
    get(index) {
        let obj = this.loaded.get(index);
        if (obj == null)
            throw new java.lang.IndexOutOfBoundsException();
        return obj;
    }
    /**
     *
     * @return {number}
     */
    size() {
        return (this.numResults | 0);
    }
    correctRowsNumber(correction) {
        this.numResults = this.numResults + correction;
    }
    getStartIndex() {
        return this.startIndex;
    }
    getFragmentSize() {
        return this.loaded.size();
    }
    getActualRowNumber() {
        return this.actualRowNumber;
    }
}
LazyList["__class"] = "org.tura.platform.datacontrol.commons.LazyList";
LazyList["__interfaces"] = ["java.util.List", "java.util.Collection", "java.lang.Iterable"];
/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export class OrderCriteria {
    constructor(name, order) {
        if (((typeof name === 'string') || name === null) && ((typeof order === 'string') || order === null)) {
            let __args = Array.prototype.slice.call(arguments);
            if (this.name === undefined)
                this.name = null;
            if (this.order === undefined)
                this.order = null;
            if (this.name === undefined)
                this.name = null;
            if (this.order === undefined)
                this.order = null;
            (() => {
                this.name = name;
                this.order = order;
            })();
        }
        else if (name === undefined && order === undefined) {
            let __args = Array.prototype.slice.call(arguments);
            if (this.name === undefined)
                this.name = null;
            if (this.order === undefined)
                this.order = null;
            if (this.name === undefined)
                this.name = null;
            if (this.order === undefined)
                this.order = null;
        }
        else
            throw new Error('invalid overload');
    }
    getName() {
        return this.name;
    }
    setName(name) {
        this.name = name;
    }
    getOrder() {
        return this.order;
    }
    setOrder(order) {
        this.order = order;
    }
}
OrderCriteria["__class"] = "org.tura.platform.datacontrol.commons.OrderCriteria";
/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export class PlatformConfig {
}
PlatformConfig.LOADSTEP = 40;
PlatformConfig["__class"] = "org.tura.platform.datacontrol.commons.PlatformConfig";
/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export class SearchCriteria {
    constructor(name, comparator, value, className) {
        if (((typeof name === 'string') || name === null) && ((typeof comparator === 'string') || comparator === null) && ((value != null) || value === null) && ((typeof className === 'string') || className === null)) {
            let __args = Array.prototype.slice.call(arguments);
            if (this.name === undefined)
                this.name = null;
            if (this.comparator === undefined)
                this.comparator = null;
            if (this.value === undefined)
                this.value = null;
            if (this.className === undefined)
                this.className = null;
            if (this.name === undefined)
                this.name = null;
            if (this.comparator === undefined)
                this.comparator = null;
            if (this.value === undefined)
                this.value = null;
            if (this.className === undefined)
                this.className = null;
            (() => {
                this.name = name;
                this.comparator = comparator;
                this.value = value;
                this.className = className;
            })();
        }
        else if (name === undefined && comparator === undefined && value === undefined && className === undefined) {
            let __args = Array.prototype.slice.call(arguments);
            if (this.name === undefined)
                this.name = null;
            if (this.comparator === undefined)
                this.comparator = null;
            if (this.value === undefined)
                this.value = null;
            if (this.className === undefined)
                this.className = null;
            if (this.name === undefined)
                this.name = null;
            if (this.comparator === undefined)
                this.comparator = null;
            if (this.value === undefined)
                this.value = null;
            if (this.className === undefined)
                this.className = null;
        }
        else
            throw new Error('invalid overload');
    }
    getName() {
        return this.name;
    }
    setName(name) {
        this.name = name;
    }
    getValue() {
        return this.value;
    }
    setValue(value) {
        this.value = value;
    }
    getClassName() {
        return this.className;
    }
    setClassName(className) {
        this.className = className;
    }
    getComparator() {
        return this.comparator;
    }
    setComparator(comparator) {
        this.comparator = comparator;
    }
}
SearchCriteria["__class"] = "org.tura.platform.datacontrol.commons.SearchCriteria";
/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export class TuraException extends Error {
    constructor(e) {
        if (((e != null && e instanceof Error) || e === null)) {
            let __args = Array.prototype.slice.call(arguments);
            super(e);
            this.message = e;
            Object.setPrototypeOf(this, TuraException.prototype);
        }
        else if (((typeof e === 'string') || e === null)) {
            let __args = Array.prototype.slice.call(arguments);
            let message = __args[0];
            super(message);
            this.message = message;
            Object.setPrototypeOf(this, TuraException.prototype);
        }
        else
            throw new Error('invalid overload');
    }
}
TuraException.serialVersionUID = 1;
TuraException["__class"] = "org.tura.platform.datacontrol.commons.TuraException";
TuraException["__interfaces"] = ["java.io.Serializable"];
//# sourceMappingURL=commons.js.map