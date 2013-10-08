import java.util.*;


public class LetterCheck {

	public static Boolean LetterCheck(int num, String g) {
        g= g.toUpperCase();
        char guess2[] = g.toCharArray();
        int lengthGuess = g.length();
        
        
        
        //check if guess is all letters
        for (int temp = 0; temp < num; temp++){
        if (guess2[temp] < 65 || guess2[temp] > 90)
        	{
        		System.out.println("please enter a guess of all letters!");
        		return false;
        	}
        }
        
        
        //check length of guess vs length of password
        if(lengthGuess != num){
        	System.out.println("please enter a guess of the same length as the password!");
        	return false;
        }
        
        return true;
       
        }
	}
