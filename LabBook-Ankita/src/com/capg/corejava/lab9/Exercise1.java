package com.capg.corejava.lab9;

import java.util.Scanner;

/*interface p
{
	public double power(double x,double y);
}
public class exercise1 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		 System.out.println("enter the base");double b = in.nextDouble();
		 System.out.println("Enter the power to be raised:");double p = in.nextDouble();
		p powe =(x,y)->
		{
			return Math.pow(x,y);
		};
		System.out.println("The result is = "+powe.power(b, p));
	}

}*/
interface p
{
	public int power(int x,int y);
}
public class Exercise1 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		 System.out.println("enter the base");int b = in.nextInt();
		 System.out.println("Enter the power to be raised:");int p = in.nextInt();
		p powe =(x,y)->
		{
			int power=1;
			for(int i=1;i<=y;i++)
			{
				power = power*b;
			}
			return power;
		};
		System.out.println("The reult is = "+powe.power(b, p));
	}
}