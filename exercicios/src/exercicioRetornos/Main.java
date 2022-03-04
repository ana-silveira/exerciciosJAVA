package exercicioRetornos;

/* Criar uma aplicação que calcula a área dos 3 quadriláteros notáveis:
Quadrado, retângulo e trapézio.
 */

public class Main {

    public static void main(String[] args) {
        // Quadrilátero
        System.out.println("Exercício retornos");

        double areaQuadrado = Quadrilatero.area (3);
        System.out.println("Área do quadrado: " + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(5, 6);
        System.out.println("Área do retângulo: " + areaRetangulo);

        double areaTrapezio = Quadrilatero.area(7, 8, 9);
        System.out.println("Área do trapézio: " + areaTrapezio);

        double areaLosango = Quadrilatero.area(5, 5f);
        System.out.println("Área do losângo" + areaTrapezio);
    }

}
