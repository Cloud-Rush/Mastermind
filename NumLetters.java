import java.util.Scanner;

public class int NumLetters() {
  	// Ask for number of letters in the code

    bool isNumeric = false;
    do{
    	
    	do{
    		int num = 0;
    		System.out.println("Enter number of letters for the code:");
    		num = in.nextInt();
    		if(num > 26)
    		{
    			System.out.println("You have entered an invalid number of letters try again.");
    		}
    	} while(num > 26);
    
    	try{
    		Integer.parseInt(num);
    	}
    
    	catch(InputMismatchException e){
    		System.out.println("That is not a number.");
    		isNumeric = false;
    	}
    }while(isNumeric == false)
    
    return num;
}
    
