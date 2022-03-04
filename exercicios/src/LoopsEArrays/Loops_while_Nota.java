package LoopsEArrays;

import java.util.Scanner;

/* Faça um programa que peça uma nota entre 0 e 10.
Mostre uma mensagem caso o valor seja inválido, e continue pedindo nota até que o usuário informe valor válido.
 */
public class Loops_while_Nota {

   public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int nota;

        System.out.println("Insira a nota: ");
        nota = sc.nextInt();
        while (nota < 0 | nota >10 ) {
            System.out.println("Valor inválido. Digite novamente: ");
            nota = sc.nextInt();
        }
        }
   }
