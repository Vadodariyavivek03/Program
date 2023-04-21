//Factor of given number.(iterative)

import java.util.*;

public class P3
{
  public static void main(String[] args) 
  {
  	int i, n;

  	Scanner sc = new Scanner(System.in);

  	System.out.print("Enter the number : ");
    n = sc.nextInt();

    System.out.print("The factors of the " +n+ " are: ");

    for (i=1; i<=n; i++) 
    {
       if(n%i == 0)
       {
         System.out.print(i + " "); 
       }  	
    }
  }
}