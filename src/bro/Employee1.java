package bro;

import java.util.ArrayList;
import java.util.List;

class Employee3 {

	int id;
	String name;
	int salary;

	public Employee3(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

}

public class Employee1 {
	public static void main(String[] args) {

		List<Employee3> emp = new ArrayList<Employee3>();

		emp.add(new Employee3(1, "Ibrahim", 95000));
		emp.add(new Employee3(2, "Jaheer", 35000));
		emp.add(new Employee3(3, "Mohmad", 65000));
		emp.add(new Employee3(4, "Yaseen", 85000));
		emp.add(new Employee3(5, "Vinay", 35000));

		emp.stream().filter(s -> s.salary > 50000).map(e -> e.id).forEach(System.out::println);

	}
}
