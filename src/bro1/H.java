package bro1;

import java.util.HashMap;
import java.util.Map;

public class H {
	public static void main(String[] args) {

		String s = "aaabbbccdddd";

		Map<Character, Integer> h = new HashMap<Character, Integer>();

		for (int i = 0; i < s.length(); i++) {
			if (h.containsKey(s.charAt(i))) {
				h.put(s.charAt(i), h.get(s.charAt(i)) + 1);
			} else {
				h.put(s.charAt(i), 1);
			}
		}
		
		h.forEach((y,e)->System.out.print(y+""+e));
		
	}
}
