package PrimitiveTypeOfBinaryOperator;

import java.util.function.IntBinaryOperator;

public class Test1 {

	public static void main(String[] args) {

		/*
		 * BinaryOperator<Integer> b = (i1, i2) -> i1 + i2;
		 * System.out.println(b.apply(10, 20));
		 */

		IntBinaryOperator b = (i1, i2) -> i1 + i2;
		System.out.println(b.applyAsInt(10, 20));
	}
}
