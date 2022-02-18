/*
 * Você recebeu desafio para determinar qual dos produtos é o preferêncial dos clientes de um posto de abastecimento de combustível.
 *  Para isso você deve escrever um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 
 *  1.Álcool 
 *  2.Gasolina 
 *  3.Diesel 
 *  4.Fim). 
 *  Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até que seja válido). 
 *  O programa será encerrado quando o código informado for o número 4.
 */


package dioexercicios;

import java.io.IOException;
import java.util.Scanner;

public class TipoDeCombustivel {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		int tipo = 0;
		while (tipo != 4) {
			tipo = sc.nextInt();
			while (tipo < 1 || tipo > 4) {
				tipo = sc.nextInt();
			}
			switch (tipo) {
			case 1:
				alcool++;
				break;
			case 2:
				gasolina++;
				break;
			case 3:
				diesel++;
				break;
			}
		}

		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
	}

}
