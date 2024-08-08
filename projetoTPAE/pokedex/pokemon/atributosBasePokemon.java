package pokedex.pokemon;

public class atributosBasePokemon {
    private int vida = 25;
    private int mana = 25;
    private int recvida = 5;
    private int recmana = 5;
    //private String nome_pokemon = new String(); COMENTARIO: linha desnecessário por enquanto

    public int getvida(){
        return vida;
    }

    public int getmana(){
        return mana;
    }

    public int getrecmana(){
        return recmana;
    }

    public int getrecvida(){
        return recvida;
    }

}
