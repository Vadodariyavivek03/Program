//WAP to find a summation of a digit of a given number.(Recursion)

import java.util.*;

public class P5b
{
	public static void main(String[] args) 
	{
      int n;

      Scanner sc = new Scanner(System.in);

      System.out.print("Enter the Number : ");
      n= sc.nextInt();

      int Ans = SoD(n);
      System.out.print("Sum of Digit is : "+Ans);
	}

	static int SoD(int n)
	{
      
      if (n == 0) 
      {
        return 0;	
      }
  
       return n%10 + SoD(n/10);
	}

}