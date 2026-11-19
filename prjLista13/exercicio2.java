package prjLista13;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAMANHO=10;
		int a[], b[], c[], i;
		a = new int[TAMANHO];
		b = new int[TAMANHO];
		c = new int[TAMANHO];
		
		for(i=0; i<TAMANHO; i++) {
			System.out.println("digite o " + (i+1) +"⁰ valor do vetor A");
			a[i] = ler.nextInt();
		}
		
		for(i=0; i<TAMANHO; i++) {
			System.out.println("digite o " + (i+1) +"⁰ valor do vetor B");
			b[i] = ler.nextInt();
			c[i] = a[i]+b[i];
		}
		
		System.out.print("\nC = [");
		
		for(i=0; i<TAMANHO; i++) {
			System.out.print(c[i]+ " ");
		}
		
		System.out.print("]");
		ler.close();
		
	}

}
