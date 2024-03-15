package bro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import bro1.Employee;

public class N {
	public static void main(String[] args) {
		Map<String, Integer> sal = new HashMap<String, Integer>();
		String str = "Hey Bro i Am Ibrahim";
		sal.put("Ibrahim", 35000);
		sal.put("Ibbu", 35000);
		sal.put("Yaseen", 45000);
		sal.put("Jaheer", 25000);
		sal.put("Saif", 15000);
		sal.put("Sartaj", 95000);
		sal.put("Satiesh", 55000);
		sal.put("Vinay", 95000);
		String i = "Heloo jdjjdb jdb";
//
//		Map<String, Long> collect = Arrays.stream(i.split("")).map(t -> t.toUpperCase()).filter(j -> !j.isBlank())
//				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//		System.out.println(collect);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
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
				.map(g -> g.stream().max(Comparator.comparing(Employee::getSalary)).orElse(null))
				.collect(Collectors.toList());

		for (Employee employee : collect) {
			System.out.println(employee.getDepartment() + "  " + employee.getName() + "  " + employee.getSalary());
		}
//		 for (List<Employee> list : collect) {
//			 for (Employee list2 : list) {
//				 System.out.println(list2.getDepartment());
//				
//			}
//			
//		}
//		List<List<Employee>> collect = map.collect(Collectors.toList());

//		for (List<Employee>  employee : collect) {
//			for (Employee list : employee) {
//				System.out.println(list.getName()+"  "+list.getDepartment());
//				
//			}
////			
//		}
//		Entry<Integer, List<String>> entry = sal.entrySet().stream()
//				.collect(Collectors.groupingBy(i -> i.getValue(),
////						Collectors.mapping(k -> k.getKey(), Collectors.toList())))
//				.entrySet().stream().sorted(Collections.reverseOrder(Entry.comparingByKey()))
//				.collect(Collectors.toList()).get(0);
////		System.out.println(entry);

	}
}
