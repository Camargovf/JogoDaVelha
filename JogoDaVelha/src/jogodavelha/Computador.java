package jogodavelha;

import java.util.Random;

public class Computador extends Jogador { //herança jogador

    public Computador(int jogador) {
        super(jogador);
        System.out.println("O jogador [ computador ] acabou de ser criado."); //impressão com salto de linha
    }

    @Override
    public void jogar(Tabuleiro tabuleiro) {
        Tentativa(tabuleiro);

    }

    @Override
    public void Tentativa(Tabuleiro tabuleiro) { // While true com if para gerar nuemros aleatorios

        while (true) {
            int[] coord = new int[3];
            Random rand = new Random();
            int movimento = rand.nextInt(9) + 1;

            if (movimento == 1) {
                coord[0] = 0;
                coord[0] = 0;
            } else if (movimento == 2) {
                coord[0] = 0;
                coord[1] = 1;
            } else if (movimento == 3) {
                coord[0] = 0;
                coord[2] = 2;
            } else if (movimento == 4) {
                coord[1] = 1;
                coord[0] = 0;
            } else if (movimento == 5) {
                coord[1] = 1;
                coord[1] = 1;
            } else if (movimento == 6) {
                coord[1] = 1;
                coord[2] = 2;
            } else if (movimento == 7) {
                coord[2] = 2;
                coord[0] = 0;
            } else if (movimento == 8) {
                coord[2] = 2;
                coord[1] = 1;
            } else if (movimento == 9) {
                coord[2] = 2;
                coord[2] = 2;
            }

            if (movimento > 0 && movimento < 10) {
                boolean resultado = checaTentativa(tentativa, tabuleiro);
                if (resultado) {
                    tabuleiro.setPosicao(coord, jogador);

                    System.out.println("escolheu a posição " + movimento);
                    break;
                }
            }
        }
    }
}
