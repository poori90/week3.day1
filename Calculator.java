package week3.day1;

public class Calculator {

	private void add(int num1 ,int num2) {
		System.out.println("The sum of 2 Numbers are : " +(num1+num2));

	}
	private void add(int num1,int num2,int num3) {
		System.out.println("The sum of 3 Numbers are : " +(num1+num2+num3));

	}
	
	private void multiply(int num1 , int num2) {
		System.out.println("The multiply of 2 Numbers are : " +(num1*num2));

	}
	
	private void multiply(int num1, double num2) {
		
		System.out.println("The multiply of 2 Numbers are : " +(num1*num2));
	}
	
	private void subtract(int num1 , int num2) {
		
		System.out.println("The subtraction of 2 Numbers are : " +(num1-num2));
	}
	private void subtract(double num1,double num2) {
		
		System.out.println("The subtraction of 2 Numbers are : " +(num1-num2));
	}
	
	private void divide(int num1 , int num2) {
		System.out.println("The Divide of 2 Numbers are : " +(num1/num2));

	} 
	private void divide(int num1 ,double num2) {
		
		System.out.println("The Divide of 2 Numbers are : " +(num1/num2));

	}
	
	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		cal.add(3, 2);
		cal.add(1, 2, 3);
		cal.subtract(5d, 2d);
		cal.subtract(9, 2);
		cal.divide(8, 2);
		cal.divide(6, 2d);
		cal.multiply(2,3d);
		cal.multiply(7, 5);
	}

}
