/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2015, Arseniy Isakov
 *
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
 *
 * Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.elsoft.platform.hr.objects;

import org.tura.platform.persistence.TuraObject;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "FileDAO")
@Table(name = "FILEDAO")
public class FileDAO extends TuraObject implements Serializable {
    private static final long serialVersionUID = -1L;
    @Column(name = "FILENAME")
    private String fileName;
    @Column(name = "DIRECTORY")
    private Boolean directory;
    @Column(name = "SIZE")
    private Integer size;

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setDirectory(Boolean directory) {
        this.directory = directory;
    }

    public Boolean getDirectory() {
        return directory;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getSize() {
        return size;
    }
}
