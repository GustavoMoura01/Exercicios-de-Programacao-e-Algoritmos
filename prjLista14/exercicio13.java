package prjLista14;

import java.util.Scanner;

public class exercicio13 {
	 public static void main(String[] args) {
	        Scanner ler = new Scanner(System.in);
	        final int TAM = 10;
	        int A[], i;
	        boolean palindromo = true;

	        A = new int[TAM];

	        for(i=0; i<TAM; i++) {
	            System.out.println("Entre com o numero " + (i+1) + " do vetor A");
	            A[i] = ler.nextInt();
	        }

	        for(i=0; i<TAM/2; i++) {
	            if(A[i] != A[TAM-1-i]) {
	                palindromo = false;
	            }
	        }

	        if(palindromo) {
	            System.out.println("O vetor e um palindromo");
	        }
	        else {
	            System.out.println("O vetor nao e um palindromo");
	        }

	      	ler.close();
	   }
}
