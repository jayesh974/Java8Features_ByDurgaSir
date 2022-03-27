package FunctionInterface;

import java.util.ArrayList;
import java.util.function.Function;

/*
 * Progarm to find Total Monthly Salary of All Employees by using Function:
 */

public class Employee1 {

	String name;
	double salary;

	Employee1(String name,double salary) 
	 { 
	 this.name=name; 
	 this.salary=salary; 
	 }

	public String toString() {
		return name + ":" + salary;
	}
}

class TotalMonthlySalaryOfEmp {
	
	public static void main(String[] args) {
		ArrayList<Employee1> l = new ArrayList<Employee1>();
		populate(l);
		System.out.println(l);
		Function<ArrayList<Employee1>, Double> f = l1 -> {
			double total = 0;
			for (Employee1 e : l1) {
				total = total + e.salary;
			}
			return total;
		};
		System.out.println("The total salary of this month:" + f.apply(l));
	}

	public static void populate(ArrayList<Employee1> l) {
		l.add(new Employee1("Sunny", 1000));

		l.add(new Employee1("Bunny", 2000));
		l.add(new Employee1("Chinny", 3000));
		l.add(new Employee1("Pinny", 4000));
		l.add(new Employee1("Vinny", 5000));
	}
}
