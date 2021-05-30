package easyPrograms;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = {5,6,8,1,2,9,10,3,0};
		int[] newArr = sort(arr);
		for(int i=0;i<newArr.length;i++) {
			System.out.print(newArr[i]+" ");
		}

	}

	private static int[] sort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int min =i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[min] > arr[j]) {
					int temp = arr[min];
					arr[min] = arr[j];
					arr[j] = temp;
				}
				
			}
		}
		return arr;
	}

}
