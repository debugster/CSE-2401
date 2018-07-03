/**
1-c
*/

package SPR_16;

public class GCDMain
{
	static int GCD(int a, int b)
	{
		if (b == 0)
			return a;
		return GCD(b, a % b);
	}
	
	public static void main(String[] args)
	{
		System.out.println("GCD(50, 4) = " + GCD(50, 4));
	}
}
