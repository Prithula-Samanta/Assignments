package com.Assignment1;

public class MainStudent {
     public static void main(String[] args) {
         Student obj=new Student();
         Student obj2=new Student();
         Student obj3=new Student();
// here we pass the value throw the method 
	obj.calculateFeesStructure((long) 234,(char) 'C',(double) 600,(boolean) true);
	obj2.calculateFeesStructure((long) 115,(char) 'B',(double) 909.50,(boolean) true);
	obj3.calculateFeesStructure((long) 980,(char) 'G',(double) 1801,(boolean) false);
	
	
	// for comparing marks 
	
	obj.compareMarks((long)65,(double)85);
	obj.compareMarks((long)98,(double)56);
	obj.compareMarks((long)84,(double)84);
	
	// for calculating validate fees
	
	obj.validateFees((double)1/0);
	
}
}