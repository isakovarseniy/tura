/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2022 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.platform.uuiclient.model;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.lang.exception.ExceptionUtils;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.uuiclient.rest.EventDescription;

public class FullCalendarModel implements Serializable {

	private static final long serialVersionUID = -1486051813259570543L;

	private transient Logger logger = Logger.getLogger(FullCalendarModel.class.getName());

	private String modelId;

	private FullCalendarTriggers callback;

	private Date startParam;

	private Date endParam;

	private List<CalendarEvent> events;

	private CalendarOptions options;

	public FullCalendarModel() {
	}

	public FullCalendarModel(DataControl<?> dc, Object callback, String modelId) {
		this.setModelId(modelId);
		this.callback = (FullCalendarTriggers) callback;
	}

	public String getModelId() {
		return modelId;
	}

	public void setModelId(String modelId) {
		this.modelId = modelId;
	}

	public Date getStartParam() {
		return startParam;
	}

	public void setStartParam(Date startParam) {
		this.startParam = startParam;
	}

	public Date getEndParam() {
		return endParam;
	}

	public void setEndParam(Date endParam) {
		this.endParam = endParam;
	}

	public List<CalendarEvent> getEvents() {
		return events;
	}

	public void setEvents(List<CalendarEvent> events) {
		this.events = events;
	}

	public CalendarOptions getOptions() {
		return options;
	}

	public void setOptions(CalendarOptions options) {
		this.options = options;
	}

	
	public void onDataClick(EventDescription event) {
		try {
			if (callback != null) {
				callback.onDataClick(this,event);
			}

		} catch (TuraException e) {
			logger.log(Level.SEVERE, ExceptionUtils.getFullStackTrace(e));
		}

	}

	
	public void onDrop(EventDescription event) {
		try {
			if (callback != null) {
				callback.onDrop(this, event);
			}

		} catch (TuraException e) {
			logger.log(Level.SEVERE, ExceptionUtils.getFullStackTrace(e));
		}
	}

	
	public void load() {
		try {
			if (callback != null) {
				callback.load(this);
			}

		} catch (TuraException e) {
			logger.log(Level.SEVERE, ExceptionUtils.getFullStackTrace(e));
		}
	}

	public class CalendarEvent implements Serializable {
		private static final long serialVersionUID = -8079225325909634390L;

		private String id;
		private Date start;
		private Date end;
		private String title;
		private String display;
		private String groupId;
		private boolean editable = true;
		private boolean overlap = true;
		private boolean allDay = false;
		private boolean startEditable = true;
		private boolean durationEditable = true;
		private boolean resourceEditable = true;
		private String backgroundColor;
		private String borderColor;
		private String textColor;
		private String color;
		private String rendering;
		
		public String getRendering() {
			return rendering;
		}

		public void setRendering(String rendering) {
			this.rendering = rendering;
		}

		private Locale locale = Locale.getDefault();
		
		
		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public boolean isAllDay() {
			return allDay;
		}

		public void setAllDay(boolean allDay) {
			this.allDay = allDay;
		}

		public Locale getLocale() {
			return locale;
		}

		public void setLocale(Locale locale) {
			this.locale = locale;
		}


		public boolean isOverlap() {
			return overlap;
		}

		public void setOverlap(boolean overlap) {
			this.overlap = overlap;
		}

		public boolean isEditable() {
			return editable;
		}

		public void setEditable(boolean editable) {
			this.editable = editable;
		}

		public String getGroupId() {
			return groupId;
		}

		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}

		public String getDisplay() {
			return display;
		}

		public void setDisplay(String display) {
			this.display = display;
		}


		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public Date getStart() {
			return start;
		}

		public void setStart(Date start) {
			this.start = start;
		}

		public Date getEnd() {
			return end;
		}

		public void setEnd(Date end) {
			this.end = end;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		
		public boolean isStartEditable() {
			return startEditable;
		}

		public void setStartEditable(boolean startEditable) {
			this.startEditable = startEditable;
		}

		public boolean isDurationEditable() {
			return durationEditable;
		}

		public void setDurationEditable(boolean durationEditable) {
			this.durationEditable = durationEditable;
		}

		public boolean isResourceEditable() {
			return resourceEditable;
		}

		public void setResourceEditable(boolean resourceEditable) {
			this.resourceEditable = resourceEditable;
		}

		public String getBackgroundColor() {
			return backgroundColor;
		}

		public void setBackgroundColor(String backgroundColor) {
			this.backgroundColor = backgroundColor;
		}

		public String getBorderColor() {
			return borderColor;
		}

		public void setBorderColor(String borderColor) {
			this.borderColor = borderColor;
		}

		public String getTextColor() {
			return textColor;
		}

		public void setTextColor(String textColor) {
			this.textColor = textColor;
		}

		public Map<String, Object> toMap() {
			Map<String, Object> map = new HashMap<>();
			
			SimpleDateFormat sdf = new SimpleDateFormat( "yyyy-MM-dd'T'HH:mm:ss.SSSXXX" , locale);
			
			map.put("id", id);
			map.put("start", sdf.format(start));
			map.put("end", sdf.format(end));
			map.put("title", title);
			map.put("rendering", display);
			map.put("groupId", groupId);
			map.put("editable", editable);
			map.put("overlap", overlap);
			map.put("allDay", allDay);
			map.put("startEditable", startEditable);
			map.put("durationEditable", durationEditable);
			map.put("resourceEditable", resourceEditable);
			map.put("backgroundColor", backgroundColor);
			map.put("borderColor", borderColor);
			map.put("textColor", textColor);
			map.put("color",color);

			return map;
		}

	}

	public class CalendarOptions implements Serializable {

		private static final long serialVersionUID = 2138306983848621770L;

		private Date defaultDate;
		private boolean editable;
		private CalendarHeader header;

		public Date getDefaultDate() {
			return defaultDate;
		}

		public void setDefaultDate(Date defaultDate) {
			this.defaultDate = defaultDate;
		}

		public boolean isEditable() {
			return editable;
		}

		public void setEditable(boolean editable) {
			this.editable = editable;
		}

		public CalendarHeader getHeader() {
			return header;
		}

		public void setHeader(CalendarHeader header) {
			this.header = header;
		}

		public Map<String, Object> toMap() {
			Map<String, Object> map = new HashMap<>();
			SimpleDateFormat format = new SimpleDateFormat( "yyyy-MM-dd" , Locale.CANADA);
			map.put("defaultDate", format.format(defaultDate));
			map.put("editable", editable);
			if (header != null) {
				map.put("header", header.toMap());
			}
			return map;
		}

	}

	public class CalendarHeader implements Serializable {
		private static final long serialVersionUID = 2138306983848621770L;

		private String left;
		private String center;
		private String right;

		public String getLeft() {
			return left;
		}

		public void setLeft(String left) {
			this.left = left;
		}

		public String getCenter() {
			return center;
		}

		public void setCenter(String center) {
			this.center = center;
		}

		public String getRight() {
			return right;
		}

		public void setRight(String right) {
			this.right = right;
		}

		public Map<String, Object> toMap() {
			Map<String, Object> map = new HashMap<>();
			map.put("left", left);
			map.put("center", center);
			map.put("right", right);
			return map;
		}

	}

}
