package day4Assignment;

import java.util.Arrays;

public class Prg3MaxProduct {

	public static void main(String[] args) {
		int[] arr = {-10,-3,5,6,-20};
		Arrays.sort(arr);
		System.out.println(maxProduct(arr,arr.length));
	}

	private static String maxProduct(int[] arr, int length) {
		int n=length;
		int number1,number2;
		
		int productMin = arr[0] * arr[1];
		int productMax = arr[n-1] * arr[n-2];
		if(productMin> productMax) {
			number1 = arr[0];
			number2 = arr[1];
		}
		else {
		number1 = arr[n-1];
		number2 = arr[n-2];
		}
		return number1 +" "+ number2;
	}

}
