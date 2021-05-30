package easyPrograms;

public class StepsProblem {

	public static void main(String[] args) {
		printSteps(5,1);

	}
	public static void printSteps(int n ,int row){
		//to print stairs
		/*
		 * for(int i=0;i<number;i++) { 
		 * for(int j=0;j<=i;j++) {
		 *  System.out.print("#"); }
		 * System.out.println(" "); }
		 */
		//to count number of steps for given number 
		/*
		 * if (n == 1 || n == 0) return 1; else if (n == 2) return 2;
		 * 
		 * else return printSteps(n - 3) + printSteps(n - 2) + printSteps(n - 1);
		 */
		//Using Recursion
		if(row > n)
			return;
		
		print(row);
		System.out.println();
		printSteps(n,row+1);
		
	}
	private static void print(int row) {
		if(row<=0)
			return;
		System.out.print("*");
		print(row-1);
	}
}
