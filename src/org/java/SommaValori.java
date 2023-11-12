package org.java;

import java.util.Scanner;

public class SommaValori {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Inserisci il primo valore:");
		int intValue1 = in.nextInt();
		
		System.out.print("Inserisci il secondo valore:");
		int intValue2 = in.nextInt();

		in.close();
		
		if (intValue1 > intValue2) {
            int temp = intValue1;
            intValue1 = intValue2;
            intValue2 = temp;
        }

        int somma = 0;
        for (int i = intValue1; i <= intValue2; i++) {
            somma += i;
        }
		
		System.out.println("Primo valore: " + intValue1 + "\n" + "Secondo valore " + intValue2 + "\n" + "Somma dei valori: " + somma);
	}
}
