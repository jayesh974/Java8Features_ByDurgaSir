package FunctionInterface;

import java.util.function.Function;
/*
 * program to remove spaces present in the given String by using Function:
 */
public class RemoveSpaceInGivenString {

	public static void main(String[] args) {

		String s = "durga software solutions hyderabad";

		Function<String, String> f = s1 -> s1.replaceAll(" ", "");

		System.out.println(f.apply(s));
	}
}
