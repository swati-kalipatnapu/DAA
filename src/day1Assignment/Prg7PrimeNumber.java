package day1Assignment;

import java.util.Scanner;
public class Prg7PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		if(isPrime(n)) {
			System.out.println("prime number");
		}
		else {
			System.out.println("not a prime number");
		}

	}
	private static boolean  isPrime(int n) {
		if(n<=1)
			return false;
		for(int i=2;i*i<n;i++) {
			if(n%i== 0) {
				return false;
			}
		}
		
		
		return true;
	}

}
