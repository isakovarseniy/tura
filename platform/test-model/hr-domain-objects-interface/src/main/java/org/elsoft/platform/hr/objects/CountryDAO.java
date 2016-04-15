package org.elsoft.platform.hr.objects;

import org.tura.platform.object.TuraObject;

public interface CountryDAO extends TuraObject {
    public void setName(String name);

    public String getName();
}
