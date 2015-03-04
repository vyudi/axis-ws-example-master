package com.mkrupa.webservices;


/**
 * Service for sum.
 * 
 * @author Vitor
 */
public class AdditionService {

	/**
	 * Return the sum of the two parameters.
	 * @param a int :
	 * 		the first number to sum
	 * @param b int :
	 * 		the second number to sum
	 * @return int : the sum
	 */
	public int addition(int a, int b) {
		System.out.println("ENTER ADDITION METHOD WITH PARAMETERS " + a + " AND " + b);
		int total = a + b;
		System.out.println("EXIT ADDITION METHOD WITH RESULT " + total);
		return total;
	}
}
