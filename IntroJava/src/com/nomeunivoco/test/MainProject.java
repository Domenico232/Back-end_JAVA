package com.nomeunivoco.test;
import java.util.Scanner;
public class MainProject {//Class name equal to file name

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world");
		//Variable declare
		boolean f = true;
		char c = 123;//char convert numbers in AASCI
		int n = 100000;
		double dec = 10000.4325;//with ,
		float g = 4284934.4532543f;//number(f) is float
		String str = "ciao";//String like js
		System.out.print(c);
		
		int arr[] = new int[10];
		//an array in java is defined [10] items array
		
		char sett[] = {'L', 'M', 'm', 'g'};
		
		System.out.println(arr.length);
		System.out.println(sett.length);
		
		int num1 = 25;
		int num2 = 10;
		short snum = (short)num1;//esplicit conversion
		double result = (double)num1 / num2;
		System.out.println(result);
		
		Scanner sc = new Scanner(System.in);
		//scanner can make interaction with console
		System.out.println("inserisci il nome:");
		
		String nome = sc.nextLine();
		//sc is now the scanner 
		System.out.print(nome);		
	}

}
