// WAP to find Max, Min, Average of n numbers, n should be taken from user and all n value should be taken from user (Note that you are not allowed to use an array for this)

import java.util.*;
public class P12
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       
       System.out.print("Enter the number size = ");
       int n=sc.nextInt();

       int max=0,min=0,sum=0;
       double avg=0;

       System.out.print("Enter number 1: ");
       int first = sc.nextInt();

       max=first;
       min=first;
       sum=sum+first;

       for(int i=1;i<n;i++)
       {
       System.out.print("Enter number "+(i+1)+": ");
       int num=sc.nextInt();
       
        if(num>max)
        {
            max=num;
        }
        if(num<min)
        {
            min=num;
        }
        sum=sum+num;
       }

       avg = (double)sum/n;

       System.out.println("Average of the number: "+avg);
       System.out.println("Max number: "+max);
       System.out.print("Min number: "+min);
    }
}