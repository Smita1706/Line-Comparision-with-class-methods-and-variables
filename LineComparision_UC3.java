package com.bridgelabz.LineComparision;

import java.util.Scanner;

public class LineComparision_UC3 {
	static int x1, x2;
	static int y1, y2;
	static Double Length1, Length2;

	public void getInput() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first co-ordinate  : ");
		x1 = s.nextInt();
		System.out.println("Enter the second co-ordinate : ");
		y1 = s.nextInt();
		System.out.println("Enter the first co-ordinate : ");
		x2 = s.nextInt();
		System.out.println("Enter the second co-ordinate : ");
		y2 = s.nextInt();
	}
	
	public double FindLength() {
		return Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
	}

	public static void main(String [] args){

		LineComparision_UC3 u = new LineComparision_UC3();
 
		u.getInput();
		Length1 = u.FindLength();
		u.getInput();
		Length2 = u.FindLength();

		System.out.println("Length of first two points : " + Length1);
		System.out.println("Length of second two points : " + Length2);

		int res = Length1.compareTo(Length2);
		System.out.println(res);

		if (res > 0 )
			System.out.println("length of first two points is grater than length of second two points");
		else if(res < 0)
			System.out.println("length of first two points is smaller than length of second two points");
		else
			System.out.println("Both the lengths are equal");
	}
}
