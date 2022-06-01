
package BiConsumerInterface;

import java.util.ArrayList;
import java.util.function.BiConsumer;

/**
 * Demo Program to increment employee Salary by using BiConsumer
 */

class Employee {
	
	String name;
	double salary;

	Employee(String name, double salary) {
		
		this.name = name;
		this.salary = salary;
	}
}

class Test2 {
	
	public static void main(String[] args) {
		
		ArrayList<Employee> l = new ArrayList<Employee>();
		populate(l);
		
		BiConsumer<Employee, Double> c = (e, d) -> e.salary = e.salary + d;
		
		for (Employee e : l) {
			
			c.accept(e, 500.0);     // performed operation on the given argument
		}
		
		for (Employee e : l) {
			
			System.out.println("Employee Name:" + e.name);
			System.out.println("Employee Salary:" + e.salary);
			System.out.println();
		}
	}

	public static void populate(ArrayList<Employee> l) {
		
		l.add(new Employee("Durga", 1000));
		l.add(new Employee("Sunny", 2000));
		l.add(new Employee("Bunny", 3000));
		l.add(new Employee("Chinny", 4000));
	}
}
