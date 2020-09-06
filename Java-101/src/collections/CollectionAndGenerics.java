package collections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionAndGenerics {

	public static void main(String[] args) {

		// collection created with no specific type
		Collection values = new ArrayList();

		values.add(1);
		values.add(2.2);
		values.add("name");

		for (Object object : values) {
			System.out.println(object);
		}
		System.out.println("");

		// collection created with generics to define specific type

		Collection<Integer> IntValues = new ArrayList<>();

		IntValues.add(1);
		IntValues.add(2);
		IntValues.add(3);
		IntValues.add(4);

		for (Integer integer : IntValues) {
			System.out.println(integer);
		}
		System.out.println("");

		Collection<String> StringValues = new ArrayList<>();

		StringValues.add("one");
		StringValues.add("two");
		StringValues.add("three");
		StringValues.add("four");

		for (String string : StringValues) {
			System.out.println(string);
		}
		System.out.println(StringValues);

	}

	// with collections we can't add values at a specific index.
	// collection doesn't have methods for sorting the elements

}
