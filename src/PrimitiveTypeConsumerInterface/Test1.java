package PrimitiveTypeConsumerInterface;
/**
 * Demo Program for IntConsumer
 */
import java.util.function.IntConsumer;
import java.util.function.IntFunction;

public class Test1 {

	public static void main(String[] args) {

		IntConsumer c = i -> System.out.println("The Square of i:" + (i * i));
		
		c.accept(10);
	}
}
