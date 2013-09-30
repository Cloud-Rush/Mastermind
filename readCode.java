private static String readCode(int number) {
    Console console = System.console( );
    bool correct;
    bool length;
    String readPassword;
    int num = number;
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
