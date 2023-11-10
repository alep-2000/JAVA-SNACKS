package org.java;

import java.util.Scanner;

public class CalcoloCaratteri {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while (true) {
			System.out.print("Inserisci una stringa:");
			String strWord = in.nextLine().toLowerCase().replaceAll("\\s", "");
			
		
			if (strWord.equals("0")) {
                System.out.println("Programma terminato");
                break;
            }
		
			int strLength = strWord.length();
		
			int caratteriAlfabetici = 0;
	        int numeri = 0;
	        int simboli = 0;
	        
	        for (int i = 0; i < strLength; i++) {
	            char c = strWord.charAt(i);
	
	            if (Character.isLetter(c)) {
	                caratteriAlfabetici++;
	            } else if (Character.isDigit(c)) {
	                numeri++;
	            } else {
	                simboli++;
	            }
	        }
	        
	        System.out.println("Caratteri: " + caratteriAlfabetici);
	        System.out.println("Numeri: " + numeri);
	        System.out.println("Simboli: " + simboli + "\n");
		}
	}
}
