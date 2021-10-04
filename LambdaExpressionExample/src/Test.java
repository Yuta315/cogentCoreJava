

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		without lambda
		Greetable greet = new Greetable()
		{
			public void greet()
			{
				System.out.println("Hello, how are you");
			}
		};
		greet.greet();
		// with lambda
		Greetable greet1 = () -> {System.out.println("Hello, how are you!!");};
		greet1.greet();
	}

}
