// Calculate the power of a number in Java using while loop

import java.util.*;

public class P20
{
	public static void main(String[] args)
	{
		int base = 3, power = 3;

		int result = 1;

		while (power != 0) 
		{
			result = result * base;
			power--;
		}
		System.out.println("Result = " + result);
	}
}
