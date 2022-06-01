package UnaryOperator;

import java.util.function.UnaryOperator;

public class Test1 {

	public static void main(String[] args) {

/*		
//		 Normal Functionl interface
		
		Function<Integer, Integer> f = i -> i * i;		
		System.out.println(f.apply(5));
	*/
		
//		With UnaryOperator  --> child of Function Interface
		
		 UnaryOperator<Integer> f=i->i*i;
		 
		 System.out.println(f.apply(6));
		 
	}
}
