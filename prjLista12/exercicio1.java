package prjLista12;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int smaior=0, smenor=0, salario, somatoria=0, i=1, mesMaior=0, mesMenor=0;
		
		while(i<13) {
		System.out.println("coloque o salario do seu " + i + "⁰ mês"); 
		salario = ler.nextInt();
		
		if (smaior<salario) {
			smaior = salario;
			mesMaior = i;
			smenor = salario;
		}	else if (smenor>salario) {
			smenor = salario;
			mesMenor = i;
		}
		
		somatoria = somatoria + salario;
		
		i++;
		}
		
		double media = (double) somatoria/12;
		
		System.out.println("a soma dos valores: " + somatoria);
		System.out.println("a salario com menor dos valor: " + smenor + " \nno mes: " + mesMenor);
		System.out.println("a salario com maior valor: " + smaior + " \nno mês: " + mesMaior);
		System.out.println("a media valores: " + media);
		
		
	}

}
