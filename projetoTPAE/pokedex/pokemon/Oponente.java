package pokedex.pokemon;

import pokedex.pokemon.tipo.*;
import menu.Main;

/**
 * A classe {@code Oponente} representa o Pokémon oponente escolhido pelo jogador
 * no menu principal. Baseia-se na escolha feita pelo usuário e inicializa o tipo
 * do oponente como Planta, Fogo ou Água.
 * <p>
 * Esta classe utiliza a classe {@link AtributosBasePokemon} para herdar atributos básicos,
 * mas atualmente, não realiza ataques ou cálculos de dano.
 */
public class Oponente {

    private int escolhaOponente = Main.escolha_oponente;
    private Planta tipoPlanta;
    private Fogo tipoFogo;
    private Agua tipoAgua;
    private AtributosBasePokemon atributos = new AtributosBasePokemon();

    // Atributos do Oponente baseados na escolha do jogador
    private int vida = atributos.getVida();
    private int recvida = atributos.getRecVida();
    private int mana = atributos.getMana();
    private int recmana = atributos.getRecMana();

    /**
     * Construtor da classe {@code Oponente} que inicializa o tipo do oponente com base
     * na escolha feita no menu principal.
     */
    public Oponente() {
        if (escolhaOponente == 1) {
            tipoPlanta = new Planta();
        } else if (escolhaOponente == 2) {
            tipoFogo = new Fogo();
        } else if (escolhaOponente == 3) {
            tipoAgua = new Agua();
        }
    }

    // Métodos para realizar ataques e calcular dano foram comentados
    // porque dependem do tipo específico do oponente (Planta, Fogo, Água),
    // e a lógica atual ainda não está implementada.

    /*
    public int ataqueNormal(String oponente) {
        // Exemplo de como o ataque normal poderia ser implementado:
        // return tipoPlanta.getAtaqueNormal(oponente);
    }

    public int ataquePrincipal(String oponente) {
        // Exemplo de como o ataque principal poderia ser implementado:
        // return tipoPlanta.getAtaquePrincipal(oponente);
    }
    
    public int danoRecebido(String oponente) {
        // Exemplo de como o dano recebido poderia ser implementado:
        // return tipoPlanta.getDanoRecebido(oponente);
    }
    */
}
