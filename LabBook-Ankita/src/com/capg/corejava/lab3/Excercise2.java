package com.capg.corejava.lab3;
import java.util.*;
public class Excercise2
{
public String getImage(String s)
{
	StringBuffer st=new StringBuffer(s);
	st.reverse();
	s+=" ";
	s+=st.toString();
	return s;
}
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	String s;
	System.out.println("Enter the string");
	s=sc.nextLine();
	Excercise2 m1= new Excercise2();
	System.out.println("Mirror Image:");
	System.out.println(m1.getImage(s));
	}

}
