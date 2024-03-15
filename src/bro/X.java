package bro;

import java.util.StringTokenizer;

public class X {
	public static void main(String[] args) {
		String i="Hey";
		String[] split = i.split(" ");
		int count=0;
		for (String string : split) {
			count++;
		System.out.println(string);
			
		}
		System.out.println(count);
		StringTokenizer s=new StringTokenizer(i," ");
		while(s.hasMoreTokens()) {
			String h = s.nextToken();
//			System.out.println(h);
			for (int j =h.length()-1; j>=0; j--) {
				System.out.print(h.charAt(j));
				
			}
			
		}
	}

}
