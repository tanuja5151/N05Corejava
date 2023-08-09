package org.tnsif.uncheckedexception;
/*program to demonstrate on array index out of bound exception*/
public class ArrayIndexOutOfBoundExecutor {
static void print(int arr[])
{
	try {
	System.out.println(arr[4]);
}
	catch(Exception e)
	{
		System.out.println("Exception handled :"+e);

	}
	finally
	{
		System.out.println("finally block is always executed");

	}
}
//System.out.println("Any statement outside the block is always executed");

	public static void main(String[] args) {
int arr[]= {12,4,5};
print(arr);

}
}