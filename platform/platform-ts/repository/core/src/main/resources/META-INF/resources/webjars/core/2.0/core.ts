/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
import "jdk/bundle";
import {SearchCriteria} from "dc-commons/commons";
import {OrderCriteria} from "dc-commons/commons";

export class DomainObject implements TuraObject {
    /*private*/ objId : number;

    /*private*/ parentId : number;

    /*private*/ objType : string;

    /*private*/ objStatus : string;

    /*private*/ createDate : Date;

    /*private*/ updateDate : Date;

    /*private*/ activeDate : Date;

    /*private*/ expiredDate : Date;

    public getObjId() : number {
        return this.objId;
    }

    public setObjId(objId : number) {
        this.objId = objId;
    }

    public getParentId() : number {
        return this.parentId;
    }

    public setParentId(parentId : number) {
        this.parentId = parentId;
    }

    public getObjType() : string {
        return this.objType;
    }

    public setObjType(objType : string) {
        this.objType = objType;
    }

    public getObjStatus() : string {
        return this.objStatus;
    }

    public setObjStatus(objStatus : string) {
        this.objStatus = objStatus;
    }

    public getCreateDate() : Date {
        return this.createDate;
    }

    public setCreateDate(createDate : Date) {
        this.createDate = createDate;
    }

    public getUpdateDate() : Date {
        return this.updateDate;
    }

    public setUpdateDate(updateDate : Date) {
        this.updateDate = updateDate;
    }

    public getActiveDate() : Date {
        return this.activeDate;
    }

    public setActiveDate(activeDate : Date) {
        this.activeDate = activeDate;
    }

    public getExpiredDate() : Date {
        return this.expiredDate;
    }

    public setExpiredDate(expiredDate : Date) {
        this.expiredDate = expiredDate;
    }

    constructor() {
        if(this.objId===undefined) this.objId = null;
        if(this.parentId===undefined) this.parentId = null;
        if(this.objType===undefined) this.objType = null;
        if(this.objStatus===undefined) this.objStatus = null;
        if(this.createDate===undefined) this.createDate = null;
        if(this.updateDate===undefined) this.updateDate = null;
        if(this.activeDate===undefined) this.activeDate = null;
        if(this.expiredDate===undefined) this.expiredDate = null;
    }
}
DomainObject["__class"] = "org.tura.platform.object.model.DomainObject";
DomainObject["__interfaces"] = ["org.tura.platform.object.TuraObject"];




/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export interface TuraObject {
    getObjType() : string;

    setObjType(objType : string);

    getObjStatus() : string;

    setObjStatus(objStatus : string);

    getCreateDate() : Date;

    setCreateDate(createDate : Date);

    getUpdateDate() : Date;

    setUpdateDate(updateDate : Date);

    getActiveDate() : Date;

    setActiveDate(activeDate : Date);

    getExpiredDate() : Date;

    setExpiredDate(expiredDate : Date);

    getObjId() : number;

    setObjId(objId : number);
}


/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export class BasicRepository implements Repository {
    /*private*/ providerTable : java.util.HashMap<string, DataProvider> = <any>(<java.util.HashMap<string, DataProvider>>new java.util.HashMap<string, DataProvider>());

    /*private*/ cmdHash : java.util.HashMap<string, DataProvider> = <any>(<java.util.HashMap<string, DataProvider>>new java.util.HashMap<string, DataProvider>());

    public addProvider(provider : DataProvider, objectClass : string) {
        this.providerTable.put(objectClass, provider);
    }

    public addCommand(provider : DataProvider, dataClass : string) {
        this.cmdHash.put(dataClass, provider);
    }

    /*private*/ findprovider(objectClass : string) : DataProvider {
        let provider : DataProvider = this.providerTable.get(objectClass);
        if(provider == null) throw new RepositoryException("No provider for " + objectClass);
        return provider;
    }

    public create(objectClass : string) : any {
        let provider : DataProvider = this.findprovider(objectClass);
        return provider.create(objectClass);
    }

    public find(searchCriteria : java.util.List<SearchCriteria>, orderCriteria : java.util.List<OrderCriteria>, startIndex : number, endIndex : number, objectClass : string) : SearchResult {
        let provider : DataProvider = this.findprovider(objectClass);
        return provider.find(searchCriteria, orderCriteria, startIndex, endIndex, objectClass);
    }

    public applyChanges(changes : java.util.List<any>) {
        try {
            for(let index149=changes.iterator();index149.hasNext();) {
                let change = index149.next();
                {
                    let provider : DataProvider = this.cmdHash.get(/* getName */(c => c["__class"]?c["__class"]:c["name"])((<any>change.constructor)));
                    let cmd : Command = provider.getCommand(/* getName */(c => c["__class"]?c["__class"]:c["name"])((<any>change.constructor)));
                    cmd.execute(change);
                }
            }
        } catch(e) {
            throw new RepositoryException(e);
        };
    }

    /**
     * 
     * @param {*} obj
     * @param {string} objectClass
     */
    public insert(obj : any, objectClass : string) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * 
     * @param {*} obj
     * @param {string} objectClass
     */
    public remove(obj : any, objectClass : string) {
        throw new java.lang.UnsupportedOperationException();
    }

    constructor() {
    }
}
BasicRepository["__class"] = "org.tura.platform.repository.core.BasicRepository";
BasicRepository["__interfaces"] = ["org.tura.platform.repository.core.Repository"];




/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export interface Command {
    execute(data : any) : any;
}


/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export interface DataProvider {
    create(objectClass : string) : any;

    find(searchCriteria : java.util.List<SearchCriteria>, orderCriteria : java.util.List<OrderCriteria>, startIndex : number, endIndex : number, objectClass : string) : SearchResult;

    setRepository(repository : Repository);

    init();

    setExtendedQuery(query : ExtendedQuery);

    setTriggers(triggers : Triggers);

    getCommand(clazz : string) : Command;
}


/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export interface ExtendedQuery {
    getCalssName() : string;

    getQueryName() : string;

    findObjectsQuery() : string;

    findNumberOfRowsQuery() : string;
}


/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export interface ObjectControl {
    getAttached() : boolean;

    getWrappedObject() : any;

    getKey() : string;

    getAttributes() : java.util.Map<string, any>;

    addListener(listener : ProxyObjectUpdateListener);

    setStackProvider(stackProvider : ProxyCommadStackProvider);

    clone() : ObjectControl;
}


/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export interface PrImaryKeyStrategy {
    generatePk(o : any);
}


/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export interface Repository {
    addProvider(provider : DataProvider, objectClass : string);

    addCommand(provider : DataProvider, dataClass : string);

    create(objectClass : string) : any;

    find(searchCriteria : java.util.List<SearchCriteria>, orderCriteria : java.util.List<OrderCriteria>, startIndex : number, endIndex : number, objectClass : string) : SearchResult;

    insert(obj : any, objectClass : string);

    remove(obj : any, objectClass : string);

    applyChanges(changes : java.util.List<any>);
}


/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export class RepositoryException extends Error {
    static serialVersionUID : number = 5383770471837645080;

    public constructor(e? : any) {
        if(((e != null && e instanceof <any>Error) || e === null)) {
            let __args = Array.prototype.slice.call(arguments);
            super(e); this.message=e;
            (<any>Object).setPrototypeOf(this, RepositoryException.prototype);
        } else if(((typeof e === 'string') || e === null)) {
            let __args = Array.prototype.slice.call(arguments);
            let message : any = __args[0];
            super(message); this.message=message;
            (<any>Object).setPrototypeOf(this, RepositoryException.prototype);
        } else throw new Error('invalid overload');
    }
}
RepositoryException["__class"] = "org.tura.platform.repository.core.RepositoryException";
RepositoryException["__interfaces"] = ["java.io.Serializable"];




/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export interface Rule {
    execute();
}


/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export class SearchRequest {
    /*private*/ search : java.util.List<SearchCriteria>;

    /*private*/ order : java.util.List<OrderCriteria>;

    /*private*/ startIndex : number;

    /*private*/ endIndex : number;

    /*private*/ objectClass : string;

    public getStartIndex() : number {
        return this.startIndex;
    }

    public setStartIndex(startIndex : number) {
        this.startIndex = startIndex;
    }

    public getEndIndex() : number {
        return this.endIndex;
    }

    public setEndIndex(endIndex : number) {
        this.endIndex = endIndex;
    }

    public getObjectClass() : string {
        return this.objectClass;
    }

    public setObjectClass(objectClass : string) {
        this.objectClass = objectClass;
    }

    public getSearch() : java.util.List<SearchCriteria> {
        return this.search;
    }

    public setSearch(search : java.util.List<SearchCriteria>) {
        this.search = search;
    }

    public getOrder() : java.util.List<OrderCriteria> {
        return this.order;
    }

    public setOrder(order : java.util.List<OrderCriteria>) {
        this.order = order;
    }

    constructor() {
        if(this.search===undefined) this.search = null;
        if(this.order===undefined) this.order = null;
        if(this.startIndex===undefined) this.startIndex = null;
        if(this.endIndex===undefined) this.endIndex = null;
        if(this.objectClass===undefined) this.objectClass = null;
    }
}
SearchRequest["__class"] = "org.tura.platform.repository.core.SearchRequest";



/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export class SearchResult {
    /*private*/ searchResult : java.util.List<any>;

    /*private*/ numberOfRows : number;

    public constructor(searchResult : java.util.List<any>, numberOfRows : number) {
        if(this.searchResult===undefined) this.searchResult = null;
        if(this.numberOfRows===undefined) this.numberOfRows = 0;
        this.searchResult = searchResult;
        this.numberOfRows = numberOfRows;
    }

    public getSearchResult() : java.util.List<any> {
        return this.searchResult;
    }

    public setSearchResult(searchResult : java.util.List<any>) {
        this.searchResult = searchResult;
    }

    public getNumberOfRows() : number {
        return this.numberOfRows;
    }

    public setNumberOfRows(numberOfRows : number) {
        this.numberOfRows = numberOfRows;
    }
}
SearchResult["__class"] = "org.tura.platform.repository.core.SearchResult";



/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export abstract class Triggers {
    public abstract getCalssName() : string;

    public abstract getQueryName() : string;

    public preQueryTrigger(searchCriteria : java.util.List<SearchCriteria>, orderCriteria : java.util.List<OrderCriteria>) {
    }

    public postQueryTrigger(obj : any) {
    }
}
Triggers["__class"] = "org.tura.platform.repository.core.Triggers";



/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export interface ProxyCommadStackProvider {
    addCommand(cmd : any);

    getListOfCommand() : java.util.List<any>;

    clear();
}


/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export interface ProxyObjectUpdateListener {
    listener(obj : ObjectControl, property : string);
}


/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export interface ProxyRepositoryCommand {
    prepare() : boolean;
}


