import java.util.*;

public class P27
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of array : ");
		int n = sc.nextInt();

		int[] a = new int[n];
		

        System.out.println("Enter the element of array : ");

		for(int i=0; i<n; i++)
		{
          a[i] = sc.nextInt();
		}
        
		CS(a,n);

		System.out.println("After Sorting with Counting sort : ");

        for (int i=0; i<n; i++) 
        {
          System.out.print(a[i]+" ");
        }


	}

	static void CS(int[] a, int n)
	{
      n = a.length;

      int max = a[0];

      for (int i=1; i<n; i++) 
      {
        if (a[i] > max) 
        {
          max = a[i]; 		
       	}	
      }

      int[] b = new int[max + 1];

      for (int i=0; i<max; i++) 
      {
        b[i] = 0;	
      }

      for (int i=0; i<n; i++) 
      {
      	b[a[i]]++;
      }

      for (int i=1; i<=max; i++) 
      {
        b[i] += b[i-1];	
      }

      //Output
      int[] c = new int[n+1];

     for(int i=n-1; i>=0; i--)
     {
       c[b[a[i]]-1]=a[i];
       b[a[i]]--;
     }

     for (int i=0; i<n; i++) 
     {
       a[i]	= c[i];
     }

	}
}