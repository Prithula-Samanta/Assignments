package com.Assignments;

public class Employee {
	long employeeId;	
	String employeeName;	
	String employeeAddress;	
	Long employeePhone;
	double basicSalary;
	double specialAllowance=250.80;
	double Hra=1000.50;
	
public Employee(long Id,String Name,String address,Long phone){
		employeeId=Id;
		employeeName=Name;
		employeeAddress=address;
	    employeePhone=phone;

	}
	
// 	public long getEmployeeId() {
// 		return employeeId;
// 	}
// 	public void setEmployeeId(long Id) {
// 		employeeId = Id;
// 	}
// 	public String getEmployeeName() {
// 		return employeeName;
// 	}
// 	public void setEmployeeName(String Name) {
// 		employeeName = Name;
// 	}
// 	public String getEmployeeAddress() {
// 		return employeeAddress;
// 	}
// 	public void setEmployeeAddress(String address) {
// 		employeeAddress = address;
// 	}
// 	public long getEmployeePhone() {
// 		return employeePhone;
// 	}
// 	public void setEmployeePhone(long phone) {
// 	employeePhone = phone;
// 	}
	public void calculateSalary() {
		double salary=  basicSalary + ( basicSalary * specialAllowance/100) + ( basicSalary * Hra/100); 
	  System.out.println("The salary is " +salary);
	}
	public void calculateTransportAllowance () {
		double transportAllowance = 10/100*basicSalary;
		System.out.println("The transportAllowance is " +transportAllowance);
	}
}