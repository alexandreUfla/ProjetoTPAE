package pokedex.pokemon;
import pokedex.pokemon.tipo.fogo;
//import menu.Main;

public class charmander{
    atributosBasePokemon atributos = new atributosBasePokemon();
    pokedex.pokemon.tipo.fogo Cfogo = new fogo(); //Cfogo = classe fogo

    //pegando atributos da base (atributosBasePokemon)
    String classe = "fogo";
    int vida = atributos.getvida();
    int recvida = atributos.getrecvida();
    int mana = atributos.getmana();
    int recmana = atributos.getrecmana();
    //int ataque_nomal = fogo.getataque_normal();
    //int ataque_principal = fogo.getataque_principal();
    //int Receber_dano = fogo.getdanoRecebido();

    //pegando métodos da classe fogo (classe.fogo)
    public int ataqueNormal(String oponente){
        return Cfogo.getataque_normal(oponente);
    }

    public int ataquePrincipal(String oponente){
        return Cfogo.getataque_principal(oponente);
    }
    
    public int danoRecebido(String oponente){
        return Cfogo.getdanoRecebido(oponente);
    }
}