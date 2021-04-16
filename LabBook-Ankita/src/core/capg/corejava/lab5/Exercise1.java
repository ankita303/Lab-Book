package core.capg.corejava.lab5;
import java.util.Scanner;

class MyUserDefinedException extends Exception
{
	MyUserDefinedException(String message)
	{
		System.out.println(""+message);
	}
}
public class Exercise1 {
	
	public static void main(String[] args) {
		  Scanner s = new Scanner(System.in);
		  System.out.print("Enter your age :: ");
		  int age = s.nextInt();
		  
		  if(age<15)
				new MyUserDefinedException("Invalid");
		  else
				System.out.println("Valid");
	}
}
