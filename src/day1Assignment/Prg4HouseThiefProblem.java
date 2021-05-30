package day1Assignment;

public class Prg4HouseThiefProblem {

	public static void main(String[] args) {
		int[] arr = {20,5,1,13,6,11,40};
		int n= arr.length;
		System.out.println(maxLoot(arr,n));
	}
	//REcursion
	/*
	 * private static int maxLoot(int a[],int n){ int val= -1; if(n==0){ return
	 * a[0]; } if(n==1){ return Math.max(a[1],a[0]); } else val =
	 * Math.max(val,Math.max(maxLoot(a,n-1),a[n]+maxLoot(a,n-2))); return val; }
	 */
	private static int maxLoot(int[] arr, int n) {
		int value1 = arr[0];
		int value2 = Math.max(arr[1],arr[0]);
		int max = -1;
		if(n==0) {
			return value1;
		}
		if(n==1) {
			return value2;
		}
		//iterative method
		
		  for(int i=2;i<n;i++) {
			  max = Math.max(value1+arr[i], value2);
			  value1 = value2;
			  value2 = max; }
		 
		
		//recursive method
		/*else
			max = Math.max(max,Math.max(maxLoot(arr,n-1), arr[n]+maxLoot(arr, n-2)));
		*/
		return max;
				
	}	
	

}
