//Factorial of given number (iterative method)

import java.util.*;

public class P4
{
  public static void main(String[] args) 
  {
    int i, n, fact=1;

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the number : ");
    n = sc.nextInt();

    for (i=1; i<=n; i++) 
    {
      fact = fact * i; 
    }

    System.out.print("Factorial of given number "+n+" is : "+fact);
    
  }
}