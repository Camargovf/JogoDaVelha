package jogodavelha;
//Classe

public class Tabuleiro { //acesso irrestrito

    //Transformar valor imutável
    public final int[][] tabuleiro = new int[3][3]; //matriz do tabuleiro. //era privado

    //Métodos
    public Tabuleiro() {
        resetarTabuleiro();
    }

    //Método que zera todos os inteiros da matriz receber valor 0
    public void resetarTabuleiro() {
        for (int linha = 0; linha < 3; linha++) //percorre ate menor que 3
        {
            for (int coluna = 0; coluna < 3; coluna++) //++ incrementa percorre com for
            {
                tabuleiro[linha][coluna] = 0; //setou 0
            }
        }
    }

    //Percorrer para imprimir X O |
    public void mostrarTabuleiro() {
        System.out.println();
        for (int linha = 0; linha < 3; linha++) {

            for (int coluna = 0; coluna < 3; coluna++) {

                if (tabuleiro[linha][coluna] == -1) {
                    System.out.print(" X ");
                }
                if (tabuleiro[linha][coluna] == 1) {
                    System.out.print(" O ");
                }
                if (tabuleiro[linha][coluna] == 0) {
                    System.out.print("   ");
                }

                if (coluna == 0 || coluna == 1) {
                    System.out.print("|");
                }
            }
            System.out.println();
        }

    }

    //METODO DE ACESSO recebe a tentativa
    public int getPosicao(int[] tentativa) {
        return tabuleiro[tentativa[0]][tentativa[1]];
    }

    //METODO MODIFICADOR marca a tentativa
    public void setPosicao(int[] tentativa, int jogador) {
        if (jogador == 1) {
            tabuleiro[tentativa[0]][tentativa[1]] = -1;
        } else {
            tabuleiro[tentativa[0]][tentativa[1]] = 1;
        }

        mostrarTabuleiro();
    }

    //METODO PARA CHECAR LINHA
    public int verificaLinhas() {
        for (int linha = 0; linha < 3; linha++) {

            if ((tabuleiro[linha][0] + tabuleiro[linha][1] + tabuleiro[linha][2]) == -3) {
                return -1;
            }
            if ((tabuleiro[linha][0] + tabuleiro[linha][1] + tabuleiro[linha][2]) == 3) {
                return 1;
            }
        }

        return 0;

    }

    //METODO PARA CHECAR COLUNA
    public int verificaColuna() {
        for (int coluna = 0; coluna < 3; coluna++) {

            if ((tabuleiro[0][coluna] + tabuleiro[1][coluna] + tabuleiro[2][coluna]) == -3) {
                return -1;
            }
            if ((tabuleiro[0][coluna] + tabuleiro[1][coluna] + tabuleiro[2][coluna]) == 3) {
                return 1;
            }
        }

        return 0;

    }

    //METODO PARA CHECAR AS DUAS
    public int verificaDiagonais() {
        if ((tabuleiro[0][0] + tabuleiro[1][1] + tabuleiro[2][2]) == -3) {
            return -1;
        }
        if ((tabuleiro[0][0] + tabuleiro[1][1] + tabuleiro[2][2]) == 3) {
            return 1;
        }
        if ((tabuleiro[0][2] + tabuleiro[1][1] + tabuleiro[2][0]) == -3) {
            return -1;
        }
        if ((tabuleiro[0][2] + tabuleiro[1][1] + tabuleiro[2][0]) == 3) {
            return 1;
        }

        return 0;
    }

    //METODO CHECA TODOS OS ELEMENTOS (BOOLEAN)
    public boolean tabuleiroCompleto() {
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                if (tabuleiro[linha][coluna] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

}
