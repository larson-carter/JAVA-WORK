import java.util.Scanner;
public class program {
	public program() {
	}
	public static void main(String[] args) {
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println("How Big Do You Want Your Play Button?");
		size = sc.nextInt();
		topofplaybutton(size);
		bottomofplaybutton(size);
	}
	public static void topofplaybutton(int size) {
		double counter0 = 1.0;
		while (counter0 <= size) {
			double counter1 = 0.0;	
			while (counter1 < counter0) {
				System.out.print("*  ");
				System.out.print("");
				counter1 = counter1 + 1.0;
			}
			System.out.println("");
			counter0 = counter0 + 1.0;
		}
	}
	public static void bottomofplaybutton(int size) {
		double counter3 = 1.0;	
		while (counter3 < size) {
			double counter4 = 1.0;	
			while (counter4 < size) {
				System.out.print("*  ");
				System.out.print("");
				counter4 = counter4 + 1;
			}
			System.out.println("");
			size = size - 1;
		}
	}}
