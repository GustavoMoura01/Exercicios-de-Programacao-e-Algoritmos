package prjLista11;

import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i, n, somatoria=0;
		System.out.println("entre com o numero de termos desejado: ");
		n = ler.nextInt();
		for(i=1; i<=n; i++) {
			somatoria = somatoria + i; 
			System.out.println(i);
			
		}
		System.out.println("\no resultado é : " + somatoria);
	}

}
