package day1Assignment;

public class Prg10DeleteElementInArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,5};
		int index = 2,j=0;
		int[] output = new int[arr.length-1];
		for(int i=0; i<arr.length;i++) {
			
			if(index != i) {
				 output[j] = arr[i];
				j++;
			}
			
		}
		for(int i=0; i<output.length;i++) {
			System.out.print(output[i]);
		}
	

	}

}
