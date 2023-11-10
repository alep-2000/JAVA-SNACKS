package org.java;

import java.util.Random;

public class InvitatiCasuali {
	public static void main(String[] args) {
		String[] nomi = {"Alessio", "Giuseppe", "Francesco", "Laura", "Francesca", "Sara"};
		String[] cognomi = {"Palmas", "Piras", "Cordeddu", "Lippi", "Santi", "Vadilonga"};
		
		Random r = new Random();
		int invitati = 10;
		
		for(int i=0; i < invitati; i++){
			String nomeCasuale = nomi[r.nextInt(nomi.length)];
			String cognomeCasuale = cognomi[r.nextInt(cognomi.length)];
			
			System.out.println("Invitato: " + nomeCasuale + " " + cognomeCasuale);
		}
	}
}
