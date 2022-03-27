package BinaryOperator;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class Test1 {

	public static void main(String[] args) {

		/*
		 * 
		 * BiFunction<String, String, String> f = (s1, s2) -> s1 + s2;
		 * System.out.println(f.apply("durga", "software"));
		 */

//		with BinaryOperator

		BinaryOperator<String> b = (s1, s2) -> s1 + s2;
		System.out.println(b.apply("durga", "software"));
	}
}
