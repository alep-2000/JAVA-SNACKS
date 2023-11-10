package org.java;

public class ArrayNumeriInteri {
	public static void main(String[] args) {
		int[] numeriInteri = {2, 5, 8, 10, 15, 20, 25, 30};
		
		int sommaDispari = 0;
		
		for(int i=0; i < numeriInteri.length; i += 2){
			
			sommaDispari += numeriInteri[i];
		}
		
		System.out.println("I numeri dispari sommati sono: " + sommaDispari);
	}
	
}
