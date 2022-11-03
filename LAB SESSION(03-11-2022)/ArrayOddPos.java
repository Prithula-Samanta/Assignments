package com.Assignments;
/*
 * Q.3   we need to print the elements of the array which are present in odd positions.
 *  This can be accomplished by looping through the array 
 *  and printing the elements of an array by incrementing
 *   i by 2 till the end of the array is reached.
 */
public class ArrayOddPos {
	   public static void oddPosition(int arr[]) {
		   System.out.println("The odd positioned values are ");
		   for(int i=0;i<arr.length;i+=2) {  // using for loop for traverse an array and also find odd position
			   System.out.println(arr[i]);
		   }
	   }
	   public static void main(String[] args) {
		int arr[]= {12,45,67,89,32,45,87};  // array increases and decreases
		oddPosition(arr);
	  }
	}