package bro;

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

public class Salary {
	public static void main(String[] args) {
		Map<String,Integer> sal = new HashMap<String, Integer>();
		String str="Hey Bro i Am Ibrahim";
		sal.put("Ibrahim", 35000);
		sal.put("Ibbu", 35000);
		sal.put("Yaseen", 45000);
		sal.put("Jaheer", 25000);
		sal.put("Saif", 15000);
		sal.put("Sartaj", 95000);
		sal.put("Satiesh", 55000);
		sal.put("Vinay", 75000);

	List<Entry<String,Long>> collect = Arrays.stream(str.toUpperCase().split("")).filter(e->!e.isBlank()).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).
			entrySet().stream().sorted(Entry.comparingByKey()).collect(Collectors.toList());
		
//	System.out.println(collect);
//	  List<Entry<Integer,List<String>>> collect = sal.entrySet().stream().collect(Collectors.groupingBy(e->e.getValue(),Collectors.mapping(i->i.getKey(), Collectors.toList()))).
//		entrySet().stream().sorted(Collections.reverseOrder(Entry.comparingByKey())).collect(Collectors.toList());
////	  System.out.println(collect);
//	Map<Integer,List<Integer>> collect2 = sal.values().stream().collect(Collectors.groupingBy(e->e.compareTo(e)));
////	System.out.println(collect2);
	
Entry<Integer, List<String>> entry = sal.entrySet().stream().collect(Collectors.groupingBy(i->i.getValue(),Collectors.mapping(u->u.getKey(), Collectors.toList())))
	.entrySet().stream().sorted(Collections.reverseOrder(Entry.comparingByKey())).collect(Collectors.toList()).get(0);
	System.out.println(entry);
	}

}
