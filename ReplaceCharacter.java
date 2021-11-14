package week3.day1;
import java.lang.String;

public class ReplaceCharacter {

	public static void main(String[] args) {
		// replace 8 to 11
		String sentence = "I am working with Java8";
		
		String replaceString=sentence.replace('8','1');
		String newSen = replaceString+1;
		System.out.println(newSen);
		
		// String sentence = "I am working with Java8"
		
		char[] strArray = newSen.toCharArray();
		
		System.out.println("*************************************************************");
		System.out.println("Printing  position of charcters from  5 to 14 : " );
		
		  for (int i = 5; i<=14; i++) 
		  { 
			  System.out.print(strArray[i]);
		  }
	}
}