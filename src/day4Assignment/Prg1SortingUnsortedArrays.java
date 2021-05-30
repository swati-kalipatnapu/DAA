package day4Assignment;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Prg1SortingUnsortedArrays {

	public static void main(String[] args) {
		int[] a = {10,5,15};
		int[] b = {20,3,2};
		Arrays.sort(a);
		Arrays.sort(b);
		int sizeA = a.length;
		int sizeB  =b.length;
		mergeSort(a,b,sizeA,sizeB);
		
	}
	private static void mergeSort(int[] a,int[] b,int sizeA ,int sizeB) {
		Map<Integer,Boolean> map = new HashMap<Integer,Boolean>();
		for(int i=0;i<sizeA ;i++) {
			map.put(a[i], true);
			for(int j=0;j<sizeB ;j++) {
				map.put(b[j], true);
				}
		}
			
					
				


	
		for(Map.Entry<Integer, Boolean> ma: map.entrySet()) {
			System.out.print(ma.getKey()+" ");
			
		}
	
}
	}		
		
		
		
		
		
		
		
		
		
		
		