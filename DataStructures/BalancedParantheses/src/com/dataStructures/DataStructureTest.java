package com.dataStructures;

import com.dataStructures.paranthesis.SimpleBalancedParanthesis;

public class DataStructureTest {

	public static void main(String[] args) {
		
		String str = "(5+6)*(7+8)/(4+3)(5+6)*(7+8)/(4+3)";
		SimpleBalancedParanthesis obj = new SimpleBalancedParanthesis(str.length());
		
		obj.check(str);		
	}
}
