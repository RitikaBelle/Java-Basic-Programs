package com.kn.utubeprograms;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int no = scan.nextInt();
		int t1 = no;
		int leng = 0;
		while (t1 != 0) {
			leng = leng + 1;
			t1 = t1 / 10;
		}
		int t2 = no, rem;
		int arm = 0;
		while (t2 != 0) {
			int mul = 1;
			rem = t2 % 10;
			for (int i = 1; i <= leng; i++) {
				mul = mul * rem;

			}
			arm = arm + mul;
			t2 = t2 / 10;
		}
		if (arm == no) {
			System.out.println(no + " is armstrong");
		} else {
			System.out.println(no + " is not armstrong");
		}

	}

}