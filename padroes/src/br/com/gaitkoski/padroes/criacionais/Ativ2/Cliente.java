package br.com.gaitkoski.padroes.criacionais.Ativ2;

public class Cliente {
    public static void main(String[] args) {
        FabricaJogo fabricaAdultos = new FabricaJogosAdultos();
        FabricaJogo fabricaInfantis = new FabricaJogosInfantis();

        JogoTabuleiro jogoTabuleiroAdulto = fabricaAdultos.criarJogoTabuleiro();
        JogoCartas jogoCartasAdulto = fabricaAdultos.criarJogoCartas();

        JogoTabuleiro jogoTabuleiroInfantil = fabricaInfantis.criarJogoTabuleiro();
        JogoCartas jogoCartasInfantil = fabricaInfantis.criarJogoCartas();

        jogoTabuleiroAdulto.jogar();
        jogoCartasAdulto.embaralhar();

        jogoTabuleiroInfantil.jogar();
        jogoCartasInfantil.embaralhar();
    }
}