//WAP to find a Fibonacci series up to n terms (n is entered by user). (Recursion)

import java.util.*;

public class P7b
{
  public static void main(String[] args) 
  {
    int n;

  	Scanner sc = new Scanner(System.in);

    System.out.print("Enter the number : ");
    n = sc.nextInt();

    System.out.print("Fibonacci Series : ");

    for(int i=0; i<=n; i++)    
    {    
      System.out.print(FoS(i)+" ");  
    }    

  }

  public static int FoS(int n)
   {

       if(n == 0)
       {
         return 0;
       }
       else if(n == 1 || n == 2)
       {
         return 1;
       }
       else 
       {
         return FoS(n-2) + FoS(n-1);
       } 
    }
 }
