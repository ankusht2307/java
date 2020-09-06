package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {

		Set<Integer> hashSet = new HashSet<Integer>();

		hashSet.add(1);
		hashSet.add(2);
		hashSet.add(3);
		hashSet.add(19);
		hashSet.add(123);
		hashSet.add(4);
		hashSet.add(5);
		hashSet.add(1);
		hashSet.add(2);
		hashSet.add(100);
		hashSet.add(21);

//		System.out.println(hashSet);

		for (Integer integer : hashSet) {
			System.out.println(integer);
		}
		
		System.out.println("");

		Set<Integer> treeSet = new TreeSet<>();

		treeSet.add(1);
		treeSet.add(2);
		treeSet.add(3);
		treeSet.add(19);
		treeSet.add(123);
		treeSet.add(4);
		treeSet.add(5);
		treeSet.add(1);
		treeSet.add(2);
		treeSet.add(100);
		treeSet.add(21);
		
		// treeset return sorted values in ascending order

		System.out.println(treeSet);

		for (Integer integer : treeSet) {
			System.out.println(integer);
		}

	}

}
