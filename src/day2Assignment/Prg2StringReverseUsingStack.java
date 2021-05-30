package day2Assignment;

import java.util.Stack;
import java.util.Scanner;
public class Prg2StringReverseUsingStack {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] str1 = str.split(" ");
		for(int i=0;i<str1.length;i++) {
		 charReverseUsingStack(str1[i]);
		 }
		String reverseStr = stringReverseUsingStack(str);
		System.out.println("Input--> "+str);
		System.out.println("Output--> "+reverseStr);
	}
	
	private static String stringReverseUsingStack(String str) {
		Stack<Character> stk = new Stack<>();
		for(int i=0;i<str.length();i++) {
			stk.push(str.charAt(i));
		}
		String revStr = "";
		System.out.println(stk.size());
		for(int i=stk.size();i>0;i--) {
			
			revStr +=stk.pop();
		}
		return revStr;
	}
	private static void charReverseUsingStack(String str1) {
		Stack<Character> stk = new Stack<>();
		for(int i=0;i<str1.length();i++) {
			stk.push(str1.charAt(i));
		}
		String revStr = "";
		
		for(int i=stk.size();i>0;i--) {
			
			revStr +=stk.pop();
		}
		System.out.println(revStr);
	}
}
