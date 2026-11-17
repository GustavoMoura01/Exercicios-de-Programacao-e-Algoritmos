package prjLista14;

import java.util.Scanner;

public class exercicio15 {
	public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        final int TAM = 10;
        int A[], B[], C[], i;

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

        for(i=0; i<TAM; i++) {
            if(A[i] > B[i]) {
                C[i] = 1;
            }
            else if(A[i] == B[i]) {
                C[i] = 0;
            }
            else {
                C[i] = -1;
            }
        }

        System.out.println("Resultado do vetor C:");

        for(i=0; i<TAM; i++) {
            System.out.println("C[" + i + "] = " + C[i]);
        }

        ler.close();
    }
}
