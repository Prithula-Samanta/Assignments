package com.Assignments;
/*
 * Q.2   Write a Java program to find the duplicate values of an array of integer values.
 */
import java.util.Scanner;
public class DuplicateValue {

	 public static void findDuplicate(int arr[],int val){
	   
	     for (int i = 0; i < arr.length; i++) {
	         for (int j = i+1; j < arr.length; j++) {
	             if(arr[i]==arr[j] && val != arr[i]){
	                 val=arr[i];
	                 System.out.println("The duplicate value is: "+arr[j]);
	                 break;
	             }
	         }

	     }

	 }
	 public static void main(String[] args) {
	 int arr[]={0,0,0,1,1,2,3,5,6,7,7,7,8,8,8,8,9,9,9,9};
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter any integer value which is not present inside the array ");
	 int val=sc.nextInt();
	 findDuplicate(arr,val);

	 }
	}
