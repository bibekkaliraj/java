package com.techaxis.test;

import java.util.Scanner;

public class Addition {
	public static void main(String[] args) {
		int a, b, z;
		System.out.println("Enter the value a and b");
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		b = scan.nextInt();

		z = a + b;
		System.out.println("The sum " + a + " and " + b + " is " + (z));
	}

}
