package pokedex.pokemon;
import pokedex.pokemon.tipo.agua;
//import menu.Main;

public class squirtle{
    atributosBasePokemon atributos = new atributosBasePokemon();
    pokedex.pokemon.tipo.agua Cagua = new agua(); //Cagua = classe agua

    //pegando atributos da base (atributosBasePokemon)
    String classe = "agua";
    int vida = atributos.getvida();
    int recvida = atributos.getrecvida();
    int mana = atributos.getmana();
    int recmana = atributos.getrecmana();
    //int ataque_nomal = agua.getataque_normal();
    //int ataque_principal = agua.getataque_principal();
    //int Receber_dano = agua.getdanoRecebido();

    //pegando métodos da classe agua (classe.agua)
    public int ataqueNormal(String oponente){
        return Cagua.getataque_normal(oponente);
    }

    public int ataquePrincipal(String oponente){
        return Cagua.getataque_principal(oponente);
    }
    
    public int danoRecebido(String oponente){
        return Cagua.getdanoRecebido(oponente);
    }
}