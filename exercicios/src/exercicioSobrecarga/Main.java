package exercicioSobrecarga;

/* Criar uma aplicação que calcula a área dos 3 quadriláteros notáveis:
Quadrado, retângulo e trapézio.
 */

public class Main {

    public static void main(String[] args) {
        // Quadrilátero
        System.out.println("Exercício quadrilátero");
        Quadrilatero.area (3);
        Quadrilatero.area(5d, 6d); // quando passou os dois "d", o sistema reconheceu que se tratava de um retângulo.
        Quadrilatero.area(7, 8, 9);
        Quadrilatero.area(5f, 5f); // quando passou os dois "f", o sistema reconheceu que se tratava de um losango.
        // Sem os tipos dos dados do retangulo e do losango, ele não conseguiria identificar e retornaria erro.
    }

}
