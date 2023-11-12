package org.java;

import java.util.Random;

public class InteriCasuali {
	public static void main(String[] args) {
		Random r = new Random(1);
		int[] array = new int[8];
		
		for (int i = 0; i < array.length; i++) {

			array[i] = r.nextInt(0, 101);
			System.out.println(i+1 + ": " + array[i]);
		}
	}
}
