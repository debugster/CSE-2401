/**
3-c
*/

package AUT_15;

import java.lang.Exception;
import java.util.Scanner;

class IDException extends Exception
{
	IDException(String msg)
	{
		super(msg);
	}
}

public class IDCheck
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String ID;
		
		try
		{
			System.out.print("Enter your ID: ");
			ID = input.nextLine();
			
			if (ID.length() == 7 && ID.charAt(0) == 'C') {
				System.out.println("Valid ID.");
			}
			else {
				throw new IDException("Invalid ID!");
			}
		}
		catch (IDException ob)
		{
			System.out.println("Caught an ID Error Exception: " + ob);
		}
	}
}
