
//	Allows Keyboard Input.
import java.util.Scanner;
//	Generates Random Number
import java.util.Random;

//	Class name is "program"
public class program {
	public static void main(String[] args) {
		// Initial Question, Displays Problem Choices
		System.out.println("How Many Questions Would You Like?");
		// Accept Input For How Many Questions That The User Wants
		Scanner sc = new Scanner(System.in);
		Double num;
		num = sc.nextDouble();
		// Sets Up How Many Times The Program Needs To Run To Repeat For How Many
		// Questions.
		Double questions;
		// Start To Count How Many Problems That The User Got Right.
		Double right;
		// Sets Needed Doubles To 0
		right = 0.0;
		questions = 0.0;
		// Update Questions Asked
		Double questionsasked;
		questionsasked = questions;
		// Will Repeat However Many Times That The User wants for questions.
		while (questions < num) { // Compares Initial value of questions to num,is how many questions that the
									// user wants.
			// Ask User What Type Of Problem
			System.out.println("What Kind Of Problem Would You Like?");
			// 1 for Addition, 2 for Subtraction, 3 For Multiplication, 4 for Division
			System.out.println("1 for \"+\", 2 for \"-\", 3 for \"*\", 4 for \"/\"");
			// Takes Input Values For Problem Type
			Scanner sd = new Scanner(System.in);
			Double input;
			input = sc.nextDouble();
			// Register What Problem They Would Like
			// Input is what type of problem user wants
			if (input == 1) {
				// Addition Problem, Passes Number Of Questions Right, and other necessary
				// things
				// Adds Value To Number Of Questions Asked, Used To Find Percentage Correct
				questions = questions + 1.0;
				// Calls Method
				add(right, questions, questionsasked);
			} else if (input == 2) {
				// Subtraction Problem, Passes Number Of Questions Right, and other necessary
				// things
				// Adds Value To Number Of Questions Asked, Used To Find Percentage Correct
				questions = questions + 1.0;
				// Calls Method
				subtract(right, questions, questionsasked);

			} else if (input == 3) {
				// Multiply Problem, Passes Number Of Questions Right, and other necessary
				// things
				// Adds Value To Number Of Questions Asked, Used To Find Percentage Correct
				questions = questions + 1.0;
				// Calls Method
				multiply(right, questions, questionsasked);

			} else if (input == 4) {
				// Division Problem, Passes Number Of Questions Right, and other necessary
				// things
				// Adds Value To Number Of Questions Asked, Used To Find Percentage Correct
				questions = questions + 1.0;
				// Calls Method
				divide(right, questions, questionsasked);

			} else {
				// If Answer to what type of problem they want is not 1-4 it will print this.
				System.out.println("Not A Valid Problem.");
			}
		}
		Double calcper;
		calcper = right / questions;
		Double calcperfinal;
		calcperfinal = calcper * 100;
		System.out.println("You Got " + calcperfinal + "% Correct");
		// Lets User Know That The Program Is Done Running!
		System.out.println("Program Is Done Running!"); // This Is The Very Last Thing That Happens.
	}

	// Addition Method
	public static Double add(Double right, Double questions, Double questionsasked) {
		// Computer FeedBack
		System.out.println("OK, Let's Add!");
		// THIS IS THE RANDOM NUMBER GENERATOR
		Random rand = new Random(); // This Declares The Random Number
		Double rnumber = rand.nextInt((int) 100.0) + 0.0; // 100 Is The Max, 0 Is The Min.
		// THIS IS THE RANDOM NUMBER GENERATOR 2
		Random rand2 = new Random(); // This Declares The Random Number
		Double rnumber2 = rand2.nextInt((int) 100.0) + 0.0; // 100 Is The Max, 0 Is The Min.
		// This Will Ask The Question!
		System.out.println("What Is, " + rnumber + " + " + rnumber2 + "?"); // This Will Ask Question.
		// Takes Input Values For What User Thinks Answer Is.
		Scanner sc = new Scanner(System.in);
		Double add; // This Is The User Answer
		add = sc.nextDouble(); // This Sets Current Scanner To The User Answer
		// Tell User If It Is Right Or Wrong!
		int answer = (int) (rnumber + rnumber2); // Creates INT To Determine The Right Answer
		// Used If user Got Question Correct
		if (add == answer) { // Compares User Answer To The Correct Computer Answer
			System.out.println("Correct!"); // Prints Out Correct
			right = right + 1.0;
			return right;
			// Used If user Got Question Incorrect
		} else {
			System.out.println("No, the correct answer is " + answer); // Prints The Correct Answer.
			return right;
		}
	}

	// Subtraction Method
	public static Double subtract(Double right, Double questions, Double questionsasked) {
		// Computer Feedback
		System.out.println("OK, Let's Subtract!");
		// THIS IS THE RANDOM NUMBER GENERATOR
		Random rand = new Random(); // This Declares The Random Number
		Double rnumber = (double) (rand.nextInt(100) + 0.0); // 100 Is The Max, 0 Is The Min.
		// THIS IS THE RANDOM NUMBER GENERATOR 2
		Random rand2 = new Random(); // This Declares The Random Number
		Double rnumber2 = (double) (rand2.nextInt(100) + 0.0); // 100 Is The Max, 0 Is The Min.
		// This Will Ask The Question!
		System.out.println("What Is, " + rnumber + " - " + rnumber2 + "?"); // This Will Ask Question.
		// Takes Input Values For What User Thinks Answer Is.
		Scanner sc = new Scanner(System.in);
		Double sub; // This Is The User Answer
		sub = sc.nextDouble(); // This Sets Current Scanner To The User Answer
		// Tell User If It Is Right Or Wrong!
		int answer = (int) (rnumber - rnumber2); // Creates INT To Determine The Right Answer
		// Used If User gets Question Correct
		if (sub == answer) { // Compares User Answer To The Correct Computer Answer
			System.out.println("Correct!"); // Prints Out Correct
			right = right + 1;
			return right;
			// Used If User Gets Question Incorrect
		} else {
			System.out.println("No, the correct answer is " + answer); // Prints The Correct Answer.
			if (questionsasked == 1.0 || questions == 1.0 && right == 0.0) {
				System.out.println("You Got %0 Right.");
			} else {
				return right;
			}
		}
		return questions; // Updates Value Of Questions Asked
	}

	// Multiplication Method
	public static Double multiply(Double right, Double questions, Double questionsasked) {
		// Computer FeedBack
		System.out.println("OK, Let's Multiply!");
		// THIS IS THE RANDOM NUMBER GENERATOR
		Random rand = new Random(); // This Declares The Random Number
		Double rnumber = (double) (rand.nextInt(100) + 0); // 100 Is The Max, 0 Is The Min.
		// THIS IS THE RANDOM NUMBER GENERATOR 2
		Random rand2 = new Random(); // This Declares The Random Number
		Double rnumber2 = (double) (rand2.nextInt(100) + 0); // 100 Is The Max, 0 Is The Min.
		// This Will Ask The Question!
		System.out.println("What Is, " + rnumber + " * " + rnumber2 + "?"); // This Will Ask Question.
		// Takes Input Values For What User Thinks Answer Is.
		Scanner sc = new Scanner(System.in);
		Double mul; // This Is The User Answer
		mul = sc.nextDouble(); // This Sets Current Scanner To The User Answer
		// Tell User If It Is Right Or Wrong!
		int answer = (int) (rnumber * rnumber2); // Creates INT To Determine The Right Answer
		// Used If User Gets Question Correct
		if (mul == answer) { // Compares User Answer To The Correct Computer Answer
			System.out.println("Correct!"); // Prints Out Correct
			right = right + 1.0;
			// Used If User Gets Question Incorrect
		} else {
			System.out.println("No, the correct answer is " + answer); // Prints The Correct Answer.
			return right;
		}
		return questions; // Updates Value Of Questions Asked
	}

	// Division Method
	public static Double divide(Double right, Double questions, Double questionsasked) {
		// Computer FeedBack
		System.out.println("OK, Let's Divide!");
		// THIS IS THE RANDOM NUMBER GENERATOR
		Random rand = new Random(); // This Declares The Random Number
		Double rnumber = (double) (rand.nextInt(100) + 0.0); // 100 Is The Max, 0 Is The Min.
		// THIS IS THE RANDOM NUMBER GENERATOR 2
		Random rand2 = new Random(); // This Declares The Random Number
		Double rnumber2 = (double) rand2.nextInt(100) + 0.0; // 100 Is The Max, 0 Is The Min.
		// This Will Ask The Question!
		System.out.println("What Is, " + rnumber + " / " + rnumber2 + "?" + ", Round To The Nearest 100th Place."); // This
																													// Will
																													// Ask
																													// Question.
		// Takes Input Values For What User Thinks Answer Is.
		Scanner sc = new Scanner(System.in);
		Double div; // This Is The User Answer
		div = sc.nextDouble(); // This Sets Current Scanner To The User Answer
		// Tell User If It Is Right Or Wrong!
		double answer = (rnumber / rnumber2); // Creates Double To Determine The Right Answer
		double answerrounded = Math.round(answer * 100.0) / 100.0; // Creates Answer To The Nearest 100th
		// Used If User Gets Question Correct
		if (div == answerrounded) { // Compares User Answer To The Correct Computer Answer
			System.out.println("Correct!"); // Prints Out Correct
			right = right + 1.0;
			return right;
			// used If User Gets Question Incorrect
		} else {
			System.out.println("No, the correct answer is " + answerrounded); // Prints The Correct Answer.
		}
		return questions; // Updates Value Of Questions Asked
	}
}
