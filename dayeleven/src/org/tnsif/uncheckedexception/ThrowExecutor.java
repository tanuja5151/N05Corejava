package org.tnsif.uncheckedexception;
import java.io.IOException;
//program to demonstrate on throws keyword
public class ThrowExecutor {
	//throws keyword is declare for exception
static void isEligible(int age,int weight)throws IOException
{
	if(age>18 && weight>50)
	{
		System.out.println("eligible for donate the blood");
	}
	else
	//throw keyword use for throw an exception explicitly	
throw new  IOException("age and weight sriteria is not fulfilled");
	
}

public static void main(String[] args)  throws IOException{
	isEligible (12,54);


	}
}

