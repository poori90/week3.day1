package week3.day1;

public class AndroidPhone extends Mobile {
	public void takeVideo() {
		System.out.println("This is calling take Vedio Method from Android Phone Class");

	}

	public static void main(String[] args) {
	
		AndroidPhone ap = new AndroidPhone();
		ap.takeVideo();
	}

}
