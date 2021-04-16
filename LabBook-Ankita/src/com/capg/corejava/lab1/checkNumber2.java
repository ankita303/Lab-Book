package com.capg.corejava.lab1;
import java.util.*;
public class checkNumber2 {
	
	public boolean checkNumber(int n)
	{
	 boolean t=false;
	 for(int i=n;i>0;i=i/2)
	 {
		 if(i==2)
		 {
			 t=true;
			 break;
		 }
		 if(i%2==0)
			 t=true;
		 else
		 {
			 t=false;
			 break;
		 }
	 }
	 return t;
	}
	
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=scr.nextInt();
		checkNumber2 ob = new checkNumber2();
		System.out.println(ob.checkNumber(n));
	}
	 
}