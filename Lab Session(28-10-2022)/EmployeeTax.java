package com.cognizant.tax;
public class EmployeeTax {
	public static void main(String[] args) {
		TaxCalculator obj = new TaxCalculator(25000,true);
		System.out.println("Test case 1");
		obj.calculateTax();
		obj.deductTax();
		obj.validateSalary();
		TaxCalculator obj2 = new TaxCalculator(125000,true);
		System.out.println("Test case 2");
        obj2.calculateTax();
		obj2.deductTax();
		obj2.validateSalary();	
	}
}
