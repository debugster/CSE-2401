/**
Throws NotValidException when a persin is not permitted to enter
*/

package SPR_17;

import java.lang.Exception;
import java.util.Scanner;

class NotValidException extends Exception
{
	NotValidException(String msg)
	{
		super(msg);
	}
}

public class ThrowExc
{
	public static void main(String[] args)
	{
		boolean isPermitted = false;
		
		try
		{
			if (!isPermitted)
			{
				throw new NotValidException("You are not permitted to enter!");
			}
		}
		catch (NotValidException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
