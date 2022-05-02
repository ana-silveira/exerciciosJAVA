package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
    Dadas as seguintes informações sobre os gatos da Camila, crie uma lista e ordene-a exibindo: (nome - idade - cor).

    Gato1 = nome: Jon, idade: 18, cor: preto
    Gato2 = nome: Simba, idade: 6, cor: tigrado
    Gato3 = nome: Jon, idade: 12, cor: amarelo
     */
    public class ordenarElementosNaColecaoList {

        public static void main(String[] args) {

            List<Gato> meusGatos = new ArrayList<>(){{
                add (new Gato("Jon", "preto", 18));
                add (new Gato("Simba", "tigrado", 6));
                add (new Gato("Jon", "amarelo", 12));
                }};
            System.out.println(meusGatos);

            System.out.println("--\t Ordem de Inserção \t---");
            System.out.println(meusGatos);

            System.out.println("--\t Ordem aleatória  \t---");
            Collections.shuffle(meusGatos);
            System.out.println(meusGatos);

            System.out.println("--\t Ordem Natural (nome)  \t---");
            Collections.sort(meusGatos); // lista vai ser organizada de acordo com a classe Comparable
            System.out.println(meusGatos);

            System.out.println("--\t Ordem Idade \t---");
            meusGatos.sort(new ComparatorIdade());
         //  Collections.sort (meusGatos, new ComparatorIdade());
            System.out.println(meusGatos);

            System.out.println("--\t Ordem cor  \t---");
            meusGatos.sort(new ComparatorCor());
            System.out.println(meusGatos);

            System.out.println("--\t Ordem Nome / Cor / Idade  \t---");
            meusGatos.sort(new ComparatorNomeCorIdade());
            System.out.println(meusGatos);



        }
    }

    class Gato implements Comparable<Gato> {
        private String Nome;
        private String cor;
        private Integer idade;

        public Gato(String nome, String cor, Integer idade) {
            Nome = nome;
            this.cor = cor;
            this.idade = idade;
        }

        public String getNome() {
            return Nome;
        }

        public String getCor() {
            return cor;
        }

        public Integer getIdade() {
            return idade;
        }

        @Override
        public String toString() {
            return "** {" +
                    "Nome='" + Nome + '\'' +
                    ", cor='" + cor + '\'' +
                    ", idade=" + idade +
                    '}';
        }

        @Override
        public int compareTo(Gato gato) {
            return this.getNome().compareToIgnoreCase(gato.getNome());
        }
    }

    class ComparatorIdade implements Comparator<Gato>{

        @Override
        public int compare(Gato g1, Gato g2) {
            return Integer.compare(g1.getIdade(), g2.getIdade());
        }
    }

class ComparatorCor implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
}

class ComparatorNomeCorIdade implements Comparator<Gato>{
    @Override
    public int compare(Gato g1, Gato g2) {
    int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
    if (nome != 0) return nome;

    int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
    if (cor != 0) return cor;

        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}



