package PrimitiveTypeFunctionalInterface;

import java.util.function.ToIntFunction;

/**
 * Demo Program to find length of the given String by using ToIntFunction
 */

public class Test5 {

	public static void main(String[] args) {
		
		ToIntFunction<String> f = s -> s.length();

		System.out.println(f.applyAsInt("durga"));
	}
}
