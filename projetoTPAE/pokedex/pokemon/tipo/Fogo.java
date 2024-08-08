package pokedex.pokemon.tipo;

/**
 * A classe {@code Fogo} representa um Pokémon do tipo Fogo e contém métodos para calcular
 * o dano causado e recebido em batalhas com outros tipos de Pokémon.
 * <p>
 * Esta classe contém três métodos principais:
 * <ul>
 * <li>{@link #getAtaqueNormal(String)} - calcula o dano de um ataque normal.
 * <li>{@link #getAtaquePrincipal(String)} - calcula o dano de um ataque principal.
 * <li>{@link #getDanoRecebido(String)} - calcula o dano recebido de um ataque de outro Pokémon.
 * </ul>
 */
public class Fogo {
    
    private int ataqueNormal;
    private int ataquePrincipal;
    private int danoRecebido;

    /**
     * Calcula o valor do ataque normal baseado no tipo do oponente.
     *
     * @param oponente o tipo do Pokémon oponente (ex: "folha", "fogo").
     * @return o valor do ataque normal.
     */
    public int getAtaqueNormal(String oponente) {
        if(oponente.equals("folha")) {
            this.ataqueNormal = 3;
        } else if(oponente.equals("fogo")) {
            this.ataqueNormal = 2;
        } else {
            this.ataqueNormal = 1;
        }
        return this.ataqueNormal;
    }

    /**
     * Calcula o valor do ataque principal baseado no tipo do oponente.
     *
     * @param oponente o tipo do Pokémon oponente (ex: "folha", "fogo").
     * @return o valor do ataque principal.
     */
    public int getAtaquePrincipal(String oponente) {
        if(oponente.equals("folha")) {
            this.ataquePrincipal = 5;
        } else if(oponente.equals("fogo")) {
            this.ataquePrincipal = 4;
        } else {
            this.ataquePrincipal = 3;
        }
        return this.ataquePrincipal;
    }

    /**
     * Calcula o valor do dano recebido baseado no tipo do oponente.
     *
     * @param oponente o tipo do Pokémon oponente (ex: "folha", "fogo").
     * @return o valor do dano recebido.
     */
    public int getDanoRecebido(String oponente) {
        if(oponente.equals("folha")) {
            this.danoRecebido = 3;
        } else if(oponente.equals("fogo")) {
            this.danoRecebido = 4;
        } else {
            this.danoRecebido = 5;
        }
        return danoRecebido;
    }
    
}
