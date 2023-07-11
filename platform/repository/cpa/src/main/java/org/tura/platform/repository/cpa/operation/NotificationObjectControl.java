/*
 * Tura - Application generation solution
 *
 * Copyright 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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

package org.tura.platform.repository.cpa.operation;

import org.tura.platform.repository.spa.OperationLevel;
import org.tura.platform.repository.spa.SpaControl;

public class NotificationObjectControl extends SpaControl{
	private String sourceId;
	private Object notificationSourceObject;
	private NotificationType notificationType;

	public Object getNotificationSourceObject() {
		return notificationSourceObject;
	}

	public void setNotificationSourceObject(Object notificationSourceObject) {
		this.notificationSourceObject = notificationSourceObject;
	}

	public NotificationObjectControl(Object object, Object key, OperationLevel level, String registryName) {
		super(object, key, level, registryName);
	}

	public String getSourceId() {
		return sourceId;
	}

	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	public NotificationType getNotificationType() {
		return notificationType;
	}

	public void setNotificationType(NotificationType notificationType) {
		this.notificationType = notificationType;
	}

	public enum NotificationType{
		INSERT,DELETE
	}
	
}
