package day1Assignment;

public class Prg5FirstRepeatingElement {

	public static void main(String[] args) {
		int[] arr = {1,2,3,10,2,4,3,7,8};
		int n = arr.length;
		int[] newArr = new int[arr.length];
		int max=0;
		for(int i=0;i<n;i++) {
			newArr[i] = 1;
			for(int j=i+1;j<n-1;j++) {
				if(arr[i]==arr[j]&& arr[j]!=0) {
					newArr[i]++;
					arr[j] = 0;
				}
				
			}
			System.out.print(newArr[i]+" ");
		}
		for(int i=0;i<n;i++) {
			
			if(newArr[i] > 1) {
				System.out.println("max element is: "+arr[i]);
				break;
				
			}
		}
		

	}

}
