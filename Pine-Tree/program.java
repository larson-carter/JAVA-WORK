import java.util.Scanner;

public class program {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("How Wide Do You Want Your Pine Tree?" + " Make Sure It Is An Even Number!");

		int counter0;

		int counter1;

		int counter2;

		int input;

		input = s.nextInt();

		for (counter0 = 1; counter0 < input + (input / 2); counter0++) {

			for (counter1 = input + (input / 2); counter1 > counter0; counter1--) {

				System.out.print(" ");

			}

			for (counter2 = 1; counter2 <= 2 * counter0 - 1; counter2++) {

				System.out.print("*");

			}

			System.out.println("");

		}

		for (counter0 = 1; counter0 < input - (input / 2); counter0++) {

			for (counter1 = input + (input / 2); counter1 > 1; counter1--) {

				System.out.print(" ");

			}

			for (counter2 = input / 2; counter2 <= (input / 2) + 1; counter2++) {

				System.out.print("*");

			}

			System.out.println("");

		}

	}

}
