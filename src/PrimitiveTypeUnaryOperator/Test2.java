package PrimitiveTypeUnaryOperator;
/*
 *  Demo Program-1 for IntUnaryOperator
 */
import java.util.function.IntUnaryOperator;

public class Test2 {

	public static void main(String[] args) {
		
		IntUnaryOperator f = i -> i * i;
		
		System.out.println(f.applyAsInt(6));
	}
}
