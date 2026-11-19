package prjLista11;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int anoi, anof, anobi=0;
		System.out.println("Informe o ano inicial");
		anoi = ler.nextInt();
		System.out.println("Informe o ano final");
		anof = ler.nextInt();
		for(;anoi<=anof;anoi++) {
			
			if((anoi % 4) == 0) {
				System.out.println(anoi);
				anobi++;
			} else {
				
			}
				
		}
		System.out.println("a quantidade de ano bi é: " + anobi);
	}

}
