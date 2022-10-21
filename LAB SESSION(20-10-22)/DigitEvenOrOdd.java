package com.Assignments;

import java.util.Scanner;

/*
 * Problem 1.
Write a Java method to check whether every digit of a given integer
is even. Return true if every digit is odd otherwise false?
 */
public class DigitEvenOrOdd {
	public static int digitEvenOdd(int num) {
		 int rem;
		 int count=0;
		  while(num!=0) {
			  rem=num%10;  // last digit
			  if(rem%2==0) {
				  count++;
				  break;
			  }
			  num=num/10;  // 
		  }
		  return count;
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number ");
		int val=sc.nextInt();
		int result=digitEvenOdd(val);
		if(result==0) {
			System.out.println("ture");
		}
		else {
			System.out.println("false");
		}
	}
}
