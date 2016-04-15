package org.elsoft.platform.hr.objects.complex.model;

import org.elsoft.platform.hr.objects.simple.model.File;

import java.util.Collection;

public class FileObject extends File {
    private Collection<FileObject> fileObject;

    public Collection<FileObject> getFileObject() {
        return fileObject;
    }

    public void setFileObject(Collection<FileObject> fileObject) {
        this.fileObject = fileObject;
    }
}
