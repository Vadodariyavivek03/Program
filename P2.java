//Check string is palindrome or not.

import java.util.*;
 
public class P2
 {
   public static void main(String args[])  
   {  
      String str, rev = ""; 

      Scanner sc = new Scanner(System.in);

      System.out.print("Enter a string : ");  
      str = sc.nextLine();   

      int n = str.length();

      for ( int i=n-1; i>=0; i--) 
      { 
         rev = rev + str.charAt(i); 
      }   

      if (str.toLowerCase().equals(rev.toLowerCase())) 
          {
            System.out.println("The given string is a palindrome."); 
          }
      else
          {  
            System.out.println("The given string isn't a palindrome.");
          }
   }  
} 

/* Palindrom number

import java.util.Scanner;

public class P2
{
   public static void main(String args[])
   {
    int i,n,rev=0;

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the number : ");
    n = sc.nextInt(); 

    int origin = n;

    while(n>0)
    {
      int rem = n%10;
      rev = rev*10+rem;
      n=n/10;
    }

    if(origin==rev)
    {
     System.out.print("The given number is palindrome.");
    }
    else
    {
     System.out.print("The given number is not palindrome.");
    }
   }
} 

*/
