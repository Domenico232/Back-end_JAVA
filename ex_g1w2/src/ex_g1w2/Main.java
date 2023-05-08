package ex_g1w2;
import java.util.Random;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] array =new int[5];
		Random random = new Random();
		
		for (int i = 0; i < array.length; i++) {
			array[i] =1 + random.nextInt(10);
			System.out.println(array[i]);
		}
		boolean a = true;
		
		while (a) {
			try {
				System.out.println("inserisci linea da cambiare (da 1 a 5):");
				int input = sc.nextInt();
				if (input == 0) {
					
					a = !a;
					
				} else {
					
					System.out.println("inserisci numero da sostituire:");
					int input2 = sc.nextInt();
					array[input-1] = input2;
					System.out.println("nuova lista:");
					for (int i = 0; i < array.length; i++) {
						System.out.println(array[i]);
					}
				}
			} catch (Exception e) {
				System.out.println("inserisci linea da cambiare (da 1 a 5):");
				int input = sc.nextInt();
			}
			
		}
		

	}

}
