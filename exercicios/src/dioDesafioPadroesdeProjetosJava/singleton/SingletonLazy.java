package dioDesafioPadroesdeProjetosJava.singleton;

/*SIngleton "preguiçoso: Não disponibiliza, num primeiro momento, a instância para o usuário. */

public class SingletonLazy {

    private static SingletonLazy instancia;

    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstancia() {
        if (instancia == null) {
            instancia = new SingletonLazy();
        }

        return instancia;
    }
}
