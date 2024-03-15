package bro;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Nth {
	public static void main(String[] args) {
		Map<String, Integer> sal = new HashMap();
		Map<String, Integer> sal1 = new HashMap();

		sal.put("Ibrahim", 35000);
		sal.put("Ibbu", 35000);
		sal.put("Yaseen", 45000);
		sal.put("Jaheer", 25000);
		sal.put("Saif", 15000);
		sal.put("Sartaj", 95000);
		sal.put("Satiesh", 55000);
		sal.put("Vinay", 75000);
//	List<Entry<String, Integer>> collect =sal.entrySet().stream().sorted(Entry.comparingByValue()).collect(Collectors.toList());

//		Entry<Integer, List<String>> sala = sala(4, sal);
//		System.out.println(sala);
		
	Map<Integer,List<Entry<String,Integer>>> collect = sal.entrySet().stream().collect(Collectors.groupingBy(o->o.getValue()));
	 
//		System.out.println(collect);
		
	Entry<Integer, List<String>> entry = sal.entrySet().stream().collect(Collectors.groupingBy(e->e.getValue(),Collectors.mapping(o->o.getKey(), Collectors.toList())))
	.entrySet().stream().sorted(Collections.reverseOrder(Entry.comparingByKey())).collect(Collectors.toList()).get(1);
	
		
//System.out.println(entry);

List<Entry<Integer,List<String>>> collect2 = sal.entrySet().stream().collect(Collectors.groupingBy(e->e.getValue(),Collectors.mapping(o->o.getKey(), Collectors.toList())))
.entrySet().stream().sorted(Collections.reverseOrder(Entry.comparingByKey())).collect(Collectors.toList());
System.out.println(collect2);
Map<Integer,List<String>> collect3 = sal.entrySet().stream().collect(Collectors.groupingBy(e->e.getValue(),Collectors.mapping(o->o.getKey(), Collectors.toList())));
//System.out.println(collect3);
	}

//	public static Entry<Integer, List<String>> sala(int id, Map<String, Integer> m) {
//
////		 		return m.entrySet().stream().sorted(Entry.comparingByValue()).collect(Collectors.toList()).get(id);
//		return m.entrySet().stream()
//				.collect(Collectors.groupingBy(e -> e.getValue(),
//						Collectors.mapping(i -> i.getKey(), Collectors.toList())))
//				.entrySet().stream().sorted(Collections.reverseOrder(Entry.comparingByKey()))
//				.collect(Collectors.toList()).get(id);
//
//	}

}
