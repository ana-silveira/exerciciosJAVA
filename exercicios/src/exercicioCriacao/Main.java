package exercicioCriacao;

public class Main {

    public static void main(String[] args) {
        //calculadora

        System.out.println("Calculadora");
        Calculadora.soma(3, 4);
        Calculadora.subtracao(7,6);
        Calculadora.multiplicacao(8,2);
        Calculadora.divisao(10, 5);

        // Mensagem

        System.out.println("Exercício Mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(15);
        Mensagem.obterMensagem(21);

        // Empréstimo

        System.out.println("Exercício Empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas()); // Pode-se passar como parâmetro para um método um outro método, desde que este método retorne algo.
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 2);
        Emprestimo.calcular(1000, 3);
        Emprestimo.calcular(1000, 6);

    }
}
