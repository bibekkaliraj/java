package com.techaxis.test;

import java.util.Scanner;

public class PracticeJava {
	public static void main(String[] arg) {
		PracticeJava obj = new PracticeJava();
		// obj.Greatest();
		// obj.digitAdd();
		// obj.reverseNumber();
		// obj.Name();
		// obj.Fact();
		// obj.Matric();
		// obj.decimalBinary();
		// obj.binaryDecimal();
		//obj.whileLoop();
		// obj.doWhile();
           obj.forLoop();
	}
	/*
	 * 
	 * private void Greatest() { int a, b, c; Scanner obj = new Scanner(System.in);
	 * System.out.println("Enter value of a "); a = obj.nextInt();
	 * System.out.println("Enter value of b "); b = obj.nextInt();
	 * System.out.println("Enter value of c "); c = obj.nextInt(); if (a > b) { if
	 * (a > c) { System.out.println("Greatest value is " + a);
	 * 
	 * } else { System.out.println("Greatest value is " + c); } } else if (b > c) {
	 * System.out.println("Greatest value is " + b);
	 * 
	 * } else { System.out.println("Greatest value is " + c); }
	 * 
	 * }
	 * 
	 * 
	 * /* private void digitAdd() { int n, sum = 0, reminder = 0; Scanner obj = new
	 * Scanner(System.in); System.out.println("Enter the numbers"); n =
	 * obj.nextInt(); while (n != 0) { reminder = n % 10; sum = sum + reminder; n =
	 * n / 10;
	 * 
	 * } System.out.println("The sum of digits " + sum); }
	 */

	/*
	 * private void reverseNumber() { int p = 0, n, reverse = 0, reminder;
	 * System.out.println("Enter the number to reverse"); Scanner obj = new
	 * Scanner(System.in); n = obj.nextInt(); p = n; while (n != 0) { reminder = n %
	 * 10; reverse = reverse * 10 + reminder; n = n / 10; }
	 * System.out.println("The reverse number is " + reverse);
	 * 
	 * if (p == reverse) { System.out.println("Given number is palindrome");
	 * 
	 * } else { System.out.println("Given number is not palindrome");
	 * 
	 * } }
	 */

	/*
	 * private void Name() {
	 * 
	 * String original; String name = " "; System.out.println("Enter your name");
	 * Scanner obj = new Scanner(System.in); name=obj.nextLine();
	 * System.out.println("Your name is " + name);
	 * 
	 * }
	 */
	/*
	 * private void Fact() { int n,fact=1,i=0;
	 * System.out.println("Enter the number to find factorial"); Scanner obj=new
	 * Scanner(System.in); n=obj.nextInt(); for(i=1;i<=n;i++) { fact=fact*i; }
	 * System.out.println("The factorial of given number is " + fact);
	 * 
	 * }
	 * 
	 * private void Matric() { int i=0,n;
	 * System.out.println("Enter the value of matric A"); Scanner obj=new
	 * Scanner(System.in); for(i=0;i<=2;i++) { n=obj.nextInt(); } {
	 * for(i=0;i<=2;i++) {
	 * 
	 * System.out.print(+ i ); } }
	 * 
	 * 
	 * }
	 */
	/*
	 * private void decimalBinary() { int n, i = 1, binary = 0, reminder;
	 * System.out.println("Enter the decimal num"); Scanner obj = new
	 * Scanner(System.in); n = obj.nextInt(); { while (n != 0) { reminder = n % 2; n
	 * = n / 2; binary = binary + reminder * i; i = i * 10;
	 * 
	 * } System.out.println("The decimal num is " + binary); } }
	 */

	/*
	 * private void binaryDecimal() { int i=1,n,reminder,decimal=0;
	 * System.out.println("Enter the binary number"); Scanner obj=new
	 * Scanner(System.in); n=obj.nextInt(); while(n!=0) { reminder=n%10; n=n/10;
	 * decimal=decimal+i*reminder; i=i*2; }
	 * System.out.println("The binary number is " + decimal); }
	 * 
	 * }
	 */
	/*private void whileLoop() {
		int n = 2;

		while (n <= 100) {

			System.out.println(n);
			n = n + 2;
		}

	}
}
*/
/*
 * private void doWhile() { int n=2; do { System.out.println(n); n=n+2;
 * 
 * 
 * } while (n<=100);
 * 
 * }
 * 
 * }
 */
	
	private void forLoop() {
		int i,j;
		for(i=1;i<=5;i++)
		{
			
		
		for(j=1;j<=i;j++)
		{
		System.out.print(" * ");
		}
		System.out.println(" ");
	}
	}
}