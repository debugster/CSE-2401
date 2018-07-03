/**
Inherit abstract class
*/

package SPR_17;

abstract class Shape
{
	abstract void draw();
}

class Circle extends Shape
{
	void draw()
	{
		System.out.println("Circle is drawn.");
	}
}

public class Main
{
	public static void main(String[] args)
	{
		Circle c = new Circle();
		c.draw();
	}
}
