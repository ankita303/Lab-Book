package com.capg.corejava.lab3;
import java.util.Arrays;
import java.util.Scanner;
public class Exercise8 {
static boolean checkPositiveString(String s) {
	int n = s.length();
    char c[] = new char [n];
    for (int i = 0; i < n; i++) {
        c[i] = s.charAt(i);
    }
    Arrays.sort(c);
    for (int i = 0; i < n; i++)
        if (c[i] != s.charAt(i)) 
            return false;
           
    return true; 
}
	
	
	public static void main(String[] args) {
		 Scanner sc =new Scanner(System.in);
	        System.out.println("Enter a Sentence");
	        String s=sc.nextLine();
	        Exercise8 e8=new Exercise8();
	 
	        System.out.println(e8.checkPositiveString(s));

	}

}
