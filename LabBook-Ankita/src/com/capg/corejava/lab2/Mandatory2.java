package com.capg.corejava.lab2;
import java.util.Arrays;
import java.util.Scanner;

public class Mandatory2 {
	public String [] sortString(String [] arr)
	{
		
		Arrays.sort(arr);
		
		
		return arr;
	}
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array ");
		n = sc.nextInt();
		String [] arr = new String[n];
		int len = arr.length;
		if(n%2 !=0)
		{
		for(int i=0;i<len;i++)
		{
			if(i<(n/2)+1)
			{	
			arr[i] = sc.next().toUpperCase();
			}
			else
			{
				arr[i] = sc.next().toLowerCase();
			}
		}
		}
		else
		{
			for(int i=0;i<len;i++)
			{
				if(i<(n/2))
				{	
				arr[i] = sc.next().toUpperCase();
				}
				else
				{
					arr[i] = sc.next().toLowerCase();
				}
			}
			
		}
		//for(int i=0;i<n;i++)
		//{
		//	System.out.println(arr[i] + " ");
		//}
		
	Mandatory2 ad = new Mandatory2();
		String [] result_array = new String[arr.length];
		result_array = ad.sortString(arr);
		for(int i=0;i<result_array.length;i++)
		{
			System.out.println(result_array[i] + " ");
		}
		sc.close();



	}

}
