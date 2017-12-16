import {DataProvider, Repository, SearchRequest, SearchResult} from "repo-core/repo-core";
import {OrderCriteria, SearchCriteria} from "dc-commons/dc-commons";
import {deserialize, serialize} from "json-typescript-mapper/index";


export interface Client{
    target (url:string):Client;
    path(path : string):Client;
    request( type:string):Client;
    post(type : any):Response;
    get():Response;
}

interface Response{
    getStatus() :ResponseStatus;
    getBody() : JSON;
}

enum ResponseStatus{
    OK,
    ERROR
}


export class RestClientRepository implements Repository {

    private client : Client;
    private base : string;


    public RestClientRepository(base : string, client : Client){
        this.base = base;
        this.client=client;
    }

    public addProvider(provider: DataProvider, objectClass: string): any{
        throw new Error("Unsupported operation");
    }

    public addCommand(provider: DataProvider, dataClass: string): any{
        throw new Error("Unsupported operation");
    }

    public create(objectClass: string): any{
        var obj : any ;

        eval("obj=new " + objectClass + "()");
        var response : Response = this.client.target(this.base + "rest/repository/create")
            .path(objectClass).request("application/json").get();

        if (response.getStatus() == ResponseStatus.OK ){
            response.getBody()
            return deserialize( obj,response.getBody());
        }else{
            throw new Error("Bad response");
        }


    }

    public find(searchCriteria: java.util.List<SearchCriteria>, orderCriteria: java.util.List<OrderCriteria>, startIndex: number, endIndex: number, objectClass: string): SearchResult{

        var request :SearchRequest = new SearchRequest();
        request.setSearch(searchCriteria);
        request.setOrder(orderCriteria);
        request.setStartIndex(startIndex);
        request.setEndIndex(endIndex);
        request.setObjectClass(objectClass);

        for( let i= 0; i <  searchCriteria.size(); i++ ) {
            let sc = searchCriteria.get(i);
            sc.setClassName( sc.getValue().getClass().getName());
            sc.setValue(sc.getValue().toString());
        }

        var response : Response = this.client.target(this.base+ "rest/repository/find")
            .request("application/json").post(serialize(request));

        if (response.getStatus() == ResponseStatus.OK ){
           var list : java.util.ArrayList<any> = new java.util.ArrayList();
           var json:JSON =  response.getBody();

           for ( let key in json ){
               let serialObj: JSON = json[key];
               let clazz  = json[key+"_type"];
               list.add(deserialize(clazz,serialObj));
           }
           var size =  json["size"];

           var result : SearchResult = new SearchResult(list,size);
           return result;

        }else{
            throw new Error("Bad response");
        }
    }

    public insert(obj: any, objectClass: string): any{
        throw new Error("Unsupported operation");
    }

    public remove(obj: any, objectClass: string): any{
        throw new Error("Unsupported operation");
    }

    public applyChanges(changes: java.util.List<any>): any{


        var arrayofChanges  ={};
        var rows = 0;

        for( let i= 0; i <  changes.size(); i++ ) {

            let sc = changes.get(i);
            let changeRow = {};

            changeRow[0]=i+"_type";
            changeRow[1]=sc.getClass();
            arrayofChanges[rows]=changeRow;
            rows++;

            changeRow = {};

            changeRow[0]=i;
            changeRow[1]=sc;
            arrayofChanges[rows]=changeRow;
            rows++;
        }

        var response : Response = this.client.target(this.base + "rest/repository/applyChanges")
            .request("application/json").post(serialize(arrayofChanges));

        if (response.getStatus() != ResponseStatus.OK ){
            throw new Error("Bad response");
        }
    }
}