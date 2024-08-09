package br.com.gaitkoski.padroes.criacionais.Ativ1;

public class Principal {

    public static void main(String[] args) {
                FabricaVeiculo fabricaEletricos = new FabricaVeiculosEletricos();
        Carro carroEletrico = fabricaEletricos.criarCarro();
        Caminhao caminhaoEletrico = fabricaEletricos.criarCaminhao();

        carroEletrico.dirigir(); 
        caminhaoEletrico.transpotar(); 

        FabricaVeiculo fabricaCombustao = new FabricaVeiculosCombustao();
        Carro carroCombustao = fabricaCombustao.criarCarro();
        Caminhao caminhaoCombustao = fabricaCombustao.criarCaminhao();

        carroCombustao.dirigir(); 
        caminhaoCombustao.transpotar(); 
    }
    
}
