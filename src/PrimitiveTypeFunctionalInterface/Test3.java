package PrimitiveTypeFunctionalInterface;

import java.util.function.IntFunction;

/**
 * Demo Program to find square of given integer by using IntFunction:
 */
public class Test3 {

	public static void main(String[] args) {
		
		IntFunction<Integer> f = i -> i * i;
		
		System.out.println(f.apply(5));
	}
}
