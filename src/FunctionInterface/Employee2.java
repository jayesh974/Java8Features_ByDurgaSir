package FunctionInterface;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

/*
 * Progarm to perform Salary Increment for Employees by using Predicate & Function:
 */

public class Employee2 {

	String name;
	double salary;

	Employee2(String name,double salary) 
	 { 
	 this.name=name; 
	 this.salary=salary; 
	 }

	public String toString() {
		return name + ":" + salary;
	}
}

class PerformSalaryIncrementForEmp {
	
	public static void main(String[] args) {
		
		ArrayList<Employee2> l = new ArrayList<Employee2>();
		populate(l);

		System.out.println("Before Increment:");
		System.out.println(l);

		Predicate<Employee2> p = e -> e.salary < 3500;
		
		Function<Employee2, Employee2> f = e -> {
			e.salary = e.salary + 477;
			return e;
		};

		System.out.println("After Increment:");
		
		ArrayList<Employee2> l2 = new ArrayList<Employee2>();
		
		for (Employee2 e : l) {
			if (p.test(e)) {
				l2.add(f.apply(e));
			}
		}
		
		System.out.println(l);
		System.out.println("Employees with incremented salary:");
		System.out.println(l2);
	}

	public static void populate(ArrayList<Employee2> l) {
		
		l.add(new Employee2("Sunny", 1000));
		l.add(new Employee2("Bunny", 2000));
		l.add(new Employee2("Chinny", 3000));
		l.add(new Employee2("Pinny", 4000));
		l.add(new Employee2("Vinny", 5000));
		l.add(new Employee2("Durga", 10000));
	}
}
