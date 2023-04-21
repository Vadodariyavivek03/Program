//Insertion Sort

import java.util.*;

public class P17
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
     
     IST(a);

     System.out.println("After Sorting with Insertion sort : ");

     for (int i=0; i<n; i++) 
     {
       System.out.print(a[i]+" ");
     }
	}

  public static void IST(int[] a)
   {
      int n = a.length;

      for (int i=1; i<n; i++) 
      {
        int x = a[i];
        int j = i-1;

        while(j > -1 && x < a[j])
        {
           a[j+1] = a[j];
           j = j-1;
        }
        
        a[j+1] = x;

      }

   }

}
