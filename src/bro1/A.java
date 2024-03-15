package bro1;

import java.util.HashMap;
import java.util.Map;

public class A {
	public static void main(String[] args) {

		String s = "Hello I Am Ibrahim";
		String[] split = s.toUpperCase().trim().split("");
		char[] charArray = s.toCharArray();
		char[] charArray2 = s.toUpperCase().toCharArray();
		
		
		
		Map<Character, Integer> m = new HashMap<Character, Integer>();

//		for (int i = 0; i < split.length; i++) {
//			
//			if (s.charAt(i)!=' ') {
//				if (m.containsKey(s.charAt(i))) {
//					m.put(s.charAt(i), m.get(s.charAt(i)) + 1);
//				} else {
//					m.put(s.charAt(i), 1);
//				}
//	
//			}
//			System.out.println(m);
//	
//		}
//				
//			}
//		}
//
//	}
		StringBuffer f=new StringBuffer(s);
		System.out.println(f.reverse());

		for (char c : charArray2) {

			if (m.containsKey(c)) {
				m.put(c, m.get(c) + 1);
			} else if (c != ' ') {
				m.put(c, 1);
			}

		}
		System.out.println(m);

	}

}
