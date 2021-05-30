package day1Assignment;

public class Prg3DistinctCombinationProblem {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		int n = arr.length;
		int key = 2;
		distinctCombo(arr," ",0,n,key);
	}
	private static void distinctCombo(int[] arr,String output,int i,int n,int key) {
		if(key > n ) {
			//System.out.println("Invalid inputs");
			return;
		}
		if(key == 0) {
			System.out.print(output+ " ");
			return;
			
		}
		for(int j=i;j<n;j++) {
			distinctCombo(arr, output+" "+arr[j], j+1, n, key-1);
		}
		
		return;
	}
	

}















/*package day1Assignment;

public class DistinctCombinationProblem {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		int k = 3;
		distinctCombo(arr," ",0,arr.length,k);
		

	}
	private static void distinctCombo(int[] arr,String output,int i,int n,int key) {
		if(key>n) {
			System.out.println("invalid inputs");
			return;}
		if(key == 0) {
			System.out.println(output);
		return;}
		for(int j=i;j<n;j++) {
			distinctCombo(arr, output+" "+ arr[j], j+1, n, key-1);
		}
		return;
	}

}
*/
