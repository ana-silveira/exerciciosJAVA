package dioDesafioPadroesdeProjetosJava.singleton;

/*SIngleton "apressado: Atribui a instancia assim que a variável static é definida.  */

public class SingletonEager {

    private static final SingletonEager instancia = new SingletonEager();

    private SingletonEager() {

        super();
    }

    public static SingletonEager getInstancia() {
        return instancia;
    }
}
