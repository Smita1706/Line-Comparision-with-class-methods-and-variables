package com.bridgelabz.LineComparision;

import java.util.Scanner;
public class LineComparision_UC1 {
	int x1;
	int x2;
	int y1;
	int y2;
	static double length;

	public int getInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of x1 : ");
		x1 = sc.nextInt();

		System.out.println("Enter the value of x2 : ");
		x2 = sc.nextInt();

		System.out.println("Enter the value of y1 : ");
		y1 = sc.nextInt();

		System.out.println("Enter the value of y2 : ");
		y2 = sc.nextInt();
		return 0;
	}

	public double findLength() {
		return  Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
	}

	public static void main(String [] args){


		LineComparision_UC1 u = new LineComparision_UC1();
		Scanner sc = new Scanner(System.in);

		u.getInput();

		length = u.findLength();
		System.out.println("Length of two points is : " + length);
	} 
}
