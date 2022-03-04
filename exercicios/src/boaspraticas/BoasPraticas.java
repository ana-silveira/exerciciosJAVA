package boaspraticas;

/** Classe de exemplo para o exercicio da aula 1 de Variaveis, tipos de dados e Operadores aritmeticos */

public class BoasPraticas {
    public static void main(String[] args) {
        int i; //Nome ok.
      //int i; Ja existe uma variavel com o mesmo nome.
        int I; // Ocorre diferenciacao de maiusculas e minusculas; nome esta OK.
      //int 1a; Nome nao pode comecar com numeros.
        int _1a; //Embora permitido pelo codigo e nao ocorra erro na compilacao, nao se deve utilizar underline e cifrao.
        int $aq;

        i = 5;
        I = 10;
        _1a = 20;
        $aq = 7;

        final int j = 10; // a variavel J SEMPRE tera valor = 10.
      //j = 15; Ja foi previamente dito o valor constante de J.
        int asrn24678md = 10; //nome com letras e números criado de maneira nao usual, porem OK.
      //int asrn24678 md; O espaco no meio do nome gera erro.
        int asrn24678_md = 10; //underline nao usual e nao recomendado, mas nome esta OK porque nao gera erro no codigo.
      //int asrn24678$%md = 10; Caracteres especiais nao sao permitidos!

        int quantidadeProduto = 50;
     /// int QuantidadeProduto; Nao segue Boas Praticas pq 1a letra esta maiuscula.
        final int NUMERO_TENTATIVAS = 5; //Nao existe notacao camelo para 'final int' -> Nome ok!
     /// final int numeroTentativas = 5; Nao gera erro mas 'final int' nao deve ser escrito dessa forma.
        int QUANTIDADE_OPCOES = 25; // Nao da erro de compilacao mas nao e uma boa pratica escrever em caixa alta o nome da variavel sem se tratar de final int.
     /// int qtdProd; Baixa expressividade dessa variavel.

        System.out.println(i);
        System.out.println(I);
        System.out.println(_1a);
        System.out.println($aq);

        System.out.println(j);
        System.out.println(asrn24678md);
        System.out.println(asrn24678_md);

        System.out.println(quantidadeProduto);
        System.out.println(NUMERO_TENTATIVAS);
        System.out.println(QUANTIDADE_OPCOES);

    }
}