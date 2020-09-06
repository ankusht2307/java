package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {

	public static void main(String[] args) {

		List<Students> studentList = new ArrayList<>();

		studentList.add(new Students(1, 23));
		studentList.add(new Students(2, 25));
		studentList.add(new Students(3, 36));
		studentList.add(new Students(4, 73));
		studentList.add(new Students(5, 99));
		studentList.add(new Students(6, 78));
		
		Collections.sort(studentList);
		
		for (Students students : studentList) {
			System.out.println(students);
		}

	}

}

class Students implements Comparable<Students> {

	int rollNo;
	int marks;

	public Students(int rollNo, int marks) {
		this.marks = marks;
		this.rollNo = rollNo;
	}

	@Override
	public String toString() {
		return "Students [rollNo=" + rollNo + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(Students arg0) {
		// TODO Auto-generated method stub
		return this.marks > arg0.marks ? 1 : -1;
	}
}
