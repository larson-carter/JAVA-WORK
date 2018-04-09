import java.util.Scanner;

public class program {
	
	public static void main(String[] args) {
		
		//	Declared Variables
		
		int size;
		
		Scanner sc = new Scanner(System.in);
		
		//	Prompt User And Accept Size Value
		
		System.out.println("How Large Would You Like Your Box Of Stars To Be?");
		
		size = sc.nextInt();
		
		//	Draw A Box Of Stars
		
		for(int r = 0; r < size; r++) {
			
			lineOfStars(size);
			
		}
		
	}
	
	public static void lineOfStars(int size) {
		
		//	Draw A Line Of Stars
		
		for(int c = 0; c < size; c = c + 1) {
			
			System.out.print("* ");	
			
		}
		
		System.out.println();
		
	}
	
}