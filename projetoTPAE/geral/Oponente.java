package pokedex.pokemon;


import pokedex.pokemon.tipo.*;
public class Oponente{

    int escolhaOponente = menu.Main.escolha_oponente;

    if(escolhaOponente == 1){
        pokedex.pokemon.tipo.planta tipoPlanta = new planta();
    }else if(escolhaOponente == 2){
        pokedex.pokemon.tipo.fogo tipoFogo = new fogo();
    }else{
        pokedex.pokemon.tipo.agua tipoAgua = new agua();
    }

    atributosBasePokemon atributos = new atributosBasePokemon();

    //pegando atributos da base (atributosBasePokemon)
    int vida = atributos.getvida();
    int recvida = atributos.getrecvida();
    int mana = atributos.getmana();
    int recmana = atributos.getrecmana();

    //pegando métodos da classe planta (classe.planta)
    /*
    public int ataqueNormal(String oponente){
        int ataque_nomal = tipoPlanta.getataque_normal(oponente);
        //oponente.vida = oponente.vida-ataque_nomal;
        return tipoPlanta.getataque_normal(oponente);
    }

    public int ataquePrincipal(String oponente){
        return tipoPlanta.getataque_principal(oponente);
    }
    
    public int danoRecebido(String oponente){
        return tipoPlanta.getdanoRecebido(oponente);
    }
        */
}
