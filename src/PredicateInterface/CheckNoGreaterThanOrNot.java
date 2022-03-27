package PredicateInterface;

import java.util.function.Predicate;

public class CheckNoGreaterThanOrNot {

//	Que . Write a predicate to check whether the given integer is greater than 10 or not.

	public static void main(String[] args) {
		
//		predicate<Integer> p = I -> (i>10); 
		Predicate <Integer> p = I -> (I>10);
		 
		 System.out.println(p.test(100)); 
		 System.out.println(p.test(7)); 
//		 System.out.println(p.test(true)); //CE 
		 
		 }
}
