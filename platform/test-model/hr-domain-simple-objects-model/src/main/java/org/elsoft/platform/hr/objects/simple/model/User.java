package org.elsoft.platform.hr.objects.simple.model;

import org.elsoft.platform.hr.objects.UserDAO;

import org.tura.platform.object.model.DomainObject;

public class User extends DomainObject implements UserDAO {
    private String userName;
    private String password;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}
