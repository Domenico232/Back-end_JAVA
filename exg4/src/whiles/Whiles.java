package whiles;

import java.util.Iterator;
import java.util.Scanner;

public class Whiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String res = "";
		Scanner elm = new Scanner(System.in);
		
		while (true) {
			System.out.println("insert string");
			String str1 = elm.nextLine();
			if (str1 == ":q") {
				break;
			}else {
				for (int i = 0; i < str1.length(); i++) {
					res += str1.charAt(i) + ","; 
				}	
				System.out.println(res);
				res = "";
			}
		}
	}

}
