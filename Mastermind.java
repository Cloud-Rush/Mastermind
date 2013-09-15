import java.util.Scanner;

public class Mastermind {
    public static void main(String args[]){
  
	// Ask for number of letters in the code

	bool isNumeric = false;
	do{
	    int num = 0;
	    System.out.println("Enter number of letters for the code:");
	    num = in.nextInt();
	} while(num > 26);

	// Ask for number of turns
       	do{
	    int turns = 0;
	    System.out.println("Enter number of turns:");
	    turns = in.nextInt();
	    isNumeric = true;
	    //get the number
	    try {
		Integer.parseInt(turns);
	    }
	    // catch bad input
	    catch(InputMismatchException e) {
		// isNumeric is false
		System.out.println("That is not a number.");
		isNumeric = false;
	    }
	} while(isNumeric == false);

	// get the code and check if the input is correct
	string pass = readCode(num);

	// get the user's guess
	bool win = false;
	int turns;
	
	//calls a verify guess function to check the guess
	do{
	    System.out.prntln("Enter your guess:");
	    string guess = in.next();
	    guessVerify(guess);
	} while(win == false || rounds < turns);
      
    }
    System.out.prntln("End of game.");
    if(win == false || rounds > turns){
	System.out.prntln("You lost. The answer was", pass);
    }
    else{
	System.prntln("You won!");
    }
}

private static String readCode(int num) {
    Console console = System.console( );
    bool correct;
    bool length;
    String readPassword;
    do{
	System.out.println("Enter code:");
	readPassword = in.next();
	correct = true;
	length = true;
	try {
	    Integer.parseInt(readPassword);
	}
	catch(InputMismatchException e) {
	    System.out.println("Please enter letters".);
	    correct = false;
	}
	if(length > num){
	    System.out.println("Enter only",num, "amount of letters.");
	    length = false;
	}
    } while(correct == false && length == false );
    
    return (console.readPassword( ));
    
  }


    
