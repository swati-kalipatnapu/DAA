package easyPrograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountVowels {

	public static void main(String[] args) {
		String str = "a";
		int finalCount = vowels(str.toLowerCase());
		System.out.println(finalCount);

	}

	public static int vowels(String str) {
		int count = 0;

		/*
		 * for(int i=0;i<str.length();i++) {
		 * 
		 * 
		 * switch(ch) { case 'a' : count++;break; case 'e' : count++;break; case 'i' :
		 * count++;break; case 'o' : count++;break; case 'u' : count++;break;
		 * 
		 * 
		 * }
		 */
		
		//Using recursion
		count = str.replaceAll("[^aeiouAEIOU]","").length();
		return count;
	}

}
