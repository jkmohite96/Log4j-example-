package com.namedquerydemo;

import javax.persistence.*;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@NamedNativeQueries({
	@NamedNativeQuery(
			name = Employee.SHOW_ALL_EMPLOYEES,
			query = Employee.SHOW_ALL_EMPLOYEES_QUERY)
})
jfjjhgk

@Entity
@Table(name = "EMPLOYEE_HQL")
public class Employee {
	
	public static final String SHOW_ALL_EMPLOYEES = "SHOW_ALL_EMPLOYEES";
	public static final String SHOW_ALL_EMPLOYEES_QUERY = "select * from Employee_HQL";
	
	@Id
	@GeneratedValue(strategy =GenerationType.TABLE )
	private int empid;

	@Column
	private String fname;
	
	@Column
	private String lname;
	
	@Column
	private int salary;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String fname, String lname, int salary) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.salary = salary;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", fname=" + fname + ", lname=" + lname + ", salary=" + salary + "]";
	}

	
	
}
