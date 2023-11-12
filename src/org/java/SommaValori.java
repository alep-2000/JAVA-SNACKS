package org.java;

import java.util.Scanner;

public class SommaValori {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Inserisci il primo valore:");
		String strValue1 = in.nextLine();
		
		System.out.print("Inserisci il secondo valore:");
		String strValue2 = in.nextLine();

		in.close();
		
		System.out.println("Primo valore: " + strValue1 + "\n" + "Secondo valore " + strValue2);
	}
}
