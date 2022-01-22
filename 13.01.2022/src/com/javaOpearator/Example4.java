package com.javaOpearator;

public class Example4 {
// BITWISE OPERATOR
	public static void main(String[] args) {
int a = 10;
int b = 5;
System.out.println("&:"+(a & b));
 /*
  * a = 10 = 1 0 1 0
  * b = 5  = 0 1 0 1
  * ....................
  *        = 0 0 0 0 (if both contion is true then ans is true)
  */
System.out.println("|:"+(a | b));
/*
 * a = 10 = 1 0 1 0
  * b = 5  = 0 1 0 1
  * ....................
 *         = 1 1 1 1(atleast one condition is true the ans is true)
 * 
 */
System.out.println("<<:"+(a << b));
System.out.println(">>:"+(a >> b));
System.out.println("^:"+(a ^ b));




		
		
		
	}

}
