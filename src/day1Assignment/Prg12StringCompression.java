package day1Assignment;

public class Prg12StringCompression {

	public static void main(String[] args) {
		//Run Length Encoding
		/*
		 * String inputString = "aabbccc"; int count = 0; String outputString = "";
		 * for(int i = 0;i<inputString.length();i++){ count = 1; while(i <
		 * inputString.length()-1 && inputString.charAt(i)==inputString.charAt(i+1)) {
		 * count++; i++; } outputString = outputString + inputString.charAt(i)+count; }
		 * System.out.println(inputString);
		 * System.out.println("output-->"+outputString);
		 */
		char[] ch = {'a','a','a','b','b','a','a'};
		int grpLength = 0;
		String outputString = "";
		for(int i = 0;i<ch.length;i++) {
			grpLength = 1;
			while(i<ch.length-1 && ch[i] == ch[i+1]) {
				grpLength++;
				i++;
			}
			outputString = outputString + ch[i] + grpLength;
		}
		char[] outputCharArr = outputString.toCharArray();
		System.out.print(outputCharArr.length+"---> [");
		for(int i=0;i<outputCharArr.length;i++) {
			System.out.print(" "+"\'"+outputCharArr[i]+"\'");
		}
		System.out.print("]");
	}

}
