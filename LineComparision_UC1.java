package com.bridgelabz.LineComparision;

import java.util.Scanner;
public class LineComparision_UC1 {
	static int x1;
	static int x2;
	static int y1;
	static int y2;
	static double Length;
	
	public void getInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of x1 : ");
		x1 = sc.nextInt();

		System.out.println("Enter the value of x2 : ");
		x2 = sc.nextInt();

		System.out.println("Enter the value of y1 : ");
		y1 = sc.nextInt();

		System.out.println("Enter the value of y2 : ");
		y2 = sc.nextInt();
	}
	
	public double FindLength() {
		return  Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
	}
	
	public static void main(String [] args){

		LineComparision_UC1 u = new LineComparision_UC1();
		Scanner sc = new Scanner(System.in);
		 
		u.getInput();
		
		Length = u.FindLength();
		System.out.println("Length of two points is : " + Length);
	} 
}
