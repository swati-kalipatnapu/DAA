package easyPrograms;

public class MaxChars {

	public static void main(String[] args) {
		String str = "Hello There";
		str = str.toUpperCase();
		char[] charArray = str.toCharArray();
		int[] wordCount = new int[charArray.length];
		
		for(int i=0 ; i< charArray.length;i++) {
			wordCount[i] = 1;
			for(int j=i+1;j<=charArray.length-1;j++) {
				if(charArray[i]==charArray[j] && charArray[i]!=' ' && charArray[j]!='0') {
					wordCount[i]++;
					charArray[j] ='0';
				}
			}
		}
		for(int i=0 ; i< charArray.length;i++) {
			System.out.println(charArray[i]+"-->"+wordCount[i]);
			if(wordCount[i]> 1) {
				System.out.println(charArray[i]+" is repeated "+wordCount[i]+" times.");
			}
		}
		
	}
}