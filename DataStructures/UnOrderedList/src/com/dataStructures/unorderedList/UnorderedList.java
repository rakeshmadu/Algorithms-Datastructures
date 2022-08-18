package com.dataStructures.unorderedList;

import java.io.FileWriter;
import java.io.IOException;

public class UnorderedList {
	
	Node head = null;

	public void insert(String word) {
		Node node = new Node(word);
		if (head == null) {
			head = node;
		}
		else {
			Node iterator = head;
			while(iterator.next != null) {
				iterator = iterator.next;
			}
			iterator.next = node;
		}
	}
	
	public void checkWord(String word) {
		if (search(word)) {
			System.out.println(" Found the word: " + word);
			delete(word);
		}
		else {
			System.out.println(" Did not find the word, so now inserting " + word);
			insert(word);
		}
	}
	
	public void delete(String word) {
		if (head == null) {
			System.out.println(" Cannot delete from an empty list!");
			return;
		}
		
		Node iterator = head; 
		Node prevIterator = head;
		while(iterator != null) {
			if(iterator.word.equals(word)) {
				prevIterator.next = iterator.next;
				break;
			}
			prevIterator = iterator;
			iterator = iterator.next;
		}
		System.out.println(" Deleted \"" + word + "\"");
	}
	
	public boolean search(String word) {
		Node iterator = head;
		while(iterator != null) {
			if(word.equals(iterator.word))
				return true;
			iterator = iterator.next;
		}
		
		return false;
	}
	
	public void display() {
		Node iterator = head;
		System.out.println();
		while(iterator != null) {
			System.out.print(" " + iterator.word);
			iterator = iterator.next;
		}
	}
	
	public void writeToFile() {
		try {
			FileWriter fileWriter = new FileWriter("src/outputUnOrderedList.txt");
			Node iterator = head;
			while(iterator != null) {
				fileWriter.write(" " + iterator.word);
				iterator = iterator.next;
			}
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(" File could not be created with the output");
		}
	}
}
