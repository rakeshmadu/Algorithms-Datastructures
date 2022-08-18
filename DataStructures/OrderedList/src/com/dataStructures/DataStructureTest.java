package com.dataStructures;

import java.util.Scanner;

import com.dataStructures.orderedList.OrderedLinkedList;

public class DataStructureTest {

	public static void main(String[] args) {
		
		int ch;
		OrderedLinkedList list = new OrderedLinkedList();
		Scanner scan = new Scanner(System.in);
		
		list.readNumbers();
		
		while(true) {
			System.out.println("\n 1. Search number\n 2. Display list\n 3. Finish up");
			System.out.print(" Please enter your choice: ");
			ch = scan.nextInt();
			
			switch(ch) {
			case 1: 
				System.out.print(" Please enter the number you want to search for: ");
				int number = scan.nextInt();
				list.checkNumber(number);
				break;
			case 2: 
				list.display();
				break;
			case 3:
				list.writeToFile();
				scan.close();
				return;
			default:
				System.out.println(" Goodbye");
				break;
			}
		}
		
	}
}
