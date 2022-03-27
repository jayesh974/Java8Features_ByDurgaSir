
package PrimitiveTypeFunctionalInterface;

import java.util.function.IntToDoubleFunction;

/**
 * Demo Program to find square root of given integer by using IntToDoubleFunction
 */

public class Test7 {

	public static void main(String[] args) {
		
		IntToDoubleFunction f = i -> Math.sqrt(i);
		
		System.out.println(f.applyAsDouble(9));
	}
}
