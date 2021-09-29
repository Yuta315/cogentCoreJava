
public abstract class AbstractDemo {

	int a = 10;
	public abstract void demo();
	
	public abstract void test();
	
	public void test2()
	{
		System.out.println("Test is called.");
	}
	
	public AbstractDemo() {
		// TODO Auto-generated constructor stub
		System.out.println("Hello from abstract constructor");
	}
	
	public static void display()
	{
		System.out.println("Hello from display method");
	}
}
