package Fore;

import java.util.Scanner;

public class forese {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner elm = new Scanner(System.in);
		System.out.println("insert integer");
		
		int str = elm.nextInt();
		
		for (int i = str; i > 0; i--) {
			System.out.println(i);
		}
	}
}
