package com.kn.utubeprograms;

public class LeapYear {

	public static void main(String[] args) {
//		int year = 2017;
//		if(year%4==0) {
//			if(year%100==0) {
//				if(year%400==0) {
//					System.out.println("leap year");
//				}else {
//					System.out.println("Not a leap year");
//				}
//			}else {
//				System.out.println("It is a leap year");
//			}
//		}else {
//			System.out.println("Not a leap Year");
//		}
//		or
		int year = 2016;
		if((year%400==0) || (year%4==0 && year%100!=0)) {
			System.out.println("leap year");
		}else {
			System.out.println("Not a leap year");
		}
	}

}
