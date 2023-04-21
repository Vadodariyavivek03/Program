//Bubble Sort

import java.util.*;

public class P16
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
     
     BST(a);

     System.out.println("After Sorting with Bubble sort : ");

     for (int i=0; i<n; i++) 
     {
       System.out.print(a[i]+" ");
     }


	}

   public static void BST(int[] a)
   {
      int n = a.length;

     for (int i=1; i<n-1; i++) 
     {
       for(int j=1; j<n-i; j++)
       {
         if (a[j] > a[j+1]) 
         {
           int temp = a[j];
               a[j] = a[j+1];
               a[j+1] = temp;
         }
       }
     }

   }

}
