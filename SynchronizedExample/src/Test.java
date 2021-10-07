
public class Test {

	public static void main(String[] args)
	{
		PrintEven obj = new PrintEven(); // Only one object
		Thread1 t1 = new Thread1(obj);
		Thread2 t2 = new Thread2(obj);
		t1.start();
		t2.start();
	}
}
