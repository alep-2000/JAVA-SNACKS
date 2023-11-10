package org.java;

import java.util.Scanner;

public class NumeroPariDispari {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Inserisci un numero:");
		String strNumber = in.nextLine();
		int intNumber = Integer.valueOf(strNumber);
		
		in.close();
		
		if(intNumber %2 == 0) {
			System.out.println("Il numero è pari: " + intNumber);
		}else {
			System.out.println("Il numero è dispari, stampo il numero successivo: " + (intNumber + 1));
		}
	}
}
