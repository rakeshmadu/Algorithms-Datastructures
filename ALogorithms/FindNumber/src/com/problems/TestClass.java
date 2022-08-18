package com.problems;

import java.util.Scanner;

public class TestClass {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.print(" Please enter the range: ");
		int range = scan.nextInt();
		FindYourNumber find = new FindYourNumber();
		find.find(0, range);
	}

}
