package com.techaxis.test;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		char ch;
		System.out.println("Input a charecter");
		Scanner obj=new Scanner(System.in);
		ch=obj.next().charAt(0);
		switch(ch)
		{ 
		case 'a':
		case 'A':
		case 'e':
		case 'E':
		case 'i':
		case 'I':
		case 'o':
		case 'O':
		case 'u':
		case 'U':
			System.out.println("The given char is vowel letter");
			break;
		
		default:
		System.out.println("The given char is not vowel");	
		
		
		}
}

}
