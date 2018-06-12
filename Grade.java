package com.techaxis.test;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		int mark;
		String Grade;
		System.out.println("Enter your mark");
		Scanner obj = new Scanner(System.in);
		mark = obj.nextInt();
	

		if (mark >= 80) {
			Grade = "A+";
		}

		else if (mark >= 75) {
			Grade = "B";
		} else if (mark >= 65) {
			Grade = "C";
		} else {

			Grade = "D";
		}

		System.out.println("Grade= " + Grade);
	}
}

	