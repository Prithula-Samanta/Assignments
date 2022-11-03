package com.Assignments;
//Q.1   Write a Java program to test if an array contains a specific value.
import java.util.Scanner;

class ArrayContainValue {
public static void findVal(int arr[],int target) {
	  int count=0;
	  for(int i=0;i<arr.length;i++) {  // using for loop for terverse array 
		  if(arr[i]==target) {   // here check the target value 
			  count++;
			  break;
		  }
	  }
	  if(count==1) {
		  System.out.println(target+ " Yes, this value is contained in the array" );
	  }
	  else {
		  System.out.println("This value is not contained in array.");
	  }
}
public static void main(String[] args) {
	  int arr[]= {12,45,67,89,32,45,87};  // decrease and increase an array 

	  Scanner sc = new Scanner(System.in);
	  System.out.println("Please enter the target value ");
	  int target=sc.nextInt();
	findVal(arr,target);
}
}