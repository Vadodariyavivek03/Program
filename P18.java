//Selection Sort

import java.util.*;

public class P18
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);

     System.out.print("Enter the size of array : ");
     int n = sc.nextInt();

     int a[] = new int[n];

     System.out.println("Enter the element of array : ");

     for (int i=0; i<n; i++) 
     {
       a[i] = sc.nextInt(); 
     }
     
     SST(a);

     System.out.println("After Sorting with Selection sort : ");

     for (int i=0; i<n; i++) 
     {
       System.out.print(a[i]+" ");
     }    
  }

  public static void SST(int[] a)
  {
    int n = a.length;

    for (int i=0; i<n-1; i++) 
    {
       int minj = i;
       int minx = a[i];

       for (int j=i+1; j<n; j++) 
       {
          if (a[j] < minx) 
          {
             minj = j;
             minx = a[j]; 
          }     
       }       
        a[minj] = a[i];
        a[i] = minx;
    }
  
  }
}