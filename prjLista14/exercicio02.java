package prjLista14;

import java.util.Scanner;

public class exercicio02 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		final int TAM = 5;
		int a[], i, numero=0, j;
		a = new int[TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("entre com o numero "+ (i+1) +" do vetor" );
			a[i] = ler.nextInt();
		}
		
		for(i=0; i<TAM; i++) {
			System.out.println("\ntabuada do vetor" + (i+1));
			numero = a[i];
			for(j=1; j<=10; j++) {
				System.out.println(numero+" X "+i+" = "+(numero*j));
			}
		}
		
		ler.close();
	}
}
