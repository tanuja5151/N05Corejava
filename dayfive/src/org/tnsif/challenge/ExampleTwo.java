package org.tnsif.challenge;
import java.util.Scanner;
public class ExampleTwo {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int item=sc.nextInt();
float ht=sc.nextInt();
switch(item) {
case 1:
	System.out.println(ht);
	break;
case 2:
	System.out.println((ht/2) +ht);
	break;
case 3:
	System.out.println(2*ht);
break;
default:

	System.out.println("heating is more than 3 items at once is not recommended");
break;


	
}
	}

}
