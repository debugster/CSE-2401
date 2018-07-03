/**
3-d
*/

package AUT_16;

import java.lang.Exception;
import java.util.Scanner;

class NoMatchException extends Exception
{
	NoMatchException(String msg)
	{
		super(msg);
	}
}

public class MatchString
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String str;
		
		System.out.print("Enter a string: ");
		str = input.nextLine();
		
		try
		{
			if (!str.equals("Bangladesh"))
			{
				throw new NoMatchException("String does not match Bangladesh");
			}
		}
		catch (NoMatchException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
