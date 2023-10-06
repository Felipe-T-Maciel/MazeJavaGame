import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Labirinto labirinto = new Labirinto();
    static Jogador jogador = new Jogador();
    public static void main(String[] args) {
        while (jogador.verificaFimDeJogo()) {
            int escolha;
            System.out.print("""
                                        
                    -- Bem vindo ao labirinto --
                                        
                        [1] Jogar
                        [2] Sair
                        
                    >\t""");
            escolha = sc.nextInt();
            switch (escolha) {
                case 1 -> {
                    game();
                }
                case 2 -> {
                    System.out.println("Saindo...");
                    System.exit(0);
                }
            }
        }
        limpaConsole();
        labirinto.labirinto();
        System.out.println("\n\nParabens voce venceu!");
        System.exit(0);
    }

    private static void game() {
        char opcao=' ';
        do {
            limpaConsole();
            System.out.println("Use WASD para se mover pelo mapa");
            labirinto.labirinto();
            System.out.print("\n\n> ");
            opcao = sc.next().charAt(0);
            switch (opcao){
                case 'w':{
                    jogador.moverCimaBaixo(-1);
                    break;
                }case 'a':{
                    jogador.moverLadoLado(-1);
                    break;
                }case 's':{
                    jogador.moverCimaBaixo(1);
                    break;
                }case 'd':{
                    jogador.moverLadoLado(1);
                    break;
                }
            }
        }while(jogador.verificaFimDeJogo());
    }

    private static void limpaConsole() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

}
