package easyPrograms;

public class Palindrome {

	public static void main(String[] args) {
		String str = "adda";
		String[] revStr=str.split("");
		/*
		 * String[] newStr = str.split(""); for(int i=newStr.length-1 ; i>=0 ; i--) {
		 * revStr += newStr[i]; }
		 */
		/*
		 * StringBuilder sb = new StringBuilder(str.length()); sb.append(str); revStr=
		 * sb.reverse().toString();
		 * 
		 * System.out.println(str); System.out.println(sb);
		 * 
		 * if(str.equals(revStr)) { System.out.println("Palindrome"); } else {
		 * System.out.println("Not a palindrome"); }
		 */
		int j=revStr.length-1;
		for(int i=0;i<revStr.length;i++) {
			if(revStr[i].contentEquals(revStr[j])) {
				System.out.print(revStr[i]);
				j--;
			}
			
		}
	}

}
