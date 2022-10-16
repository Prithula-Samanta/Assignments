package com.Assignments;

public class InheritanceActivity  {
   public static void main(String[] args) {
	   Manager mgn = new Manager((long)126534,"Peter","ChennaiIndia",(long) 237844,65000);
	   mgn.calculateSalary();
	   Trainee train = new Trainee((long)29846,"Jack","Mumbai India",(long) 442085,45000);
	   train.calculateSalary();
	   mgn.calculateTransportAllowance();
	   train.calculateTransportAllowance();
}
}