package easyPrograms;

public class OccurrenceOfCharInString {

	public static void main(String[] args) {
		String str = "Hello World";
		String ch ="l";
		int number = numberOfOccurrence(str,ch);
		System.out.println(number);

	}

	private static int numberOfOccurrence(String str,String ch) {
		/*
		 * int count = 0; for(int i=0;i<str.length();i++) { if(str.charAt(i) == (ch)) {
		 * count++; } } return count;
		 */
		int strLen = str.length();
		int newStrLen = 0;
		str = str.replace(ch,"");
		newStrLen = str.length();
		int count = strLen - newStrLen;
		return count;
	}

}
