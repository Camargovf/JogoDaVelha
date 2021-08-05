/** Nao implementado */
package jogodavelha;

import java.util.Random;

public class ComputadorModoA extends Computador { //herança jogador

    public ComputadorModoA(int jogador) {
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

        Random rand = new Random();
        int movimento = rand.nextInt(9) + 1;
        boolean resultado = checaTentativa(tentativa, tabuleiro);

        while (!resultado) {
            movimento = rand.nextInt(9) + 1;
            resultado = checaTentativa(tentativa, tabuleiro);

        }

        System.out.println("escolheu a posição " + movimento);
        tabuleiro.setPosicao(tentativa, jogador);

    }
}
