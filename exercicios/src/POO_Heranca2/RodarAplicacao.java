package POO_Heranca2;

public class RodarAplicacao {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        /* Peguei a classe Funcionario, e guardei o objeto Funcionario() dentro do atributo funcionario.
        Resumidamente, peguei uma classe e instanciei um objeto dentro dela.

        A partir daqui, ocorreram 3 Upcasts:
        Funcionario é o supertipo das subclasses Gerente, Vendedor e Faxineiro.
        */
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        //Downcast
        // Gerente gerente_ = new Funcionario(); Aqui não explicito entre parenteses a classe para a qual eu vou transformar, por isso ocorre erro de compilação.
        Vendedor vendedor_ = (Vendedor) new Funcionario(); // Estou pegando a classe mãe Funcionario e transformando na classe filha (Vendedor).
        /* Obs: Ocorrerá erro na execução dessa linha 18 porque o sistema não sabe o que fazer com os dados que existem na classe Vendedor mas que não existem na classe Funcionario.
        Por isso, deve-se evitar trabalhar com Downcast na POO.
        */
    }
}
