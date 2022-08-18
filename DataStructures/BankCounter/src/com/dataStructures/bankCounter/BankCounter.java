package com.dataStructures.bankCounter;

public class BankCounter {

	int totalAmount = 0;
	int head = -1;
	int tail = -1;
	String queue[];

	public BankCounter(int size) {
		// TODO Auto-generated constructor stub
		queue = new String[size];
	}

	public void enqueue(int amount, String name) {
		if (tail < queue.length - 1) {
			queue[++tail] = name;
			totalAmount += amount;
			if (head == -1) 
				head++;
			return;
		}

		System.out.println(" The queue is full");

	}

	public void dequeue() {
		if (head < queue.length && head < tail) {
			head++;
		}

	}
	
	public void display() {
		System.out.println(" ---- QUEUE ----");
		if (head > tail || head == -1) {
			System.out.println(" [EMPTY] ");
			return;
		}
		for(int i = head; i <= tail; i++) {
			System.out.print(" " + queue[i]);
		}
		System.out.println();
	}
}
