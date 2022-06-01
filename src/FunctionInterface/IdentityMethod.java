package FunctionInterface;

import java.util.function.Function;

public class IdentityMethod {

	public static void main(String[] args) {
		
		Function<String, String> f1 = Function.identity();  //Returns a function that always returns its input argument
		                                    // it is static so we have to with class name
		String s2 = f1.apply("durga");
		System.out.println(s2);
	}
}
