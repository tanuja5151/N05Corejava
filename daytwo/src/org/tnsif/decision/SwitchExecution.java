package org.tnsif.decision;
import java.util.Scanner;
public class SwitchExecution 
{

	public static void main(String[] args) 
	{
Scanner s=new Scanner(System.in);
int songNo=s.nextInt();
switch(songNo)
		{
    case 1:
System.out.println("Perfect");
    break;
    case 2:
    	System.out.println("Love me like you do");
    break;
    case 3:
    	System.out.println("Tum tak");
    break;
    default:
	System.out.println("In Valid");
	}

 }
}


