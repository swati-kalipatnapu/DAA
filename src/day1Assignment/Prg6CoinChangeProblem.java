package day1Assignment;

public class Prg6CoinChangeProblem {

	public static void main(String[] args) {
	int[] money= {2000,500,100,50,20,10,5,2,1};
	int value = 7230;
	//int value1=0;
	int count= 0;
	String output="";
	for(int i : money) {
		if(value >=i) {
			int noOfCoins = (int)(value/i);
			value = value -(noOfCoins *i);
			count++;
		
		}
	}
	System.out.println(count);
	
		/*
		 * for(int i=0;i<money.length;i++) { while(value < money[i] && (value!=0 )) {
		 * i--; if(value >= money[i]) { value = value-money[i]; output = output+" "+
		 * money[i]; count++;}
		 * 
		 * }
		 * 
		 * if(value==0) { break; }
		 * 
		 * } for(int i=money.length-1;i>0;i--) { while(money[i]<=value) { value =
		 * value-money[i]; output = output+"Rs. "+money[i]+""; count++; } }
		 * 
		 * System.out.println(count+" BreakDown-->"+output);
		 */

	}

}
