package org.tura.platform.hr.objects;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;

import org.tura.platform.persistence.TuraObject;

@Entity(name = "EmployeesDAO")
@Table(name = "EMPLOYEESDAO")
public class EmployeesDAO extends TuraObject {
	@Column(name = "EMPLOYEEID")
	private Long employeeId;
	@Column(name = "FIRSTNAME")
	private String firstName;
	@Column(name = "LASTNAME")
	private String lastName;
	@Column(name = "EMAIL")
	private String email;
	@Column(name = "PHONENUMBER")
	private String phoneNumber;
	@Temporal(javax.persistence.TemporalType.TIMESTAMP)
	@Column(name = "HIREDATE")
	private Date hireDate;
	@Column(name = "SALARY")
	private Float salary;
	@Column(name = "COMMISSIONPCT")
	private Float commissionPct;
	@Column(name = "MANAGERID")
	private Long managerId;
	@Column(name = "DEPARTMENTID")
	private Long departmentId;

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setSalary(Float salary) {
		this.salary = salary;
	}

	public Float getSalary() {
		return salary;
	}

	public void setCommissionPct(Float commissionPct) {
		this.commissionPct = commissionPct;
	}

	public Float getCommissionPct() {
		return commissionPct;
	}

	public void setManagerId(Long managerId) {
		this.managerId = managerId;
	}

	public Long getManagerId() {
		return managerId;
	}

	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}

	public Long getDepartmentId() {
		return departmentId;
	}
}
