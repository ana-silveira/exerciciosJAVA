package LoopsEArrays;

import java.util.Random;

/*
Gere e imprima uma matriz 4x4 com valores aleatórios entre 0-9.
 */
public class Arrays_multidimensional_matriz4x4aleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] M = new int[4][4]; // o 1o par de colchetes representa a linha, e o 2o par representa colunas. Dentro do colchete afirmo o numero de linhas e colunas que eu preciso na matriz.
        // Cada linha é um array unidimensional.

        for(int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) /* J representa cada coluna em cada linha */ {
                M[i][j] = random.nextInt(9);
            }
        }
        for (int [] linha : M) {
            for (int coluna : linha) {
                System.out.print(coluna + " ");
            }
            System.out.println();
        }

        }


        }