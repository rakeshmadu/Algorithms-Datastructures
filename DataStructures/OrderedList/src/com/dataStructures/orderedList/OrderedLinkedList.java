package com.dataStructures.orderedList;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class OrderedLinkedList {

	Node head;
	
	public void insert(int number) {
		Node newNode = new Node(number);
		if (head == null) {
			head = newNode;
			return;
		}
		
		Node iterator = head;
		Node prevIterator = head;
		while(iterator != null) {
			if(iterator.number > number) {
				newNode.next = iterator;
				if(head == iterator)
					head = newNode;
				else
					prevIterator.next = newNode;
				return;
			}
			prevIterator = iterator;
			iterator = iterator.next;
		}
		
		if(head == iterator) { 
			head.next = newNode;
			return;
		}
		newNode.next = iterator;
		prevIterator.next = newNode;
		
	}
	
	public void readNumbers() {
		int n;
		
		try {
			Scanner scan = new Scanner(new File("src/com/dataStructures/orderedList/input.txt"));
			while(scan.hasNext()) {
				n = Integer.parseInt(scan.next());
				insert(n);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(" ERROR: Could not find the file!");
		}
		
//		display();
	}
	
	public void display() {
		Node iterator = head;
		System.out.println(" Displaying list: ");
		while(iterator != null) {
			System.out.print(" " + iterator.number);
			iterator = iterator.next;
		}
		System.out.println();
	}
	
	public boolean search(int n) { 
		Node iterator = head;
		
		while(iterator != null) {
			if (iterator.number == n) 
				return true;
			iterator = iterator.next;
		}
		return false;
		
	}
	
	public void delete(int n) {
		Node iterator = head;
		Node prevIterator = head;
		while(iterator != null) {
			if (iterator.number == n) {
				prevIterator.next = iterator.next;
				return;
			}
			iterator = iterator.next;
		}
		System.out.println(" ERROR: Could not find the number!");
	}
	
	public void checkNumber(int number) {
		
		if(search(number)) {
			System.out.println(" Found the number. Deleting number " + number);
			delete(number);
		}
		else {
			System.out.println(" Could not find number. Inserting number " + number);
			insert(number);
		}
	}
	
	public void writeToFile() {
		try {
			FileWriter fileWriter = new FileWriter("src/com/dataStructures/orderedList/outputOrderedList.txt");
			System.out.println(" Writing into file ");
			Node iterator = head;
			while(iterator != null) {
				fileWriter.write(" " + iterator.number);
				iterator = iterator.next;
			}
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(" Could not create new file with output!");
		}
	}
}
