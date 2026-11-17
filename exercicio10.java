package prjLista14;

import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
        final int TAM = 10;
        int A[], B[],C[], i, j;
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
        
        System.out.println("Os valores que existem em A mas não em B são:");
        System.out.print("Numeros diferentes: ");
        
        for(i=0; i<TAM; i++) {
        	igual = false;
        	for(j=0; j<TAM; j++) {
        		if(A[i] == B[j]) {
        			igual = true;
        			}
        		}
        	if(!igual) {
        		C[i] = A[i];
        		System.out.print(", "+C[i]);
        	}
        	
        }
        
        ler.close();
	}

}
