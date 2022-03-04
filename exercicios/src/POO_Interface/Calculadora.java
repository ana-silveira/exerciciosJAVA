package POO_Interface;

public class Calculadora implements Operacaomatematica {

    @Override
    public void soma(double operando1, double operando2) {
        System.out.println("Soma: " + (operando1 + operando2));
    }

    @Override
    public void subtracao(double operando1, double operando2) {
        System.out.println("Subtração " + (operando1 - operando2));
    }

    @Override
    public void multiplicacao(double operando1, double operando2) {
        System.out.println("Multiplicação: " + (operando1 * operando2));
    }

    @Override
    public void divisao(double operando1, double operando2) {
        System.out.println("Divisão: " + (operando1 / operando2));
    }

// Obs: Observar que, se qualquer um desses overrides for retirado (comentar o override para entender), ocorre erro;
// a classe vai exigir que todos sejam implementados.
}
