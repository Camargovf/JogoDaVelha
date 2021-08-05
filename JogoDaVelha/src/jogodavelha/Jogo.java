package jogodavelha;
import java.util.Scanner; //Classe modo texto entrada

//classe

public class Jogo {
    private final Tabuleiro tabuleiro; //imutavel
    private int rodada=1, vez=1; //definindo quantidade de turno por rodada

    //instanciando jogadores
    private Jogador jogador1 = new Humano(1); //informação escondida/controlada (set/get)
    private Jogador jogador2;
    public Scanner entrada = new Scanner(System.in); // Entrada pelo processo de scanner

    //Construindo -- loop while
    public Jogo(){
        tabuleiro = new Tabuleiro();
        iniciarJogadores();

        while (Jogar()) {

        }
    }

    //Menu



    //Jogo inicia - condicional if else -- escolha de quais jogadores
    public void iniciarJogadores(){


        System.out.println("Quem vai ser o Jogador 1 ?");
        if(escolherJogador() == 1) {
            this.jogador1 = new Humano(1);
        } else {
            this.jogador1 = new Computador(1);
        }

        System.out.println("----------------------");
        System.out.println("Quem vai ser o Jogador 2 ?");

        if(escolherJogador() == 1)
            this.jogador2 = new Humano(2);
        else
            this.jogador2 = new Computador(2);



    }

    //Loop de repeticao para escolher Humano ou Computador
    public int escolherJogador(){
        int opcao=0;

        do{
            System.out.println("1. Humano");
            System.out.println("2. Computador\n");
            System.out.print("Opção: ");
            opcao = entrada.nextInt();

            if(opcao != 1 && opcao != 2)
                System.out.println("Opção inválida! Tente novamente");
        }while(opcao != 1 && opcao != 2);

        return opcao;
    }


    //Booleano que controla o andamento do jogo -- condicional

    public boolean Jogar(){
        if(ganhou() == 0 ){
            System.out.println("----------------------");
            System.out.println("\nRodada "+rodada);
            System.out.println("É a vez do jogador " + vez() );

            if(vez()==1)
                jogador1.jogar(tabuleiro);
            else
                jogador2.jogar(tabuleiro);


            if(tabuleiro.tabuleiroCompleto()){
                System.out.println("Tabuleiro Completo. Jogo empatado");
                return false;
            }
            vez++;
            rodada++;

            return true;
        } else{
            if(ganhou() == -1 )
                System.out.println("Jogador 1 ganhou!");
            else
                System.out.println("Jogador 2 ganhou!");

            return false;
        }

    }
    //vez definido inteiro
    public int vez(){
        if(vez%2 == 1)
            return 1;
        else
            return 2;
    }

    // checa quem ganhou.
    public int ganhou(){
        if(tabuleiro.verificaLinhas() == 1)
            return 1;
        if(tabuleiro.verificaColuna() == 1)
            return 1;
        if(tabuleiro.verificaDiagonais() == 1)
            return 1;

        if(tabuleiro.verificaLinhas() == -1)
            return -1;
        if(tabuleiro.verificaColuna() == -1)
            return -1;
        if(tabuleiro.verificaDiagonais() == -1)
            return -1;

        return 0;
    }


}