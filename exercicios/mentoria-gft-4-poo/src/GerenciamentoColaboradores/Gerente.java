package GerenciamentoColaboradores;

public class Gerente extends FuncionarioPJ implements CalculaBonificacao {

    private double valorBonificacao;

    @Override
    public void calculaBonificacao(double porcentagemBonificacao) {
     //   this.valorBonificacao = (super.getValorRemuneracao() * (porcentagemBonificacao/100)) + 100d;
        this.valorBonificacao = (2000 * 0.03) + 100;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", endereco=" + endereco +
                ", horasTrabalhadas=" + horasTrabalhadas +
                ", valorHora=" + valorHora +
                ", valorRemuneracao=" + valorRemuneracao +
                ", valorBonificacao=" + valorBonificacao +
                '}';
    }
}
