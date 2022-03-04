package LoopsEArrays;

import java.util.Scanner;

/*
Faça um programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
 */
public class Arrays_unidimensional_consoantes {
    public static void main(String[] args) {
        //Aqui vou adotar que esse caractere é do tipo "String" e que, obrigatoriamente, o usuário vai digitar uma letra só por vez.

        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String [6]; // mesmo que nem todas as 6 posições sejam ocupadas por valores, ainda assim estarão criadas. O valor delas será "null".
// Tenho que criar por fora um controlador para identificar quantas consoantes tenho dentro da array.

        int quantidadeConsoantes = 0;
        int count = 0;
        do {
            // Como transcrever para o programa o que é vogal e consoante para ele identificar?
            System.out.println("Letra: ");
            String letra = scan.next();

            if ( ! (letra.equalsIgnoreCase("a") |   // A interrogação aqui significa "quando não for igual a A, E, I, O, U" (...)
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u"))) {
            /* A letra será vogal quando ela for = a, e, i, o ou u.
            O objeto STRING tem métodos, e o equalsIgnoreCase é um desses métodos.
            Isso significa que ele vai comparar a string de "letra" com a 'anotherString', que são as vogais (não vai se atentar se é maiúscula ou minúscula).
            */

                // (...) quero que faça:
                consoantes[count] = letra;
                quantidadeConsoantes++;
            }

                count++;

        }while( count < consoantes.length );

        System.out.print("Consoantes: ");

        for ( String consoante : consoantes ){
            if ( consoante != null) // Sem essa linha, as posições ocupadas por vogais virão com resposta "null".
            System.out.print((consoante + " "));
        }

        System.out.println("Número de posições: " + consoantes.length);
    System.out.println("Quantidade de consoantes: " + quantidadeConsoantes);
    }
}
