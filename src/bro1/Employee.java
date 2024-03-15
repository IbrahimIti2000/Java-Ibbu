package bro1;

import java.io.Serializable;

public class Employee implements Serializable {

	int id;
	String name;
	String Department;
	int salary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Employee() {

	}

	public Employee(int id, String name, String department, int salary) {
		super();
		this.id = id;
		this.name = name;
		Department = department;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", Department=" + Department + ", salary=" + salary + "]";
	}
	

}
