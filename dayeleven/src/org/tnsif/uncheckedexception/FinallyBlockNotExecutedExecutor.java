package org.tnsif.uncheckedexception;
import java.util.Scanner;
public class FinallyBlockNotExecutedExecutor {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int x=s.nextInt();//12
int y=s.nextInt();//0

try {
System.out.println(x/y);
/*when we used system.exit finally block does not executed*/
//System.exit(0);
	}
//catch block is used to handle an exception
catch(ArithmeticException | NullPointerException e)
{
	System.out.println("Exception handled "+e);
	//System.exit(0);

}
finally
{
	System.out.println(4/0);
//when finally block contain an exception then finally block does not execute
	
	System.out.println("finally block is always executed");
}
}



	}


