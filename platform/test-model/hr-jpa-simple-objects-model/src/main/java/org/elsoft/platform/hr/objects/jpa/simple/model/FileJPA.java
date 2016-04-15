package org.elsoft.platform.hr.objects.jpa.simple.model;

import org.tura.platform.object.persistence.PersistenceObject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "FileJPA")
@Table(name = "FILEJPA")
public class FileJPA extends PersistenceObject {
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
