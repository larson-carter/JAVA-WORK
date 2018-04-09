import java.util.Scanner;
public class program {
	public static void main(String[] args) {
		int smallornot;
		Scanner sc = new Scanner(System.in);
		System.out.println("What Is Your Number?");
		smallornot = sc.nextInt();
		isSmall(smallornot);
		if (isSmall(smallornot) == true) {
			System.out.println("Your Number Is Small");
		} else {	
			System.out.println("Your Number Is Big");	
		}
	}
	public static boolean isSmall(int smallornot) {
		if (smallornot <= 5 && smallornot >= 0) {
			return true;
		} else {
			return false;
		}
	}
}
