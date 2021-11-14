package week3.day1;

public class SmartPhone extends AndroidPhone {

	public void connectWhatsApp() {
		System.out.println("This is calling Connect WatsApp Method from SmartPhone Class ");

	}
	public void takeVedio() {
		System.out.println("This is calling take Vedio  Method from SmartPhone Class  ");

	}
	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone();
		sp.connectWhatsApp();
		sp.takeVedio();

	}

}
