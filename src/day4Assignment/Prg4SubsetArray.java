package day4Assignment;

import java.util.HashSet;
import java.util.Set;

public class Prg4SubsetArray {

	public static void main(String[] args) {
		/*
		 * int[] arr1 = {11,1,13,21,3,7}; int[] arr2 = {11,3,7,1};
		 */
		int[] arr1 = {10,5,2,23,19};
		int[] arr2 = {19,5,3};
		
		if(subsetArray(arr1,arr2)) {
			System.out.println("arr2[] is a subset of arr1[]");
		}
		else {
			System.out.println("arr2[] is not a subset of arr1[]");
		}

	}

	private static boolean subsetArray(int[] arr1, int[] arr2) {
		int count = 0;
		Set s = new HashSet();
		for(int i=0;i<arr1.length;i++) {
			s.add(arr1[i]);
		}
		for(int i=0;i<arr2.length;i++) {
			if(s.contains(arr2[i])) {
				count++;
			}
		}
		if(count == arr2.length) {
			return true;
		}
		else {
		return false;}
		
		
	}

}
