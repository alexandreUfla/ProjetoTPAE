package pokedex.pokemon;

import pokedex.pokemon.tipo.Fogo;

/**
 * A classe {@code Charmander} representa o Pokémon Charmander, incluindo seus atributos
 * básicos e métodos para realizar ataques e calcular o dano recebido.
 * <p>
 * Esta classe utiliza a classe {@link AtributosBasePokemon} para herdar atributos básicos e 
 * a classe {@link Fogo} para determinar o comportamento de ataques e dano com base no tipo do Pokémon.
 */
public class Charmander {
    
    AtributosBasePokemon atributos = new AtributosBasePokemon();
    Fogo Cfogo = new Fogo(); // Cfogo = classe Fogo

    // Atributos do Charmander
    String classe = "fogo";
    int vida = atributos.getVida();
    int recvida = atributos.getRecVida();
    int mana = atributos.getMana();
    int recmana = atributos.getRecMana();

    /**
     * Realiza um ataque normal contra o Pokémon oponente, baseado no tipo do oponente.
     *
     * @param oponente o tipo do Pokémon oponente.
     * @return o valor do dano causado pelo ataque normal.
     */
    public int ataqueNormal(String oponente) {
        return Cfogo.getAtaqueNormal(oponente);
    }

    /**
     * Realiza um ataque principal contra o Pokémon oponente, baseado no tipo do oponente.
     *
     * @param oponente o tipo do Pokémon oponente.
     * @return o valor do dano causado pelo ataque principal.
     */
    public int ataquePrincipal(String oponente) {
        return Cfogo.getAtaquePrincipal(oponente);
    }

    /**
     * Calcula o dano recebido pelo Charmander de um ataque do Pokémon oponente.
     *
     * @param oponente o tipo do Pokémon oponente.
     * @return o valor do dano recebido.
     */
    public int danoRecebido(String oponente) {
        return Cfogo.getDanoRecebido(oponente);
    }
}
