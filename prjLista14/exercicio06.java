package prjLista14;

import java.util.Scanner;

public class exercicio06 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
        final int TAM = 11;
        int A[], i, j, resultado=1;
        A = new int[TAM];
        
        for (i = 0; i < TAM; i++) {
        	resultado = 1;
        	for (j=0; j<i; j++) {
        		resultado = resultado * 2;
        	}
            A[i] = resultado;
            System.out.println("o valor do vetor "+i+", é: "+A[i]);
        }
        
       ler.close();
	}

}
