package br.com.gaitkoski.padroes.criacionais.Ativ1;

public class FabricaVeiculosEletricos implements FabricaVeiculo{

    @Override
    public Carro criarCarro() {
        return new CarroEletrico();
    }

    @Override
    public Caminhao criarCaminhao() {
        return new CaminhaoEletrico();
    }
    
}
