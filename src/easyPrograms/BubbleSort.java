package easyPrograms;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {5,6,8,1,2,9,10,3};
		int[] newArr = sort(arr);
		for(int i=0;i<newArr.length;i++) {
			System.out.print(newArr[i]+" ");
		}
		

	}
	public static int[] sort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j] >arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
		
	}

}
