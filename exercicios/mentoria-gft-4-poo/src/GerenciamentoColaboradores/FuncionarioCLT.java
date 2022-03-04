package GerenciamentoColaboradores;

/*Classe de Herança -> Abstract! */

public abstract class FuncionarioCLT {
    protected String nome;
    protected String documento;
    protected double valorSalario;
    protected Endereco endereco;

    /* Criação dos construtores*/

    public FuncionarioCLT( /*construtor vazio*/ ) {
    }

    public FuncionarioCLT(String nome, String documento, double valorSalario, Endereco endereco) {
        this.nome = nome;
        this.documento = documento;
        this.valorSalario = valorSalario;
        this.endereco = endereco;
    }

    /* Criação de Getters e Setters*/

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public double getValorSalario() {
        return valorSalario;
    }

    public void setValorSalario(double valorSalario) {
        this.valorSalario = valorSalario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
