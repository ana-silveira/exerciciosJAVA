package LoopsEArrays;

/* Crie um vetor de 6 números inteiros e mostre-os na ordem inversa. */

public class Arrays_unidimensional_ordeminversa {
    public static void main(String[] args) {

        int[] vetor = {-5, -10, 19, 50, 8, 4}; // Existem 6 elementos no vetor, que ocupam até a 5a posição (porque o 1o elemento ocupa a posição zero).
    // A ordem inserida no array é a ordem que sempre ele vai ficar.

      //  System.out.print(vetor);  Na resposta vai vir um código diferente dos valores inseridos, que representa a posição do array na memória da máquina..
        // Por isso é necessaria uma estrutura de laço para conseguir ver os valores contidos na array. A cada looping a gente vai andar dentro da array para pegar cada elemento.

        System.out.print("Vetor: ");
        int count = 0;
        while (count <= (vetor.length - 1)) {    // ou (count < (vetor.length))
            /* lenght é uma propriedade do vetor que retorna o tamanho dele, ou seja, quantos elementos cabem nesse vetor.
            O -1 após o length é por causa do número de posições = numero de elementos -1 (considerar a posição zero).
                         */
            System.out.print(vetor[count] + " ");
            count++;
        }
        System.out.print("\nVetor: ");
        // Para encontrar a ordem inversa, será usado o for para fins de treino mas há outras formas.
        for ( int i = (vetor.length - 1); i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }


    }
}
