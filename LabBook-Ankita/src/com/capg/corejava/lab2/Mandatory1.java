package com.capg.corejava.lab2;
import java.util.Scanner;
public class Mandatory1 {
static int getSecondSmallest(int arr[], int n)
{ int i,j,t;
	for( i=0; i<n;i++)
	{
		for(j=i+1;j<n;j++)
		{
			if(arr[i]>arr[j])
			{
				t=arr[i];
				arr[i]=arr[j];
				arr[j]=t;
			}
		}
	}
	return arr[1];
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i;
		System.out.println("Enter the limit");
		int n=sc.nextInt();
		int a[]=new int[10];
		System.out.println("Enter elements");
		 for(i=0;i<n;i++)
		 {
			 a[i]=sc.nextInt();
		 }
		 System.out.println("The second smallest is:"+getSecondSmallest(a,n));
	}

}
