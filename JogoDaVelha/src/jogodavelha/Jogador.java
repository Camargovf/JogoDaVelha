package jogodavelha;

public abstract class Jogador {

    protected int[] tentativa = new int[9]; //era 2
    protected int jogador;

    public Jogador(int jogador) {
        this.jogador = jogador;
    }

    //METODOS ABSTRATOS SEM CORPO (CODE) ASSINATURA.
    public abstract void jogar(Tabuleiro tabuleiro);

    public abstract void Tentativa(Tabuleiro tabuleiro);

    //Não é abstrato, checa a posicao que o jogador marcará
    public boolean checaTentativa(int[] tentativa, Tabuleiro tabuleiro) {
        if (tabuleiro.getPosicao(tentativa) == 0) {
            boolean b = false;
            return b;
        } else {
            return true;
        }

    }

}
