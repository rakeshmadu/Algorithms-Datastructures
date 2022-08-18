package com.dataStructures.paranthesis;

public class SimpleBalancedParanthesis {
	
	char [] stack;
	int top = -1;
	int size;

	public SimpleBalancedParanthesis(int size) {
		// TODO Auto-generated constructor stub
		this.size = size;
		stack = new char[size];
	}
	
	public void push() {
		
		if(top + 1 < size)
			stack[++top] = '(';
		else
			System.out.println(" Stack overflow");
	}
	
	public void pop() {
		if(top > -2)
			top--;
	}
	
	public boolean isempty() {
		if(top == -1) {
			return true;
		}
		return false;
	}
	
	public void display() {
		System.out.print("STACK: ");
		for(int i = 0; i <= top; i++)
			System.out.print(" " + stack[i]);
		System.out.println();
	}
	
	public void peek() {
		if(top > -1)
			System.out.println(stack[top]);
		else
			System.out.println(" Stack is empty");
	}
	
	public int size() {
		return top + 1;
	}
	
	public void check(String str) {
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == '(') 
				push();
			else if(str.charAt(i) == ')') 
				pop();
		}
		if(isempty()) 
			System.out.println(" The parantheses are balanced");
		else
			System.out.println(" The parantheses are not balanced");
	}
}
