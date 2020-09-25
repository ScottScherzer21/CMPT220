package module3;

import java.util.Scanner;

public class problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    // Prompt the user to enter coordinates
		Scanner input = new Scanner(System.in);
		// Prompt the user to enter two points
		System.out.println("Enter x and y coordinates of two points:\n" +
		"Point 1: (x1, y1)");
		System.out.println("x1= ");
		double x1 = input.nextDouble();
		System.out.println("y1= ");
		double y1 = input.nextDouble();
		System.out.println("Point 2: (x2, y2)");
		System.out.println("x2= ");
		double x2 = input.nextDouble();
		System.out.println("y2= ");
		double y2 = input.nextDouble();
		
		double m = (y2 - y1) / (x2 - x1);
		double b = y1 - (m*x1);
		
		System.out.println(m);
		System.out.println(b);
		// y = mx + b 
		
		//if both m = 1 and b = 0
		if (( m == 1) && (b == 0)) {
			System.out.println("The line equation for two points " 
		    + "("+x1 + " , " + y1 +")" + " and " + "(" + x2 + " , " + y2 + ")" 
			+ " is " + "y = x");
	    
		//if only m = 1 but not b = 0 
		} else if(m == 1 && b != 0) {
	    	System.out.println("The line equation for two points " 
	        + "("+x1 + " , " + y1 +")" + " and " + "(" + x2 + " , " + y2 + ")" 
	    	+ " is " + "y = x + " + b);
	    	
		} else if(m != 1 && b == 0) {
		    System.out.println("The line equation for two points " 
		    + "("+x1 + " , " + y1 +")" + " and " + "(" + x2 + " , " + y2 + ")" 
		    + " is " + "y = " + m + "x");
	    } else {
	    	System.out.println("The line equation for two points " 
	    	+ "("+x1 + " , " + y1 +")" + " and " + "(" + x2 + " , " + y2 + ")" 
	    	+ " is " + "y = " + m + "x" + " + " + b);
	    }
		
	}

}
