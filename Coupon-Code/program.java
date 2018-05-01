import java.util.Scanner;

public class program {

	public static void main(String[] args) {

		int[] usedCodes = {};

		Scanner sc = new Scanner(System.in);

		int input = 0;

		System.out.print("Enter a coupon code:  ");

		input = sc.nextInt();

		do {

			if (couponIsValid(usedCodes, input) == true) {

				System.out.println("This is a valid coupon.");

			} else {

				System.out.println("This coupon has already been redeemed.");

			}

			System.out.print("Enter another coupon code:  ");

			input = sc.nextInt();

		} while (input >= 0);

	}

	public static boolean couponIsValid(int[] usedCodes, int input) {

		int[] moreCodes = new int[usedCodes.length + 1];

		for (int i = 0; i < usedCodes.length; i++) {

			usedCodes[i] = usedCodes[i];

		}

		moreCodes[moreCodes.length - 1] = input;

		moreCodes = usedCodes;

		for (int i = 0; i < usedCodes.length;) {

			System.out.print(usedCodes[i] + " ");

			i = i + 1;
			
			if (usedCodes.length == input) {

				return false;

			} else {

				return true;

			}

		}

		return false;

	}
  
}
