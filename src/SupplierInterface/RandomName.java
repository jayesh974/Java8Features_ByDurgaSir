package SupplierInterface;
/*
 * Demo Program-1 For Supplier to generate Random Name
 */
import java.util.function.Supplier;

public class RandomName {

	public static void main(String[] args) {
				
		Supplier<String> s = () -> {
			String[] s1 = { "Sunny", "Bunny", "Chinny", "Pinny" };
			
			int x = (int) (Math.random() * 4);
			return s1[x];
		};
		
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
	}
}
