package com.Assignment1;

public class Student {
 Long studentId;
 Character studentGrade;
 Double monthlyFees;
 Boolean isScholarshipEligible;
 Double Fees;
 // as per the question here we use the cfs method and pass the following parameter 
public void calculateFeesStructure(Long studentId,Character studentGrade,Double monthlyFees,Boolean isScholarshipEligible){
	 this.studentId=studentId;
	 this.studentGrade=studentGrade;
	 this.monthlyFees=monthlyFees;
	 this.isScholarshipEligible=isScholarshipEligible;
	 if(this.studentId!=0 && this.studentGrade =='A' && this.isScholarshipEligible==true) {
		 Fees =monthlyFees - monthlyFees *10/100;  // here we calculate the fees 
		 Integer ff=Fees.intValue();  // convert to int 
		 System.out.println("10% fees is exempted, the calculated fees is "+(int)ff);
	 }
	 else if(this.studentId!=0 && this.studentGrade =='B' && this.isScholarshipEligible==true) {
		 Fees =monthlyFees - monthlyFees *8/100;
		 Integer ff=Fees.intValue(); // convert to int 

		 System.out.println("8% fees is exempted, the calculated fees is "+ (int)ff);

	 }
	 else if(this.studentId!=0 && this.studentGrade =='C' && this.isScholarshipEligible==true) {
		 Fees =monthlyFees - monthlyFees *6/100;
		 Integer ff=Fees.intValue();   // convert to int 

		 System.out.println("6% fees is exempted, the calculated fees is "+(int)ff);

	 }
	 else if(this.studentId!=0 && this.studentGrade =='D' && this.isScholarshipEligible==true) {
		 Fees =monthlyFees - monthlyFees *4/100;
		 Integer ff=Fees.intValue();  // convert to int 

		 System.out.println("4% fees is exempted, the calculated fees is "+(int)ff);

	 }
	 else {
		 System.out.println("Not Eligible for Exemption");
	 }
 }
 public void compareMarks(Long Maths,Double English) {
	 Integer i =Maths.intValue();  // convert Long to int 
	 Integer j=English.intValue();  // convert Double to int 
	 if(j>i) {
		 System.out.println("English mark is higher than Maths");
	 }
	  else if(i>j) {
		 System.out.println("Maths mark is higher than English");
	 }
	  else {
		  System.out.println("Both are equal");
	  }
 }
 public void validateFees(Double Fees) {
	 if(Fees.isInfinite()) {
		 System.out.println("Fees is infinite");
	 }
	 else {
		 System.out.println("Fees is not infinite");
		 Byte b=Fees.byteValue();
	     System.out.println("Fees = " +b);
	 }
  }
}
