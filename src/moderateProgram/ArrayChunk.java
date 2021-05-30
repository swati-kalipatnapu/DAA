package moderateProgram;

public class ArrayChunk {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int chunkSize = 2;
		
		int[][] chunkArr = chunkArr(arr,chunkSize);
		try {
		for(int i=0;i<chunkArr.length;i++) {
			for(int j=0;j<chunkArr.length-1;j++) {
				System.out.print("chunkArr["+i+"]"+"["+j+"]-->"+"["+chunkArr[i][j]+"]");
			}
			System.out.println();
		}
		}
		catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("");
		}
	 }
	public static int[][] chunkArr(int[] arr, int chunkSize){
	
		int numberOfChunks =  (int) (Math.ceil((double)arr.length/chunkSize));
		int[][] newArr = new int[numberOfChunks][];
		for(int i=0;i<numberOfChunks;i++) {
			int start = i*chunkSize;
			int length = Math.min(arr.length - start,chunkSize);
			int[] temp = new int[length];
			System.arraycopy(arr, start, temp, 0, length);
			newArr[i] = temp;

		}
		
		return newArr;
		
	}
}

