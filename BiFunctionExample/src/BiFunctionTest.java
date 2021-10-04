import java.util.function.BiFunction;

public class BiFunctionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BiFunction<Integer, Integer, Integer> biFun = (a, b) -> (a + b);
		System.out.println(biFun.apply(100, 200));
	}

}
