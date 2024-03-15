package bro;

import java.util.Scanner;

public class REmo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s =sc.next();

		int coun = 1;
		for (int i = 0; i<=s.length() - 1; i++) {
			if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' ')) {
				coun++;
			}

		}
		System.out.println(coun);
	}

}
