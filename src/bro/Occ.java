package bro;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Occ {
	public static void main(String[] args) {
		int[] n = { 2, 3, 1, 4, 2, 3, 4, 4, 5, 5, 7, 8, 7, 9, 2, 4, 4, 10 };
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
//
//		for (int i : n) {
//
//			if (hm.containsKey(i)) {
//				hm.put(i, hm.get(i) + 1);
//			} else {
//				hm.put(i, 1);
//			}
//
//		}
//
//		for (Integer i : hm.keySet()) {
//			// System.out.println(i+" "+hm.get(i));
//		}
//
//		System.out.println(hm.get(4));
//		System.out.println(hm.containsKey(0));
//		System.out.println(hm.keySet());

		for (int i : n) {

			if (hm.containsKey(i)) {
				hm.put(i, hm.get(i) + 1);
			} else {
				hm.put(i, 1);
			}

		}

		for (Integer i : hm.keySet()) {
			System.out.println(i + "  " + hm.get(i));

		}
		
		Map<Integer,Long> collect = Arrays.stream(n).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(collect);
		
		for (Integer i : collect.keySet()) {
			System.out.println(i+"    "+collect.get(i));
		}

	}

}
