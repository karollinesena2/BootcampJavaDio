package src.Estrutura_repeticao;
/*
Faça um programa que peça N numero inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
 */

import java.util.Scanner;

public class ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;

        System.out.println("Quantidade de números: ");
        quantNumeros = scan.nextInt();

        int count = 0;
        int numero;
        int quantPares = 0, quantImpares = 0;

        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();

            if (numero % 2 == 0 ) quantPares++;
            else quantImpares++;

            count++;

        }while(count < quantNumeros);

        System.out.println("Quantidade Par: " + quantPares);
        System.out.println("Quantidade Impart: " + quantImpares);
    }

}
