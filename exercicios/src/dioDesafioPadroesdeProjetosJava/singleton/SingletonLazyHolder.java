package dioDesafioPadroesdeProjetosJava.singleton;

/*SIngleton LazyHolder: Tem a função de encapsular a instância ; "InstanceHolder */

public class SingletonLazyHolder {

    private static SingletonLazyHolder instancia = new SingletonLazyHolder();

    private SingletonLazyHolder() {

        super();
    }

    public static SingletonLazyHolder getInstancia() {

        return SingletonLazyHolder.instancia;
    }
}
