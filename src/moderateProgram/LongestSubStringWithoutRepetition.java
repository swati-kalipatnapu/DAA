package moderateProgram;

import java.util.HashSet;
public class LongestSubStringWithoutRepetition {

	public static void main(String[] args) {
		
		String str = "abcdeabf";
		String longestSubString = longestSubString(str);
		System.out.println(longestSubString);
		
	}

	public static String longestSubString(String str) {
		HashSet<Character> set = new HashSet();
		String longestTillNow = "";
		String longestOverall = "";
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			
			if(set.contains(ch)) {
				longestTillNow = "";
				//set.clear();
			}
			
				set.add(ch);
				longestTillNow += ch;
			
			if(longestTillNow.length() > longestOverall.length()) {
				longestOverall = longestTillNow;
			}
		}
			
		
		return longestOverall;
	}
	

}
