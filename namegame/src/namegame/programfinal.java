package namegame;
import java.util.Scanner;
public class programfinal {
	public static void main(String[] args) {
		 Scanner input1 = new Scanner(System.in);
		 System.out.println("Enter Your Name : ");
		 String name = input1.next();
		 int counter = 0;
		 while (name.length() > counter) {
			 System.out.println(name);
			 counter = counter + 1;
		 }
	}
}
