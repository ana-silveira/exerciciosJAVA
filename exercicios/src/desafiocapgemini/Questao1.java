package desafiocapgemini;

import java.util.Scanner;

/**
 * # Questão 01
Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e espaços.
 A base e altura da escada devem ser iguais ao valor de n.
A última linha não deve conter nenhum espaço.
*/

public class Questao1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o valor de n:");
        int n = scan.nextInt();

        int[][] M = new int[n][n];

        for (int i = 0; i < M.length; i++) {

            String linha = "";

            for (int j = 0; j < M[i].length; j++) {
                if ( i + j >= n - 1 ) {
                    linha = linha + "*";
                }
                else{
                    linha = linha + " ";
                }
            }
            System.out.println(linha);

        }

    }
}



