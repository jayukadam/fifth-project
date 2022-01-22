package com.javaOpearator;

public class Example1 {
//ASSIGNMENT OPERATOR
	
	
	public static void main(String[] args) {
int a = 500;
int b = 5;

System.out.println("+=:" +(a += b));
/**
 * a += b
 * a=a+b
 * a=500+5
 * a=505
 * 
 */
System.out.println("-=:" +(a -= b));
/**
 * a -=b
 * a = a-b
 * a = 500-5
 * a = 495
 */

System.out.println("*=:" +(a *= b));
/**
 * a *=b
 * a = a*b
 * a= 500*5
 * a = 2500
 */
System.out.println("%=:" +(a %= b));
/**
 * a %=b
 * a = a%b
 * a = 500 % 5
 * a=0
 */
System.out.println("/=:" +(a /= b));
/**
 * a /=b
 * a = a/b
 * a = 500/5
 * a = 100
 */






	}

}
