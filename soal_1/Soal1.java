import java.util.Scanner;

public class Soal1 {
	public double inputNum;

	public Soal1(double inputNum) {
		this.inputNum = inputNum;
	}

	public void checkNum() {
		System.out.println(inputNum + " can be fitted in:");
		if ((inputNum >= Short.MIN_VALUE) && (inputNum <= Short.MAX_VALUE)) {
			System.out.println("* short");
			System.out.println("* int");
			System.out.println("* long");
		} else {
			if ((inputNum >= Integer.MIN_VALUE) && (inputNum <= Integer.MAX_VALUE)) {
				System.out.println("* int");
				System.out.println("* long");
			} else {
				if ((inputNum >= Long.MIN_VALUE) && (inputNum <= Long.MAX_VALUE)) {
					System.out.println("* long");
				} else {
					System.out.println(inputNum + " can\'t be fitted anywhere.");
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner scanThis = new Scanner(System.in); // Create a Scanner object
		System.out.print("Enter a number: ");
		double num = scanThis.nextDouble();
		Soal1 myObj = new Soal1(num);
		myObj.checkNum();
	}
}