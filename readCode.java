import java.util.*;
import java.util.Scanner;

public class readCode {
 public static String readCode(int num) {
        Scanner in = new Scanner(System.in);
    Boolean correct = false;
    Boolean length = false;
    String readPassword;
    Boolean letters ;

    do{
              System.out.println("Enter code and press enter: ");
              readPassword = Pass.Pass();
              int lengthOfPass = readPassword.length();
             if (lengthOfPass < num || lengthOfPass > num){
                 System.out.println("please enter a valid number for your code")
;
                 correct = false;
                 length = false;
                 continue;
             }

              letters = isAlpha.isAlpha(readPassword);
        if (letters == false){
                correct = false;
                continue;
        }
        else{
                letters = true;
                correct = true;
        }
    } while(correct == false && length == false );

    return (readPassword);

  }
}
