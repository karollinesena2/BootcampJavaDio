package src.Array;

/*
Crie um vetor de 6 numeros inteiros e mostre-os na ordem inversa.
 */

import java.sql.SQLOutput;

public class OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = {-6, -5, 15, 50, 8, 4};
        System.out.println("Vetor: ");

            int  count =0;

            while(count <= (vetor.length-1)) {
            System.out.print(vetor[count] + " ");
            count++;

        }
            System.out.print("\nvetor: ");
            for(int i = (vetor.length - 1); i >= 0; i --) {
                System.out.print(vetor[i] + " ");
            }
    }
}
