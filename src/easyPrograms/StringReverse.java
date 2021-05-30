package easyPrograms;
public class StringReverse {
	String str1;
	StringBuilder revStr= new StringBuilder();
	public String strReverse(String str) {
		
		str1 = str;
		
		//using charAt function
		/*
		 * for(int i=str1.length()-1;i>=0;i--) { revStr =revStr+str.charAt(i);
		 * 
		 * } return revStr;
		 */
		
		
		 //using reverse function
		/*
		 * revStr = revStr.append(str1); revStr.reverse();
		 * 
		 * return revStr.toString();
		 */
		
		//using split()
		/*
		 * String str2=""; String[] ch = str1.split(""); for(int
		 * i=str1.length()-1;i>=0;i--) { str2 = str2 +(ch[i]); } return str2;
		 */
		//using toCharArray()
		String strRev="";
		char[] ch = str.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			strRev = strRev + ch[i];
		}
		return strRev;
	}
	
}
