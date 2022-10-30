package com.Assignments;
public class MainMovie {
	public static void main(String[] args) {
		  Movie obj = new Movie(12,3,250);
		  obj.setMovieName("Harry Potter and the Philosopher's Stone");
		  System.out.println("The movie name is "+obj.getMovieName());
		  System.out.println("The start time is "+obj.movieStartTime+" PM");
		  System.out.println("The end time is "+obj.movieEndTime+" PM");
		  System.out.println("The ticket price is "+obj.movieTicketPrice);	  
	}
}
