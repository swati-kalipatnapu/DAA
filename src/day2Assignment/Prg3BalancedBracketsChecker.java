package day2Assignment;

import java.util.Stack;

public class Prg3BalancedBracketsChecker {

	public static void main(String[] args) {
		String str = "[()]{}{[()()]()}";
		
		  int n = -1; 
		  while(str.length() != n) { 
			  n =str.length();
			  str = str.replace("()","");
			  str = str.replace("[]","");
			  str = str.replace("{}",""); 
		  } 
		  if(str.length() == 0) {
		  System.out.println("Balanced"); 
		  } else { System.out.println("Not Balanced");
		  }
		 
	}
		
	}

	


