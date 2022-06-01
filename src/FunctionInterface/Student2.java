package FunctionInterface;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

/*
 * Program to find Students Information including Grade by using Function whose marks are >=60:
 */

public class Student2 {

	String name;
	int marks;

	Student2(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}
}

class FindStudentGradeInfoWithCondition {
	
	public static void main(String[] args) {
		
		ArrayList<Student2> l = new ArrayList<Student2>();
		populate(l);
		
		Function<Student2, String> f = s -> {
			int marks = s.marks;
			if (marks >= 80){
				return "A[Dictinction]";
			} else if (marks >= 60) {
				return "B[First Class]";
			} else if (marks >= 50) {
				return "C[Second Class]";
			} else if (marks >= 35) {
				return "D[Third Class]";
			} else {
				return "E[Failed]";
			}
		};
		
		Predicate<Student2> p = s -> s.marks >= 60;

		for (Student2 s : l) {
			if (p.test(s)) {
				System.out.println("Student Name:" + s.name);
				System.out.println("Student Marks:" + s.marks);
				System.out.println("Student Grade:" + f.apply(s));
				System.out.println();
			}
		}
	}

	public static void populate(ArrayList<Student2> l) {
		
		l.add(new Student2("Sunny", 100));
		l.add(new Student2("Bunny", 65));
		l.add(new Student2("Chinny", 55));
		l.add(new Student2("Vinny", 45));
		l.add(new Student2("Pinny", 25));
	}

}
