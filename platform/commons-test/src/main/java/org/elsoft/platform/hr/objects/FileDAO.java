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
