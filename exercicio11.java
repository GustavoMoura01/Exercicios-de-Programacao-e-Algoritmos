package prjLista14;

import java.util.Scanner;

public class exercicio11 {

	public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        final int TAM = 10;
        int A[], i, X;
        boolean encontrou = false;

        A = new int[TAM];

        for(i=0; i<TAM; i++) {
            System.out.println("Entre com o numero " + (i+1) + " do vetor A");
            A[i] = ler.nextInt();
        }

        System.out.println("Digite o numero que deseja procurar:");
        X = ler.nextInt();

        for(i=0; i<TAM; i++) {
            if(A[i] == X) {
                encontrou = true;
                System.out.println("Numero encontrado na posicao " + i);
            }
        }

        if(!encontrou) {
            System.out.println("Numero nao encontrado no vetor");
        }

        ler.close();
	}

}
