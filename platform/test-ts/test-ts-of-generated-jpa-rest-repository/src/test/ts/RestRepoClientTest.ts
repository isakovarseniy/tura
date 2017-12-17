import "jdk/bundle";
import { assert, expect } from "chai";
import {One2One1B,One2One1A} from "ts-test-objects-serialization/ts-test-objects-serialization";
import {ProxyRepository} from "ts-test-objects-repository-proxy/ts-test-objects-repository-proxy";
import {ProxyCommadStackProvider, SearchResult} from "repo-core/repo-core";
import {OrderCriteria, SearchCriteria} from "dc-commons/dc-commons";
import {RestClientRepository} from "repo-client/RestClientRepository";
import {Client as HTTPClient} from "repo-client/RestClientRepository";
import {Response as HTTPResponse} from "repo-client/RestClientRepository";
import {ResponseStatus as HTTPResponseStatus} from "repo-client/RestClientRepository";
import axios from 'axios/index';


function  getRepository():ProxyRepository{
    var url:string  = "http://127.0.0.1:8080/test-objects-restservice-repository-1.0/";
    var commandStack:java.util.ArrayList<any> = new java.util.ArrayList();
    return  new ProxyRepository(
        new RestClientRepository(url,new NodeClient()),
        new StackProvider(commandStack)
    );
}


export class StackProvider implements ProxyCommadStackProvider{

    private commandStack :java.util.List<any>;

    public constructor (commandStack :java.util.List<any>){
        this.commandStack = commandStack;
    }

     public addCommand( cmd: any) {
        this.commandStack.add(cmd);
    }

     public getListOfCommand () :java.util.List<any> {
        return this.commandStack;
    }

     public clear()  {
        this.commandStack.clear();
     }

}

export class ServerResponse implements HTTPResponse{
    private status : HTTPResponseStatus;
    private body : JSON;

    setStatus(status : HTTPResponseStatus){
        this.status = status;
    }

    getStatus(): HTTPResponseStatus{
        return this.status;

    }

    setBody(body:string){
        this.body = JSON.parse(body);
    }

    getBody(): JSON{
        return this.body;

    }

}


export class NodeClient implements HTTPClient{

    private baseUrl : string;
    private requestType : string;


    target(url: string):HTTPClient{
        var lastChar = url.substr(url.length - 1);
        if (lastChar == "/"){
            this.baseUrl=url;
        }else{
            this.baseUrl=url+"/";
        }
        return <HTTPClient><any>this;
    }
    path(path: string): HTTPClient{
        var firsttChar = path.charAt(0);
        var p;
        if (firsttChar == "/"){
            p = path;
        }else{
            p = "/"+path;
        }
        this.baseUrl = this.baseUrl+p;

        return <HTTPClient><any>this;
    }
    request(requestType: string): HTTPClient{
        this.requestType = requestType;
        return <HTTPClient><any>this;
    }
    post(body: any): HTTPResponse{
        var httpResponse:ServerResponse;



        axios.post(this.baseUrl,body,{
            headers: {
                'Content-Type': 'application/json',
            }
        })
            .then(function(response){
                httpResponse = new ServerResponse();
                httpResponse.setStatus(HTTPResponseStatus.OK);
                httpResponse.setBody(response.data);
            })
            .catch(function(response){
                httpResponse = new ServerResponse();
                httpResponse.setStatus(HTTPResponseStatus.ERROR);
            })

        return httpResponse;
    }
    get(): HTTPResponse{

        var httpResponse:ServerResponse;

        axios.get(this.baseUrl,{
            headers: {
                'Content-Type': 'application/json',
            }
        })
            .then(function(response){
                httpResponse = new ServerResponse();
                httpResponse.setStatus(HTTPResponseStatus.OK);
                httpResponse.setBody(response.data);
            })
            .catch(function(response){
                httpResponse = new ServerResponse();
                httpResponse.setStatus(HTTPResponseStatus.ERROR);
            })

        return httpResponse;
    }
}


describe('t0000_One2One1', () => {
    var repository :ProxyRepository  = getRepository();

    var o1 : One2One1A = <One2One1A> (repository.create(One2One1A["__class"]));

    var o2:One2One1B = <One2One1B> (repository.create(One2One1B["__class"]));

    o1.setOne2One1B(o2);

    repository.insert(o1, One2One1A["__class"]);

    repository.applyChanges(null);

    var result: SearchResult  = repository.find(new java.util.ArrayList<SearchCriteria>(), new java.util.ArrayList<OrderCriteria>(), 0, 0, One2One1B["__class"]);
    expect(1).to.equals(result.getSearchResult().size());

    result = repository.find(new java.util.ArrayList<SearchCriteria>(), new java.util.ArrayList<OrderCriteria>(), 0, 0, One2One1A["__class"]);
    expect(1).to.equals(result.getSearchResult().size());

    var sc:SearchCriteria = new SearchCriteria();
    sc.setName("objId");
    sc.setComparator("EQ");
    sc.setValue(o1.getObjId());
    var search : java.util.ArrayList<SearchCriteria>= new java.util.ArrayList<SearchCriteria>();
    search.add(sc);
    result = repository.find(search, new java.util.ArrayList<OrderCriteria>(), 0, 0, One2One1A["__class"]);
    expect(1).to.equals(result.getSearchResult().size());



    repository.remove(result.getSearchResult().get(0), One2One1A["__class"]);

    repository.applyChanges(null);

    result = repository.find(new java.util.ArrayList<SearchCriteria>(), new java.util.ArrayList<OrderCriteria>(), 0, 0, One2One1B["__class"]);
    expect(0).to.equals(result.getSearchResult().size());

    result = repository.find(new java.util.ArrayList<SearchCriteria>(), new java.util.ArrayList<OrderCriteria>(), 0, 0, One2One1A["__class"]);
    expect(0).to.equals(result.getSearchResult().size());



});
