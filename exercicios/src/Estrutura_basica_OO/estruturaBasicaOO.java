package Estrutura_basica_OO;

public class estruturaBasicaOO {
    static class Carro {
        String cor;
        String modelo;
        int capacidadeTanque;


        Carro(String cor, String modelo, int capacidadeTanque) {
            this.cor = cor;
            this.modelo = modelo;
            this.capacidadeTanque = capacidadeTanque;
        }

        public Carro() {

        }


        void setCor(String cor) {
            this.cor = cor;
        }
        String getCor() {
            return cor;     // como retorna a cor, não pode ser void.
        }

        void setModelo(String modelo){
            this.modelo = modelo;
        }
        String getModelo() {
            return  modelo;
        }

        void setCapacidadeTanque(int capacidadeTanque){
            this.capacidadeTanque = capacidadeTanque;
        }
        int getCapacidadeTanque (){
            return capacidadeTanque;
        }

        //     Método do total para encher o tanque:

        double totalValorTanque (double valorCombustivel) {
            return capacidadeTanque * valorCombustivel;
        }
    }
}
