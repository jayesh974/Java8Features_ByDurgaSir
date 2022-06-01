package PredicateInterface;

import java.util.function.Predicate;
import java.util.Scanner;

//Program for User Authentication by using Predicate

public class User {

	String username;
	String pwd;

	User(String username, String pwd) {
		this.username = username;
		this.pwd = pwd;
	}
}

 class Test1 {
	 
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter User Name:");
		String username = sc.next();
		
		System.out.println("Enter Password:");
		String pwd = sc.next();
		
		User user = new User(username, pwd);
		
		Predicate<User> p = u -> u.username.equals("durga") && u.pwd.equals("java");

		if (p.test(user)) {

			System.out.println("Valid user and can avail all services");
			
		} else {

			System.out.println("invalid user you cannot avail services");

		}
	}
}
