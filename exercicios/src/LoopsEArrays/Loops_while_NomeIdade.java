package LoopsEArrays;

import java.util.Scanner;

/*
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
*/
public class Loops_while_NomeIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // se ele quer que "leia", preciso criar um fluxo de entrada através do teclado, representado pela classe "scanner'

        String nome;
        int idade;

        while(true) {
            System.out.println("Nome: ");
            nome = scan.next();
            if (nome.equals("0")) break;

            System.out.println("Idade: ");
            idade = scan.nextInt();
        }

        System.out.println("Continua aqui...");

    }

}