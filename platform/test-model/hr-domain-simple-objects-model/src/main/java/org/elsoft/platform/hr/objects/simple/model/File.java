package org.elsoft.platform.hr.objects.simple.model;

import org.elsoft.platform.hr.objects.FileDAO;

import org.tura.platform.object.model.DomainObject;

public class File extends DomainObject implements FileDAO {
    private String fileName;
    private Boolean directory;
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
