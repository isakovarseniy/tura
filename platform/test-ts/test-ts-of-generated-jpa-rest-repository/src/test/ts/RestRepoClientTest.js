import "jdk/bundle";
import { expect } from "chai";
import { One2One1B, One2One1A } from "ts-test-objects-serialization/ts-test-objects-serialization";
import { ProxyRepository } from "ts-test-objects-repository-proxy/ts-test-objects-repository-proxy";
import { SearchCriteria } from "dc-commons/dc-commons";
import { RestClientRepository } from "repo-client/RestClientRepository";
import { ResponseStatus as HTTPResponseStatus } from "repo-client/RestClientRepository";
import axios from 'axios/index';
function getRepository() {
    var qqq = new One2One1A();
    var url = "http://127.0.0.1:8080/test-objects-restservice-repository-1.0/";
    var commandStack = new java.util.ArrayList();
    return new ProxyRepository(new RestClientRepository(url, new NodeClient()), new StackProvider(commandStack));
}
export class StackProvider {
    constructor(commandStack) {
        this.commandStack = commandStack;
    }
    addCommand(cmd) {
        this.commandStack.add(cmd);
    }
    getListOfCommand() {
        return this.commandStack;
    }
    clear() {
        this.commandStack.clear();
    }
}
export class ServerResponse {
    setStatus(status) {
        this.status = status;
    }
    getStatus() {
        return this.status;
    }
    setBody(body) {
        this.body = JSON.parse(body);
    }
    getBody() {
        return this.body;
    }
}
export class NodeClient {
    target(url) {
        var lastChar = url.substr(url.length - 1);
        if (lastChar == "/") {
            this.baseUrl = url;
        }
        else {
            this.baseUrl = url + "/";
        }
        return this;
    }
    path(path) {
        var firsttChar = path.charAt(0);
        var p;
        if (firsttChar == "/") {
            p = path;
        }
        else {
            p = "/" + path;
        }
        this.baseUrl = this.baseUrl + p;
        return this;
    }
    request(requestType) {
        this.requestType = requestType;
        return this;
    }
    post(body) {
        var httpResponse;
        axios.post(this.baseUrl, body, {
            headers: {
                'Content-Type': 'application/json',
            }
        })
            .then(function (response) {
            httpResponse = new ServerResponse();
            httpResponse.setStatus(HTTPResponseStatus.OK);
            httpResponse.setBody(response.data);
        })
            .catch(function (response) {
            httpResponse = new ServerResponse();
            httpResponse.setStatus(HTTPResponseStatus.ERROR);
        });
        return httpResponse;
    }
    get() {
        var httpResponse;
        axios.get(this.baseUrl, {
            headers: {
                'Content-Type': 'application/json',
            }
        })
            .then(function (response) {
            httpResponse = new ServerResponse();
            httpResponse.setStatus(HTTPResponseStatus.OK);
            httpResponse.setBody(response.data);
        })
            .catch(function (response) {
            httpResponse = new ServerResponse();
            httpResponse.setStatus(HTTPResponseStatus.ERROR);
        });
        return httpResponse;
    }
}
describe('t0000_One2One1', () => {
    var repository = getRepository();
    var o1 = (repository.create(One2One1A["__class"]));
    var o2 = (repository.create(One2One1B["__class"]));
    o1.setOne2One1B(o2);
    repository.insert(o1, One2One1A["__class"]);
    repository.applyChanges(null);
    var result = repository.find(new java.util.ArrayList(), new java.util.ArrayList(), 0, 0, One2One1B["__class"]);
    expect(1).to.equals(result.getSearchResult().size());
    result = repository.find(new java.util.ArrayList(), new java.util.ArrayList(), 0, 0, One2One1A["__class"]);
    expect(1).to.equals(result.getSearchResult().size());
    var sc = new SearchCriteria();
    sc.setName("objId");
    sc.setComparator("EQ");
    sc.setValue(o1.getObjId());
    var search = new java.util.ArrayList();
    search.add(sc);
    result = repository.find(search, new java.util.ArrayList(), 0, 0, One2One1A["__class"]);
    expect(1).to.equals(result.getSearchResult().size());
    repository.remove(result.getSearchResult().get(0), One2One1A["__class"]);
    repository.applyChanges(null);
    result = repository.find(new java.util.ArrayList(), new java.util.ArrayList(), 0, 0, One2One1B["__class"]);
    expect(0).to.equals(result.getSearchResult().size());
    result = repository.find(new java.util.ArrayList(), new java.util.ArrayList(), 0, 0, One2One1A["__class"]);
    expect(0).to.equals(result.getSearchResult().size());
});
//# sourceMappingURL=RestRepoClientTest.js.map