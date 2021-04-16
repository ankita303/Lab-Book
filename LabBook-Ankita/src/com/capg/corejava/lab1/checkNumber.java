package com.capg.corejava.lab1;
import java.util.*;
public class checkNumber {
	
	    public static void main(String args[]) {
	        
	       
	       int num;
	       boolean f = false;
	        
	       
	       @SuppressWarnings("resource")
	 Scanner sc = new Scanner(System.in);
	        
	       
	       System.out.println("Enter a number : ");
	       num = sc.nextInt();
	        
	       
	       int currentDigit = num % 10;
	       num = num/10;
	        
	       
	       while(num>0) {
	           
	           if(currentDigit <= num % 10){
	               f = true;
	               break;
	           }

	           currentDigit = num % 10;
	           num = num/10;
	       }
	        
	       
	       if(f){
	           System.out.println("Digits are not in increasing order.");
	       }else{
	           System.out.println("Digits are in increasing order.");
	       }
	    }
	}

	
	
	
	
	
	
	
	
	