import java.util.Scanner;
public class program {
	public static void main(String[] args) {
		//	Set Up Variables
		Scanner sc = new Scanner(System.in);
		int input, max;
		int[] list;
		//	Read In Values
		System.out.println("How Many Numbers Are There?");
		input = sc.nextInt();
		list = new int [input];
		for(int i=0; i<list.length; i++) {
			System.out.println("Enter An Integer:");
			list[i] = sc.nextInt();
		}
		//	Find The Maximum
		max = maximum(list);
		//	Prints Our Results To Screen.
		System.out.println("The Largest Number Is " + max);
	}
	//	Method to Find The Biggest Integer In A List
	public static int maximum(int [] list) {
		int largest;
		largest = list[0];
		for(int i=0; i<list.length; i++) {
			if(list[i] > largest) {
				largest = list[i];
			}
		}		
		return largest;		
	}
	//	Method To Double An Integer Value
	public static int doubleInt(int i) {
		i = i * 2;
		return i;
	}
}
