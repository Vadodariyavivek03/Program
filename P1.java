//Sum of Even Number...

import java.util.*;

public class P1
{
  public static void main(String[] args) 
  {

    int i, n, even=0;

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the size of array: ");
    n = sc.nextInt();

    int a[] = new int[n];

    System.out.println("Enter the element of array :");

    for (i=0; i<n; i++) 
    {
      a[i] = sc.nextInt();
    }

    for(i=0; i<n; i++)
    {
       if(a[i]%2==0)
      {
        even += a[i]; 
      }
    }

    System.out.print("Sum of Even number is: "+even);

  }
}

