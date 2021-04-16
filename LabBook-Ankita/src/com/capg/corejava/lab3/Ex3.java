package com.capg.corejava.lab3;

import java.util.*;
 public class Ex3 
 {
    public static void main (String args[])
    {
        Scanner in =new Scanner (System.in);
        System.out.println("Enter a Sentence");
        String w=in.nextLine();
        String v="aeiouAEIOU ";
        String z="";
        for (int i=0;i<w.length();i++)
        {
            char c=w.charAt(i);
            if(v.indexOf(c)==-1)
                {
                    c--;
                    if(v.indexOf(c)!=-1)
                        c+=2;
                }
                z+=c;
        }
        System.out.println("Modified Sentence is "+z);
    }
}