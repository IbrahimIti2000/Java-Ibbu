package bro;

import java.util.StringTokenizer;

public class O {
	public static void main(String[] args) {
		String w="hey bro I am Ibrahim";
		StringTokenizer s=new StringTokenizer(w," ");
		while(s.hasMoreTokens()) {
			String d = s.nextToken();	
			for (int i = d.length()-1; i>=0; i--) {
				System.out.print(d.charAt(i));
				
			}
		}
	}

}
