package day2Assignment;

public class Prg9GameOfLife {

	public static void main(String[] args) {
		
		int[][]arr = {
				{1,1},{1,0}
				
				/*
				 * {0,1,0}, {0,0,1}, {1,1,1}, {0,0,0}
				 */
				 
		};
		gameOfLife(arr);
	}

	private static void gameOfLife(int[][] arr) {
		int m = arr.length;
		int n = arr[0].length;
		System.out.println(n);
		int[][] future = new int[m][n];
		for(int i =0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i =0;i<m;i++) {
			for(int j=0;j<n;j++) {
				future[i][j] = arr[i][j];
			
			}
		}
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				
				int n1 = i==0 || j==0 ? 0 : future[i-1][j-1];
				int n2 = i==0? 0 : future[i-1][j];
				int n3 = i==0 || j== n -1 ?0 : future[i-1][j+1];
				int n4 = j == 0 ? 0: future[i][j-1];
				int n5 = j == n-1 ? 0: future[i][j+1];
				int n6 = i == m -1 || j == 0? 0: future[i+1][j-1];
				int n7 = i == m-1 ? 0: future[i+1][j];
				int n8 = i == m -1 ||j == n-1 ?0: future[i+1][j+1];
				int k= n1+n2+n3+n4+n5+n6+n7+n8;
				if(arr[i][j] == 1 && (k<2 || k>3)) arr[i][j] = 0;
				if(arr[i][j] == 0 && k==3) arr[i][j] = 1;
			}
			
		}
		 for(int i =0;i<m;i++) { 
			 for(int j=0;j<n;j++) {
				 if(arr[i][j] == 0) {
					 System.out.print("0 ");
				 }
				 else {
					 System.out.print("1 ");
				 }
			} System.out.println(); 
			}
		/*
		 * for(int i=1;i<m-1;i++) { for(int j=1;j<n-1;j++) { int aliveNeighbours = 0;
		 * for(int k1=0;k1<=2;k1++ ) { for(int k2=0;k2<=2;k2++) { int ii = i; int jj= j;
		 * if(k1==2 &&k2==2) { aliveNeighbours += arr[k1+--ii][k2+--jj]; }
		 * aliveNeighbours += arr[k1][k2]; } }//aliveNeighbours added aliveNeighbours -=
		 * arr[i][j];
		 * 
		 * //Applying the rules of Game Of Life if( arr[i][j] == 1 && (aliveNeighbours
		 * <2)) { future[i][j] = 0; } else if((arr[i][j])==0 &&((aliveNeighbours ==
		 * 2)||(aliveNeighbours == 3))) { future[i][j] = 1; } else if((arr[i][j])==1 &&
		 * (aliveNeighbours > 3)) { future[i][j] = 0; } else { future[i][j] = arr[i][j];
		 * } } }//end of for
		 * 
		 * for(int i =0;i<m;i++) { for(int j=0;j<n;j++) {
		 * System.out.print(future[i][j]+" "); } System.out.println(); }
		 */
	}

}
