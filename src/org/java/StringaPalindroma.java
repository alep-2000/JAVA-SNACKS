package org.java;

import java.util.Scanner;

public class StringaPalindroma {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Inserisci una stringa:");
		String strWord = in.nextLine();
		int strLength = strWord.length();
		
		in.close();
		
		String strReverse = "";


		for (int i = strLength - 1; i >= 0; i--) {

			char c = strWord.charAt(i);

			strReverse += c;
		}


		if (strWord.equals(strReverse)) {

			System.out.println("Questa parola è Palindroma!");

		} else {

			System.out.println("Questa parola NON è Palindroma!");
		}
		
	}
}
