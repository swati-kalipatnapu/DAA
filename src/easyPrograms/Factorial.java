package easyPrograms;
import java.util.*;
public class Factorial {
	final static long  startTime = System.nanoTime();
	public static void main(String[] args) {
		
		int n=4;
		System.out.println(fact(n));
		final long duration = (System.nanoTime() - startTime)/1000;
		System.out.println(duration+"ns");
	}
	public static int fact(int n) {
		Map<Integer,Integer> memo = new HashMap<>();
		if(n<2) {
			return 1;
		}
		
		  else if(memo.containsKey(n)) { return n; }
		 
		int result = n*fact(n-1);
		memo.put(n, result);
		System.out.println(memo);
		return result;
	}
	
	

}
