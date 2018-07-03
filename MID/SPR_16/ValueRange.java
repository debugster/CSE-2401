/**
3-b
*/

package SPR_16;

import java.lang.Exception;
import java.util.Scanner;

class ValueNotInRangeException extends Exception
{
	ValueNotInRangeException(String msg)
	{
		super(msg);
	}
}

public class ValueRange
{	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int v;
		
		try
		{
			System.out.print("Enter an integer : ");
			v = input.nextInt();
			
			if (v <= 0 || v >= 100)
			{
				throw new ValueNotInRangeException("Invalid Range");
			}
			else {
				System.out.println("You have entered " + v);
			}
		}
		catch (ValueNotInRangeException e)
		{
			System.out.print(e.getMessage());
		}
	}
}
