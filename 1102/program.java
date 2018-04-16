import java.util.Scanner;
public class program {
	public static void main(String[] args) {
		// Set Up Variables
		Scanner sc = new Scanner(System.in);
		int input, max, min;
		int[] list;
		// Read In Values
		System.out.println("How Many Numbers Are There?");
		input = sc.nextInt();
		list = new int[input];
		for (int i = 0; i < list.length; i++) {
			System.out.println("Enter An Integer:");
			list[i] = sc.nextInt();
		}
		// Find The Maximum
		max = maximum(list);
		// Find The Minimum
		min = minimum(list);
		// Prints Our Results To Screen
		System.out.println("The Largest Number Is " + max);
		System.out.println("The Smallest Number Is " + min);
	}
	// Method to Find The Biggest Integer In A List
	public static int maximum(int[] list) {
		int largest;
		largest = list[0];
		for (int i = 0; i < list.length; i++) {
			if (list[i] > largest) {
				largest = list[i];
			}
		}
		return largest;
	}
	// Method To Find The Biggest Integer In A List
	public static int minimum(int[] list) {
		int smallest;
		smallest = list[0];
		for (int i = 1; i < list.length; i++) {
			if (list[i] < smallest) {
				smallest = list[i];
			}
		}
		return smallest;
	}
}
