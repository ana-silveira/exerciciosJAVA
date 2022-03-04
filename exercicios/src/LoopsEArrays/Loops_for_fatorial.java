package LoopsEArrays;

import java.util.Scanner;

/* Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex: 5! = 120.
 */
public class Loops_for_fatorial {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o número fatorial:");
        int fatorial = scan.nextInt();

        int multiplicacao = 1;
        for (int i = fatorial; i > 0 ; i--) {
            multiplicacao = multiplicacao * i;
        }

        System.out.println( fatorial + "! = " + multiplicacao);
    }
}
