/**
2-d
*/

package AUT_16;

interface Animal
{
	void display();
}

class Cat implements Animal
{
	public void display()
	{
		System.out.println("This is cat");
	}
}

class Dog implements Animal
{
	public void display()
	{
		System.out.println("This is dog");
	}
}

public class AnimalMsg
{
	public static void main(String[] args)
	{
		Cat c = new Cat();
		Dog d = new Dog();
		
		c.display();
		d.display();
	}
}
