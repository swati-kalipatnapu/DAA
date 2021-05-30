package day1Assignment;
import java.util.Scanner;
public class Prg1DigitCounter {

	public static void main(String[] args) {
		int n ;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println(digitCounter(n));

	}
	private static int digitCounter(int number) {
		int count=0;
		while(number > 0) {
			number /= 10;
			count++;
			
		}
		
		return count;
	}

}
