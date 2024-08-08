package menu;

import pokedex.treinador.AtributosBaseTreinador;
import pokedex.treinador.Jogador;
import pokedex.pokemon.Bulbassauro;
import pokedex.pokemon.Charmander;
import pokedex.pokemon.Squirtle;
import pokedex.pokemon.Oponente;

import java.util.Scanner;

/**
 * A classe {@code Main} é responsável por gerenciar o fluxo principal do jogo, incluindo a criação do jogador,
 * seleção de oponentes, batalhas e visualização dos Pokémon disponíveis.
 */
public class Main {

    public static int escolha_oponente;

    /**
     * Método principal do jogo que inicia o processo de criação do jogador e seleção do oponente.
     *
     * @param args argumentos da linha de comando (não utilizados).
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Criação do treinador
        Jogador jogador1 = new Jogador();
        AtributosBaseTreinador atributosJogador = new AtributosBaseTreinador();

        System.out.println("+---------------------------------+");
        System.out.println("|             TREINADOR           |");
        System.out.println("+---------------------------------+");
        System.out.print("Insira seu nome: ");
        atributosJogador.setNome(scan.nextLine());
        System.out.print("Insira sua idade: ");
        // código para definir a idade (não utilizado diretamente)
        scan.nextLine();
        System.out.println("+---------------------------------+");

        // Seleção de oponente
        System.out.println("+---------------------------------+");
        System.out.println("|       ESCOLHA SEU OPONENTE      |");
        System.out.println("+---------------------------------+");
        System.out.println("|  1 - Bulbassauro                |");
        System.out.println("|  2 - Charmander                 |");
        System.out.println("|  3 - Squirtle                   |");
        System.out.println("+---------------------------------+");
        escolha_oponente = scan.nextInt();

        // Inicializa o oponente com base na escolha
        Oponente oponente = new Oponente();

        // Início da batalha
        iniciarBatalha(oponente, atributosJogador);
    }

    /**
     * Inicia a batalha entre o jogador e o oponente escolhido.
     *
     * @param oponente o oponente selecionado para a batalha.
     * @param atributosJogador os atributos do treinador jogador.
     */
    public static void iniciarBatalha(Oponente oponente, AtributosBaseTreinador atributosJogador) {
        Scanner scan = new Scanner(System.in);
        int escolhaAtaque;

        // Inicialização do Pokémon do jogador
        Bulbassauro bulbassauro = null;
        Charmander charmander = null;
        Squirtle squirtle = null;

        // Criação do Pokémon do jogador (para o exemplo, vamos usar Bulbassauro)
        bulbassauro = new Bulbassauro();

        boolean emBatalha = true;

        while (emBatalha) {
            System.out.println("+---------------------------------+");
            System.out.println("|       ESCOLHA SUA AÇÃO          |");
            System.out.println("+---------------------------------+");
            System.out.println("|  1 - Ataque Normal              |");
            System.out.println("|  2 - Ataque Principal           |");
            System.out.println("|  3 - Verificar Pokémon          |");
            System.out.println("|  4 - Sair                       |");
            System.out.println("+---------------------------------+");
            escolhaAtaque = scan.nextInt();

            switch (escolhaAtaque) {
                case 1:
                    System.out.println("Você usou o ataque normal!");
                    // Adicionar lógica de ataque normal
                    break;
                case 2:
                    System.out.println("Você usou o ataque principal!");
                    // Adicionar lógica de ataque principal
                    break;
                case 3:
                    System.out.println("Você escolheu visualizar seus Pokémon!");
                    // Adicionar lógica para visualizar Pokémon
                    break;
                case 4:
                    emBatalha = false;
                    System.out.println("Você fugiu da batalha!");
                    break;
                default:
                    System.out.println("Escolha inválida. Tente novamente.");
                    break;
            }

            // Aqui pode ser adicionada a lógica de turno do oponente, cálculo de danos, etc.
            // Exemplo de finalização da batalha (simplificado):
            if (oponente == null) {
                System.out.println("Parabéns! Você venceu a batalha!");
                atributosJogador.getInsignias(atributosJogador.getInsignias(0) + 1);
                emBatalha = false;
            }
        }

        System.out.println("Fim da batalha. Voltando ao menu principal...");
    }
}
