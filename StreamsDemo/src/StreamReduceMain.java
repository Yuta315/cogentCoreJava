import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamReduceMain {

//	N no of inputs ===> only single value o/p
//	reduce method.

	public static void main(String[] args) {
		 int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		 
		 int sum = 0;
		 for (int i: numbers) {
			 sum += i;
		 }

//		  System.out.println("sum : " + sum); // 55
		  
//		  int sum2 = Arrays.stream(numbers).reduce(0, (a, b) -> a + b); // 55
//		  int sum2 = Arrays.stream(numbers).reduce(0, Integer::sum); // 55
//		  int sum2 = Arrays.stream(numbers).reduce(0, Integer::min); // 0
//		  int sum2 = Arrays.stream(numbers).reduce(0, Integer::max); // 10
//		  int sum2 = Arrays.stream(numbers).reduce(10, Integer::min); // 1
//		  System.out.println(sum2);
		 
		 
		 
		 
		 
		 IntStream stream = Arrays.stream(numbers);
		  
		 Stream<Integer> boxed = stream.boxed();
//		 int ---> integer object
		 
//		 boxed.forEach(System.out::println); // 1 2 3 4 5 6 7 8 9 10
		 
		 
		 
		 
		 
		 List<String> list = Arrays.asList("9", "A", "Z", "1", "B", "Y", "4", "a", "c");
		 String s[] = {"9", "A", "Z", "1", "B", "Y", "4", "a", "c"};
		 
//		 Sorted without lambda
		 Collections.sort(list);
		 System.out.println(list); // [1, 4, 9, A, B, Y, Z, a, c]
		 
//		 Sorted with lambda
//		 Arrays.sort(list.toArray());
		 Arrays.sort(s);
		 Arrays.asList(s).forEach(System.out::println);
		 
//		 Sorted with lambda stream() edition
		 list.stream().sorted().collect(Collectors.toList());
		 System.out.println(list);
	}
}
