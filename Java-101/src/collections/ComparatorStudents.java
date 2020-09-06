package collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorStudents {

	public static void main(String[] args) {
		
		List<Child> students = new ArrayList<>();
		
		students.add(new Child(1, 33));
		students.add(new Child(2, 93));
		students.add(new Child(3, 45));
		students.add(new Child(4, 67));
		students.add(new Child(5, 87));
		students.add(new Child(6, 12));
		
		for (Child students2 : students) {
			System.out.println(students2);
		}
		
		System.out.println("");
		
		Comparator<Child> compareGrades = ( Child arg1, Child arg2) -> {
				return arg1.marks < arg2.marks ? 1 : -1;
		};
		
		Collections.sort(students, compareGrades);
		
		for (Child students2 : students) {
			System.out.println(students2);
		}
		

	}

}

class Child {

	int rollNo;
	int marks;

	public Child(int rollNo, int marks) {
		super();
		this.rollNo = rollNo;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Students [rollNo=" + rollNo + ", marks=" + marks + "]";
	}

}