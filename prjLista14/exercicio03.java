package prjLista14;

import java.util.Scanner;

public class exercicio03 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        final int TAM = 10;
        int A[], i, j, primos=0;
        A = new int[TAM];

        for(i = 0; i < TAM; i++) {
            System.out.println("entre com o numero " + (i+1) + " do vetor");
            A[i] = ler.nextInt();
        }

        for(i = 0; i < TAM; i++) {
            primos = 0;
            if(A[i] > 1) {
                for(j = 2; j < A[i]; j++) {
                    if(A[i] % j == 0) {
                        primos++;
                    }
                }
                if(primos == 0) {
                    System.out.println("o numero " + A[i] + " que é o vetor " + i + ", é primo");
                }
                else {
                    System.out.println("o numero " + A[i] + " que é o vetor " + i + ", não é primo");
                }
            }
            else {
                System.out.println("o numero " + A[i] + " que é o vetor " + i + ", não é primo");
            }
            
        }
        
        
        ler.close();
    }
}
