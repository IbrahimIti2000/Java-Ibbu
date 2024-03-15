package bro;

import java.util.Arrays;
import java.util.List;

public class P {
	public static void main(String[] args) {
		List<String> s = Arrays.asList("Ibrahim", "Ibbu", "Hello");
		List<String> s1 = Arrays.asList("Yaseen", "Khan", "Jaheer");
		List<String> s2 = Arrays.asList("Anil", "Vinay", "Prakash");
		List<List<String>> s4 = Arrays.asList(s, s1, s2);
		for (List<String> list : s4) {
			for (String list2 : list) {
				for (int i = list2.length() - 1; i >= 0; i--) {
					System.out.print(list2.charAt(i));
				}
				System.out.println();
			}
		}
	}

}
