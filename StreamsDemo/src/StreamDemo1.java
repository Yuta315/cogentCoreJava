import java.util.Arrays;

public class StreamDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] strings = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
				"1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
				"1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
				"1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
				"1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
				"1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
				"1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
				"1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
				"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
		long startTime = System.currentTimeMillis();
//		System.out.println(System.currentTimeMillis());
		System.out.println(startTime);
//		Arrays.stream(strings).forEach(System.out::println);
		Arrays.stream(strings).parallel().forEach(System.out::println);

//		seq
//		System.out.println(System.currentTimeMillis());
		System.out.println("diff is " + (System.currentTimeMillis()-startTime));
		
	}

}
