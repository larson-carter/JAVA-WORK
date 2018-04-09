import java.util.Scanner;
public class program {
	public static void main(String[] args) {
		Double absnumber;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Double Value Using The Keyboard:");
		absnumber = sc.nextDouble();
		abs(absnumber);
	}
	public static void abs(double absnumber) {
		double last = 0.0;
		if (absnumber < 0) {
			last = absnumber * -1;
		} else {
			last = absnumber * 1;
		}
		System.out.print("The Absolute Value Is: ");
		System.out.println(last);
	}
}
