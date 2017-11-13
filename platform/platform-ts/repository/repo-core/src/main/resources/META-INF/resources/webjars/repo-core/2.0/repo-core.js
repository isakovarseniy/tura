/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
import "jdk/bundle";
export class DomainObject {
    getObjId() {
        return this.objId;
    }
    setObjId(objId) {
        this.objId = objId;
    }
    getParentId() {
        return this.parentId;
    }
    setParentId(parentId) {
        this.parentId = parentId;
    }
    getObjType() {
        return this.objType;
    }
    setObjType(objType) {
        this.objType = objType;
    }
    getObjStatus() {
        return this.objStatus;
    }
    setObjStatus(objStatus) {
        this.objStatus = objStatus;
    }
    getCreateDate() {
        return this.createDate;
    }
    setCreateDate(createDate) {
        this.createDate = createDate;
    }
    getUpdateDate() {
        return this.updateDate;
    }
    setUpdateDate(updateDate) {
        this.updateDate = updateDate;
    }
    getActiveDate() {
        return this.activeDate;
    }
    setActiveDate(activeDate) {
        this.activeDate = activeDate;
    }
    getExpiredDate() {
        return this.expiredDate;
    }
    setExpiredDate(expiredDate) {
        this.expiredDate = expiredDate;
    }
    constructor() {
        if (this.objId === undefined)
            this.objId = null;
        if (this.parentId === undefined)
            this.parentId = null;
        if (this.objType === undefined)
            this.objType = null;
        if (this.objStatus === undefined)
            this.objStatus = null;
        if (this.createDate === undefined)
            this.createDate = null;
        if (this.updateDate === undefined)
            this.updateDate = null;
        if (this.activeDate === undefined)
            this.activeDate = null;
        if (this.expiredDate === undefined)
            this.expiredDate = null;
    }
}
DomainObject["__class"] = "org.tura.platform.object.model.DomainObject";
DomainObject["__interfaces"] = ["org.tura.platform.object.TuraObject"];
/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export class BasicRepository {
    constructor() {
        /*private*/ this.providerTable = new java.util.HashMap();
        /*private*/ this.cmdHash = new java.util.HashMap();
    }
    addProvider(provider, objectClass) {
        this.providerTable.put(objectClass, provider);
    }
    addCommand(provider, dataClass) {
        this.cmdHash.put(dataClass, provider);
    }
    /*private*/ findprovider(objectClass) {
        let provider = this.providerTable.get(objectClass);
        if (provider == null)
            throw new RepositoryException("No provider for " + objectClass);
        return provider;
    }
    create(objectClass) {
        let provider = this.findprovider(objectClass);
        return provider.create(objectClass);
    }
    find(searchCriteria, orderCriteria, startIndex, endIndex, objectClass) {
        let provider = this.findprovider(objectClass);
        return provider.find(searchCriteria, orderCriteria, startIndex, endIndex, objectClass);
    }
    applyChanges(changes) {
        try {
            for (let index149 = changes.iterator(); index149.hasNext();) {
                let change = index149.next();
                {
                    let provider = this.cmdHash.get(/* getName */ (c => c["__class"] ? c["__class"] : c["name"])(change.constructor));
                    let cmd = provider.getCommand(/* getName */ (c => c["__class"] ? c["__class"] : c["name"])(change.constructor));
                    cmd.execute(change);
                }
            }
        }
        catch (e) {
            throw new RepositoryException(e);
        }
        ;
    }
    /**
     *
     * @param {*} obj
     * @param {string} objectClass
     */
    insert(obj, objectClass) {
        throw new java.lang.UnsupportedOperationException();
    }
    /**
     *
     * @param {*} obj
     * @param {string} objectClass
     */
    remove(obj, objectClass) {
        throw new java.lang.UnsupportedOperationException();
    }
}
BasicRepository["__class"] = "org.tura.platform.repository.core.BasicRepository";
BasicRepository["__interfaces"] = ["org.tura.platform.repository.core.Repository"];
/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export class RepositoryException extends Error {
    constructor(e) {
        if (((e != null && e instanceof Error) || e === null)) {
            let __args = Array.prototype.slice.call(arguments);
            super(e);
            this.message = e;
            Object.setPrototypeOf(this, RepositoryException.prototype);
        }
        else if (((typeof e === 'string') || e === null)) {
            let __args = Array.prototype.slice.call(arguments);
            let message = __args[0];
            super(message);
            this.message = message;
            Object.setPrototypeOf(this, RepositoryException.prototype);
        }
        else
            throw new Error('invalid overload');
    }
}
RepositoryException.serialVersionUID = 5383770471837645080;
RepositoryException["__class"] = "org.tura.platform.repository.core.RepositoryException";
RepositoryException["__interfaces"] = ["java.io.Serializable"];
/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export class SearchRequest {
    getStartIndex() {
        return this.startIndex;
    }
    setStartIndex(startIndex) {
        this.startIndex = startIndex;
    }
    getEndIndex() {
        return this.endIndex;
    }
    setEndIndex(endIndex) {
        this.endIndex = endIndex;
    }
    getObjectClass() {
        return this.objectClass;
    }
    setObjectClass(objectClass) {
        this.objectClass = objectClass;
    }
    getSearch() {
        return this.search;
    }
    setSearch(search) {
        this.search = search;
    }
    getOrder() {
        return this.order;
    }
    setOrder(order) {
        this.order = order;
    }
    constructor() {
        if (this.search === undefined)
            this.search = null;
        if (this.order === undefined)
            this.order = null;
        if (this.startIndex === undefined)
            this.startIndex = null;
        if (this.endIndex === undefined)
            this.endIndex = null;
        if (this.objectClass === undefined)
            this.objectClass = null;
    }
}
SearchRequest["__class"] = "org.tura.platform.repository.core.SearchRequest";
/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export class SearchResult {
    constructor(searchResult, numberOfRows) {
        if (this.searchResult === undefined)
            this.searchResult = null;
        if (this.numberOfRows === undefined)
            this.numberOfRows = 0;
        this.searchResult = searchResult;
        this.numberOfRows = numberOfRows;
    }
    getSearchResult() {
        return this.searchResult;
    }
    setSearchResult(searchResult) {
        this.searchResult = searchResult;
    }
    getNumberOfRows() {
        return this.numberOfRows;
    }
    setNumberOfRows(numberOfRows) {
        this.numberOfRows = numberOfRows;
    }
}
SearchResult["__class"] = "org.tura.platform.repository.core.SearchResult";
/* Generated from Java with JSweet 2.0.1-SNAPSHOT - http://www.jsweet.org */
export class Triggers {
    preQueryTrigger(searchCriteria, orderCriteria) {
    }
    postQueryTrigger(obj) {
    }
}
Triggers["__class"] = "org.tura.platform.repository.core.Triggers";
//# sourceMappingURL=repo-core.js.map