package pokedex.pokemon;
import pokedex.pokemon.tipo.planta;
import pokedex.pokemon.Oponente;
//import menu.Main;

public class bulbassauro{
    atributosBasePokemon atributos = new atributosBasePokemon();
    pokedex.pokemon.tipo.planta tipoPlanta = new planta();

    //pegando atributos da base (atributosBasePokemon)
    String classe = "planta";
    int vida = atributos.getvida();
    int recvida = atributos.getrecvida();
    int mana = atributos.getmana();
    int recmana = atributos.getrecmana();

    //pegando métodos da classe planta (classe.planta)
    public int ataqueNormal(String oponente){
        int ataque_nomal = tipoPlanta.getataque_normal(oponente);
        //int oponente.vida = oponente.vida-ataque_nomal;
        return tipoPlanta.getataque_normal(oponente);
    }

    public int ataquePrincipal(String oponente){
        return tipoPlanta.getataque_principal(oponente);
    }
    
    public int danoRecebido(String oponente){
        return tipoPlanta.getdanoRecebido(oponente);
    }
}