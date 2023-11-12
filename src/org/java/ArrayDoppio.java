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
		
    }
}
