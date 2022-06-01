package FunctionInterface;

/*
 * Program to find Student Grade by using Function
 */

import java.util.function.*;
import java.util.*;

class Student1 {

	String name;
	int marks;

	Student1(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}
}

class FindStudentGrade {
	
	public static void main(String[] args) {
		
		ArrayList<Student1> l = new ArrayList<Student1>();
		populate(l);
		
		Function<Student1, String> f = s -> {
			
			int marks = s.marks;
			
			if (marks >= 80) {
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
		
		for (Student1 s : l) {
			System.out.println("Student Name:" + s.name);
			System.out.println("Student Marks:" + s.marks);
			System.out.println("Student Grade:" + f.apply(s));
			System.out.println();
		}
	}

	public static void populate(ArrayList<Student1> l) {
		
		l.add(new Student1("Sunny", 100));
		l.add(new Student1("Bunny", 65));
		l.add(new Student1("Chinny", 55));
		l.add(new Student1("Vinny", 45));
		l.add(new Student1("Pinny", 25));
	}
}
