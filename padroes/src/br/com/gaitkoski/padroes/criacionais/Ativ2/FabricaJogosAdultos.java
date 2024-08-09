package br.com.gaitkoski.padroes.criacionais.Ativ2;

public class FabricaJogosAdultos implements FabricaJogo {
    @Override
    public JogoTabuleiro criarJogoTabuleiro() {
        return new JogoTabuleiroAdulto();
    }

    @Override
    public JogoCartas criarJogoCartas() {
        return new JogoCartasAdulto();
    }
}