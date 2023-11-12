package org.java;

public class SecondiInStringa {
	public static void main(String[] args) {
		int secondi = 1000;
		
		int ore = secondi / 3600;
		int min = (secondi % 3600) / 60;
		int sec = secondi % 60;
		
		String risultato = String.format("%02d:%02d:%02d", ore,min,sec);
		System.out.println("Secondi -> " + risultato);
	}
}
