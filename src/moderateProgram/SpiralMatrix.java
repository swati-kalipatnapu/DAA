package moderateProgram;

public class SpiralMatrix {

	public static void main(String[] args) {
		int n=3;
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		int lastRow = n;
		int lastColumn = n;
		spiralMatrix(arr,lastRow,lastColumn);

	}
	public static void spiralMatrix(int[][] arr,int lastRow,int lastColumn) {
		int firstColumn = 0;
		int firstRow = 0;
		
		while((firstRow < lastRow) && (firstColumn < lastColumn)){
			/*first row*/
		
				for(int i=firstColumn;i<lastColumn;i++) {
					System.out.print(arr[firstRow][i]+" ");
				}
				firstRow++;
			
			/* last Column */
			
				for(int i=firstRow;i<lastRow;i++) {
					System.out.print(arr[i][lastColumn-1]+" ");
				}
				lastColumn--;
			
			/* last row */
			if(firstColumn < lastColumn) {
				for(int i=lastColumn-1;i>=firstColumn;--i) {
					System.out.print(arr[lastRow-1][i]+" ");
				}
				lastRow--;
			}
			/*first column*/
			if(firstRow < lastRow) {
				for(int i=lastRow-1;i>=firstRow;--i) {
					System.out.print(arr[i][firstColumn]+" ");
				}
				firstColumn++;
			}
			
		}
	}

}
