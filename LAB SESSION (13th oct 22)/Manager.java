package com.Assignments;

public class Manager extends Employee {

	public Manager(long Id,String name,String address,Long phone,double salary){
		super(Id,name,address,phone);
		super.basicSalary=salary;
		employeeId=Id;
		employeeName=name;
		employeeAddress=address;
	    employeePhone=phone;

	}
	public void calculateTransportAllowance () {
		double transportAllowance = 15* basicSalary/100;
		System.out.println("The transportAllowance(Manager) is " +transportAllowance);

	}
}