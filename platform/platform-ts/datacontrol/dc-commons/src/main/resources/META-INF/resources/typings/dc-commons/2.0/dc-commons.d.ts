import { Query } from "sql-dsl/ts-sql-dsl";
import { SelectQuery } from "sql-dsl/ts-sql-dsl";
export declare enum ConditionConverter {
    WHERE = 0,
    AND = 1,
}
/** @ignore */
export declare class ConditionConverter_$WRAPPER {
    protected _$ordinal: number;
    protected _$name: string;
    condition: any;
    constructor(_$ordinal: number, _$name: string, condition: any);
    getRestriction(query: any, column: any): Query<any>;
    name(): string;
    ordinal(): number;
}
export declare class Constants {
    static UNDEFINED_PARAMETER: string;
    static POST_QUERY_TRIGGER_COMPLETED: string;
    static DATA_CONTROL: string;
    static PARENT_OBJECT: string;
    static TURA_EXT_QUERY: string;
}
export declare class DefaulQueryFactory {
    static builder(searchCriteria: java.util.List<SearchCriteria>, orderCriteria: java.util.List<OrderCriteria>, baseClass: any): SelectQuery;
}
export declare class LazyList<T> extends java.util.AbstractList<T> {
    loaded: java.util.Map<number, T>;
    numResults: number;
    startIndex: number;
    actualRowNumber: number;
    constructor(data?: any, numResults?: any, startIndex?: any);
    reindex(index: number): void;
    getKeys(): java.util.Set<number>;
    /**
     *
     * @param {number} index
     * @param {*} t
     */
    add(index: number, t: T): void;
    /**
     *
     * @param {number} index
     * @param {*} t
     * @return {*}
     */
    set(index: number, t: T): T;
    /**
     *
     * @param {number} index
     * @return {*}
     */
    remove(index: number): T;
    /**
     *
     * @param {number} index
     * @return {*}
     */
    get(index: number): T;
    /**
     *
     * @return {number}
     */
    size(): number;
    correctRowsNumber(correction: number): void;
    getStartIndex(): number;
    getFragmentSize(): number;
    getActualRowNumber(): number;
}
export declare class OrderCriteria {
    name: string;
    order: string;
    constructor(name?: any, order?: any);
    getName(): string;
    setName(name: string): void;
    getOrder(): string;
    setOrder(order: string): void;
}
export declare class PlatformConfig {
    static LOADSTEP: number;
}
export declare class SearchCriteria {
    name: string;
    comparator: string;
    value: any;
    className: string;
    constructor(name?: any, comparator?: any, value?: any, className?: any);
    getName(): string;
    setName(name: string): void;
    getValue(): any;
    setValue(value: any): void;
    getClassName(): string;
    setClassName(className: string): void;
    getComparator(): string;
    setComparator(comparator: string): void;
}
export declare class TuraException extends Error {
    constructor(e?: any);
    static serialVersionUID: number;
}
