package pokedex.pokemon;

import pokedex.pokemon.tipo.Agua;

/**
 * A classe {@code Squirtle} representa o Pokémon Squirtle, incluindo seus atributos
 * básicos e métodos para realizar ataques e calcular o dano recebido.
 * <p>
 * Esta classe utiliza a classe {@link AtributosBasePokemon} para herdar atributos básicos e 
 * a classe {@link Agua} para determinar o comportamento de ataques e dano com base no tipo do Pokémon.
 */
public class Squirtle {
    
    AtributosBasePokemon atributos = new AtributosBasePokemon();
    Agua Cagua = new Agua(); // Cagua = classe Agua

    // Atributos do Squirtle
    String classe = "agua";
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
        return Cagua.getAtaqueNormal(oponente);
    }

    /**
     * Realiza um ataque principal contra o Pokémon oponente, baseado no tipo do oponente.
     *
     * @param oponente o tipo do Pokémon oponente.
     * @return o valor do dano causado pelo ataque principal.
     */
    public int ataquePrincipal(String oponente) {
        return Cagua.getAtaquePrincipal(oponente);
    }

    /**
     * Calcula o dano recebido pelo Squirtle de um ataque do Pokémon oponente.
     *
     * @param oponente o tipo do Pokémon oponente.
     * @return o valor do dano recebido.
     */
    public int danoRecebido(String oponente) {
        return Cagua.getDanoRecebido(oponente);
    }
}
