package day1Assignment;

public class Prg9FactorsOfNumber {

	public static void main(String[] args) {
		int lastNumber = 100;
		int number = 1;
		while(number <=100) {
		System.out.print("Factors of "+number+"is: " );
			
		for(int i = 1; i <= number ;i++) {
				
			if(number%i == 0) {
				System.out.print(i+" ");
			}
			
		}
		number++;
		System.out.println();
	}
	}


}
