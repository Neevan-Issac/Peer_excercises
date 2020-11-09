package com.qa.peer_exercise;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
        System.out.println("Input Num1 Digit: ");
    	int num1 =in.nextInt();
    	System.out.println("Input Num2 Digit: ");
		int num2 =in.nextInt();
		System.out.println("Input Num3 Digit: ");
		int num3 =in.nextInt();
		
		
		if (num1*num2==num3) {
			System.out.println("Answer: " +num3);
			}
		if (num3/num2==num1) {
			System.out.println("Answer: " +num1);
			}
		if (num3/num1==num2) {
			System.out.println("Answer: " +num2);
			}
		if (num3*num2==num1) {
			System.out.println("Answer: " +num1);
			}
		if (num1/num2==num3) {
			System.out.println("Answer: " +num3);
			}
		if (num1/num3==num2) {
			System.out.println("Answer: " +num2);
			}
		if (num1*num3==num2) {
			System.out.println("Answer: " +num2);
			}
		if (num2/num3==num1) {
			System.out.println("Answer: " +num1);
			}
		if (num2/num1==num3) {
			System.out.println("Answer: " +num3);
			}
		in.close();
	}
	
}
