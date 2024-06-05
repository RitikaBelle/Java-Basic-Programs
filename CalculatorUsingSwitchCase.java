package com.kn.utubeprograms;

import java.util.Scanner;

public class CalculatorUsingSwitchCase {

	public static void main(String[] args) {
		String yn;
		do {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter first number: ");
			int n1 = scan.nextInt();
			System.out.println("Enter second number: ");
			int n2 = scan.nextInt();
			System.out.println("Select symbol(+,-,*,/)");
			String symbol = scan.next();
			int res;
			switch (symbol) {
			case "+":
				res = n1 + n2;
				System.out.println(res);
				break;
			case "-":
				res = n1 - n2;
				System.out.println(res);
				break;
			case "*":
				res = n1 * n2;
				System.out.println(res);
				break;
			case "/":
				res = n1 / n2;
				System.out.println(res);
				break;
			default:
				System.out.println("Invalid symbo;");
			}
			System.out.println("Do you want to continue(Press y for Yes and n for No)");
			yn = scan.next();
		} while (yn.equals("y") || yn.equals("Y"));

	}

}
