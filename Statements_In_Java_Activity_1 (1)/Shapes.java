
package com.cognizant.shapes;

public class Shapes {
 int noOfSides;
  public void calculateShapeArea(String shape,int noOfSides) {
  	this.noOfSides=noOfSides;
  }
  public static void main(String[] args) {
  	
  	Shapes sph = new Shapes();
  	sph.noOfSides=9;
  	
  	Circle2 cir=new Circle2();
  	Triangle2 tir = new Triangle2();
  	Squre2 sqr = new Squre2();
  	
  	cir.Radius=5;
  	tir.Sides=6;
  	sqr.Side=8;
  	
  	if(sph.noOfSides==1) {
       System.out.println("The area of circle is " + cir.calculateArea());
   }

  	else if(sph.noOfSides==3) {
       System.out.println("The area of Triangle is " + tir.calculateArea());
   }

  	else if(sph.noOfSides==4) {
       System.out.println("The area of squre is " + sqr.calculateArea());
   }
  	else {
          System.out.println("No shapes present ");

  	}	
	}
}