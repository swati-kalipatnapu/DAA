package day1Assignment;

import java.util.HashSet;

public class Prg8ElementSearchInArray {

	public static void main(String[] args) {
		int[] arr1 = {1,2,3,9,8,7};
		int[] arr2 = {4,1,2,10,15};
		int[] arr3 = {5,1,2,4,10};
		
		System.out.println(elementSearch(arr1,arr2,arr3));
		

	}

	private static HashSet<Integer> elementSearch(int[] arr1, int[] arr2, int[] arr3) {
		HashSet<Integer> hs = new HashSet();
		HashSet<Integer> count = new HashSet();
		for(int i=0;i<arr1.length;i++) {
			hs.add(arr1[i]);
		}
		for(int i=0;i<arr2.length;i++) {
			if(hs.contains(arr2[i])) {
				count.add(arr2[i]);
			}
			hs.add(arr2[i]);
		}
		for(int i=0;i<arr3.length;i++) {
			if(hs.contains(arr3[i])) {
				count.add(arr3[i]);
			}
			hs.add(arr3[i]);
		}
		
			
		
		//System.out.println(hs);
		//System.out.println(count);
		return count;
	}

}
