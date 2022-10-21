package com.Assignments;
/*
 * Problem 3.
Program to create library book Management system
to store and display book details in library where you can
create two classes one is main another one is library, where you can
create two methods as addBook,dispanseBook and
bookId,bookName,bookAuthor as instance variables
 */
public class Library {
  int bookId;
  String bookName;
  String bookAuther;
  public void addBook(int bookId,String bookName,String bookAuther) {
	  this.bookId=bookId;
	  this.bookName=bookName;
	  this.bookAuther=bookAuther;
  }
  public void dispanceBook(String bkname) {
	  if(this.bookName==bkname) {
		  System.out.println("BookId " +this.bookId+" BookName "+this.bookName+ " BookAuther " +this.bookAuther);
	  }
	  else {
		  System.out.println("Book is not found");
	  }
  }
}
