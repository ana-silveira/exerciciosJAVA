package GerenciamentoColaboradores;

public class Vendedor extends FuncionarioCLT implements CalculaBonificacao{

    private double valorDaBonificacao;
    @Override
    public void calculaBonificacao(double porcentagemBonificacao) {
        this.valorDaBonificacao = this.valorSalario * (porcentagemBonificacao/100d);
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", valorSalario=" + valorSalario +
                ", endereco=" + endereco.getBairro() +
                ", valorDaBonificacao =" + valorDaBonificacao +
                '}';
    }


}
