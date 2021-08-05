/**Nao implementado*/


package jogodavelha;

public class ComputadorModoB extends Computador { //herança jogador


    public ComputadorModoB(int jogador) {
        super(jogador);
        System.out.println("O jogador [ computador ] acabou de ser criado."); //impressão com salto de linha
    }



    @Override
    public void jogar(Tabuleiro tabuleiro) {
        Tentativa(tabuleiro);
        tabuleiro.setPosicao(tentativa, jogador);

    }

    @Override
    public void Tentativa(Tabuleiro tabuleiro) { //era privado


        tentativa[0] = 1;
        tentativa[1] = 2;
        tentativa[3] = 3;
        tentativa[4] = 4;
        tentativa[5] = 6;
        tentativa[6] = 7;
        tentativa[7] = 8;
        tentativa[8] = 9;





    }
}

