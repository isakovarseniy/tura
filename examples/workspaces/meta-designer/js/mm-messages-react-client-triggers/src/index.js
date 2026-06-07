/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2026 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

import 'primereact/resources/themes/nova/theme.css';
import 'commons-react-client-triggers/style/css/mm-designer.css';
import {MainLangLayout} from "./layout/MainLangLayout";
import {MessageLayout} from "./layout/MessageLayout";
import {AvailableMessagesListLayout} from "./layout/AvailableMessagesListLayout";
import {MessageDetailsLayout} from "./layout/MessageDetailsLayout";
import { PopulLanguageSelector } from './layout/PopulLanguageSelector';


export class InitMMMessagesTriggers{

    init( registry,fn){
        registry.addComponentLayoutManager("e333048d-2341-4127-8aa6-f3dda8924325",new MainLangLayout());
        registry.addComponentLayoutManager("0d905b5c-9aee-4dcc-aae6-92fa32d30c62",new PopulLanguageSelector());
        registry.addComponentLayoutManager("c2a0bdb0-a95f-49c4-a340-7e7ee8e52b6d",new MessageLayout());
        registry.addComponentLayoutManager("6aebe0dc-fc31-450e-8219-1912de9518a8",new AvailableMessagesListLayout());
        registry.addComponentLayoutManager("3f464e38-4630-46cb-9b54-56574553ea95",new MessageDetailsLayout());
        registry.setPluginMode();

    }
}
