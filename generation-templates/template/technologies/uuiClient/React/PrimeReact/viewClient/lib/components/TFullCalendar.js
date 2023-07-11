/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

import React from 'react';
import {TuraComponent} from "../core/TuraComponent";
import { FullCalendar } from 'primereact/fullcalendar';
import {Transformation} from "../core/Transformation";
import dayGridPlugin from '@fullcalendar/daygrid';
import timeGridPlugin from '@fullcalendar/timegrid';
import interactionPlugin from '@fullcalendar/interaction';
import '@fullcalendar/core/main.css';
import '@fullcalendar/daygrid/main.css';
import '@fullcalendar/timegrid/main.css';
import {EventExecuter} from "../core/EventExecutor";

export class TFullCalendar extends TuraComponent {

    constructor(props) {
        super(props);
        this.dataClick = this.dataClick.bind(this);
        this.eventDrop = this.eventDrop.bind(this);
    }

    dataClick(e){
        let eventDataClick = this.getEvent('react.onDataClickEvent');
        if ( typeof eventDataClick !== "undefined" && eventDataClick !== null){
            let date_ = this.getParameter( eventDataClick, "date");
            date_.value = e.date;

            new EventExecuter(eventDataClick, this.contextManager ).run(this,e);
        }
    }

    eventDrop(e){
        let eventDrop = this.getEvent('react.onDropEvent');
        if ( typeof eventDrop !== "undefined" && eventDrop !== null){
            let eventId = this.getParameter( eventDrop, "eventId");
            eventId.value = e.event.id;

            let start_ = this.getParameter( eventDrop, "start");
            start_.value = e.event.start;

            let end_ = this.getParameter( eventDrop, "end");
            end_.value = e.event.end;

            new EventExecuter(eventDrop, this.contextManager ).run(this,e);
        }
    }

    render() {
        if (!this.state.rendered) {
            return (
                <></>
            );
        }
        return (
          <FullCalendar id={this.id}  ref={(el) => this.calendar = el} events={this.state.values} options={this.state.options}/>

        );
    }


    componentPreProcessSate( obj){
        obj =  new Transformation().stylePreProcessor(obj);
        if ( typeof obj.options === "undefined" ||  obj.options === null){
            obj.options = [];
        }

        obj.options['plugins'] =[ dayGridPlugin, timeGridPlugin, interactionPlugin];

        obj.options['dateClick']=this.dataClick;
        obj.options['dateClick']=obj.options['dateClick'].bind(this);

        obj.options['eventDrop']=this.eventDrop;
        obj.options['eventDrop']=obj.options['eventDrop'].bind(this);

        if ( typeof obj.options['defaultView'] === "undefined" || obj.options['defaultView'] === null){
            obj.options['defaultView'] = 'dayGridMonth';
        }
        if ( typeof obj.options['defaultDate'] === "undefined" || obj.options['defaultDate'] === null){
            obj.options['defaultDate'] = new Date();
        }
        if ( typeof obj.options['header'] === "undefined" || obj.options['header'] === null){
            obj.options['header'] = {
                left: 'prev,next',
                center: 'title',
                right: 'dayGridMonth,timeGridWeek,timeGridDay'
            };
        }
        if ( typeof obj.options['editable'] === "undefined" || obj.options['editable'] === null){
            obj.options['editable'] = true;
        }

        return obj;
    }

}
