import java.util.Scanner;

public class program {

    private static Scanner a;

    private static String  inputusername;

    private static Scanner b;

    private static String  inputpassword;

    private static String  validusername;

    private static String  validpassword;

    public static void main(String[] args) {

        compile();

    }

    public static void greeting() {

        System.out.println("Hello!");

        System.out.println("Note: All Things Are Case Sensitive!");

    }

    public static String questiona() {

        System.out.println("What Is Your Username?");

        a = new Scanner(System.in);

        inputusername = a.next();

        return inputusername;

    }

    public static String questionb() {

        System.out.println("What Is Your Password?");

        b = new Scanner(System.in);

        inputpassword = b.next();

        return inputpassword;

    }

    public static String username() {

        validusername = "username";

        return validusername;

    }

    public static String password() {

        validpassword = "password";

        return validpassword;

    }

    private static boolean checkOne(String validusername, String inputusername) {

        boolean usernamecheck = false;

        if (username().equals(inputusername)) {

            usernamecheck = true;

        }

        return usernamecheck;

    }

    private static boolean checkTwo(String validpassword, String inputpassword) {

        boolean passwordcheck = false;

        if (password().equals(inputpassword)) {

            passwordcheck = true;

        }

        return passwordcheck;

    }

    private static boolean checkFinal(boolean usernamecheck, boolean passwordcheck) {

        boolean checkFinal = false;

        if (usernamecheck && passwordcheck) {

            checkFinal = true;

        } else {

            checkFinal = false;

        }

        return checkFinal;

    }

    public static void compile() {

        greeting();

        questiona();

        questionb();

        boolean usernamecheck = checkOne(validusername, inputusername);

        boolean passwordcheck = checkTwo(validpassword, inputpassword);

        System.out.println(checkFinal(usernamecheck, passwordcheck) ? "Welcome!" : "Incorrect Information!");

    }

}
