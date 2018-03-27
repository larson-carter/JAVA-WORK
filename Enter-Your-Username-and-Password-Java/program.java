/**
 * 
 */

/**
 * @author 		Larson Carter
 * 
 * @copyright	2018
 * 
 * @datemade	1/16/2018
 * 
 * @updated		1/17/2018
 *
 */

//	This Will Set The "Tag" Input Scanner And The Time Delays.
import java.util.Scanner;
import java.util.Date;

//	This Class Will Be Changed To Fit The Dev Container In The Dev Box. This Will Become Whatever You Program Will Be Called!
public class program {

public static void main(String[] args) throws InterruptedException {

	
	//	This Will Print The Text "Done!" To Declare Everything Processed And Finished.
	String done;
	
	//	This Is The "String" "done" Output!
	done = "Done!";
	
	//	This Will Declare The "TAG" "Username" and "Password"
    String Username;
    String Password;
        
    //	This Is The Username And Password To Let You In!
    Username = "admin";
    Password = "admin";

    //	This Is The Greeting
    System.out.println("Hello Welcome To Valley View Food Pantry!");
    
    //	This Will Make The Computer "Sleep/Delay" The Rest Of The Program For About 2.5 Seconds.
    Thread.sleep(2500);
    
    //	This Is The Username Input
    Scanner input1 = new Scanner(System.in);
    System.out.println("Enter Username : ");
    String username = input1.next();
    
    //	This Will Make The Computer Sleep/Delay The Rest Of The Program For About 1.5 Seconds.
    Thread.sleep(1500);

    //	This is The Passowrd Input
    Scanner input2 = new Scanner(System.in);
    System.out.println("Enter Password : ");
    String password = input2.next();

    //	This Is The First Part Of The Check Process.
    if (username.equals(Username) && password.equals(Password)) {

    	//	This Will Delay The System .5 Seconds.
    	Thread.sleep(0575);
    	
    	//	This Is Letting The Use Know That Their Information Worked.
        System.out.println("Access Granted!!!");
        
        //	This Will Delay The System .6 Seconds
        Thread.sleep(0675);
        
        //	This Will Greet The User!
        System.out.println("Welcome!!!");
        
        //	This Will Make The Computer Sleep/Delay The Rest Of The Program For About 1 Second.
        Thread.sleep(1000);
        
        //	This Is The First Part Of The "Loading" Section!
        System.out.print("Loading...");
        
        //	This Is The Adding "Animated" Dots To The End Of Loading.
        Thread.sleep(0600);
        System.out.print("."); 
        //  This Is The Adding "Animated" Dots To The End Of Loading.
        Thread.sleep(0600);
        System.out.print(".");
        //  This Is The Adding "Animated" Dots To The End Of Loading.
        Thread.sleep(0600);
        System.out.print(".");
        //  This Is The Adding "Animated" Dots To The End Of Loading.
        Thread.sleep(0600);
        System.out.print(".");
        //  This Is The Adding "Animated" Dots To The End Of Loading.
        Thread.sleep(0600);
        System.out.print(".");
        //  This Is The Adding "Animated" Dots To The End Of Loading.
        Thread.sleep(0600);
        System.out.print(".");
        //  This Is The Adding "Animated" Dots To The End Of Loading.
        Thread.sleep(0600);
        System.out.print(".");
        //  This Is The Adding "Animated" Dots To The End Of Loading.
        Thread.sleep(0600);
        System.out.print(".");
        //  This Is The Adding "Animated" Dots To The End Of Loading.
        Thread.sleep(0600);
        System.out.print(".");
        //  This Is The Adding "Animated" Dots To The End Of Loading.
        Thread.sleep(0600);
        System.out.print(".");
        //  This Is The Adding "Animated" Dots To The End Of Loading.
        Thread.sleep(0600);
        System.out.print(".");
        //  This Is The Adding "Animated" Dots To The End Of Loading.
        Thread.sleep(0600);
        System.out.print(".");
        //  This Is The Adding "Animated" Dots To The End Of Loading.
        Thread.sleep(0600);
        System.out.print(".");
        //  This Is The Adding "Animated" Dots To The End Of Loading.
        Thread.sleep(0600);
        System.out.println(".");
        
        //	This Will Delay The Rest Of The Tags To Be Processed. 
        Thread.sleep(0700);
        
        //	This Will Print The "Tag" Verifying
        System.out.println("Verifying");
        
        //	This Will Load All Of The Remainder Files.
        Thread.sleep(0665);
        
        //	This Will Print The "Tag" Success.
        System.out.println("Success!");
        
        //	This Will Delay All Of The Remainder Things.
        Thread.sleep(0560);
        
        //	This Will Start The "Tag" Processing
        System.out.println("Processing Needed Files.");
        
        //	This Will Delay All Of The Remainder Things.
        Thread.sleep(0650);
        
        //	Files That The User Will See That Are Being Loaded!
        
        //	404.php , archive.php , attachment.php , changelog.txt , comments.php , footer.php , functions.php , header.php , index.php , page.php , rtl.css , search.php , sidebar.php , single.php , style.css
        
        //	THe Files Are Broken Up Here.
        System.out.print("404.php");
        Thread.sleep(0650);
        System.out.print(", archive.php" );
        Thread.sleep(0650);
        System.out.print(", attachment.php");
        Thread.sleep(0650);
        System.out.print(", changelog.txt");
        Thread.sleep(0650);
        System.out.print(", comments.php");
        Thread.sleep(0650);
        System.out.print(", footer.php");
        Thread.sleep(0650);
        System.out.print(", functions.php");
        Thread.sleep(0650);
        System.out.print(", header.php");
        Thread.sleep(0650);
        System.out.print(", index.php");
        Thread.sleep(0650);
        System.out.print(", page.php");
        Thread.sleep(0650);
        System.out.print(", rtl.css");
        Thread.sleep(0650);
        System.out.print(", search.php");
        Thread.sleep(0650);
        System.out.print(", sidebar.php");
        Thread.sleep(0650);
        System.out.print(", single.php");
        Thread.sleep(0650);
        System.out.println(", style.css");
        Thread.sleep(0650);
        
        //	This Will Be The "Tag" That Says Done.
        System.out.println(done);
    }

    //	This Is The Section That Will Tell You Your Results.
    
    else if (username.equals(Username)) {
        System.out.println("Invalid Password! Try Again.");
        Thread.sleep(0650);
        System.out.print("Reloading...");
        Thread.sleep(0650);
        System.out.print(".");
        Thread.sleep(0650);
        System.out.print(".");
        Thread.sleep(0650);
        System.out.print(".");
        Thread.sleep(0650);
        System.out.print(".");
        Thread.sleep(0650);
        System.out.print(".");
        Thread.sleep(0650);
        System.out.print(".");
        Thread.sleep(0650);
        System.out.print(".");
        Thread.sleep(0650);
        System.out.print(".");
        Thread.sleep(0650);
        System.out.print(".");
        Thread.sleep(0650);
        System.out.print(".");
        Thread.sleep(0650);
        System.out.print(".");
        Thread.sleep(0650);
        System.out.print(".");
        Thread.sleep(0650);
        System.out.print(".");
        Thread.sleep(0650);
        System.out.print(".");
        Thread.sleep(0650);
        System.out.print(".");
        Thread.sleep(0650);
        System.out.println(".");
        Thread.sleep(0650);
        System.out.print(done);
        
    } else if (password.equals(Password)) {
        System.out.println("Invalid Username! Try Again.");
        Thread.sleep(0650);
        System.out.print("Reloading...");
        Thread.sleep(0650);
        System.out.print(".");
        Thread.sleep(0650);
        System.out.print(".");
        Thread.sleep(0650);
        System.out.print(".");
        Thread.sleep(0650);
        System.out.print(".");
        Thread.sleep(0650);
        System.out.print(".");
        Thread.sleep(0650);
        System.out.print(".");
        Thread.sleep(0650);
        System.out.print(".");
        Thread.sleep(0650);
        System.out.print(".");
        Thread.sleep(0650);
        System.out.print(".");
        Thread.sleep(0650);
        System.out.print(".");
        Thread.sleep(0650);
        System.out.print(".");
        Thread.sleep(0650);
        System.out.print(".");
        Thread.sleep(0650);
        System.out.print(".");
        Thread.sleep(0650);
        System.out.print(".");
        Thread.sleep(0650);
        System.out.print(".");
        Thread.sleep(0650);
        System.out.println(".");
        Thread.sleep(0650);
        System.out.print(done);
        
    } else {
        System.out.println("Invalid Username & Password! Try Again.");
        Thread.sleep(0650);
        System.out.print("Reloading...");
        Thread.sleep(0650);
        System.out.print(".");
        Thread.sleep(0650);
        System.out.print(".");
        Thread.sleep(0650);
        System.out.print(".");
        Thread.sleep(0650);
        System.out.print(".");
        Thread.sleep(0650);
        System.out.print(".");
        Thread.sleep(0650);
        System.out.print(".");
        Thread.sleep(0650);
        System.out.print(".");
        Thread.sleep(0650);
        System.out.print(".");
        Thread.sleep(0650);
        System.out.print(".");
        Thread.sleep(0650);
        System.out.print(".");
        Thread.sleep(0650);
        System.out.print(".");
        Thread.sleep(0650);
        System.out.print(".");
        Thread.sleep(0650);
        System.out.print(".");
        Thread.sleep(0650);
        System.out.print(".");
        Thread.sleep(0650);
        System.out.print(".");
        Thread.sleep(0650);
        System.out.println(".");
        Thread.sleep(0650);
        System.out.print(done);
        
    }

}

}
