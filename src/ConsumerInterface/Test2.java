package ConsumerInterface;

import java.util.ArrayList;
import java.util.function.Consumer;

class Movie {
	
	String name;
	String hero;
	String heroine;

	Movie(String name, String hero, String heroine) {
		this.name = name;
		this.hero = hero;
		this.heroine = heroine;
	}
}

class Test3 {
	
	public static void main(String[] args) {
		
		ArrayList<Movie> l = new ArrayList<Movie>();
		populate(l);
		
		Consumer<Movie> c = m -> {
			System.out.println("Movie Name:" + m.name);
			System.out.println("Movie Hero:" + m.hero);
			System.out.println("Movie Heroine:" + m.heroine);
			System.out.println();
		};
		
		for (Movie m : l) {
			c.accept(m);
		}

	}

	public static void populate(ArrayList<Movie> l) {
		l.add(new Movie("Bahubali", "Prabhas", "Anushka"));
		l.add(new Movie("Rayees", "Sharukh", "Sunny"));
		l.add(new Movie("Dangal", "Ameer", "Ritu"));
		l.add(new Movie("Sultan", "Salman", "Anushka"));
	}
}
