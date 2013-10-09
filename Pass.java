package mastermind;
import java.util.*;
import java.util.Scanner;
import java.io.Console;

public class Pass {
    public static String Pass(){
    Console console = System.console( );
    return new String(console.readPassword( ));
  }
}
