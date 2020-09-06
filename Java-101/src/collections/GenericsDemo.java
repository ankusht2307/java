package collections;

import java.util.ArrayList;

// creating custom generics to set types

class CustomGenerics<T> {

	T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

}

public class GenericsDemo {

	public static void main(String[] args) {

		CustomGenerics<Integer> obj = new CustomGenerics<>();

		obj.value = 4;

		System.out.println(obj.getValue());

	}

}
