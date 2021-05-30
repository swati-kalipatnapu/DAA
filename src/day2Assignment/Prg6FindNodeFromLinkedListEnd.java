package day2Assignment;

import java.util.LinkedList;
import java.util.Scanner;
public class Prg6FindNodeFromLinkedListEnd {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		LinkedList<Integer> ll =new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of nodes in the list: ");
		int numberOfNodes = sc.nextInt();
		System.out.println("Enter the values into the list: ");
		for(int i=0;i<numberOfNodes;i++) {
			ll.add(sc.nextInt());
		}
		System.out.println("Enter the index of the element to be searched from the last: ");
		int searchIndex = sc.nextInt(); //from end
		
		
		 
		int nodeValue = getNthFromLast(ll,searchIndex);
		System.out.println("Element found at "+searchIndex+" th/nd/st position from last of linkedlist is: ");
		if(nodeValue == -1) {
			System.out.println("Element is not present in the list");
		}
		else {
		System.out.println(nodeValue);}
		//System.out.println(ll);
	}
	
	private static int getNthFromLast(LinkedList<Integer> ll,int searchIndex) {
		/*
		 * int currentNode = 0; if(nodeToSearch > ll.size()) { return -1; } else {
		 * while(nodeToSearch >0) { currentNode = ll.pollLast();
		 * 
		 * nodeToSearch--; } } return currentNode;
		 */
		int value = -1;
		int length = ll.size();
		if(searchIndex < length) {
			value = ll.get(length-searchIndex);
		}
		return value;
	}

}
