package it.epicode.be;

import java.util.Scanner;

public class Helloworld {

public static void main (String[] args)
		{
		// Stampa a console  la frase
		System.out.println("This is my first Epicode Java Project!");
		Scanner elm = new Scanner(System.in);
		System.out.print("insert number");
		int num1 = elm.nextInt();
		System.out.print("insert snd number");
		int num2 = elm.nextInt();
		
		System.out.println("La moltiplicazione è "+ num1*num2);
		System.out.println("____________________ex 2_______________________________");
			
		System.out.print("insert String");
		String str1 = elm.next();
		System.out.print("insert number");
		int num3 = elm.nextInt();
		String res = str1 + " " + num3;
		System.out.println(res);
		
		System.out.println("____________________ex 3_______________________________");
		
		String arr[] = new String [6];
		arr[0]= "primo";arr[1]="secondo";arr[2]="terzo";
		arr[4]="quarto";arr[5]="quinto";
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("insert string");
		String strarr = elm.next();
		arr[3]=strarr;
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("____________________ESERCIZIO#3___________________________");
		String arra2[] = new String[3];
		System.out.println("insert 3 string");
		String str2 = elm.next();
		String str3 = elm.next();
		String str4 = elm.next();
		arra2[0] = str2;
		arra2[1] = str3;
		arra2[2] = str4; 
		for (int i = 0; i < arra2.length; i++) {
			System.out.println(arra2[i]);
		}
		System.out.println("____________________reverse for___________________________");
		
		for (int i = arra2.length-1; i >= 0; i--) {
			System.out.println(arra2[i]);
		}
		
		System.out.println("____________________ESERCIZIO#4___________________________");
		System.out.println("inserire 2 lati rettangolo");
		double lato = elm.nextDouble();
		double lato1 = elm.nextDouble();
		System.out.println("il perimetro è: "+(lato+lato1)*2);

		System.out.println("inserire 2 lati rettangolo");
		double oddeven = elm.nextDouble();
		if (oddeven % 2 == 0 ) {
			System.out.println("il numero è pari");

		} else {
			System.out.println("il numero è dispari");

		}
		
		System.out.println("inserire lato e altezza del triangolo");
		double base = elm.nextDouble();
		double altezza = elm.nextDouble();
		
		calcarea(base,altezza);
		
		}

private static void calcarea(double base, double altezza) {
	// TODO Auto-generated method stub
	double ris = (base * altezza)/2; 
	System.out.print("area triangolo "+ris);
}


}



