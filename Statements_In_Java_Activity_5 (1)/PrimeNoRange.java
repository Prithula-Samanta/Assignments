
/*
 * Problem Statement # 1:
Develop a program which prints the prime numbers between 1 and 150
The output should be printed in this format
1,3,5……goes on till it prints the last prime number.
Prime number definition: A prime number (or a prime) is a natural number greater than 1 that has no positive divisors other than 1 and itself. For example 5 is prime, as only 1 and 5 divide it.


Statements_In_Java_Activity_5 (1)
 */
package com.Assignments;

public class PrimeNoRange {
	public static void main(String[] args) {
		int num=1,i;
		while(num!=150) {
			int count=0;
		for(i=2;i<num;i++) {
			if(num%i==0) {
				count++;
				break;
			}
			
		}
		if(count==0) {
			System.out.print(num+",");
		}
		num++;
	}
		
  }

}