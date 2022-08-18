package com.dataStructures.palindrome;

public class PalindromeChecker {
	
	char [] queue;
	int tail;
	int head;
	
	public PalindromeChecker(int size) {
		// TODO Auto-generated constructor stub
		this.queue = new char[size];
		tail = head = - 1;
	}

	public void insertRear(char c) {
		
		if(tail == queue.length - 1) {
			System.out.println(" Queue is full");
			return;
		}
		if(head == -1)
			head++;
		queue[++tail] = c;
	}
	
	public boolean removeRear(char c) {
		if(queue[tail--] == c)
			return true;
		return false;
	}
	
	public void checkPalindrome(String s) {
		char[] arrayString = s.toCharArray();
		int mid = s.length() / 2;
		
		for(int i = 0; i < mid; i++) {
			insertRear(arrayString[i]);
		}
		
		if (s.length() % 2 != 0) 			
			mid++;
		
		for(int i = mid; i < s.length(); i++) {
			if(!removeRear(arrayString[i]) ) { 
				System.out.println(s + " is not a palindrome");
				return;
			}
		}
		
		System.out.println(s + " is a palindrome");
	}
}
