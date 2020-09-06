package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();

		list.add(1);
		list.add(2);
		list.add(4);
		list.add(42);
		list.add(64);
		list.add(8);
		list.add(103);
		list.add(47);

		// with list we can specify index where we want to add the value

		list.add(2, 3);
		System.out.println(list);
		
		
		Collections.sort(list);
		System.out.println(list);
		
		// printing values by lambda expression
		list.forEach(System.out::println);
		

	}

}
