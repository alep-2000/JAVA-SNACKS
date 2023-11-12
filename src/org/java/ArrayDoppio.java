package org.java;

public class ArrayDoppio {
	public static void main(String[] args) {
		int[] numeri = {1,4,9,10,45,60,120};
		
		int countPari = 0;
        int countDispari = 0;
        for (int numero : numeri) {
            if (numero % 2 == 0) {
                countPari++;
            } else {
                countDispari++;
            }
        }
		
        int[] numeriPari = new int[countPari];
        int[] numeriDispari = new int[countDispari];
		
		int Pari = 0;
		int Dispari = 0;
		
		for(int numero : numeri) {
			if(numero % 2 == 0) {
				numeriPari[Pari] = numero;
				Pari++;
			}else {
				numeriDispari[Dispari] = numero;
				Dispari++;
			}
		}
		
		
		System.out.print("Pari: [");
        for (int i = 0; i < numeriPari.length; i++) {
            System.out.print(numeriPari[i]);
            if (i < numeriPari.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        System.out.print("Dispari: [");
        for (int i = 0; i < numeriDispari.length; i++) {
            System.out.print(numeriDispari[i]);
            if (i < numeriDispari.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

    }
}
