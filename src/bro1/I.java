package bro1;

import java.util.Scanner;

public class I {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to the Calculator!");

		System.out.print("Enter the first number: ");
		System.out.println();
		double num1 = scanner.nextDouble();

		System.out.print("Enter the second number: ");

		System.out.println();
		double num2 = scanner.nextDouble();

		System.out.println("Enter the operation you want to perform: ");
		System.out.println("1. Addition (+)");
		System.out.println("2. Subtraction (-)");
		System.out.println("3. Multiplication (*)");
		System.out.println("4. Division (/)");
		System.out.println("5. Squre Root (^)");
		System.out.println();

		int operation = scanner.nextInt();

		double result;

		switch (operation) {
		case 1:
			result = num1 + num2;
			System.out.println("The sum of " + num1 + " and " + num2 + " is " + result);
			break;
		case 2:
			result = num1 - num2;
			System.out.println("The difference between " + num1 + " and " + num2 + " is " + result);
			break;
		case 3:
			result = num1 * num2;
			System.out.println("The product of " + num1 + " and " + num2 + " is " + result);
			break;
		case 4:
			if (num2 == 0) {
				System.out.println("Error: Cannot divide by zero!");
				return;

			}
			result = num1 / num2;
			System.out.println("The quotient of " + num1 + " and " + num2 + " is " + result);
			break;
		case 5:
			result = num1 - num2;
			System.out.println("The difference between " + num1 + " and " + num2 + " is " + result);
			break;
		default:
			System.out.println("Error: Invalid operation!");
			return;
		}

		scanner.close();
	}
}
