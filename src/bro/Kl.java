package bro;

import java.util.Scanner;

public class Kl {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			for (int j = num-1; j >= i; j--) {
				System.out.print("  ");
			}
			for (int k = 1; k<=i; k++) {
				System.out.print("U ");
			}
			for (int h = 2; h <=i ; h++) {
				System.out.print("B ");
				
			}
			System.out.println();
	}
		for (int i = 2; i <= num; i++) {
//			for (int j = num-1; j >= i; j--) {
//				System.out.print(" ");
//			}
//			for (int k = 1; k<=i; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
			for (int k = 2; k <= i; k++) {
				System.out.print("  ");
			}
			for (int j = num; j >= i; j--) {
				System.out.print("I ");
			}
			for (int l = num-1; l >= i; l--) {
				System.out.print("$ ");
			}
			System.out.println();

		}
	}
}
