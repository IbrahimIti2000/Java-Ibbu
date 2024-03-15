package bro;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class sele {
	public static void main(String[] args) {

		Map<String, Integer> h = new HashMap();

		String str = "hhhhhhhhhhhhhh hfkdljnljwdbl";

		h.put("Abc", 1);
		h.put("Abc", 2);
		h.put("ghi", 3);
		h.put("jkl", 4);
		h.put("mno", 5);
		h.put("pqr", 6);
		System.out.println(h);

		List<Entry<String, List<String>>> collect = h.entrySet().stream()
				.collect(Collectors.groupingBy(i -> i.getKey(),
						Collectors.mapping(o -> o.getKey(), Collectors.toList())))
				.entrySet().stream().sorted(Entry.comparingByKey()).collect(Collectors.toList());
		System.out.println(collect);

		List<Entry<String, Long>> collect2 = Arrays.stream(str.split("")).map(o -> o.toUpperCase())
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.collect(Collectors.toList());
		System.out.println(collect2);
		
		List<Entry<String,Long>> collect3 = Arrays.stream(str.split("")).filter(o->!o.isBlank()).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().collect(Collectors.toList());
		System.out.println(collect3);
	}

}
