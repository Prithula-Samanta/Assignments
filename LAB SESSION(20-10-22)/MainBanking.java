package com.Assignments;
public class MainBanking {
	public static void main(String[] args) {
		BankingOperation obj = new BankingOperation(12345,"Prithula",50400); // first customer
		BankingOperation obj2 = new BankingOperation(13974,"Rani",90400); // second customer 
        System.out.println("First customer");
		System.out.println("Now");
		obj.getAmount();
		obj.setAmount(15000);
        System.out.println("After add amount ");

		obj.getAmount();
		
		obj.withdrawAmount(14000);
        System.out.println("After withdraw amount ");

		obj.getAmount();
		
		System.out.println("Second customer");
		System.out.println("Now");
		obj2.getAmount();
		obj2.setAmount(4000);
        System.out.println("After add amount ");

		obj2.getAmount();
		
		obj2.withdrawAmount(1000);
        System.out.println("After withdraw amount ");

		obj2.getAmount();
	}
	
}
