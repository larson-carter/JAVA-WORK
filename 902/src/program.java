import java.util.Scanner;
public class program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What Is The Name Of Your Favorite City?");
		String city = sc.next();	
		System.out.println(city.toUpperCase());
		System.out.println(city.toLowerCase());
		System.out.println(city.charAt(0));
		char last1 = city.charAt(city.length() - 1);
		char last2 = city.charAt(city.length() - 2);
		char last3 = city.charAt(city.length() - 3);
		System.out.print(last1);
		System.out.print(last2);
		System.out.println(last3);
	}
}
