package prjLista14;

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		final int TAMANHO=20;
		int i, vetorA[], vetorB[];
				
		vetorA = new int[TAMANHO];
		vetorB = new int[TAMANHO];
		
		for(i=0; i<TAMANHO; i++) {
			
			System.out.print("escolha o elemento do " + (i+1) + " vetor"); 
			vetorA[i] = ler.nextInt();
			vetorB[i] = 1;
			if (vetorA[i] % 2 == 0) {
				vetorB[i] = vetorA[i];
				vetorA[i] = vetorA[i] - vetorB[i];
			} 
		}
		
		for (i=0; i<TAMANHO; i++) {
			if (vetorB[i] % 2 == 0 ) {
				System.out.print(vetorB[i] + " ");
			}
		}
		
		System.out.println("\n");

		for (i=0; i<TAMANHO; i++) {
			if (vetorA[i] % 2 == 1 ) {
				System.out.print(vetorA[i] + " ");						{
			}
		}
		
		ler.close();
			
		}
	}
}
