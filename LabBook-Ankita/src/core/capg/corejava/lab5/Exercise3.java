package core.capg.corejava.lab5;
import java.util.Scanner;
class EmployeeException extends Exception
{
	EmployeeException(String s)
	{
		System.out.println("Your Salary is:"+s);
	}
}

public class Exercise3 {
	public void mySal(int salary) throws Exception
	{
		if(salary<3000)
			throw new EmployeeException(" Not Valid");
		else
			System.out.println("Your Salary is: Valid");
	}
	public static void main(String[] args) {
	int Salary=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Amount:");
	Salary=sc.nextInt();
try {
	Exercise3 e3=new Exercise3();
	e3.mySal(Salary);
}
catch(Exception e)
{
	System.out.println("I can handle this exception."+e);
		}
	}
}
