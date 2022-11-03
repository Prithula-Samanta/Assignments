package com.Assignments;

public class MainStudent {
   public static void stdNoFee(int No,int Fee) {
	   if(Fee < 2000) {
		   Fee=Fee+(Fee*10/100);
	   }
	   System.out.println("Student No "+No+" Student Fee "+Fee);
	   
   }
   public static void main(String[] args) {
	Student[] s=new Student[5];  // array of student 
	s[0]=new Student(1,"abc@gmail.com","Kolkata","Prithula",1000);
	s[1]=new Student(2,"def@gmail.com","Medinipur","Angshu",1500);
    s[2]=new Student(3,"abc123@gmail.com","Purulia","Abhi",3000);
    s[3]=new Student(4,"def123@gmail.com","Bankura","Sam",2000);
    s[4]=new Student(5,"old123@gmail.com","Darjeeling","Ram",3000);
  System.out.println("Before updating the details is :");
	for(int i=0;i<5;i++) {
		s[i].display(i+1);
	}
	System.out.println("After updating the details is :");

	MainStudent.stdNoFee(1, 1000);
	MainStudent.stdNoFee(5, 1000);

	

	
  }
}