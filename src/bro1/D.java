package bro1;

import java.util.Arrays;
import java.util.Scanner;

public class D {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);

//		int a = 20, b = 50;
//		System.out.println(a + "  " + b);
//		int t = a;
//		a = b;
//		b = t;
		// a=a+b;//70
//		b=a-b;//70-50=20
//		a=a-b;

//		a = a * b;
//		b = a / b;
//		a = a / b;

//		System.out.println(a + "  " + b);

		int num = 123456789;
//		int sum=0;
//		
//		while (num>0) {
//			int a=num%10;
//			sum=sum+a;
//			num=num/10;
//			
//			
//		}
		
		
		
		String string = Integer.toString(num);
		int[] i=new int[string.length()];
		for (int j = 0; j < string.length(); j++) {
			i[j]=string.charAt(j)-'0';
		}
		for (int j : i) {
			System.out.println(j);
		}
//		System.out.println(sum);
		String v = String.valueOf(num);
//		System.out.println(v);
		

//		for (int i = v.length() - 1; i >= 0; i--) {
//			System.out.print(v.charAt(i));
//			sum=sum+v.charAt(i);
//
//		}
//		
//		for (int i = 0; i <v.length()-1; i++) {
//			sum=sum+v.charAt(i);
//		}
//		System.out.println(sum);
		
//		System.out.println(num % 10 + "  " + num / 10);
//		int rev = 0;
//		while (num > 0) {
//			rev = rev * 10 + num % 10;
//			num = num / 10;
//		}
//		System.out.println(rev);

	}

}
