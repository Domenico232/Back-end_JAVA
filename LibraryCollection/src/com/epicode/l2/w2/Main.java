package com.epicode.l2.w2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* 
  	import org.slf4j.Logger;
	import org.slf4j.LoggerFactory;
  	Logger log = LoggerFactory.getLogger(Main.class);
log.error("diopo");*/

public class Main {

	public static void main(String[] args) {
		
	}
	
	public static void testCollection(){
		// Lista con indici dinamici e Collection puo contenere duplicati
		// collection puo contenere tipi come (Integer - Char - Boolean - Double - String)
		Collection<String> c = new ArrayList<String>();
		Collection<Integer> num = new ArrayList<Integer>();
		
		c.add("Primo"); //c.push() js cor.
		c.add("Secondo");
		c.add("Terzo");
		c.add("Primo");
		
		boolean b = c.contains("Terzo"); // Chiedere alla lista se contiene "Secondo"
		System.out.print(b);
		
		int s = c.size(); // Chiedere alla lista se contiene "Secondo"
		System.out.println(s);
	}
	public static void testList() {
		List<String> l = new ArrayList<String>();
		
		
	}
}
