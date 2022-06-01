package PrimitiveTypeUnaryOperator;

import java.util.function.UnaryOperator;

/**
 * The primitive versions for UnaryOperator
 */
public class Test1 {

	public static void main(String[] args) {
		/*
		 * // With normal function interface
		 * 
		 * Function<Integer, Integer> f = i -> i * i;
         *                               System.out.println(f.apply(5));
		 */

//		With UnaryOperator
		
		UnaryOperator<Integer> f = i -> i * i;	
		System.out.println(f.apply(6));

	}
}
