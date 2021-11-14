package week3.day1;

public class Mobile {
	
	public void sendMsg() {
		System.out.println("This is calling Send Message Method ");

	}
	public void makeCall() {

		System.out.println("This is calling Make Call Method ");

	}
	public void saveContact() {
		
		System.out.println("This is calling Save Contact Method ");
	}
	public static void main(String[] args) {
		
		Mobile mob = new Mobile();
		mob.sendMsg();
		mob.makeCall();
		mob.saveContact();

	}

}
