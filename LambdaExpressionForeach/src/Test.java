import java.util.*;
class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> cart = new ArrayList<String>();
		cart.add("mobile");
		cart.add("TV");
		cart.add("Guiter");
		cart.add("Book");
		cart.forEach((n) -> System.out.println(n));
	}

}
