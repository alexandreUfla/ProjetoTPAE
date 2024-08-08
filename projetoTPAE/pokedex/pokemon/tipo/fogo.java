package pokedex.pokemon.tipo;

public class fogo {
    
    private int ataque_normal;
    private int ataque_principal;
    private int danoRecebido;
    //private String oponente = new String(); COMENTARIO: linha desnecessária por enquanto
    
    //calculo do valor do ataque normal
    public int getataque_normal(String oponente){
        
        if(oponente == "folha"){
            this.ataque_normal = 3;
        }else if(oponente == "fogo"){
            this.ataque_normal = 2;
        }else{
            this.ataque_normal = 1;
        }

        return this.ataque_normal;
    }

    //calculo do valor do ataque principal
    public int getataque_principal(String oponente){
        
        if(oponente == "folha"){
            this.ataque_principal = 5;
        }else if(oponente == "fogo"){
            this.ataque_principal = 4;
        }else{
            this.ataque_principal = 3;
        }

        return this.ataque_principal;
    }

    //calculo do valor do dano recebido
    public int getdanoRecebido(String oponente){
        
        if(oponente == "folha"){
            this.danoRecebido = 3;
        }else if(oponente == "fogo"){
            this.danoRecebido = 4;
        }else{
            this.danoRecebido = 5;
        }

        return danoRecebido;
    }
    
}
