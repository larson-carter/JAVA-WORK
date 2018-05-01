import java.util.Scanner;

public class program {

	public static void main(String[] args) {

		int[] usedCodes = {};

		Scanner sc = new Scanner(System.in);

		int input = 0;

		System.out.print("Enter a coupon code:  ");

		input = sc.nextInt();

		do {

			if (couponIsValid(usedCodes, input)) {

				System.out.println("This is a valid coupon.");

				addToList();

			}

			else {

				System.out.println("This coupon has already been redeemed.");

			}

			System.out.print("Enter another coupon code:  ");

			input = sc.nextInt();

		} while (input >= 0);

	}

	public static void addToList(int input, int usedCodes) {
		int[] usedCodes.add(input);
	}

	public static boolean couponIsValid(int[] usedCodes, int input) {

		// Check to see if the input value is already in the usedCodes list.

		return true; // Or false

	}

}
