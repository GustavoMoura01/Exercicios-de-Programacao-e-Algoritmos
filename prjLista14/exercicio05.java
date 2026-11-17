package prjLista14;

import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
        final int TAM = 10;
        int A[], i, j;
        A = new int[TAM];
        
        for(i = 0; i < TAM; i++) {
            System.out.println("entre com o numero " + (i+1) + "⁰ do vetor");
            A[i] = ler.nextInt();
        }
        
        for(i=0; i<TAM; i++) {
        	System.out.println("\nVETOR "+i+":"+"\nos numeros divisores de "+A[i]+" são:");
        	for(j=1; j<=A[i]; j++) {
        		if(A[i] % j == 0) {
        			System.out.print(j+ ", ");
        		}
        	}
        }

        ler.close();
	}

}

