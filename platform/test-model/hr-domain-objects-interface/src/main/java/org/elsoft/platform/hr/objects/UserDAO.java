package org.elsoft.platform.hr.objects;

import org.tura.platform.object.TuraObject;

public interface UserDAO extends TuraObject {
    public void setUserName(String userName);

    public String getUserName();

    public void setPassword(String password);

    public String getPassword();
}
