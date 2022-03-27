package PrimitiveTypeFunctionalInterface;

/**
 * Demo Program to find length of the given String by using Function
 */
import java.util.function.Function;

public class Test4 {

	public static void main(String[] args) {
		
		Function<String, Integer> f = s -> s.length();
		
		System.out.println(f.apply("durga"));
	}
}
