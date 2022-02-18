/*
 * Escreva um programa que leia 2 valores X e Y e que imprima todos os valores entre eles 
 * cujo resto da divisão dele por 5 for igual a 2 ou igual a 3.
 */
package dioexercicios;

import java.util.Scanner;

public class RestoDaDivisao {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		int x = inp.nextInt();
		int y = inp.nextInt();
		int cont = 0;

		if (x > y) {
			for (cont = y + 1; cont < x; cont++) {
				if (cont % 5 == 2 || cont % 5 == 3) {
					System.out.println(cont);
				}
			}
		} else if (x < y) {
			for (cont = x + 1; cont < y; cont++) {
				if (cont % 5 == 2 || cont % 5 == 3) {
					System.out.println(cont);
				}

			}
		}
	}
}
