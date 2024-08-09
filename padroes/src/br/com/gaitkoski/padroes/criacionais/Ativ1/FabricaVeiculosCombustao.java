package br.com.gaitkoski.padroes.criacionais.Ativ1;

public class FabricaVeiculosCombustao implements FabricaVeiculo{

    @Override
    public Carro criarCarro() {
        return new CarroCombustao();
    }

    @Override
    public Caminhao criarCaminhao() {
        return new CaminhaoCombustao();
        
    }
    
}
