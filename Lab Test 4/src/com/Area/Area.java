package com.Area;

// Creating class 'Area' which implements interface 'Shape'
public class Area implements Shape{

	// Overriding all the three methods of interface Shape
	@Override
	public void RectangleArea(double length, double breadth) {
		
		System.out.println("The area of the Rectangle is "+(length*breadth));
	}

	@Override
	public void SquareArea(double side) {
		
		System.out.println("The area of the Square is "+(side*side));
	}

	@Override
	public void CircleArea(double radius) {
		
		double pi=3.14;
		System.out.println("The area of the Circle is "+(pi*radius*radius));
	}
	
}
