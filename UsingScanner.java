package com.kn.utubeprograms;

import java.util.Scanner;

public class UsingScanner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = scan.next();
		System.out.println("Enter your age: ");
		int age = scan.nextInt();
		System.out.println("Enetr your gender: ");
		char gender = scan.next().charAt(0);
		System.out.println("Enter your phone no: ");
		long phoneno = scan.nextLong();
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Gender: "+gender);
		System.out.println("Phoneno: "+phoneno);

	}

}
