/*
 *Desenvolva um programa que leia um valor inteiro N. 
 *Este N refere-se à quantidade de linhas de saída que serão apresentadas na execução do programa.  * 
 */

package dioexercicios;

import java.io.IOException;
import java.util.Scanner;

public class PUM {

	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int n, aux=1;
		
		n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
        for(int j=1; j<=3; j++) {
            System.out.printf("%d ", aux++);
        }
        aux++;
        System.out.printf("PUM\n");
	}
}

}
