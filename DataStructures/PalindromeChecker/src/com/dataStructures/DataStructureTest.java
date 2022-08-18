package com.dataStructures;

import java.util.Scanner;

import com.dataStructures.palindrome.PalindromeChecker;

public class DataStructureTest {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print(" Please enter the string to check: ");
		String word = scan.next();

		PalindromeChecker check = new PalindromeChecker(word.length());
		check.checkPalindrome(word);

		scan.close();

	}
}
