package test;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> names=new ArrayList<>();
		names.add("Steve");names.add("Bob");
		names.add("Dave");names.add("Mark");
		Iterator<String> itr=names.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			}
	}

}
