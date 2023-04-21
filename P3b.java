//Factor of given number.(Recursion)

import java.util.*;

public class P3b
{
  public static void main(String[] args) 
  {
    int i,n;

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the number : ");
    n = sc.nextInt();
    
    System.out.print("The factors of the " +n+ " are: ");

    FindFactors(n,1);
    
  	}

  	public static void FindFactors(int n, int i) {
        
        if (i <= n)
         {
            if (n % i == 0) 
            {
              System.out.print(i + " ");
            }
           
            FindFactors(n,i+1);
         }
  }

}