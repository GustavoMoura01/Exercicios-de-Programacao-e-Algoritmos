package prjLista14;

import java.util.Scanner;

public class exercicio14 {
	 public static void main(String[] args) {
	        Scanner ler = new Scanner(System.in);
	        final int TAM = 10;
	        int A[], B[], i;

	        A = new int[TAM];
	        B = new int[TAM];

	        for(i=0; i<TAM; i++) {
	            System.out.println("Entre com o numero " + (i+1) + " do vetor A");
	            A[i] = ler.nextInt();
	        }

	        for(i=0; i<TAM; i++) {
	            if(A[i] % 2 == 0) {
	                B[i] = 1;
	            }
	            else {
	                B[i] = 0;
	            }
	        }

	        System.out.println("Vetor B:");

	        for(i=0; i<TAM; i++) {
	            System.out.println("B[" + i + "] = " + B[i]);
	        }

	        ler.close();
	    }	
	}
