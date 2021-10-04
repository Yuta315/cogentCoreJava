
class Base {
	static int i = 10; // static variable i = 0, i = 10, at the time of identification of the static variable
//	will given
	
	static {
		m1();
		System.out.println("First Static Block"); // First Static block
	}
	
	public static void main(String[] args)
	{
		m1();
		System.out.println("Main Method");
	} // main method
	public static void m1()
	{
		System.out.println(j); // 0, 20
	}
	static {
		System.out.println("Second Static Block"); // Second Static Block
	} // static block
	static int j = 20; // static variable j = 0, j = 20
}
