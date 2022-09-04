import java.util.*;

public class Soal5 {
	public static void main(String[] args) {
		Scanner scanThis = new Scanner(System.in);

		// Take the user input for both first and second string
		System.out.print("Enter the first string (1): ");
		String str1 = scanThis.nextLine();
		System.out.print("\nEnter the second string (2): ");
		String str2 = scanThis.nextLine();

		// Print sum of str1 and st2 length
		System.out.println(str1.length() + str2.length());

		// Check wether str1 comes before str2 or not
		if (str1.compareTo(str2) == 0) {
			System.out.println("No. They are the same strings.");
		} else if (str1.compareTo(str2) > 0) {
			System.out.println("Yes.");
		} else {
			System.out.println("No.");
		}

		// Convert both of those strings into array of chars
		char[] str_arr1 = str1.toCharArray();
		char[] str_arr2 = str2.toCharArray();

		// Change their first letter to the uppercase one
		// We need to substract the decimal value in order the obtain
		// the right ASCII character (uppercase)
		str_arr1[0] -= 32;
		str_arr2[0] -= 32;

		// Convert them back to strings
		str1 = new String(str_arr1);
		str2 = new String(str_arr2);

		// Print the concetenated version of those strings
		System.out.println(str1 + " " + str2);
	}
}
