package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();

		list.add(231);
		list.add(312);
		list.add(992);
		list.add(628);
		list.add(426);

		ComparatorImplementation compare = new ComparatorImplementation();
		
		
		// using lambda functions for creating comparator
		Comparator<Integer> CompareByLastDigit = (arg0, arg1) -> {
			return arg0 % 10 > arg1 % 10 ? 1 : -1;
		};

//		list.sort(compare);
		// comparing the whole digit
		Collections.sort(list, compare);
		for (Integer integer : list) {
			System.out.println(integer);
		}

		System.out.println("");

		// comparaing by last digit
		Collections.sort(list, CompareByLastDigit);

		for (Integer integer : list) {
			System.out.println(integer);
		}

	}

}

class ComparatorImplementation implements Comparator<Integer> {

	@Override
	public int compare(Integer arg0, Integer arg1) {
		// TODO Auto-generated method stub

		if (arg0 > arg1) {
			return 1;
		} else {
			return -1;
		}
	}

}
