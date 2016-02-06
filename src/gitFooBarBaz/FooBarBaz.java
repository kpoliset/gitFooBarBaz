package gitFooBarBaz;

import java.io.*;
import java.util.Scanner;

public class FooBarBaz {
private static final String divide357 = "FOOBARBAZ"; 
private static final String divide57 = "BARBAZ"; 
private static final String divide35 = "FOOBAR";
private static final String divide37 = "FOOBAZ";
private static final String divide7 = "BAZ"; 
private static final String divide5 = "BAR"; 
private static final String divide3 = "FOO";  
private static Scanner scan;
static File fout = new File("FooBarBaz.txt");
static PrintWriter writer = null;
public static void main(String args[])throws IOException
{
	writer = new PrintWriter(fout, "UTF-8");
	ReadInput();
	writer.close();
}
private static void ReadInput()
{
	int number = 0;
	int listnum = 1;
	for(;;)
	{
	System.out.println("Enter the Maximum Limit.");	
	scan = new Scanner(System.in);
	try{
	number = scan.nextInt();
	writer.println("");
	writer.println("List Number"+ listnum);
	writer.println("Maximum Value Provided is: "+ number);
	writer.println("");
	writer.flush();
	findResult(number);
	exit_or_continue();
	listnum++;
	}
	catch(Exception EE)
	{
		System.out.println("Invalid Input. Please try again");
	}
	
	}
}
private static void findResult(int Input)
{
	
	//FooBarBazMain tofile = new FooBarBazMain();
	for (int number =1; number <= Input;number++)
	{
	if((number % 7 == 0)&& (number % 5 == 0) && (number % 3 == 0))
	{
		printResult(divide357);
	}
	else if((number % 7 == 0)&& (number % 5 == 0))
	{
		printResult(divide57);
	}
	else if((number % 7 == 0)&& (number % 3 == 0))
	{
		printResult(divide37);
	}
	else if((number % 5 == 0) && (number % 3 == 0))
	{
		printResult(divide35);
	}
	else if(number % 7 == 0)
	{
		printResult(divide7);
	}
	else if(number % 5 == 0)
	{
		printResult(divide5);
	}
	else if(number % 3 == 0)
	{
		printResult(divide3);
	}
	else
	{
		printResult(Integer.toString(number));
	}
	}
	writer.println("");
	writer.println("End of List");
	writer.print("");
	writer.flush();
}
private static void printResult(String Result)
{	
	writer.println(Result);
	System.out.println(Result);
	
}
private static void exit_or_continue()
{
	String input1 = null;
	System.out.println("Enter stop to exit or any key to continue");
	BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
	try {
		input1 = rd.readLine();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		System.out.println("Invalid Input");	
	}
	if(input1.equals("stop"))
	{
		System.out.println("Thank You");
		System.exit(0);
	}
	}

}