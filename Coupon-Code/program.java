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
				int[] moreNums = new int[usedCodes.length + 1];
				for (int i = 0; i < usedCodes.length; i++) {
					moreNums[i] = usedCodes[i];
				}
				moreNums[moreNums.length - 1] = input;
				usedCodes = moreNums;
			} else {
				System.out.println("This coupon has already been redeemed.");
			}
			System.out.print("Enter another coupon code:  ");
			input = sc.nextInt();
		} while (input >= 0);
	}
	public static boolean couponIsValid(int[] usedCodes, int input) {
		for (int i = 0; i < usedCodes.length; i++) {
			if (usedCodes[i] == input)
				return false;
		}
		return true;
	}
}
