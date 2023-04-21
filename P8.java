// WAP to find a total odd and total even digit of a given number.

import java.util.*;

public class P8
{
  public static void main(String[] args)
   {

  	int n;
  	int even_digit = 0;
    int odd_digit = 0;

  	Scanner sc = new Scanner (System.in);

  	System.out.print("Enter the number : ");
  	n = sc.nextInt();

    while (n > 0) 
     {
       int rem = n%10;

        if (rem%2 == 0) 
        {
          even_digit++;
        }
        else 
        {
          odd_digit++;
        }

           n = n / 10;
      }

    System.out.println ( "Total Even Digit is : " +even_digit);
	System.out.println ( "Total Odd Digit is : " +odd_digit);

	// if (even_digit % 2 == 0 && odd_digit % 2 != 0)
	// {
	// 	return 1;
	// }
	// else 
	// {
	// 	return 0;
	// }


   // if (i == 1) {
   //      System.out.println ( "YES" );
   //  }
   //  else {
   //      System.out.println( "NO") ;
   //  }
   
   }
}