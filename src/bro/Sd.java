package bro;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Sd {
	public static void main(String[] args) {

		String[] atr = { "Ibrahim B Iti", "Ibbu", "JAheer", "YAseen Iti" };
		String str = "Ibrahim igfh";
		String string = Arrays.stream(atr).collect(Collectors.toList()).stream()
				.reduce((w1, w2) -> w1.length() > w2.length() ? w1 : w2).get();
		System.out.println(string);
		List<String> collect = Arrays.stream(str.split("")).map(i -> i.toUpperCase()).filter(o -> !o.isBlank())
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(p -> p.getValue() >= 1).map(y -> y.getKey()).collect(Collectors.toList())
				.stream().limit(1).collect(Collectors.toList());

	System.out.println(collect);

		int[] num = { 12, 11, 5, 9, 11, 2, 8, 21, 1 ,22,90};

		List<Integer> collect2 = Arrays.stream(num).boxed().sorted(Collections.reverseOrder()).skip(1).limit(1)
				.collect(Collectors.toList());
//		System.out.println(collect2);
//
//		for (int i = 0; i < num.length - 1; i++) {
//			for (int j = 0; j < num.length - 1; j++) {
//				if (num[j] > num[j + 1]) {
//					int temp = num[j];
//					num[j] = num[j + 1];
//					num[j + 1] = temp;
//
//				}
//
//			}
//
//		}
////		System.out.println(Arrays.toString(num));
//		
//		System.out.println(num[num.length-2]);
		
		
		List<String> collect3 = Arrays.stream(num).boxed().map(o->o+"").filter(i->i.startsWith("1")).collect(Collectors.toList());
				
System.out.println(collect3);
	}
}
