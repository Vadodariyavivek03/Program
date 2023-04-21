//Bucket Sort

import java.util.*;
import java.util.Collections;

public class P19
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
     
     BUST(a,n);

     System.out.println("After Sorting with Selection sort : ");

     for (int i=0; i<n; i++) 
     {
       System.out.print(a[i]+" ");
     }    
  }

  public static void BUST(int[] a, int n)
  {
     n = a.length;

    if (n <= 0)
    {
      return;
    }

        Vector[] buckets = new Vector[n];
  
        for (int i = 0; i < n; i++) 
        {
            buckets[i] = new Vector();
        }
  
        
        for (int i = 0; i < n; i++) 
        {
            int idx = a[i] * n;
            buckets[idx].add(a[i]);
        }
  
       
        for (int i = 0; i < n; i++) 
        {
            Collections.sort(buckets[i]);
        }
  
        
        int index = 0;

        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < buckets[i].size(); j++) 
            {
                a[index++] = buckets[i].get(j);
            }
        }
      
  }
}