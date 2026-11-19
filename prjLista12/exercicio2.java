package prjLista12;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {

		Scanner ler = new Scanner (System.in);
		
		double n1, n2, m;
		
		
		String continuar;
		do{
		System.out.println("entre com a primeira nota");
		n1 = ler.nextDouble();
		System.out.println("entre com a segunda nota");
		n2 = ler.nextDouble();
		
		m = (n1+n2)/2;
		
		if(m>=7) {
			System.out.println("aprovado");
		} else{
			System.out.println("reprovado");
		} 
		
		System.out.println("deseja continuar? digite sim ou não");
		continuar = ler.next();
		}while(continuar.equalsIgnoreCase("sim"));

     }
}