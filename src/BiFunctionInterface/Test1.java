package BiFunctionInterface;
/*
 * To create Student Object by taking name and rollno as input by using BiFunction:
 */
import java.util.ArrayList;
import java.util.function.BiFunction;

class Student {
	
	String name;
	int rollno;

	Student(String name, int rollno) {
		this.name = name;
		this.rollno = rollno;
	}
}

class Test1 {

	public static void main(String[] args) {
		ArrayList<Student> l = new ArrayList<Student>();
		
		BiFunction<String, Integer, Student> f = (name, rollno) -> new Student(name, rollno);
		
		l.add(f.apply("Durga", 100));
		l.add(f.apply("Ravi", 200));
		l.add(f.apply("Shiva", 300));
		l.add(f.apply("Pavan", 400));
		
		for (Student s : l) {
			
			System.out.println("Student Name:" + s.name);
			System.out.println("Student Rollno:" + s.rollno);
			System.out.println();
		}
	}
}
