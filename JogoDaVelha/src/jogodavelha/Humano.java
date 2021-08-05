package jogodavelha;

import java.util.Scanner; //dados scanner

public class Humano extends Jogador { // utilização da herança da classe Jogador

    public Scanner entrada = new Scanner(System.in);

    //Jogador humano
    public Humano(int jogador) {
        super(jogador);
        this.jogador = jogador;
        System.out.println("O jogador [ humano ] acabou de ser criado.");
    }

    //Polimorfismo, metodos iguais e implementação diferente.
    @Override
    public void jogar(Tabuleiro tabuleiro) {
        Tentativa(tabuleiro);
        tabuleiro.setPosicao(tentativa, jogador);
    }

    //Verificando se os numeros sao validos e faz a alteracao -- laco while -- condicional simples
    @Override
    public void Tentativa(Tabuleiro tabuleiro) {
        do {
            do {
                System.out.print("Linha: ");
                tentativa[0] = entrada.nextInt();

                if (tentativa[0] > 3 || tentativa[0] < 1) {
                    System.out.println("Linha inválida. É 1, 2 ou 3");
                }

            } while (tentativa[0] > 3 || tentativa[0] < 1);

            do {
                System.out.print("Coluna: ");
                tentativa[1] = entrada.nextInt();

                if (tentativa[1] > 3 || tentativa[1] < 1) {
                    System.out.println("Coluna inválida. É 1, 2 ou 3");
                }

            } while (tentativa[1] > 3 || tentativa[1] < 1);

            tentativa[0]--;
            tentativa[1]--;

            if (checaTentativa(tentativa, tabuleiro)) {
                System.out.println("Esse local já foi marcado. Tente outro.");
            }
        } while (checaTentativa(tentativa, tabuleiro));
    }
}
