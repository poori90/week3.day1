package week3.day1;

public class AxisBank extends BankInfo {
	protected void deposit() {
		System.out.println("This is calling Deposit method in AxisBank Class");

	}

	public static void main(String[] args) {
		AxisBank ab= new AxisBank();
		ab.deposit();
		ab.saving();
		ab.fixed();

	}

}
