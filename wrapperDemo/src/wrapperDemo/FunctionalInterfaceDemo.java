package wrapperDemo;

@FunctionalInterface
public interface FunctionalInterfaceDemo {

//	must have only one abstract method.
	
	public void sample();
	
//	one abstract method + it can have many default methods / static methods.
	
//	public default void display()
	public static void display()
	{
		System.out.println("Hello from display");
	} // default methods
	
	public default String test()
	{
		return "test";
	}
}
