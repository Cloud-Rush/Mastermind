import java.util.Scanner;

public class Mastermind {
    public static void main(String args[]){
  	// calls function to ask how many letters are in the code
  	int num = NumLetters();

	// Ask for number of turns
	int turns = NumTurns();

	// get the code and check if the input is correct
	string pass = readCode(num);
	char password[] = pass.toCharArray;
	// get the user's guess
	bool win = false;
	
	//calls a verify guess function to check the guess
	do{
	    System.out.println("Enter your guess:");
	    string g = in.next();
	    LetterCheck(num, g);
	    char guess[] = g.toCharArray;
	    guessVarify(guess[], password[]);
	} while(win == false || rounds < turns);
      
    }
    System.out.println("End of game.");
    if(win == false || rounds > turns){
	System.out.println("You lost. The answer was", pass);
    }
    else{
	System.out.println("You won!");
    }
}



    
