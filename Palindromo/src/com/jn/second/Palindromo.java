package com.jn.second;

import java.util.Scanner;

public class Palindromo {

	public static void main(String[] args) {

		System.out.println("Por favor introduzca una palabra o frase con el teclado:");

		String keyboardInput = "";
		@SuppressWarnings("resource")
		Scanner scannerInput = new Scanner(System.in);
		keyboardInput = scannerInput.nextLine();

		if (keyboardInput.isEmpty()) {
			System.out.println("El texto no puede estar vacio.");

		} else {
			if (validPalindrome(keyboardInput)) {
				System.out.println("La palabra o frase: " + keyboardInput + " es un Palindromo");
			} else {
				System.out.println("La palabra o frase: " + keyboardInput + " no es un Palindromo");
			}
		}

	}

	public static boolean validPalindrome(String text) {

		text = text.toLowerCase().replaceAll("[^a-zA-Z0-9]+", "");

		String inverted = new StringBuilder(text).reverse().toString();

		return inverted.equals(text);
	}

}
