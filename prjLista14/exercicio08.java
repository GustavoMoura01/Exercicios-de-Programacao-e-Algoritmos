package prjLista14;

import java.util.Scanner;

public class exercicio08 {

	public static void main(String[] args) {
		
	Scanner ler = new Scanner(System.in);
    final int TAM = 10;
    int A[], B[], i, j, soma = 0;
    A = new int[TAM];
    B = new int[TAM];

    for(i = 0; i < TAM; i++) {
        System.out.println("Entre com o numero " + (i+1) + " do vetor A");
        A[i] = ler.nextInt();
    }

    for(i = 0; i < TAM; i++) {
        soma = 0;
        for(j = i; j < TAM; j++) {
            soma = soma + A[j];
        }
        B[i] = soma;
    }

    for(i = 0; i < TAM; i++) {
        System.out.println("B[" + i + "] = " + B[i]);
    }

    ler.close();
}
}
