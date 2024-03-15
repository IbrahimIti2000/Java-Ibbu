package bro;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee {

	String name;
	int salary;
	int expe;

	public Employee(String name, int salary, int expe) {
		super();
		this.name = name;
		this.salary = salary;
		this.expe = expe;
	}

}

public class Lamda {
	public static void main(String[] args) {
		List<Employee> em = new ArrayList<Employee>();
		Employee emp = new Employee("Ibrahim", 35000, 3);
		em.add(emp);
		em.add(new Employee("Ibbu", 9000, 2));
		em.add(new Employee("Yaseen", 900000, 6));
		em.add(new Employee("Yasu", 7800, 7));
		em.add(new Employee("Ibru", 65700, 8));
		// Predicate<Employee> p = e -> e.salary > 35000;
		Function<Employee, Integer> f = e -> {
			int s = e.salary;
			if (s > 35000 && s < 60000) {
				return (s * 10 / 100);
			} else {
				return s+10000;
			}
		};

		for (Employee employee : em) {
			Integer apply = f.apply(employee);
			System.out.println(apply);

		}
	}

}
