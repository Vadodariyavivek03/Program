//WAP to find a prime number between range (range should be entered by user).

import java.util.*;

public class P10
{
  public static void main(String[] args) 
  {
    int n1,n2,i,j,flag=0;

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the starting limit number : ");
    n1 = sc.nextInt();  

    System.out.print("Enter the ending limit number : ");
    n2 = sc.nextInt();  

    for (i = n1; i <= n2; i++)
    {
      for (j = 2; j < i; j++) 
      {
        if (i % j == 0) 
        {
          flag = 0;
          break;  
        }
        else
        {
          flag = 1;
        }
      } 

      if (flag == 1) 
      {
        System.out.print(i + " "); 
      } 
    }
  }
}