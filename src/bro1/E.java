package bro1;

import java.util.HashMap;

public class E {

	public static void main(String[] args) {
		String h1 = "ABCDEFGHIAB";
		String s = h1.toUpperCase().trim();

		HashMap<Character, Integer> h = new HashMap<Character, Integer>();

		for (int i = 0; i < s.length(); i++) {
			if (h.containsKey(s.charAt(i))) {
				h.put(s.charAt(i), h.get(s.charAt(i)) + 1);
			} else {
				h.put(s.charAt(i), 1);
			}
		}
		for (int i = 0; i < s.length(); i++) {
			if (h.get(s.charAt(i)) == 1) {
				System.out.print(s.charAt(i));
//				break;
			}
		}

//		for (char c : s.toCharArray()) {
//			if (h.get(s.charAt(c)) == 1) {
//				System.out.println(s.charAt(c)+"   "+c);
//				break;
//			}
//		}

	}
}
