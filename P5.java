//WAP to find a summation of a digit of a given number.(iterative)

import java.util.*;

public class P5
{
  public static void main(String[] args) 
  {
     int n,digit,sum=0;

     Scanner sc = new Scanner(System.in);

     System.out.print("Enter the number : ");
     n = sc.nextInt();

     while (n > 0)
     {
       digit = n % 10;
       sum += digit;  
       n = n/10;
     }

     System.out.print("The Sum of given number is : "+sum);
  	
  }
}