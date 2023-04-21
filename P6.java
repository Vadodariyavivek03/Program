//Print a following pattern.
// 1
// 1 2
// 1 2 3
// 1 2 3 4

import java.util.*;

public class P6
{
  public static void main(String[] args) 
  {
  	int n=4;

    for (int i=1; i<=n; i++) 
    {    
      for (int j=n; j>=i; j--) 
      {
        System.out.print(j + " ");
      }

      System.out.println();
    }

   }

 }
