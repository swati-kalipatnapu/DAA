package day2Assignment;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
public class Prg7PalindromeLinkedList {

	public static void main(String[] args) {
		LinkedList<Character> list = new LinkedList<>();
		/*
		 * LinkedList<Character> list = new LinkedList<>(); Scanner sc = new
		 * Scanner(System.in); System.out.println("Enter the length of list: "); int
		 * wordLength = sc.nextInt(); System.out.println("Enter the list: "); for(int
		 * i=0;i<wordLength;i++) { list.add(sc.next().charAt(i)); }
		 * System.out.println(list);
		 */
		list.add('R');
		list.add('a');
		list.add('D');
		list.add('A');
		list.add('r');
		/*
		 * list.add('C'); list.add('o'); list.add('r'); list.add('o'); list.add('n');
		 * list.add('a');
		 */
		isPalindrome(list);
		
	}
	private static void isPalindrome(LinkedList<Character> list) {
		int size = list.size();
		String str = "";
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			str = str+itr.next();
		}
		String revStr = "";
		while(size-1>=0){
			revStr =revStr+ list.get(size-1);
			size--;
		}
		if(str.equalsIgnoreCase(revStr)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}
		

	}

}
