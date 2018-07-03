/**
Calculates the frequencies of characters of a string
*/

package SPR_17;

import java.util.Scanner;

class CalculateFreq
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int[] frequencies = new int[26];
		String str, temp;
		
		System.out.print("Enter a string: ");
		str = input.nextLine();
		
		temp = str.toUpperCase();
		
		for (int i = 0; i < str.length(); i++)
		{
			char c = temp.charAt(i);
			
			if (c >= 'A' && c <= 'Z')
			{
				frequencies[(int) c - 65]++;
			}
		}
		
		for (int i = 0; i < 26; i++)
		{
			System.out.println((char) (i + 65) + " -> " + frequencies[i]);
		}
	}
}
