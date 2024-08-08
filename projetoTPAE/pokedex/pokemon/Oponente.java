package pokedex.pokemon;

import pokedex.pokemon.tipo.*;
import menu.Main;

/**
 * A classe {@code Oponente} representa o Pokémon oponente escolhido pelo jogador
 * no menu principal. Baseia-se na escolha feita pelo usuário e inicializa o tipo
 * do oponente como Planta, Fogo ou Água.
 * <p>
 * Esta classe utiliza a classe {@link AtributosBasePokemon} para herdar atributos básicos,
 * como vida, regeneração de vida, mana e regeneração de mana. Dependendo do tipo
 * de Pokémon escolhido pelo jogador, o oponente será configurado com atributos específicos.
 * <p>
 * Atualmente, a classe possui métodos comentados que podem ser usados para realizar ataques
 * e calcular dano, dependendo do tipo do oponente, mas a lógica de combate ainda não está
 * implementada.
 */
public class Oponente {

    // Atributos principais da classe
    private int escolhaOponente;
    private Planta tipoPlanta;
    private Fogo tipoFogo;
    private Agua tipoAgua;
    private AtributosBasePokemon atributos;

    // Atributos de status do Oponente baseados na escolha do jogador
    private int vida;
    private int recvida;
    private int mana;
    private int recmana;

    /**
     * Construtor da classe {@code Oponente} que inicializa o tipo do oponente com base
     * na escolha feita no menu principal. Inicializa também os atributos de vida, regeneração de vida,
     * mana e regeneração de mana com base nos valores definidos na classe {@link AtributosBasePokemon}.
     */
    public Oponente() {
        this.escolhaOponente = Main.escolha_oponente;
        this.atributos = new AtributosBasePokemon();
        this.vida = atributos.getVida();
        this.recvida = atributos.getRecVida();
        this.mana = atributos.getMana();
        this.recmana = atributos.getRecMana();

        // Inicializa o tipo do oponente baseado na escolha do jogador
        if (escolhaOponente == 1) {
            tipoPlanta = new Planta();
        } else if (escolhaOponente == 2) {
            tipoFogo = new Fogo();
        } else if (escolhaOponente == 3) {
            tipoAgua = new Agua();
        }
    }

    /**
     * Método comentado que poderia ser utilizado para realizar um ataque normal no oponente.
     * A lógica exata do ataque dependeria do tipo de Pokémon.
     * 
     * @param oponente Nome do oponente que receberá o ataque.
     * @return O dano causado ao oponente pelo ataque normal.
     */
    /*
    public int ataqueNormal(String oponente) {
        if (tipoPlanta != null) {
            return tipoPlanta.getAtaqueNormal(oponente);
        } else if (tipoFogo != null) {
            return tipoFogo.getAtaqueNormal(oponente);
        } else if (tipoAgua != null) {
            return tipoAgua.getAtaqueNormal(oponente);
        }
        return 0; // Retorna 0 se nenhum tipo foi selecionado
    }
    */

    /**
     * Método comentado que poderia ser utilizado para realizar um ataque principal no oponente.
     * A lógica exata do ataque dependeria do tipo de Pokémon.
     * 
     * @param oponente Nome do oponente que receberá o ataque.
     * @return O dano causado ao oponente pelo ataque principal.
     */
    /*
    public int ataquePrincipal(String oponente) {
        if (tipoPlanta != null) {
            return tipoPlanta.getAtaquePrincipal(oponente);
        } else if (tipoFogo != null) {
            return tipoFogo.getAtaquePrincipal(oponente);
        } else if (tipoAgua != null) {
            return tipoAgua.getAtaquePrincipal(oponente);
        }
        return 0; // Retorna 0 se nenhum tipo foi selecionado
    }
    */

    /**
     * Método comentado que poderia ser utilizado para calcular o dano recebido pelo oponente.
     * A lógica exata do cálculo dependeria do tipo de Pokémon.
     * 
     * @param oponente Nome do oponente que causou o dano.
     * @return O dano recebido pelo oponente.
     */
    /*
    public int danoRecebido(String oponente) {
        if (tipoPlanta != null) {
            return tipoPlanta.getDanoRecebido(oponente);
        } else if (tipoFogo != null) {
            return tipoFogo.getDanoRecebido(oponente);
        } else if (tipoAgua != null) {
            return tipoAgua.getDanoRecebido(oponente);
        }
        return 0; // Retorna 0 se nenhum tipo foi selecionado
    }
    */
}
