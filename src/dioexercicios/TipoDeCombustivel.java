/*
 * Voc� recebeu desafio para determinar qual dos produtos � o prefer�ncial dos clientes de um posto de abastecimento de combust�vel.
 *  Para isso voc� deve escrever um algoritmo para ler o tipo de combust�vel abastecido (codificado da seguinte forma: 
 *  1.�lcool 
 *  2.Gasolina 
 *  3.Diesel 
 *  4.Fim). 
 *  Caso o usu�rio informe um c�digo inv�lido (fora da faixa de 1 a 4) deve ser solicitado um novo c�digo (at� que seja v�lido). 
 *  O programa ser� encerrado quando o c�digo informado for o n�mero 4.
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
