package week3.day1;
import java.lang.String;

public class StringCompare {

	public static void main(String[] args) {
		String str = "I am Learning Java";
		String str1 = "I am learning java";
		if(str.equals(str1))
		
			System.out.println(" same content");
		
		else
			System.out.println(" diff content");
		
		if(str.equalsIgnoreCase(str1))
			
			System.out.println(" same content");
		
		else
			System.out.println(" diff content");
		if(str==str1)
			
			System.out.println(" same content");
		
		else
			System.out.println(" diff content");
	}

}