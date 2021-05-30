package easyPrograms;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr = {5,6,8,1,2,9,10,3};
		int start = 0;
		int end = arr.length - 1;
		for(int i=0 ;i <arr.length;i++) {
			 System.out.print(arr[i]+" ");
		 }
		 mergeSort(arr,start,end);
		 System.out.println();
		 for(int i=0 ;i <arr.length;i++) {
			 System.out.print(arr[i]+" ");
		 }
		

	}
	

	public static void mergeSort(int[] arr, int start, int end) {
		if(end <= start) {
			return;
		}
		
			int mid = (start+end)/2;
			mergeSort(arr,start,mid);
			mergeSort(arr,mid+1,end);
			merge(arr,start,mid,end);
		
	}
	
	
	public static void merge(int[] arr, int start,int mid,int end) {
		int leftSlot = start;
		int rightSlot = mid+1;
		int k = 0;
		int[] temp = new int[end-start +1];
		while(leftSlot <= mid && rightSlot <=end) {
			if(arr[leftSlot] < arr[rightSlot]) {
				 temp[k] = arr[leftSlot];
				leftSlot++;
				
			}
			else {
				temp[k] = arr[rightSlot];
				rightSlot++;
				
			}k++;
		}
		
		if(leftSlot <= mid) {
			while(leftSlot <=mid) {
				temp[k] = arr[leftSlot];
				leftSlot++;
				k++;
			}
		}
		else if(rightSlot <= end) {
			while(rightSlot <= end) {
				temp[k] = arr[rightSlot];
				rightSlot++;
				k++;
			}
		}
		for(int i=0;i<temp.length;i++) {
			arr[start+i] = temp[i];
		}
		
	}

}
