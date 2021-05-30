package easyPrograms;

/**
 * @author snethi
 *	To print a pyramid
 *	 * 
 *  ***
 * *****
 */
public class PyramidProb {

	public static void main(String[] args) {
		int n=5;
		int star = 1;
		int space = n-1;
		//USing iterative approach
		/*
		 * for(int i=0;i<n;i++) { for(int k=0;k<space;k++) { System.out.print(" "); }
		 * for(int j=0;j<star;j++) { System.out.print("*"); } star = star+2; space--;
		 * System.out.println(); }
		 */
		
		//Using Recursion
		
		pyramid(n,star,space);
		
	}
	public static void pyramid(int n,int star,int space) {
		if(space<0) {
			return;
		}
		printPyramid(star,space);
		System.out.println();
		pyramid(n,star+2,space-1);
	}
	public static void printPyramid(int star,int space) {
		while(space!=0) {
			System.out.print(" ");
		space--;
		}
		while(star!=0) {
			System.out.print("*");
			star--;
		}
		
		
	}
}
