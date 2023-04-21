//WAP to find weather given number is Armstrong number is not. 

import java.util.*;
import java.math.*;

public class P11
{
  public static void main(String[] args) {
    
      int n,rem,ans=0;

      Scanner sc = new Scanner(System.in);

      System.out.print("Enter the number : ");
      n = sc.nextInt();

      int origin = n;
      
      while (origin != 0) 
      {
         rem = origin % 10;
         ans += Math.pow(rem,3);
         origin /= 10;  
      }

      if (ans == n) 
      {
        System.out.print("Armstrong");  
      }
      else 
      {
        System.out.print("Not Armstrong");
      }
  }

}
