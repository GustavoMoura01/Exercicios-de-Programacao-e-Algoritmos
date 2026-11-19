package matrizes;

public class exercicio01 {

	public static void main(String[] args) {
		final int TAM=4;
		int m[][] = new int [TAM][TAM];
		int i, j, valor;
		
		valor = 2;
		
		for(i=0; i<TAM; i++) {
			for(j=0; j<TAM; j++) {
				m[i][j] = valor;
				valor = valor * 2;
			}
		}
		
		for(i=0; i<TAM; i++) {
			for(j=0; j<TAM; j++) {
				System.out.println(m[i][j]);
			}
		}

	}

}
