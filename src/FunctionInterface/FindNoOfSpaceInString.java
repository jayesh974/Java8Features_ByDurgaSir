package FunctionInterface;

import java.util.function.Function;

/*
 * Program to find Number of spaces present in the given String by using Function:
 */

public class FindNoOfSpaceInString {

	public static void main(String[] args) {

		String s = "durga software solutions hyderabad";

		Function<String, Integer> f = s1 -> s1.length() - s1.replaceAll(" ", "").length();

		System.out.println(f.apply(s));
	}
}
