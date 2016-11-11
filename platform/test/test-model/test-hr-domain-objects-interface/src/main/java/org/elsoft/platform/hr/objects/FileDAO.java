package org.elsoft.platform.hr.objects;

import org.tura.platform.object.TuraObject;

public interface FileDAO extends TuraObject {
    public void setFileName(String fileName);

    public String getFileName();

    public void setDirectory(Boolean directory);

    public Boolean getDirectory();

    public void setSize(Integer size);

    public Integer getSize();
}
