package GerenciamentoColaboradores;
// Finalidade: Gerenciar o pagamento de cada colaborador.

public class Main {

    public static void main(String[] args) {
        /*Endereco endereco = new Endereco();
        endereco.setRua("Endereço para essa rua");
        System.out.println(endereco.getRua());*/

        Endereco endereco = new Endereco("Rua funcionário", "Complemento endereço funcionario", "bairro funcionario");
        System.out.println("---------");

        /*Dá para iniciar um objeto passando por ele com o () contendo informação ou não. */
        Vendedor vendedor = new Vendedor();
        vendedor.setNome("vendedora Ana Carolina");
        vendedor.setDocumento("123.456.789.10");
        vendedor.setValorSalario(1000d);
        vendedor.setEndereco(endereco);
        vendedor.calculaBonificacao(2d);
        /*Esses 4 atributos estão vindo FuncionarioCLT, que são herdados pela subclasse Vendedor ('extends').*/
        System.out.println(vendedor);
        System.out.println("---------");

        OperadorDeCaixa operadorDeCaixa = new OperadorDeCaixa("Operador de caixa Camila", "789.012.345.67", 2000d, endereco);
        System.out.println(operadorDeCaixa);
        System.out.println("---------");

        Gerente gerente = new Gerente(); /* Criei construtor vazio aqui porque não criei o construtor dentro da classe Gerente*/
        gerente.setNome("Gerente Lygia");
        gerente.setDocumento("345.765.987-23");
        gerente.setEndereco(endereco);
        gerente.setHorasTrabalhadas(20);
        gerente.setValorHora(100d);

        gerente.calculaRemuneracao();
        gerente.calculaBonificacao(3);

        System.out.println(gerente);
        System.out.println("---------");



    }



 }
