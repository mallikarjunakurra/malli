package com.Area;

public class AreaMain {

	public static void main(String[] args) {
		
		// Creating object of class 'Area'
		Shape a=new Area();
		
		// Calling method to get area of Rectangle
		a.RectangleArea(2,3);
		
		// Calling method to get area of Square
		a.SquareArea(11);
		
		// Calling method to get area of Circle
		a.CircleArea(2);
	}

}
