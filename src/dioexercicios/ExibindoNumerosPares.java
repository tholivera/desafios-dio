//Crie um programa que leia um n�mero e mostre os n�meros pares at� esse n�mero, inclusive ele mesmo.

package dioexercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExibindoNumerosPares {

    public static void main(String[] args) throws IOException {

        String entrada;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        entrada = br.readLine();
        for (int i = 2; i <= Integer.parseInt(entrada); i++) {

            if (i % 2 == 0) {

                System.out.println(i);

            }

        }
    }
}