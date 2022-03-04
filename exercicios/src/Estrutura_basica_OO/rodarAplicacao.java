package Estrutura_basica_OO;

public class rodarAplicacao {
    public static void main(String[] args) {

        //Ex. criação do objeto vazio para inserção dos valores posteriormente
        estruturaBasicaOO.Carro carro1 = new estruturaBasicaOO.Carro();
        // Inserção dos valores no objeto.
        carro1.setCor("Azul");
        carro1.setModelo("BMW Serie 3");
        carro1.setCapacidadeTanque(59);

        System.out.println(carro1.getCor());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque(6.39));

        //  Uso da sobrecarga no construtor para inserir as informações já na criação do objeto.
        estruturaBasicaOO.Carro carro2 = new estruturaBasicaOO.Carro("Cinza", "Mercedes-Benz Classe C", 66);

        System.out.println(carro2.getCor());
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalValorTanque(6.46));

    }
}
