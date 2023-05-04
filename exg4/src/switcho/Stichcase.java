package switcho;

import java.util.Scanner;

public class Stichcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner elm = new Scanner(System.in);
		System.out.println("insert num from 0 to 3");
		int str = elm.nextInt();
		checknum(str);
	}

	private static void checknum(int str) {
		// TODO Auto-generated method stub
		switch (str) {
		case 0: {
			System.out.println("zero");
		}
		case 1: {
			System.out.println("uno");
		}
		case 2: {
			System.out.println("due");
		}
		case 3: {
			System.out.println("tre");
		}
		default:
			System.out.println("unexpected value " + str);
		}
	}
	
}
