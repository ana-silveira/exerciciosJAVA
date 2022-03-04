package DesafioGFT1;

import java.io.IOException;
import java.util.Scanner;

public class Desafio2numerospares {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o valor de entrada (N): ");

        int N = scanner.nextInt();

        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) System.out.println(i);
        }

    }
}