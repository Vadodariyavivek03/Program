import java.util.*;

public class Demo1
{
   public static void main(String[] args) 
   {
   	

   	 Rectangle r1 = new Rectangle();

   	 Scanner sc = new Scanner(System.in);

   	 System.out.print("Enter the height : ");
   	 r1.n1 = sc.nextFloat();

   	 System.out.print("Enter the Width : ");
   	 r1.n2 = sc.nextFloat();

        r1.CALA();


   }

}

class Rectangle{

   float n1,n2;

public void CALA()
{
   float Area = n1 * n2;
System.out.print("Area is : "+Area);
}



}