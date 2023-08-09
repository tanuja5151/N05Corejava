package org.tnsif.polymorphism;
//driver class
import java.util.Scanner;

public class MethodOverloadExecutor {
		 public static void main(String[] args) {
		 		
		 		Scanner s=new Scanner(System.in);
		 		String str1=s.next();
		 		String str2=s.next();
		 		String str3=s.next();
		 		Bollywood.display(str1,str2);
		 		Bollywood.display(str1,str2,str3);


		 	}

		 }

}
