package BancoDigital;
// Interface: CLasse abstrata com todos os métodos abstratos. As Classes que a extendem, implementam tudop que ela tem.
// Os métodos não possuem corpo; E como toda interface é pública, torna-se redundante o modificador do método "public"
public interface IConta {

    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, Conta contaDestino);

    void imprimirExtrato();

}
