package prjLista13;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAMANHO=10;
		int a[], b[], i;
		a = new int[TAMANHO];
		b = new int[TAMANHO];
		
		for(i=0; i<TAMANHO; i++) {
			System.out.println("digite o "+ (i+1) +"⁰ do vetor A");
			a[i] = ler.nextInt();
		}
		
		System.out.println("os numeros dos vetores são");
		for(i=0; i<TAMANHO; i++) {
		System.out.print(a[i] + " ");
		}
		
		System.out.println("\n");
		for(i=0; i<TAMANHO; i++) {
			b[i] = (a[i] * a[i]);
			System.out.print("o valor ao quadrado dos numeros do vetor é " + b[i] + "\n");
		}
		ler.close();
	}

}
