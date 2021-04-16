package com.capg.corejava.lab1;
import java.util.*;
public class calculateDifference {

		   public int calculatedifference(int n){
		    int sum1=0, sum2=0;
		    for(int i=1;i<=n;i++)
		    {
		    	sum1+=(i*i);
		    	sum2+=i;
		    }
			  sum2=sum2*sum2;
			  return sum2-sum1;
			   
		   }
		
		   public static void main(String args[]){
			   
			   @SuppressWarnings("resource")
			Scanner scr=new Scanner(System.in);
			   System.out.println("Enter the noumber:");
		      int n = scr.nextInt();
		      calculateDifference ob=new calculateDifference();
		      System.out.println("Difference = "+ob.calculatedifference(n));
		   }
		}
