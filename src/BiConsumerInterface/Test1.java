package BiConsumerInterface;

import java.util.function.BiConsumer;

/**
 * Program to accept 2 String values and print result of concatenation by using BiConsumer:
 */

public class Test1 {

	public static void main(String[] args) {
		
		BiConsumer<String, String> c = (s1, s2) -> System.out.println(s1 + s2);
		
		c.accept("durga", "soft");
	}
}
