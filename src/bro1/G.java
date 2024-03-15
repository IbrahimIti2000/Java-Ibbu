package bro1;

import java.util.Scanner;

public class G {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s= "I s d d f j k l";
//
		int count = 1;
//		System.out.println(s.length()-1);
		for (int i = 0; i < s.length(); i++) {
			if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' ')) {
				count++;
			}
		}
		System.out.println(count);
//		int cou = 1;
//		String l="";
//		//char h=' ';
//		
//		for (int i = 1; i < str.length(); i++) {
//			if ((str.charAt(i) == ' ') && (str.charAt(i+1) !=' ')) {
//				cou++;
//				//l=l+str.charAt(i);
//				
//			}
//
//		}
//		System.out.println(cou);
	}
	
}
