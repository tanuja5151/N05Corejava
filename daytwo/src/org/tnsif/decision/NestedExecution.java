package org.tnsif.decision;
import java.util.Scanner;

public class NestedExecution
{

	public static void main(String[] args) 
	{
Scanner s=new Scanner(System.in);
int age=s.nextInt();
int weight= s.nextInt();
if(age>=12) 
	
{
	
	if(weight>=40)
	{
		System.out.println("Eligible for bunjee jumping");
		if(weight>=110)
		{
			System.out.println("Extra  ropes will be added");

		}
	}

else
{
	System.out.println("Not eligible");
	
}
	}
	else
	{
		System.out.println("It eligible");

	}
}
}

