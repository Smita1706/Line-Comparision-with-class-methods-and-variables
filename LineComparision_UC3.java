package com.bridgelabz.LineComparision;

import java.util.Scanner;

public class LineComparision_UC3 {
	int x1, x2;
	int y1, y2;

	public int getInput() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first co-ordinate  : ");
		x1 = s.nextInt();
		System.out.println("Enter the second co-ordinate : ");
		y1 = s.nextInt();
		System.out.println("Enter the first co-ordinate : ");
		x2 = s.nextInt();
		System.out.println("Enter the second co-ordinate : ");
		y2 = s.nextInt();
		return 0;
	}

	public double findLength() {
		return Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
	}

	public int compareLength(Double length1, Double length2) {
		return length1.compareTo(length2);
	}
	public static void main(String [] args){
		Double length1, length2;
		LineComparision_UC3 u = new LineComparision_UC3();

		u.getInput();
		length1 = u.findLength();
		u.getInput();
		length2 = u.findLength();

		System.out.println("Length of first two points : " + length1);
		System.out.println("Length of second two points : " + length2);

		int res = u.compareLength(length1,length2);
		System.out.println(res);

		if (res > 0 )
			System.out.println("length of first two points is grater than length of second two points");
		else if(res < 0)
			System.out.println("length of first two points is smaller than length of second two points");
		else
			System.out.println("Both the lengths are equal");
	}
}
