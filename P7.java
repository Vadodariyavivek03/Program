//WAP to find a Fibonacci series up to n terms (n is entered by user). (Iterative)

import java.util.*;

public class P7
{
  public static void main(String[] args) 
  {

   int a=0,b=1,n,c=1; 

   Scanner sc = new Scanner(System.in);

   System.out.print("Enter the number : ");
   n = sc.nextInt();

  System.out.print("Fibonacci Series : ");
       
   for(int i=0; i<=n; i++)    
    {    

      System.out.print(a+" "); 

      c = a + b; 

      a = b;
            
      b = c; 
   
    }    
  
  }
}