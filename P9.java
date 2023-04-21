 //WAP to find whether a number is Odd or Even without using a % operator. 

import java.util.*;

public class P9
{
  public static void main(String[] args) 
  {
    int n;

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the number : ");
    n = sc.nextInt();

    //Method ---> 1(best)

    if((n&1) == 0)
    {
      System.out.print("The given number "+n+" is even.");
    }
    else
    {
      System.out.print("The given number "+n+" is odd.");
    }

    //Method ---> 2

    // int temp = n/2;

    // if (n == temp*2) 
    // {
    //   System.out.print("The given number "+n+" is even.");
    // }
    // else
    // {
    //    System.out.print("The given number "+n+" is odd.");
    // }            
  }
}