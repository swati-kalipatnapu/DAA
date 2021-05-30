package easyPrograms;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = {5,6,8,1,2,9,10,3};
		int[] newArr = sort(arr);
		for(int i=0;i<newArr.length;i++) {
			System.out.print(newArr[i]+" ");
		}

	}

	private static int[] sort(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			int element = arr[i];
			int j=i-1;
			while(j>=0 && arr[j] > element) {
				arr[j+1] = arr[j];
				j--;
				
			}
			arr[j+1] = element;
		}
		
		
		
		return arr;
	}

}
