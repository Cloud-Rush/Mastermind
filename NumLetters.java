package mastermind;
import java.util.*;
public class NumLetters {
	
	public static Integer NumLetters(){
  	// Ask for number of letters in the code
	Scanner in = new Scanner(System.in);
    Boolean isNumeric = false;
    Boolean letters = false;
    Boolean temp = false;
    String t = ""; 
    Integer num=0;
    while (isNumeric == false){
    	isNumeric = true;
    	System.out.println("Enter number of letters:");
    	try{
    		t = in.next();
    		Integer.parseInt(t);
    		
    	}
    	catch(Exception e){
    		isNumeric = false;
    	}
    	if(isNumeric == true){
    		num = Integer.parseInt(t);
    		if (num < 1 || num > 26){
    			System.out.println("You have entered an incorrect number of letters.");
    			isNumeric = false;
    			continue;
    		}
    	}

    	
    }
    return num;
	
}
}
