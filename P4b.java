//Factorial of given number.(Recursion)

import java.util.*;

public class P4b
{

  public static void main(String[] args) 
  {
  	int n, fact=1;

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the number : ");
    n = sc.nextInt();

    fact = fact(n);

    System.out.print("Factorial of given number "+n+" is : "+fact);
  }

  public static int fact(int n)
    {

      if (n==0 || n==1) 
      {
        return 1;  
      }
      else
      {
        return n * fact(n-1);
      }
    } 
}

