package prjLista12;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
	
		int i;
		double emprestimo, qm, juros=0, valorTotal=0;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("qual o valor que você ira emrpestar? ");
		emprestimo = ler.nextDouble();
		System.out.println("por quantos meses você ira emrpestar? ");
		qm = ler.nextDouble();
		
		for (i=0; i<qm; i++) {
			
			juros = juros + (emprestimo*2.5/100);
			valorTotal = emprestimo + juros;
					
		}
		System.out.println("o valor total a ser pago é: " + valorTotal + "R$");
		System.out.println("o valor apenas de juros é: " + juros + "R$");
	}

}
