package prjLista14;

import java.util.Scanner;

public class exercicio07 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
        final int TAM = 15;
        int A[], B[], i, j;
        A = new int[TAM];
        B = new int[TAM];
        
        for(i = 0; i < TAM; i++) {
            System.out.println("\nentre com o numero " + (i+1) + "⁰ do vetor");
            A[i] = ler.nextInt();
            B[i] = 1;
            for(j=1; j<=A[i]; j++) {
            	B[i] = B[i] * j;
            }
            System.out.println("vetor A: "+A[i]);
            System.out.println("vetor B: "+B[i]);
        }

        ler.close();
	}

}
