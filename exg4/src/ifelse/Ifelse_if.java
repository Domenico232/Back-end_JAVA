package ifelse;

import java.util.Scanner;

public class Ifelse_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner elm = new Scanner(System.in);
		System.out.println("insert string");
		String str = elm.nextLine();
		checkoddeven(str);
		
		System.out.println("insert number");
		int num = elm.nextInt();
		checkleapmonth(num);
	}
	
	public static void checkoddeven(String str) {
		if ((str.length()%2)==0 ) {
			System.out.println("string length even");
		} else {
			System.out.println("string length odd");
		}
	}
	
	public static void checkleapmonth(int str) {
		if ((str % 400)==0 ) {
			System.out.println("leap month");
		} else {
			if ((str%4)==0) {
				if((str%100) == 0) {
					System.out.println("non leap month");
				}else {
					System.out.println("leap month");
				}
			} else {
				System.out.println("nonleap month");
			}
		}
	}
	
}
