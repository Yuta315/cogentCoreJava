package wrapperDemo;

import java.util.*;
import java.util.Map.Entry;

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
		FunctionalInterfaceDemo demo = new FunctionalInterfaceDemo() {
			@Override
			public void sample() {
				System.out.println("Hello from sample");
			}
//			@Override
//			public String test() {
//				return "new Value";
//			}
		}; // traditional approach
		
//		String result = demo.test();
//		System.out.println(result);
//		demo.sample();
//		FunctionalInterfaceDemo.display();
			
		FunctionalInterfaceDemo demo2 = ()->{System.out.println("Hello from java 8");};
		
		String result = demo2.test();
		System.out.println(result);
		demo2.sample();
		FunctionalInterfaceDemo.display();
	}
}
