package src.Estrutura_repeticao;

import java.util.Scanner;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5! = 120
 */
public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.print("Fatorial: ");
        int fatorial = scan.nextInt();

        int multiplicacao = 1;

        System.out.println(fatorial + "! =");
        for(int i = fatorial ; i  >= 1 ; i -- ) {
            multiplicacao = multiplicacao * i;
        }
        System.out.println(multiplicacao);

    }
}
