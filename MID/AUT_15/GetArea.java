/**
4-c
*/

package AUT_15;

abstract class Figure
{
	final double PI = 3.14;
	abstract double area();
}

class Square extends Figure
{
	double length;
	
	Square(double l)
	{
		length = l;
	}
	
	double area()
	{
		return length * length;
	}
}

class Circle extends Figure
{
	double radius;
	
	Circle (double r)
	{
		radius = r;
	}
	
	double area()
	{
		return PI * radius * radius;
	}
}

public class GetArea
{
	public static void main(String[] args)
	{
		Square s = new Square(6.0);
		Circle c = new Circle(10.0);
		
		System.out.println("Area of square = " + s.area());
		System.out.println("Area of circle = " + c.area());
	}
}
