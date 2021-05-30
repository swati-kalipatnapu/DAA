package day1Assignment;
import java.util.Scanner;
public class Prg2ReplaceArrayWithProductOfOtherElements {

	public static void main(String[] args) {
		int n;
	int[] arr;
	Scanner sc = new Scanner(System.in);
	System.out.println("Number of elements in array");
	n = sc.nextInt();
	arr = new int[n];
	for(int i=0;i<n;i++) {
		arr[i] = sc.nextInt();
	}
	printProductOfElements(arr,n);
	}
	
	private static int[] printProductOfElements(int[] arr,int num) {
		int product = 1;
		for(int i=0;i<num;i++) {
			product = product * arr[i];
		}
		System.out.println(product);
		for(int i=0;i<num;i++) {
			arr[i] =product/arr[i]  ;
			System.out.print(arr[i]+" ");
		}
		
		
	
		return null;
	}

}
