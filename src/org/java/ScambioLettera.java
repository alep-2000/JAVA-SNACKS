package org.java;

public class ScambioLettera {
	public static void main(String[] args) {
		String str1 = "Fantasmagorico";
		int strLenght = str1.length();
		
		
		String swapStr = "";
		
		for(int i=0; i<strLenght; i++){
			
			char currentChar = str1.charAt(i);
			if(currentChar == 'a'){
				currentChar = 'o';
			}else if(currentChar == 'o'){
				currentChar = 'a';
			}
			
			swapStr += currentChar;
		}
		
		System.out.println("Parola modificata: " + swapStr);
	}
}
