import "jdk/bundle";
import { SearchCriteria } from "dc-commons/dc-commons";
import { OrderCriteria } from "dc-commons/dc-commons";
export declare class DomainObject implements TuraObject {
    objId: number;
    parentId: number;
    objType: string;
    objStatus: string;
    createDate: Date;
    updateDate: Date;
    activeDate: Date;
    expiredDate: Date;
    getObjId(): number;
    setObjId(objId: number): void;
    getParentId(): number;
    setParentId(parentId: number): void;
    getObjType(): string;
    setObjType(objType: string): void;
    getObjStatus(): string;
    setObjStatus(objStatus: string): void;
    getCreateDate(): Date;
    setCreateDate(createDate: Date): void;
    getUpdateDate(): Date;
    setUpdateDate(updateDate: Date): void;
    getActiveDate(): Date;
    setActiveDate(activeDate: Date): void;
    getExpiredDate(): Date;
    setExpiredDate(expiredDate: Date): void;
    constructor();
}
export interface TuraObject {
    getObjType(): string;
    setObjType(objType: string): any;
    getObjStatus(): string;
    setObjStatus(objStatus: string): any;
    getCreateDate(): Date;
    setCreateDate(createDate: Date): any;
    getUpdateDate(): Date;
    setUpdateDate(updateDate: Date): any;
    getActiveDate(): Date;
    setActiveDate(activeDate: Date): any;
    getExpiredDate(): Date;
    setExpiredDate(expiredDate: Date): any;
    getObjId(): number;
    setObjId(objId: number): any;
}
export declare class BasicRepository implements Repository {
    providerTable: java.util.HashMap<string, DataProvider>;
    cmdHash: java.util.HashMap<string, DataProvider>;
    addProvider(provider: DataProvider, objectClass: string): void;
    addCommand(provider: DataProvider, dataClass: string): void;
    findprovider(objectClass: string): DataProvider;
    create(objectClass: string): any;
    find(searchCriteria: java.util.List<SearchCriteria>, orderCriteria: java.util.List<OrderCriteria>, startIndex: number, endIndex: number, objectClass: string): SearchResult;
    applyChanges(changes: java.util.List<any>): void;
    /**
     *
     * @param {*} obj
     * @param {string} objectClass
     */
    insert(obj: any, objectClass: string): void;
    /**
     *
     * @param {*} obj
     * @param {string} objectClass
     */
    remove(obj: any, objectClass: string): void;
    constructor();
}
export interface Command {
    execute(data: any): any;
}
export interface DataProvider {
    create(objectClass: string): any;
    find(searchCriteria: java.util.List<SearchCriteria>, orderCriteria: java.util.List<OrderCriteria>, startIndex: number, endIndex: number, objectClass: string): SearchResult;
    setRepository(repository: Repository): any;
    init(): any;
    setExtendedQuery(query: ExtendedQuery): any;
    setTriggers(triggers: Triggers): any;
    getCommand(clazz: string): Command;
}
export interface ExtendedQuery {
    getCalssName(): string;
    getQueryName(): string;
    findObjectsQuery(): string;
    findNumberOfRowsQuery(): string;
}
export interface ObjectControl {
    getAttached(): boolean;
    getWrappedObject(): any;
    getKey(): string;
    getAttributes(): java.util.Map<string, any>;
    addListener(listener: ProxyObjectUpdateListener): any;
    setStackProvider(stackProvider: ProxyCommadStackProvider): any;
    clone(): ObjectControl;
}
export interface PrImaryKeyStrategy {
    generatePk(o: any): any;
}
export interface Repository {
    addProvider(provider: DataProvider, objectClass: string): any;
    addCommand(provider: DataProvider, dataClass: string): any;
    create(objectClass: string): any;
    find(searchCriteria: java.util.List<SearchCriteria>, orderCriteria: java.util.List<OrderCriteria>, startIndex: number, endIndex: number, objectClass: string): SearchResult;
    insert(obj: any, objectClass: string): any;
    remove(obj: any, objectClass: string): any;
    applyChanges(changes: java.util.List<any>): any;
}
export declare class RepositoryException extends Error {
    static serialVersionUID: number;
    constructor(e?: any);
}
export interface Rule {
    execute(): any;
}
export declare class SearchRequest {
    search: java.util.List<SearchCriteria>;
    order: java.util.List<OrderCriteria>;
    startIndex: number;
    endIndex: number;
    objectClass: string;
    getStartIndex(): number;
    setStartIndex(startIndex: number): void;
    getEndIndex(): number;
    setEndIndex(endIndex: number): void;
    getObjectClass(): string;
    setObjectClass(objectClass: string): void;
    getSearch(): java.util.List<SearchCriteria>;
    setSearch(search: java.util.List<SearchCriteria>): void;
    getOrder(): java.util.List<OrderCriteria>;
    setOrder(order: java.util.List<OrderCriteria>): void;
    constructor();
}
export declare class SearchResult {
    searchResult: java.util.List<any>;
    numberOfRows: number;
    constructor(searchResult: java.util.List<any>, numberOfRows: number);
    getSearchResult(): java.util.List<any>;
    setSearchResult(searchResult: java.util.List<any>): void;
    getNumberOfRows(): number;
    setNumberOfRows(numberOfRows: number): void;
}
export declare abstract class Triggers {
    abstract getCalssName(): string;
    abstract getQueryName(): string;
    preQueryTrigger(searchCriteria: java.util.List<SearchCriteria>, orderCriteria: java.util.List<OrderCriteria>): void;
    postQueryTrigger(obj: any): void;
}
export interface ProxyCommadStackProvider {
    addCommand(cmd: any): any;
    getListOfCommand(): java.util.List<any>;
    clear(): any;
}
export interface ProxyObjectUpdateListener {
    listener(obj: ObjectControl, property: string): any;
}
export interface ProxyRepositoryCommand {
    prepare(): boolean;
}
