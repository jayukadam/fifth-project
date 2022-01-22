package com.javaOpearator;

public class Example3 {
//LOGICAL OPERATOR
	public static void main(String[] args) {
		int a = 500;
		int b = 5;
		boolean variable = (a >= b);
		System.out.println("&&:"+((a > b) && (a >= b)));//true
		/*
		 *  &&= if both condition is true then output is true
		 */
		System.out.println("||:"+((a < b) || (a >= b)));//true
		/*
		 * || = if atleast one condition is true then output is true
		 */
		System.out.println("!:" +!variable);//false
		/*
		 * ! = opposite process i.e 0=1 & 1= 0
		 */
		
		
	}

}
