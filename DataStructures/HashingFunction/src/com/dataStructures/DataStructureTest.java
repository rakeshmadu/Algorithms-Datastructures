package com.dataStructures;

import java.util.Scanner;

import com.dataStructures.hashTable.HashTable;

public class DataStructureTest {

	public static void main(String[] args) {

		HashTable hash = new HashTable();
		Scanner scan = new Scanner(System.in);
		int ch;
		hash.initializeHashTable();

		while (true) {
			System.out.println("\n 1. Search\n 2. Display\n 3. Finish Up");
			System.out.print(" Please enter your choice: ");
			ch = scan.nextInt();

			switch (ch) {
			case 1:
				System.out.print(" Please enter the number to search: ");
				int n = scan.nextInt();
				hash.search(n);
				break;
			case 2:
				hash.display();
				break;
			case 3:
				hash.writeIntoFile();
				scan.close();
				return;
			default:
				System.out.println(" Please enter a valid choice!");
			}
		}

	}
}
