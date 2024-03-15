package bro1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Emp {

	public static void main(String[] args) {
		List<Employee> e = new ArrayList<Employee>();
		e.add(new Employee(1, "Ibrahim", "IT", 45000));
		e.add(new Employee(2, "Yaseen", "Mech", 55000));
		e.add(new Employee(3, "Ibbu", "CS", 65000));
		e.add(new Employee(4, "Jaheer", "AI", 805000));
		e.add(new Employee(5, "Saif", "AI", 95000));
		e.add(new Employee(6, "Sartj", "CONstruction", 75000));
		e.add(new Employee(7, "Vinay", "Fruit", 75000));
		e.add(new Employee(8, "Jinna", "Fruit", 95000));
		e.add(new Employee(9, "DM", "IT", 65000));
		e.add(new Employee(10, "Shishya2", "CS", 85000));
		e.add(new Employee(11, "andi", "Mech", 55000));
		e.add(new Employee(12, "Cricket", "IT", 95000));

		List<Employee> collect = e.stream().collect(Collectors.groupingBy(Employee::getDepartment)).values().stream()
				.map(dep -> dep.stream().max(Comparator.comparing(Employee::getSalary)).orElse(null))
				.collect(Collectors.toList());

		List<Employee> collect5 = e.stream().collect(Collectors.groupingBy(Employee::getDepartment)).values().stream()
				.map(dep -> dep.stream().max(Comparator.comparing(Employee::getSalary)).orElse(null))
				.sorted(Comparator.comparing(Employee::getId)).collect(Collectors.toList());
		

		List<Employee> collect3 = e.stream().collect(Collectors.groupingBy(Employee::getDepartment)).values().stream()
				.map(dep -> dep.stream().max(Comparator.comparing(Employee::getSalary)).orElse(null))
				.sorted(Comparator.comparing(Employee::getId)).collect(Collectors.toList());
		List<Employee> collect4 = collect3.stream().sorted(Comparator.comparing(Employee::getId))
				.collect(Collectors.toList());
		for (Employee employee : collect3) {
			System.out
					.println(employee.id + "  " + employee.Department + "  " + employee.name + "  " + employee.salary);

		}

		for (Employee employee : collect3) {
//			System.out
//					.println(employee.id + "  " + employee.Department + "  " + employee.name + "  " + employee.salary);
		}

		Map<Integer, List<Employee>> collect2 = e.stream().collect(Collectors.groupingBy(i -> i.salary));
		Map<String, Integer> sal = new HashMap<String, Integer>();
		String str = "Hey Bro i Am Ibrahim";
		sal.put("Ibrahim", 35000);
		sal.put("Ibbu", 35000);
		sal.put("Yaseen", 45000);
		sal.put("Jaheer", 25000);
		sal.put("Saif", 15000);
		sal.put("Sartaj", 95000);
		sal.put("Satiesh", 55000);
		sal.put("Vinay", 75000);
		Entry<Integer, List<String>> entry = sal.entrySet().stream()
				.collect(Collectors.groupingBy(t -> t.getValue(),
						Collectors.mapping(u -> u.getKey(), Collectors.toList())))
				.entrySet().stream().sorted(Collections.reverseOrder(Entry.comparingByKey()))
				.collect(Collectors.toList()).get(0);
//		System.out.println(entry);

	}
}
