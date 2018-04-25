import java.util.Scanner;

public class program {

	public static void main(String[] args) {

		System.out.println("How Wide Do You Want Your Tree Of Stars?");
		Scanner sc = new Scanner(System.in);
		int size;
		size = sc.nextInt();
		int counter2 = 1;
		int counter1 = 1;
		int temp = 1;
		while (size >= counter2) {
			int counter = 0;
			while (counter1 < size) {
				System.out.print("  " + "");
				counter1 = counter1 + 1;
			}
			while (counter < counter2) {
				System.out.print("* " + "");
				counter = counter + 1;
			}
			System.out.println("");
			counter2 = counter2 + 1;
			temp = temp + 1;
			counter1 = (counter1 * 0) + (temp);
		}

	}

}
