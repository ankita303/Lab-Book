package com.capg.corejava.lab1;
import java.util.Scanner; 

public class calculateSum {


	int calculateSumm(int n)
{
	int i, sum=0;
	for(i=1;i<=n;i++)
	{
		if(i%3==0 || i%5==0)
		{
			sum+=i;
		}
	}
	return sum;
}
	      
	
	    public static void main(String []args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the limit");
	    int lim=sc.nextInt();
	    calculateSum s1=new calculateSum();
	    System.out.println("The sum is:"+s1.calculateSumm(lim));
}
	}
	