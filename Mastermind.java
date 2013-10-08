import java.util.Scanner;
import LetterCheck.java;
import NumLetters.java;
import NumTurns.java;
import guessVarify.java;
import readCode.java;



public class Mastermind {
	public static void main(String args[]){
    Boolean correct = false;
   	// Ask for number of turns
   	int turns = NumTurns.NumTurns();
   	int rounds = 0;
  	// calls function to ask how many letters are in the code
  	int num = NumLetters.NumLetters();
  	Scanner in = new Scanner(System.in);
  	Boolean guessCorrect = true;
  	
	
	// get the code and check if the input is correct
	String pass = readCode.readCode(num);
	char password[] = pass.toCharArray();
	
	// get the user's guess
	Boolean win = false;
	
	
	
	System.out.println("code:"+ pass);

	//calls a verify guess function to check the guess
	while(correct == false && rounds < turns){
		
	    String pass1 = new String (password);
	    
	    System.out.println("Enter your guess:");
	    String g = in.next();
	    g.toUpperCase();
	    guessCorrect = LetterCheck.LetterCheck(num, g);
	    if(guessCorrect == false){
	    	continue;
	    }
	    char guess[] = g.toCharArray();
	    correct = guessVarify.guessVarify(guess, password);
	    if(correct==true){
	    	break;
	    }
	    rounds ++;
	  
	} 
      
    
    System.out.println("End of game.");
    if(rounds == turns)
    {
    String pass2 = new String (password);
    
	System.out.println("You lost. The answer was"+ pass2);
    }
    else if(correct == true && rounds <= turns){
	System.out.println("You won!");
    }
}
}
