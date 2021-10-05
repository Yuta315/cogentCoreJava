import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.*;

public class StreamDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = Arrays.asList("spring", "java", "angular", "microservices");
		
		getList(list, "java").forEach(System.out::println);
	}
	
//	public static List<String> getList(List<String> list, String filter) {
	public static List<String> getList(List<String> list, String f) {
//		List<String> result = new ArrayList<>();
//		for(String string : list) {
//			if(!string.equals(filter)) {
//				result.add(string);
//			}
//		}
//		return result;
		
		return list.stream().filter(e -> !e.equals(f)).collect(Collectors.toList());
	}

}
