package BancoDigital;

public class Main {
    public static void main(String[] args) {

        Cliente anaCarolina = new Cliente();
        anaCarolina.setNome("Ana Carolina");

        Conta cc = new ContaCorrente(anaCarolina);
        cc.depositar(100);

        Conta poupanca = new ContaPoupanca (anaCarolina);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }
}
