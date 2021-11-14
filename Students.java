package week3.day1;
import java.lang.String;

public class Students {
	
	public void getStudentInfo() {
		
		System.out.println("This is calling empty Get Student Info Mehod ");
	}
	public void getStudentInfo(int id) {
		System.out.println("This is calling Student ID in Get Student Info Method:   "+ id);
	}
	
	public void getStudentInfo(int id,  String name) {
		System.out.println("This is calling Student ID and Name in Get Student Info Method:   "+ id + " , "  +name);
	}
	public void getStudentInfo(String email,String ph) {
	System.out.println("This is calling Student email and phone number in Get Student Info Method  "+ email + " , "  + ph);
}
	public static void main(String[] args) {
		
		Students st =new Students();
		st.getStudentInfo();
		st.getStudentInfo(5544);
		st.getStudentInfo(5544,"UjwalaPriya");
		st.getStudentInfo("ujwala@gmail.com","9876543210");

	}

}
