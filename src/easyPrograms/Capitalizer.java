package easyPrograms;

public class Capitalizer {

	public static void main(String[] args) {
		String newSentence= "a short sentence";
		String[] newSent = newSentence.split(" ");
		
		//Solution one
		
		  String[] ch = newSentence.split(" "); for(int i=0;i<ch.length;i++) {
		  
		  
		  ch[i] = ch[i].substring(0,1).toUpperCase()+ ch[i].substring(1);
		  System.out.print(ch[i]+" "); }
		 
		/*String capitalizedString = newSent[0].toUpperCase();
		for(int i=1;i< newSent.length;i++) {
			if(newSent[i-1].equals(' ')) {
				capitalizedString +=newSent[i].toUpperCase();
			}
			else {
				capitalizedString +=newSent[i];
			}
		
		}
		System.out.print(capitalizedString+" ");
		}*/
	}}
		

	


