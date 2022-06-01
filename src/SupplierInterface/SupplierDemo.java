package SupplierInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {
	
	public static void main(String[] args) {
		
		Supplier<String> supplier = () -> "List is Empty";
		
		List<String> list1 = Arrays.asList("A");
		List<String> list2 = Arrays.asList();
		
		System.out.println(list1.stream().findAny().orElseGet(supplier));    //  A
		System.out.println(list2.stream().findAny().orElseGet(supplier));    //  List is Empty
		System.out.println(list2.stream().findAny().orElseGet(() -> "List is Full Empty"));
		
		
		
	}

}
