package com.techaxis.test;

import java.util.Scanner;

public class Test {
	public static void main(String[] arg) {
		Test obj = new Test();
		obj.sqaureOrNot();
		obj.youngestOldest();
		obj. salary();
	}

	private void sqaureOrNot() {
		int l, b;
		System.out.println("Take the vaule of l and b of rectangle");
		Scanner obj = new Scanner(System.in);
		l = obj.nextInt();
		b = obj.nextInt();
		if (l == b) {
			System.out.println("It is sqaure");
		} else {
			System.out.println("It isnot square");

		}

	}

	private void youngestOldest() {
		int firstperson, secondperson, thirdperson;
		System.out.println("Enter the age of 3 person");
		Scanner obj = new Scanner(System.in);
		firstperson = obj.nextInt();
		secondperson = obj.nextInt();
		thirdperson = obj.nextInt();

		if (firstperson > secondperson && firstperson > thirdperson) {
			System.out.println("oldest " + firstperson);
		}

		else if (secondperson > firstperson && secondperson > thirdperson) {
			System.out.println("oldest " + secondperson);
		} else {
			System.out.println(" oldest " + thirdperson);
		}

		if (firstperson < secondperson && firstperson < thirdperson) {
			System.out.println("youngest " + firstperson);
		}

		else if (secondperson < firstperson && secondperson < thirdperson) {
			System.out.println("youngest " + secondperson);
		} else {
			System.out.println(" youngest " + thirdperson);
		}
	}
	private void salary() {
		float salary,totalsalary;
		int year_of_sevice;
		
		System.out.println("Enter salary");
		System.out.println("Enter the service of year");
		Scanner obj = new Scanner(System.in);
		salary=obj.nextInt();
		int year_of_service = obj.nextInt();
		if(year_of_service>=5)
		{
			totalsalary=salary+((float)5/100)*salary;
			System.out.println("total salary= " + totalsalary);
		}
		else
		{  
			totalsalary=salary;
			System.out.println("total salary= " + totalsalary);
		}
}
	}
