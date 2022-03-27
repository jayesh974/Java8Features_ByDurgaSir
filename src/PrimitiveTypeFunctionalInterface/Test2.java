package PrimitiveTypeFunctionalInterface;

import java.util.function.Function;

/**
 * Demo Program to find square of given integer by using Function:
 */

public class Test2 {

	public static void main(String[] args) {
		
		Function<Integer,Integer> f=i->i*i;
		
		System.out.println(f.apply(4));
	}
}
