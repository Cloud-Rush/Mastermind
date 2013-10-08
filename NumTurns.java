package mastermind;
import java.util.*;
public class NumTurns {
	
	public static Integer NumTurns(){
	  	// Ask for number of letters in the code
		Scanner in = new Scanner(System.in);
	    Boolean isNumeric = false;
	    String t = ""; 
	    Integer num=0;
	    while (isNumeric == false){
	    	isNumeric = true;
	    	System.out.println("Enter number of turns:");
	    	try{
	    		t = in.next();
	    		Integer.parseInt(t);
	    		
	    	}
	    	catch(Exception e){
	    		isNumeric = false;
	    	}
	    	if(isNumeric == true){
	    		num = Integer.parseInt(t);
	    		if (num < 1){
	    			System.out.println("You have entered an incorrect number of turns.");
	    			isNumeric = false;
	    			continue;
	    		}
	    	}

	    	
	    }
	    return num;
		
	}


}
