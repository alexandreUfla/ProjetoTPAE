package pokedex.pokemon;

/**
 * A classe {@code AtributosBasePokemon} representa os atributos básicos de um Pokémon, incluindo
 * vida, mana, e as taxas de recuperação de vida e mana.
 * <p>
 * Esta classe fornece métodos para acessar esses atributos básicos.
 */
public class AtributosBasePokemon {
    
    private int vida = 25;
    private int mana = 25;
    private int recvida = 5;
    private int recmana = 5;

    /**
     * Retorna o valor atual de vida do Pokémon.
     *
     * @return o valor de vida.
     */
    public int getVida() {
        return vida;
    }

    /**
     * Retorna o valor atual de mana do Pokémon.
     *
     * @return o valor de mana.
     */
    public int getMana() {
        return mana;
    }

    /**
     * Retorna o valor de recuperação de mana do Pokémon por turno.
     *
     * @return o valor de recuperação de mana.
     */
    public int getRecMana() {
        return recmana;
    }

    /**
     * Retorna o valor de recuperação de vida do Pokémon por turno.
     *
     * @return o valor de recuperação de vida.
     */
    public int getRecVida() {
        return recvida;
    }

}
