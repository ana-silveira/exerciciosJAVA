package dioDesafioPadroesdeProjetosJava.subsistema2.cep;

import dioDesafioPadroesdeProjetosJava.singleton.SingletonEager;

public class CepApi {

    private static CepApi instancia = new CepApi();

    private CepApi() {

        super();
    }

    public static CepApi getInstancia() {
        return instancia;
    }

    public String recuperarCidade(String cep) {
        return "Rio de Janeiro";
    }

    public String recuperarEstado(String cep) {
        return "RJ";
    }


}
