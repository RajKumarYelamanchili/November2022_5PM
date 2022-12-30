package December1st;

class Animal
{
  String color = "white";
}
class Dog extends Animal
{
	String color ="black";
	void printColor()
	{
		System.out.println(color);//black
		System.out.println(super.color);//white
	}
}

public class TestSuper {
	public static void main(String[] args) {
   Dog d = new Dog();
   d.printColor();

	}

}
