package day2Assignment;

public class Prg10FractionAdditionSub {

	public static void main(String[] args) {
		String input = "-1/2+1/2+1/3";
		System.out.println(fractionAddition(input));
		
	}

	private static String fractionAddition(String input) {
		String tokens[] = input.split("(?=[-+])");
		int res[] = {0,1};
		int num =0,den=0;
		for(String token : tokens) {
			if(token.startsWith("-") || token.startsWith("+") || token.startsWith("")) {
				num = Integer.parseInt(token.substring(0, token.indexOf("/")));
				den = Integer.parseInt(token.substring(token.indexOf("/")+1, token.length()));
				res[0] = den * res[0] + num * res[1];
				res[1] = den * res[1];
			}
		}
		if(res[0] == 0) {
			return "0/1";
		}
		else {
			return fraction(res[0],res[1]);
		}
		
	}

	private static long gcd(long a,long b) {
		return (a%b)==0 ? b : gcd(b,a%b);
	}
	private static String fraction(int a, int b) {
		long gcd = gcd(a,b);
		if(gcd < 0) {
			return -1*(a/gcd) + "/" +(-1*(b/gcd));
		}
		else {
			return (a/gcd) + "/" +(b/gcd);
		}
		
	}

}
