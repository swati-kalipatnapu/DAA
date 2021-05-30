package easyPrograms;

public class FizzBuzz {

	public static void main(String[] args) {
		fizzBuzz(30);

	}
	public static void fizzBuzz(int number) {
		for(int i=1;i<=number;i++) {
		if(i%3==0 && i%5==0) {
			System.out.println("fizzbuzz");
		}
		else if(i%5 == 0) {
			System.out.println("buzz");
		}
		else if(i%3==0) {
			System.out.println("fizz");
		}
		else {
			System.out.println(i);
		}
		
		}
		
	}

}
