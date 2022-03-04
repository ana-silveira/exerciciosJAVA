package LoopsEArrays;

import java.util.Scanner;

public class Loops_dowhile_maioremedia {
    /*
    Faça um programa que leia 5 números, informe o maior número e a média desses números.
     */
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;

        // Preciso informar para esse laço que ele deve repetir 5x.
        int count = 0;
        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            soma = soma + numero;

            if (numero > maior) maior = numero;
            //System.out.println("Maior número: " + maior); Para saber qual o maior número até o momento deste loop.

            count = count + 1;
        } while(count < 5);

        System.out.println("Maior número: " + maior);
        System.out.println("Média: " + (soma/5));
    }
}
