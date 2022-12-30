package December1st;

class A
{
	private int data=43;
	private void msg()
	{
		System.out.println("Hello");
	}
}
public class PrivateDefault {
	public static void main(String[] args) {
		A obj = new A();
		System.out.println(obj.data);
		obj.msg();
	

	}

}
