import java.io.*;
import java.util.*;

public class counting_vowels{  
    public static void main(String[] args) { 
	  int c=0;
try{
         System.out.println("Enter an String:");
            InputStreamReader r=new InputStreamReader(System.in);  
            BufferedReader br=new BufferedReader(r);  
            String s1 = br.readLine();
            //Write your code here to count the number of vowels in the string "s1"
          int x=s1.length();
          int i;
          for(i=0;i<x;i++)
          {
            if((s1.charAt(i)=='a')||(s1.charAt(i)=='e')||(s1.charAt(i)=='i')||(s1.charAt(i)=='o')||(s1.charAt(i)=='u')||(s1.charAt(i)=='A')||(s1.charAt(i)=='E')||(s1.charAt(i)=='I')||(s1.charAt(i)=='U'))
            {
              c=c+1;
            }
          }
        System.out.println("Total no of vowels-: "+c); 
	}
       catch (Exception e)
          {
		    System.out.println(e);
	      }	     
    }  
} 