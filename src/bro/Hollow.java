package bro;

import java.util.Scanner;

public class Hollow {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
//	for (int i = 1; i <=num; i++) {
//			for (int j = 1; j <=i; j++) {
//				if (j==1|| i==j || i==num) {
//					System.out.print("*");
//				}
//				else {
//					System.out.print(" ");
//				}
//				
//			}
//			System.out.println();}

		for (int i = 1; i <= num; i++) {
			for (int j = num - 1; j >= i; j--) {
				System.out.print(" ");

			}
			for (int l = 1; l <= i; l++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
