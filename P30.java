//WAP to convert a Decimal to Binary.

import java.util.*;

public class P30 
{
  public static void main(String[] args) 
  {
    int n;

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the decimal number : ");
    n = sc.nextInt();
  
    // convert decimal to binary
    String binary = Integer.toBinaryString(n);
    System.out.println("The Binary of decimal number "+n+" is : "+binary);
  }
}