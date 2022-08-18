package com.dataStructures;

import java.util.Scanner;

import com.dataStructures.bankCounter.BankCounter;

public class DataStructureTest {

	public static void main(String[] args) {
		
		BankCounter obj = new BankCounter(5);
		Scanner scan = new Scanner(System.in);
		int ch;
		
		while(true) {
			System.out.println("\n 1. Add customer to queue\n 2. Remove customer from queue\n 3. Display queue\n 4. Exit");
			System.out.println(" Please enter your choice: ");
			ch = scan.nextInt();
			
			switch(ch) {
			case 1:
				System.out.print(" Please enter the name of the customer: ");
				String name = scan.next();
				System.out.print(" Please enter the amount to be debited(-ve if withdrawal): ");
				int amount = scan.nextInt();
				obj.enqueue(amount, name);
				break;
			case 2:
				obj.dequeue();
				break;
			case 3: 
				obj.display();
				break;
			case 4: 
				scan.close();
				return;
			default:
				System.out.println(" Please enter a valid choice!");
			}
		}
	}
}
