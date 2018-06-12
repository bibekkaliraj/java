package com.techaxis.test;

import java.util.Scanner;

public class OperatorsTest {
	public static void main(String[] args) {
		OperatorsTest testObj = new OperatorsTest();

		// testObj.unaryTest();
		// testObj.arithematicOperatorTest();
		// testObj.solveEquationTest();
		// testObj.AssigmentTest();
		// testObj.testIfElse();
		// testObj.switchCase();
		// testObj.youngestOldest();
		// testObj.Day();
		// testObj.arraysTest();
		// testObj.forLoopTest();
		// testObj.reverseForLoopTest();
		//testObj.testEvenOdd();
		//testObj.testEvenElementOdd();
	}

	/*
	 * private void unaryTest() { int a = 5; System.out.println(a++);
	 * System.out.println(a); System.out.println(++a); System.out.println(a);
	 * 
	 * }
	 * 
	 * private void arithematicOperatorTest() { int a = 20; int b = 4;
	 * System.out.println("The sum of " + a + " and " + b + " is: " + (a + b));
	 * System.out.println("The product" + a + " and " + b + " is : " + (a * b));
	 * System.out.println("The difference" + a + " and " + b + " is : " + (a - b));
	 * System.out.println("The remender" + a + " and " + b + " is : " + (a % b)); }
	 * 
	 * // private void solveEquationTest() { // int a = 2, b = 3, c = 1; // int ans
	 * = a * 2 + b * b + c * c - (a + b + c) * (a / c) * (a % b * (a + b)); //
	 * System.out.println("The Ans of the equation is " + ans); // }
	 * 
	 * /* private void AssigmentTest() { float a = 30; a += 10;
	 * System.out.println("The ans is " + a); a -= 5;
	 * System.out.println("The ans is " + a); a *= 2;
	 * System.out.println("The ans is " + a); a /= 3;
	 * System.out.println("The ans is " + a); a %= 10;
	 * System.out.println("The ans is " + a); }
	 * 
	 * private void testIfElse() { int a = 5; int b = 10;
	 * 
	 * if (b > a) { int result = b - a; System.out.println("The result us:" +
	 * result); } else { System.out.println("cannot subtract as will be negative");
	 * } }
	 */

	/*
	 * 
	 * 
	 * private void youngestOldest() { int age,a,b,c;
	 * System.out.println("Enter a age of 3pp"); Scanner obj=new Scanner(System.in);
	 * a=obj.nextInt(); b=obj.nextInt(); c=obj.nextInt();
	 * 
	 * if(a>b && a>c) { System.out.println("oldest 1 " +a); }
	 * 
	 * else if(b>a && b>c ) {System.out.println("oldest " +b); } else
	 * {System.out.println(" oldest " +c);
	 * 
	 * } } }
	 * 
	 * 
	 * 
	 */

	/*
	 * private void switchCase() { float cost, totalcost; int percentage;
	 * System.out.println("Enter the cost"); System.out.println("Enter the per");
	 * Scanner obj = new Scanner(System.in); cost=obj.nextInt(); percentage =
	 * obj.nextInt(); switch (percentage) { case 5: { totalcost = (cost -
	 * (((float)percentage/ 100) * cost)); System.out.println("The total cost = "
	 * +totalcost);
	 * 
	 * break; } case 3: { totalcost = cost - (3 / 100) * cost;
	 * System.out.println("The total cost = " +totalcost); break; } case 4: {
	 * totalcost=cost-(4/100)*cost; System.out.println("The total cost = "
	 * +totalcost); break; } case 2: {totalcost=cost-(5/100)*cost;
	 * System.out.println("The total cost = " +totalcost);
	 * 
	 * break; }
	 * 
	 * default: System.out.println("error"); }
	 * 
	 * } }
	 */

	/*
	 * private void Day() { int n; System.out.println("Input a number"); Scanner
	 * obj=new Scanner(System.in);
	 * 
	 * n=obj.nextInt(); String suffix=""; switch(n) { case 1: { suffix="st"; } case
	 * 2: {suffix="nd"; } case 3: { suffix="rd";
	 * 
	 * 
	 * break; } default: suffix="th";
	 * 
	 * }
	 * 
	 * 
	 * switch(n) { case 1: { System.out.println("You choosed " + n + suffix
	 * +" Sunday"); break; } case 2: { System.out.println("You choosed " + n +
	 * suffix +" Monday"); break; } case 3: {System.out.println("You choosed " + n +
	 * suffix +" Tuesday"); break; } case 4: {System.out.println("You choosed " + n
	 * + suffix +" wednesday"); break; } case 5: { System.out.println("You choosed "
	 * + n + suffix +" Thursday"); break; } case 6:
	 * {System.out.println("You choosed " + n + suffix +" Friday"); break; } case 7:
	 * {System.out.println("You choosed " + n + suffix +" saturaday"); break; }
	 * 
	 * default: System.out.println("invalid num");
	 * 
	 * 
	 * } }
	 */
	/*
	 * 
	 * private void arraysTest() { int[] x=new int[5]; x[0]=6; x[1]=5; x[2]=4;
	 * x[3]=3; x[4]=2; x[5]=1; System.out.println(x[2]); System.out.println(x[3]);
	 * 
	 * }
	 * 
	 * }
	 * 
	 * 
	 */
	/*
	 * private void forLoopTest() { int i; int[] x= {1,7,8,10,2,13,17,19};
	 * for(i=0;i<x.length;i++) { System.out.println(x[i]); } }
	 */
	/*
	 * private void reverseForLoopTest() { int i; int[] x = { 1, 7, 8, 10, 2, 13,
	 * 17, 19 }; for (i = x.length - 1; i >= 0; i--) { System.out.println(x[i]); } }
	 * 
	 * }
	 */

/*	private void testEvenOdd() {
		int[] x = { 1, 7, 8, 10, 2, 13, 17, 19 };
		for (int i = 0; i < x.length; i++) {
			if (i % 2 == 0) {
				System.out.println("The number is even. The number is: " + x[i]);
			} else {
				System.out.println("The number is odd. The number is: " + x[i]);
			}
		}
	}
}

*/

private void testEvenElementOdd() {
	int[] x = { 1, 7, 8, 10, 2, 13, 17, 19 };
	for (int i = 0; i < x.length; i++) {
		if (x[i] % 2 == 0) {
			System.out.println("The number is even. The number is: " + x[i]);
		} else {
			System.out.println("The number is odd. The number is: " + x[i]);
		}
	}
}
}
