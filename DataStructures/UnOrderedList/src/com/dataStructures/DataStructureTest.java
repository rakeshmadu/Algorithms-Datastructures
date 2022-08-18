package com.dataStructures;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.dataStructures.unorderedList.UnorderedList;

public class DataStructureTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		UnorderedList list = new UnorderedList();
		String str = "";
		int ch;
		try {
			Scanner scanFile = new Scanner(new File("src/input.txt") );
			str = scanFile.nextLine();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(" ERROR: The file was not found!");
		}
		
		for (String words : str.split(" ") ) {
			list.insert(words);
		}
		list.display();
		
		while(true) {
			System.out.println("\n 1. Search word\n 2. Display list\n 3. Finish up");
			System.out.print(" Please enter your choice: ");
			ch = scan.nextInt();
			
			switch(ch) {
			case 1: 
				System.out.print(" Please enter the word you want to search for: ");
				String word = scan.next();
				list.checkWord(word);
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
