 package com.kn.utubeprograms;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int no = scan.nextInt();
		int temp =no;
		int rev = 0, rem;
		while(temp !=0) {
			rem = temp%10;
			rev = rev*10+rem;
			temp = temp/10;
		}
		if(no==rev) {
			System.out.println(no+ " is palindrome number");
		}else {
			System.out.println(no+ " is not a palindrome number");
		}
	}

}
