package keyPoint1;

import java.util.Scanner;

public class SimpleApplication {

	public static void main(String[] args) {
		
		System.out.println("Enter your name please, so I can greet you");
		Scanner s = new Scanner(System.in);
		String name = s.nextLine();
		// time to greet!
		System.out.println("Hi "+name+", I'm saluting you!");
		s.close();
	}

}