/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import Keycloak from "keycloak-js";

export class KeyCloakInitializer {

    initKeyCloak(fn){

        let kc_config = '{\n' +
            '  "realm": "sales-analyzer",\n' +
            '  "auth-server-url": "http://kc:8080/auth",\n' +
            '  "ssl-required": "external",\n' +
            '  "resource": "sa-admin-client",\n' +
            '  "credentials": {\n' +
            '    "secret": "68e09d49-853d-4f80-8cfd-758e51983ef2"\n' +
            '  },\n' +
            '  "confidential-port": 0\n' +
            '}';


        var config = JSON.parse(kc_config);
        let url_  = config['auth-server-url'];
        let realm_ = config['realm'];
        let clientId_ = config['resource'];
        let clientSecret_=(config['credentials'] || {})['secret'];

        let keycloak = Keycloak({url:url_,realm:realm_, clientId : clientId_, credentials:{secret:clientSecret_}});

        keycloak.init({onLoad: 'login-required',"checkLoginIframe" : false}).success((auth) => {

            if (!auth) {
                window.location.reload();
            } else {
                console.info("Authenticated");
            }


            localStorage.setItem("react-token", keycloak.token);
            localStorage.setItem("react-refresh-token", keycloak.refreshToken);

            fn();

            setTimeout(() => {
                keycloak.updateToken(70).success((refreshed) => {
                    if (refreshed) {
                        console.debug('Token refreshed' + refreshed);
                    } else {
                        console.warn('Token not refreshed, valid for '
                            + Math.round(keycloak.tokenParsed.exp + keycloak.timeSkew - new Date().getTime() / 1000) + ' seconds');
                    }
                }).error(() => {
                    console.error('Failed to refresh token');
                });


            }, 60000)

        }).error(() => {
            console.error("Authenticated Failed");
        });
    }


}
