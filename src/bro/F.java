package bro;

import java.util.Scanner;

public class F {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
		int num = 754548638;
		int esum = 0, osum = 0;
		while (num > 0) {
			int i = num % 10;

			if (i % 2 == 0) {
				esum++;
			} else {
				osum++;
			}
			num = num / 10;

		}
		System.out.println(esum);
		System.out.println("kdls");
		System.out.println(osum);

	}

}
