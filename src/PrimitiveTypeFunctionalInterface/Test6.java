package PrimitiveTypeFunctionalInterface;

import java.util.function.Function;

/**
 * Demo Program to find square root of given integer by using Function
 *
 */
public class Test6 {

	public static void main(String[] args) {
		
		Function<Integer, Double> f = i -> Math.sqrt(i);
		
		System.out.println(f.apply(7));
	}
}
