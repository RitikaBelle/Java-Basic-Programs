package com.kn.utubeprograms;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		//using third variable
//		int a = 10, b = 20;
//		int t;
//		t = a;
//		a = b;
//		b = t;
//		System.out.println("a: "+a);
//		System.out.println("b: "+b);

		
//		without using third variable
		int a = 10, b = 20;
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("a: "+a);
		System.out.println("b: "+b);
//		a = 10+20 = 30
//		b = 30-20 = 10
//		a = 30-10 = 20
//		so a = 20 and b = 10
	}

}
