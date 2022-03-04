package buscas;

import java.util.Scanner;

public class BuscaJava {
        public static void main(String[] args) {

            Scanner scan = new Scanner (System.in);

            System.out.println("Digite o número do curso desejado: 1-HTML 2-Lógica 3-Vendas 4-Pacote Office");

            int escolha = scan.nextInt();

            switch(escolha){
                case 1: System.out.println("HTML: Linguagem de Marcação utilizada para desenvolvimento de sites");
                    break;
                case 2: System.out.println("Lógica: Algoritmos utilizados para desenvolver programas de computador.");
                    break;
                case 3: System.out.println("Vendas:Curso para aprender como desenvolver uma estrutura de vendas na web");
                    break;
                case 4: System.out.println("Pacote Office: Software mais solicitado do mercado de trabalho ");
                    break;
                default: System.out.println("Valor não encontrado em nosso sistema. Por favor, tente novamente.");
                    break;
            }
        }
}
