package PredicateInterface;

import java.util.function.Predicate;

/*
 * Program to check whether SoftwareEngineer is allowed into pub or not by using Predicate?
 */
class SoftwareEngineer {
	
	String name;
	int age;
	boolean isHavingGf;

	SoftwareEngineer(String name, int age, boolean isHavingGf) {
		this.name = name;
		this.age = age;
		this.isHavingGf = isHavingGf;
	}

	public String toString() {
		return name;
	}
}

class Demo {
	
	public static void main(String[] args) {
		
		SoftwareEngineer[] list = {  
                new SoftwareEngineer("Durga", 60, false), 
				new SoftwareEngineer("Sunil", 25, true),
				new SoftwareEngineer("Sayan", 26, true),
				new SoftwareEngineer("Subbu", 28, false),
				new SoftwareEngineer("Ravi", 17, true)			
			};
		
		Predicate<SoftwareEngineer> allowed = se -> se.age >= 18 && se.isHavingGf;
		
		System.out.println("The Allowed Members into Pub are:");
		
		for (SoftwareEngineer se : list) {
			
			if (allowed.test(se)) {f
				
				System.out.println(se);
			}
		}
	}
}
