package SupplierInterface;
/*
 * Demo Program-2 For Supplier to supply System Date:
 */
import java.util.Date;
import java.util.function.Supplier;

public class SystemDate {

	public static void main(String[] args) {
		
		Supplier<Date> s = () -> new Date();
		
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
	}
}
