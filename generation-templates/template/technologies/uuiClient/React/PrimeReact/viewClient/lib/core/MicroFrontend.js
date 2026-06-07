/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2026 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

import React from "react";


export class MicroFrontend extends React.Component{
    constructor( props){
      super(props);
      this.libraryURL = props.libraryURL;
      this.application = props.application
      this.params = props.params;
      this.history = null;
    }

   componentDidMount() {
    window.isMicroUIFrame = true;
    const scriptId = 'micro-frontend-script-'+this.application;

    const renderMicroFrontend = () => {
      const method = 'render'+this.application;
      const containerId = this.application+"-container";

      window[method](containerId, this.history, this.params);
    };

    if (document.getElementById(scriptId)) {
      renderMicroFrontend();
      return;
    }
    

    fetch(this.libraryURL+"/asset-manifest.json")
      .then((res) => res.json())
      .then((manifest) => {
        const script = document.createElement("script");
        script.id = scriptId;
        script.crossOrigin = "";
        script.src = manifest.files["main.js"];
        script.onload = () => {
          renderMicroFrontend();
        };
        document.head.appendChild(script);
      });

    return () => {
      window['unmount'+this.application] && window[ 'unmount'+ this.application ](this.application+"-container");
    };
  }

  render(){
    const containerId = this.application+"-container";

    return <main id={ containerId } />;
 }

}
