package pokedex.treinador;

/**
 * A classe {@code AtributosBaseTreinador} representa os atributos básicos de um treinador Pokémon,
 * como nome e número de insígnias. Ela também mantém um contador estático do número de treinadores criados.
 */
public class AtributosBaseTreinador {

    /** Contador estático que mantém o número total de treinadores criados. */
    static int numeroDeTreinadores = 0;

    /** Nome do treinador. */
    private String nome = new String();

    /** Número de insígnias que o treinador possui. */
    private int N_insignias;

    /**
     * Construtor da classe {@code AtributosBaseTreinador}, que incrementa o contador de treinadores.
     */
    public AtributosBaseTreinador() {
        numeroDeTreinadores++;
    }

    /**
     * Define o nome do treinador.
     *
     * @param nome O nome do treinador.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Retorna o nome do treinador.
     *
     * @return O nome do treinador.
     */
    public String getNome() {
        return this.nome;
    }

    /**
     * Define o número de insígnias do treinador. O valor é limitado entre 0 e 10.
     *
     * @param N_insignias O número de insígnias a ser definido.
     * @return O número de insígnias ajustado, garantindo que seja entre 0 e 10.
     */
    public int getInsignias(int N_insignias) {
        if (N_insignias > 10) {
            this.N_insignias = 10;
        } else if (N_insignias < 0) {
            this.N_insignias = 0;
        } else {    
            this.N_insignias = N_insignias;
        }
        return this.N_insignias;
    }
}
