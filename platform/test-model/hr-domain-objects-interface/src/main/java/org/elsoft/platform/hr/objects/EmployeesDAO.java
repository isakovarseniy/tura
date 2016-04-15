package org.elsoft.platform.hr.objects;

import org.tura.platform.object.TuraObject;

import java.util.Date;

public interface EmployeesDAO extends TuraObject {
    public void setEmployeeId(Long employeeId);

    public Long getEmployeeId();

    public void setFirstName(String firstName);

    public String getFirstName();

    public void setLastName(String lastName);

    public String getLastName();

    public void setEmail(String email);

    public String getEmail();

    public void setPhoneNumber(String phoneNumber);

    public String getPhoneNumber();

    public void setHireDate(Date hireDate);

    public Date getHireDate();

    public void setSalary(Float salary);

    public Float getSalary();

    public void setCommissionPct(Float commissionPct);

    public Float getCommissionPct();

    public void setManagerId(Long managerId);

    public Long getManagerId();

    public void setDepartmentId(Long departmentId);

    public Long getDepartmentId();
}
