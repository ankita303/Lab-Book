package core.capg.corejava.lab5;
import java.util.Scanner;
class NameException extends Exception
{
	NameException(String msg)
	{
		System.out.println("Your name is: "+msg);
	}
}
public class Exercise2 {
	
	public void myName(String firstName,String lastName) throws NameException
	{
		if(firstName=="" || lastName=="") 
			throw new NameException("invalid"); 
		else 
			System.out.println("valid");
		}
	public static void main(String[] args) {
		String firstName="";
		String lastName="";
		
		Scanner s= new Scanner(System.in);

		System.out.println("Enter your First Name:");
		firstName=s.nextLine();
		System.out.println("Enter your Last name:");
		 lastName=s.nextLine();
		try {
		Exercise2 e=new Exercise2();
			e.myName(firstName,lastName);
		}
		catch (Exception e1) {
			System.out.println("I can handle this:"+e1);
		}
	}}
