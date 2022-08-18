package com.dataStructures.hashTable;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class HashTable {

	public static class ListNode {
		int number;
		ListNode next;

		public ListNode(int number) {
			// TODO Auto-generated constructor stub
			this.number = number;
		}
	}

	ListNode[] table;

	public HashTable() {
		// TODO Auto-generated constructor stub
		this.table = new ListNode[11];
	}

	public int hash(int n) {
		return Math.abs(n) % 11;
	}

	public void insert(int n) {
		int bucket = hash(n);

		ListNode currentNode = table[bucket];

		if (currentNode == null) {
			table[bucket] = new ListNode(n);
			return;
		}

		while (currentNode.next != null) {
			currentNode = currentNode.next;
		}

		currentNode.next = new ListNode(n);

	}

	public void display() {
		for (ListNode node : table) {
			if (node == null)
				System.out.print(" [NULL]");

			while (node != null) {
				System.out.print(" " + node.number);
				node = node.next;
			}
			System.out.println();
		}
	}

	public void initializeHashTable() {
		try {
			Scanner scan = new Scanner(new File("src/com/dataStructures/hashTable/input.txt"));
			while (scan.hasNext()) {
				insert(scan.nextInt());
			}

			scan.close();
			display();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(" ERROR: The file could not be found!");
		}
	}

	public void search(int n) {
		int bucket = hash(n);
		ListNode node = table[bucket], prev = table[bucket];

		if (node == null)
			System.out.print(" This slot is empty. Number not found!");

		while (node != null) {
			if (node.number == n) {
				System.out.println(" Found the number " + n);
				if (node == table[bucket] && node.next == null)
					table[bucket] = null;
				else if (node == table[bucket] && node.next != null)
					table[bucket] = node.next;
				else
					prev.next = node.next;
				return;
			}
			prev = node;
			node = node.next;
		}

		insert(n);
		System.out.println();
	}

	public void writeIntoFile() {
		try {
			FileWriter fw = new FileWriter("src/com/dataStructures/hashTable/output.txt");

			for (ListNode node : table) {
				if (node == null)
					fw.write(" [NULL]");

				while (node != null) {
					fw.write(" " + node.number);
					node = node.next;
				}
				fw.write("\n");
			}
			fw.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(" ERROR: Could not create a file with output! ");
		}
	}
}
