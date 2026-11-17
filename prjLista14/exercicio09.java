package prjLista14;

import java.util.Scanner;

public class exercicio09 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
        final int TAM = 10;
        int A[], B[], C[], i, j, k, posicao = 0;
        boolean igual;

        A = new int[TAM];
        B = new int[TAM];
        C = new int[TAM];

        for(i=0; i<TAM; i++) {
            System.out.println("Entre com o numero " + (i+1) + " do vetor A");
            A[i] = ler.nextInt();
        }

        for(i=0; i<TAM; i++) {
            System.out.println("Entre com o numero " + (i+1) + " do vetor B");
            B[i] = ler.nextInt();
        }

        System.out.println("Os valores que existem em A e B são:");
        System.out.print("Numeros iguais: ");

        for(i=0; i<TAM; i++) {
            igual = false;

            for(j=0; j<TAM; j++) {
                if(A[i] == B[j]) {
                    igual = true;
                }
            }

            if(igual) {
                for(k=0; k<posicao; k++) {
                    if(C[k] == A[i]) {
                        igual = false;
                    }
                }

                if(igual) {
                    C[posicao] = A[i];
                    System.out.print(", " + C[posicao]);
                    posicao++;
                }
            }
        }

        ler.close();
    }
}
