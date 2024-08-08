package pokedex.pokemon;

import pokedex.pokemon.tipo.Planta;

/**
 * A classe {@code Bulbassauro} representa o Pokémon Bulbassauro, incluindo seus atributos
 * básicos e métodos para realizar ataques e calcular o dano recebido.
 * <p>
 * Esta classe utiliza a classe {@link AtributosBasePokemon} para herdar atributos básicos e 
 * a classe {@link Planta} para determinar o comportamento de ataques e dano com base no tipo do Pokémon.
 */
public class Bulbassauro {
    
    AtributosBasePokemon atributos = new AtributosBasePokemon();
    Planta tipoPlanta = new Planta();

    // Atributos do Bulbassauro
    String classe = "planta";
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
        return tipoPlanta.getAtaqueNormal(oponente);
    }

    /**
     * Realiza um ataque principal contra o Pokémon oponente, baseado no tipo do oponente.
     *
     * @param oponente o tipo do Pokémon oponente.
     * @return o valor do dano causado pelo ataque principal.
     */
    public int ataquePrincipal(String oponente) {
        return tipoPlanta.getAtaquePrincipal(oponente);
    }

    /**
     * Calcula o dano recebido pelo Bulbassauro de um ataque do Pokémon oponente.
     *
     * @param oponente o tipo do Pokémon oponente.
     * @return o valor do dano recebido.
     */
    public int danoRecebido(String oponente) {
        return tipoPlanta.getDanoRecebido(oponente);
    }
}
