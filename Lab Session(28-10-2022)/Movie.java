package com.Assignments;
/*
 * Problem 2
Movie Theatre Management System, where you can create two classes one is main another one is movie, 
movie class can have two methods setMovie,getMovie where you can create movieName,movieStartTime,movieEndTime,
MovieTicketPrice as instance variables
*/
public class Movie {
  String movieName;
  int movieStartTime;
  int movieEndTime;
  double movieTicketPrice;
  Movie(int movieStartTime,int movieEndTime,double movieTicketPrice){
	  this.movieStartTime=movieStartTime;
	  this.movieEndTime=movieEndTime;
	  this.movieTicketPrice=movieTicketPrice;
  }
public String getMovieName() {   // we get movie name 
	return movieName;
}
public void setMovieName(String movieName) {  // here we set movie name 
	this.movieName = movieName;
}

}