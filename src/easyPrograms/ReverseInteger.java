package easyPrograms;

public class ReverseInteger {

	public static void main(String[] args) {
		int value = -159;
		int revValue=0;
		while((value>0) ||(value < 0)){
			revValue = (revValue*10) + value%10;
			value = value/10;
		}
		
		System.out.println(revValue);

	}

}
