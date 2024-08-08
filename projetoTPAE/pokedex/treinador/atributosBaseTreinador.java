package pokedex.treinador;

public class atributosBaseTreinador {

    static int numeroDeTreinadores = 0;
    
    public atributosBaseTreinador(){
        numeroDeTreinadores++;
    }

    //private int N_identificador = numeroDeTreinadores;
    private String nome = new String(); //talvez seja melhor alterar o acesso de nome e idade para public
    private int N_insignias;

    public void setnome(String nome){
        this.nome = nome; 
    }

    public String getnome(){
        return this.nome; 
    }

    public int getinsignias(int N_insignias){
        
        if(N_insignias > 10){
            this.N_insignias = 10;
        }else if(N_insignias < 0){
            this.N_insignias = 0;
        }else{    
            this.N_insignias = N_insignias;
        }
        
        return this.N_insignias;
    }


}
