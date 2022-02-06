package com.bridgelabz.LineComparision;

public class LineComparision_UC4 {
	public static void main(String[] args) {
            Double length1,length2;
            boolean eqality;
            int compare;
            LineComparision_UC2 u = new LineComparision_UC2();
            
            u.getInput();
            length1 = u.findLength();
            
            u.getInput();
            length2 = u.findLength();
            
            eqality =  u.checkEquality(length1, length2);
            System.out.println("Equality result : ");
            if(eqality == true)
    			System.out.println("Both the lengths are equal");
    		else
    			System.out.println("Both the lengths are not equal");
            
            LineComparision_UC3 u2 = new LineComparision_UC3();
            
            compare = u2.compareLength(length1, length2);
            System.out.println("Length compare result : ");
            if (compare > 0 )
    			System.out.println("length of first two points is grater than length of second two points ");
    		else if(compare < 0)
    			System.out.println("length of first two points is smaller than length of second two points");
    		else
    			System.out.println("Both the lengths are equal");
	}
}
