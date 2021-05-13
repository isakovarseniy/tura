/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

import {registry} from "../plugin/Registry";

export class Transformation{

   stylePreProcessor( obj ){
       let style = obj.style;
       let className = obj.className;
       if ( typeof obj.id !== "undefined"){
           let customizer = registry.getElementCustomizer(obj.id);
           if ( typeof customizer !== "undefined" && customizer !== null){
               if (typeof customizer.style !== "undefined" && customizer.style !== null){
                   style = customizer.style;
               }
               if (typeof customizer.className !== "undefined" && customizer.className !== null){
                   className = customizer.className;
               }


           }
       }

       if ( style === ""){
           style = {};
       }else{
           if (style !== null && typeof style === "string" ) {
               style  = this.convertString2CSS(style);
           }
       }
       obj.style = style;
       obj.className = className;
       return obj;

   }

    stylePostProcessor(obj){
        if (obj.style !== null &&  typeof obj.style !== "undefined"){
            obj.style = JSON.stringify(obj.style);
            obj.style = obj.style.substr(1);
            obj.style = obj.style.slice(0, -1)
        }
        return obj;
    }



    menuPreProcessor( items, context){
       for ( let item of items){
           if ( typeof item.items !== "undefined"){
               this.menuPreProcessor(item.items,context);
           }
           if (typeof item.url !== "undefined" && item.url !== null ){
               if ( typeof  item.pr === "undefined"){
                   item.pr = true;
                   item.url=this.buildUrl(context ,item.url) ;
               }
           }
        }
    }

    buildUrl(context,url ){
       if ( typeof  url !== "undefined" && url !== null ){
           if (url.startsWith("http")){
               return url;
           }
           if (url.startsWith("+")){
               return url.substring(1);
           }
           return context+url;

       }else{
           return "";
       }
    }


    convertString2CSS( input){
        var result = {},
            attributes = input.split(';');

        for (var i = 0; i < attributes.length; i++) {
            var entry = attributes[i].split(':');
            var key = entry.splice(0,1)[0];
            result[key.trim()] = entry.join(':');
        }
        return result;
    }

}
