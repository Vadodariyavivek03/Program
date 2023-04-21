import java.util.*;

public class P22b 
{
    public static void main(String[] args)
    {
        int rows = 5;

        for (int i = 1; i <= rows; i++) 
        {
            // print spaces
            for (int j = 1; j < i; j++) 
            {
                System.out.print(" ");
            }

            // print asterisks
            for (int k = 1; k <= 2 * rows - 2 * i + 1; k++) 
            {
                if (i == 1 || k == 1 || k == 2 * rows - 2 * i + 1) 
                {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            // print new line
            System.out.println();
        }
    }
}
