package com.cognizant.tax;
public class TaxCalculator {
	float basicsalary;
	boolean citizenship;
	float tax;
	int nettSalary;
	TaxCalculator(float basicSalary,boolean citizenship){
		this.basicsalary=basicSalary;
		this.citizenship=citizenship;
	}
	public void calculateTax() {
		 tax = 30*basicsalary/100;
		 System.out.println("The Tax of the employee  for  the "+basicsalary+" is " +tax);
	}
	public void deductTax() {
		nettSalary=(int)(basicsalary-tax);
		System.out.println("The nett salary of the employee "+nettSalary);
	}
	public void validateSalary() {
		if((basicsalary>100000) && (citizenship==true)) {
			System.out.println("The salary and citizenship eligibility : true");
			
		}
		else {
			System.out.println("The salary and citizenship eligibility : false");

		}
	}
}
