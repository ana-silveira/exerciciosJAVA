package LoopsEArrays;

/* Faça um programa que leia 20 números inteiros aleatórios (entre 0 e 100);
 Armazene-os num vetor.
Ao final, mostre os números e seus sucessores.
 */

import java.util.Random;

public class Arrays_unidimensional_numerosaleatorios {
    public static void main(String[] args) {
        // Existe uma classe chamada "random", que gera números aleatórios. Vamos chamar essa classe:
        Random random = new Random(); // () vai dizer qual é o valor limite;

        int [] numerosAleatorios = new int[20];
        // ou int numerosAleatorios[] = new int[20]; Funciona mas assim não é usual.

        //criação do laço para inserção dos 20 valores na array numerosAleatorios:
        for(int i = 0; i < numerosAleatorios.length; i++) {
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.print("Números aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero) + " ");
        }

        System.out.print("\nSucessores dos números aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero+1) + " ");
        }

        System.out.print("\nAntecessores dos números aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero-1) + " ");
        }
            
        }
    }
