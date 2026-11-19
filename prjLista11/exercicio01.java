package prjLista11;

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double imc, peso, altura;
		int imc1=0, imc2=0, imc3=0, imc4=0;
		
		for(int i=1; i<=15; i++) {
		System.out.println("entre com o peso da " + i + "⁰ pessoa");
		peso = ler.nextDouble();
		System.out.println("entre com o altura da " + i + "⁰ pessoa");
		altura = ler.nextDouble();

		imc = peso/(altura*altura);
		
			if(imc<22) {
				imc1++;
			} else if(imc<27) {
				imc2++;
			} else if(imc<=29.99) {
				imc3++;
			} else {
				 imc4++;
			}
			
		}
		
		System.out.println("a quantidade de pessoas com peso baixo são: " + imc1 + "\npeso normal: " + imc2 + "\nsobrepeso: " + imc3 + "\nobesão" + imc4);
	} 	
		
}
