package easyPrograms;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

	public static void main(String[] args) {
		int n = 7;
		int[] arr = new int[n];
		/*
		 * arr[0] = 0; arr[1] = 1; int value = 0;
		 */
		//System.out.print(arr[0]+" "+arr[1]+" ");
		//System.out.print(fib0+" "+fib1+" "+" ");
		
		/*
		 * for(int i=2;i<n;i++) {
		 * 
		 * arr[i] = arr[i-2] + arr[i-1];
		 * 
		 * 
		 * value = arr[i];
		 * 
		 * }System.out.print(value+" ");
		 */
		System.out.println(fib(n));
		
	}
	//Using memoization for efficient at runtime
	public static int fib(int num) {
		Map<Integer,Integer> memo = new HashMap<>();
		if(num==0 || num==1) {
			return num;
		}
		else if(memo.containsKey(num)){
			return num;
		}
		int result = fib(num-1) + fib(num-2);
		memo.put(num, result);
		return result;
	}

}
