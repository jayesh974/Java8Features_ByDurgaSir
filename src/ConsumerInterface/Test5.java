package ConsumerInterface;

import java.util.function.Consumer;

class Film {

	String name;
	String result;

	Film(String name, String result) {
		this.name = name;
		this.result = result;
	}
}

class Consumer_Chaining {

	public static void main(String[] args) {

		Consumer<Film> c1 = m -> System.out.println("Movie:" + m.name + " is ready to release");
		Consumer<Film> c2 = m -> System.out.println("Movie:" + m.name + " is just Released and it is:" + m.result);
		Consumer<Film> c3 = m -> System.out.println("Movie:" + m.name + " information storing in the database");

		Consumer<Film> chainedC = c1.andThen(c2).andThen(c3);

		Film m1 = new Film("Bahubali", "Hit");
		chainedC.accept(m1);

		Film m2 = new Film("Spider", "Flop");
		chainedC.accept(m2);

	}
}
