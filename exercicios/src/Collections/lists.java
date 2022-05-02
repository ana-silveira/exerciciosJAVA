package Collections;

import java.util.*;

public class lists {
    public static void main(String[] args) {
    // Dada uma lista com as sete notas de um aluno [7d, 8.5, 9.3, 5d, 7d, 0d, 3.6], faça:

    // Formas de iniciar uma List:
    //  List notas = new ArrayList();// antes do JAVA 5
    //  List<Double> notas = new ArrayList<>(); // Generics (jdk5) - Diamond Operator (jdk 7)
    //  ArrayList<Double> notas = new ArrayList<>();
    //  List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
    /*  List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6); Obs: Essa forma de iniciar list é mais limitada, pois não consigo adicionar ou remover elementos.
            notas.add(10d); // Vai dar erro
            System.out.println(notas); */

        /*List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
          notas.add(1d);
          notas.remove(5d);
          System.out.println(notas);
    */

       System.out.println("Crie uma lista e adicione as sete notas: ");
        List<Double> notas = new ArrayList<>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas);

        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d));
               
        System.out.println ("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8d);
        System.out.println(notas);

        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas);

        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d));

        System.out.println("Exiba todas as notas na ordem em que foram informadas: ");

        System.out.println("Exiba todas as notas na ordem em que foram informadas: ");
        for (Double nota : notas) System.out.println(nota);

        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas);

        System.out.println("Exiba a menor nota:" + Collections.min(notas));

        System.out.println("Exiba a maior nota:" + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores:" + soma);

        System.out.println("Exiba a média das notas:" + (soma/notas.size()));

        System.out.println("Remova a nota zero");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Remova a nota da posição zero");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7.0 e exiba a lista");
        Iterator<Double> iterator1 = notas.iterator();
        if (iterator1.hasNext()) {
            do {
                Double next = iterator1.next();
                if (next < 7) iterator1.remove();
            } while (iterator1.hasNext());
        }
        System.out.println(notas);

        System.out.println("Apague toda a lista");
        notas.clear();
        System.out.println(notas);

        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());


        /*
        Resolva exercicios utilizando os metodos de implementação linked List:

        System.out.println("Crie uma lista chamada notas2" + "e coloque todos os elementos da ListArrayList nessa nova lista: ");

        System.out.println("Mostre a primeira nota da nova lista sem removê-lo: ");

        System.out.println("Mostre a primeira nota da nova lista removendo-o ");
         */
    }


}
