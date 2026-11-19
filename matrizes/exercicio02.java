package matrizes;

import java.util.Random;

public class exercicio02 {

	public static void main(String[] args) {
		final int TAM=3;
		int m[][] = new int [TAM][TAM];
		int i, j, maior=0, menor=0, atual, colunaMenor=0, linhaMenor=0, linhaMaior=0, colunaMaior=0;
		Random in = new Random();
		
		for(i=0; i<TAM; i++) {
			for(j=0; j<TAM; j++) {
				m[i][j] = in.nextInt()%100;
				System.out.println("aleatorio:"+m[i][j]);
				atual = m[i][j];
				
				if (i == 0 && j == 0) {
					maior = atual;
					menor = atual;
				} else {
					if(atual>maior) {
						maior = atual;
						linhaMaior = i;
						colunaMaior = j;
					} else if (atual<menor) {
						menor = atual;
						linhaMenor = i;
						colunaMenor = j;
					}
				}
			}	
		}	
		System.out.println("maior:" + maior + ", na linha: " + (linhaMaior+1) + ", na coluna: " + (colunaMaior+1));
		System.out.println("menor:" + menor + ", na linha: " + (linhaMenor+1) + ", na coluna: " + (colunaMenor+1));
	}

}
