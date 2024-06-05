package com.kn.utubeprograms;

import java.util.Scanner;

public class FactorialUsingRecursion {
//using return
//	 int fact = 1,res;
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//	    System.out.println("Enter a number");
//		int no=scan.nextInt();
//		FactorialUsingRecursion ob = new FactorialUsingRecursion();
//		int res=ob.calcFact(no);
//		System.out.println("factorial of "+no+ " is " +res);
//	}
//	int calcFact(int no) {
//		if(no>=1) {
//			fact= fact*no;
//			calcFact(no-1);
//			
//		}
//		return fact;
//		
//	}
	
//	without return type 
	 static int fact = 1;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int no=scan.nextInt();
		FactorialUsingRecursion ob = new FactorialUsingRecursion();
		ob.calcFact(no);
		System.out.println("factorial of "+no+ " is " +fact);
	}
	void calcFact(int no) {
		if(no>=1) {
			fact= fact*no;
			calcFact(no-1);
			
		}
	

}
}
