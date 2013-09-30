import java.util.Scanner;

public class int NumTurns() {
  	// Ask for number of letters in the code

    bool isNumeric = false;
    do{
    	
    		int t = 0;
    		System.out.println("Enter number of turns:");
    		t = in.nextInt();
    		if(t <1)
    		{
    			System.out.println("You must have at least one turn.");
    		}
    	} while(t < 1);
    
    	try{
    		Integer.parseInt(t);
    	}
    
    	catch(InputMismatchException e){
    		System.out.println("That is not a number.");
    		isNumeric = false;
    	}
    	
    }while(isNumeric == false)
    
    return t;
}
