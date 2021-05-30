package moderateProgram;
import java.util.Arrays;
public class Anagrams {

	public static void main(String[] args) {
		String str1 ="hello!! De1ar";
		String str2 = "e!!lloh d1are";
		str1 = str1.replaceAll("[^\\w]","");
		str2 = str2.replaceAll("[^\\w]","");
		if(str1.length()!=str2.length()) {
			System.out.println("not anagrams");
		}
		else {
		char[] arr1 = str1.toLowerCase().toCharArray();
		char[] arr2 = str2.toLowerCase().toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		str1 = String.valueOf(arr1);
		str2 = String.valueOf(arr2);
		boolean status = str1.equals(str2);
		if(status) {
			System.out.println("strings are anagrams");
		}
		else {
			System.out.println("not anagrams");
		}
		}
	}
		
	
}
