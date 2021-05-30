package day4Assignment;

import java.util.Arrays;

public class Prg2MaxSumArray {

	public static void main(String[] args) {
		int[] arr = {4,6,2,7,9,8};
		Arrays.parallelSort(arr);
		
		System.out.println(maxSum(arr,arr.length));

	}

	private static String maxSum(int[] arr,int n) {
		int a=0,b=0;
		for(int i=n-1;i>=0;i--) {
			if(i%2 == 0) {
				b= b*10 + arr[i];
				
			}
			else {
				a = a*10 + arr[i];
			}
		}
		return "Max are "+a+" "+b;
		
	}

}
