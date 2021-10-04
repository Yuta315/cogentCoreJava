package wrapperDemo;

import java.util.*;
import java.util.Map.Entry;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.function.*;

import org.apache.commons.codec.digest.DigestUtils;

public class Main {

	public static void main(String[] args)
	{
//		autoboxing primitive to object
//		Integer i = 10;
//		System.out.println(i);
//		System.out.println(i.getClass().getName());
//		
//		int a = i;
////		unboxing
//		System.out.println(a);
//		
//		Float j = 10.0f;
//		System.out.println(j.getClass().getName());
//		
//		float b = j;
//		System.out.println(b);
//		
//		double c = i.doubleValue();
//		System.out.println(c);
		
//		HashMap<Integer, String> hashMap = new HashMap<>();
//		
////		hashMap.put(10, "Yuta"); // 1
//		hashMap.put(10, null); // 2
//		hashMap.put(null, "YutaMogi"); // 3
////		hashMap.put(null, "Y"); // 4
//		hashMap.put(null, null); // 5
//
////		2,3,5 = {null=null, 10=null}
////		1,3,4 = {null=Y, 10=Yuta}
//		System.out.println(hashMap);
//		
//		LinkedHashMap<Integer, String> hashMap2 = new LinkedHashMap<>();
//		
////		hashMap2.put(10, null);
//		hashMap2.put(10, "Yuta"); // *
//		hashMap2.put(null, "YutaMogi");
//		hashMap2.put(null, null);
//		System.out.println(hashMap2); // {10=null, null=null}
//		System.out.println(hashMap2.get(null)); // null
////		System.out.println(hashMap2.get(10)); // * ===> Yuta
//		
////		only keys from the map
//		
//		Set<Integer> set = hashMap2.keySet();
//		System.out.println(set); // [10, null]
//		
//		Collection<String> set2 = hashMap2.values();
//		System.out.println(set2); // []
//		
////		traverse the map
//		
//		for (Entry<Integer, String> entry : hashMap2.entrySet()) {
////			entry ===> key value pair
//			Integer key = entry.getKey();
//			String val = entry.getValue();
//			
//			System.out.println("key = " + key);
//			System.out.println(val);
//		}
		
//		FunctionalInterfaceDemo.display();
		
		
		
//		FunctionalInterfaceDemo demo = new FunctionalInterfaceDemo() {
//			@Override
//			public void sample() {
//				System.out.println("Hello from sample");
//			}
////			@Override
////			public String test() {
////				return "new Value";
////			}
//		}; // traditional approach
//		
////		String result = demo.test();
////		System.out.println(result);
////		demo.sample();
////		FunctionalInterfaceDemo.display();
//			
//		FunctionalInterfaceDemo demo2 = ()->{System.out.println("Hello from java 8");};
//		
//		String result = demo2.test();
//		System.out.println(result);
//		demo2.sample();
////		FunctionalInterfaceDemo.display();
//		
		
		
//		
//		Function<String, Integer> function = x-> x.length();
////		Function<String, Integer> function = x-> {
////			int res = x.length();
////			return res;
////		}; // return statement
//		Function<Integer, Integer> function2 = x-> x * 2;
//		
//		Integer result = function.andThen(function2).apply("Yuta");
////		int result = function.andThen(function2).apply("Yuta"); // Integer or int both fine
////		object to primitive
////		Integer ===> int
//
//		System.out.println(result);
//		List<Integer> integers = Arrays.asList(1,2,3,4,5);
////		List<? extends Number> numbers = new ArrayList<Number>();
//		List<? super Number> numbers = new ArrayList<Number>();
//		
////		List<? super A> means that the list is typed to either class A or a superclass of A.
////		extends A : a list of object that are instances of class A or subclasses of A.
////		upperbound character
//		
//		numbers.add(new Integer(5));
//		numbers.add(new Double(10.4));
//		numbers.add(new Float(10.4555));
//		
////		System.out.println(integers);
//		System.out.println(numbers);
//		
//		
////		List<? super Number> numbers2 = new ArrayList<Double>();
////		
////		numbers2.add(new Integer(5));
////		
////		System.out.println(numbers);
//		
////		List<? extends Number> list = new ArrayList<Number>();
////		List<? extends Number> list2 = new ArrayList<Integer>();
////		Number num = new Integer(10);
//////		list2.add(10);
//////		list2.add(new Integer(10));
////		list2.add(Integer.valueOf(10),null);
////		list2.add((int) 10.0, null);
////		System.out.println(list);
////		System.out.println(list2);
//		
////		Employee e = new Manager();
//		
//		
//		
//		
////		int a = function.apply(null);
//		int a = function.apply("Yuta");
//		System.out.println(a);
//		
		
		// x : string
		
		
		
		
//		can u create a list of type integer which will hold only integer value?
//		List<Integer> integersTest = Arrays.asList(1,2,3,4,5);
////		can u create a list of type double which will hold only double value?
//		List<Double> doubleTest = Arrays.asList(1.0,2.0,3.0,4.0,5.0);
		
//		sum();
//		System.out.println(sum());
//		double result = sum(integersTest);
//		System.out.println(result);
//		result = sum(doubleTest);
//		System.out.println(doubleTest);
		
		
		
		
//		List<String> list = Arrays.asList("Yuta", "YutaMogi", "Yuta315", "JP1USA2NZ3");
//		List<String> resultList =  map(list, x->sha256(x));
//		
//		for(String string : resultList) {
//			System.out.println(string);
//		}
//		
		
		
		
		
		Function<Integer, Integer> function = x->x*2;
		
//		int result = function.apply(10);
		
//		System.out.println(result);
		
		UnaryOperator<Integer> operator = x->x*2;
		System.out.println(operator.apply(20));
		
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> result2 = math(list, x -> x * 2);
		System.out.println(result2);
		
		List<String> list3 = Arrays.asList("YUTA", "YUTAMOGI", "YUTA315", "JP1NZ2USA3");
		list3.stream().map(String::toLowerCase).forEach(System.out::println);
		
		
		
		
		
		BiFunction<Integer, Integer, Integer> biFunction = (a, b) ->{return a + b;};
		int result = biFunction.apply(10, 20);
		System.out.println(result);
		
		
		Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		Integer result3 = math2(Arrays.asList(numbers), 0, (a, b) -> a + b);
		System.out.println(result3); // 55
		
		Integer result4 = math2(Arrays.asList(numbers), 0, Integer::sum);
		System.out.println(result4); // 55
	}
	
	private static double sum(List<? extends Number> list) {
		double result = 0;
		
//		list.forEach(null);
		for (Number number : list) {
		
			result += number.doubleValue();
		}
		
		return result;
	}
	
//	default passowrd
//	default random password
	
	public static <T,R> List<R> map(List<T> list, Function<T, R> func) {
		
		List<R> result = new ArrayList<>();
		
		for(T t : list) {
			result.add(func.apply(t));
//			whatever the lambda expression we will write it ---> will it be applied here?
		}

//		return null;
		return result;
		
	}
	
	public static String sha256(String str) {
		return DigestUtils.sha256Hex(str);
	}
	
//	public static Integer math() {
	public static <T> List<T> math(List<T> list, UnaryOperator<T> unaryOperator) {
		List<T> result = new ArrayList<>();
		for (T t : list) {
			result.add(unaryOperator.apply(t));
		}
		return result;
	}
	
	public static <T> T math2(List<T> list, T init, BinaryOperator<T> accumulator) {
		T result = init;
		for (T t : list) {
			result = accumulator.apply(result,t);
		}
		return result;
	}
}
