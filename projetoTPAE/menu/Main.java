package menu;
//import pokedex.jogador;
//import java.util.Scanner;
//import pokedex.pokemon.atributosBasePokemon;

public class  Main{
    public static int escolha_oponente;


      public int escolha(int escolha_oponente){
            return escolha_oponente;
        }
        //função/método não pode ser criada(o) dentro da main

    public static void main(String[] args) {

        //Scanner scan = new Scanner(System.in);

        System.out.println("+---------------------------------+");
        System.out.println("|             TREINADOR           |");
        System.out.println("+---------------------------------+");
        System.out.println("Insira seu nome: ");
        //codigo pra inserir nome
        System.out.println("Insira sua idade: ");
        //codigo pra inserir nome
        System.out.println("+---------------------------------+");

        //jogador jogador1 = new jogador();
        
        int escolha_oponente = 0;
        System.out.println("+---------------------------------+");
        System.out.println("|       ESCOLHA SEU OPONENTE      |");
        System.out.println("+---------------------------------+");
        System.out.println("|  1 - Bulbassauro                |");
        System.out.println("|  2 - Charmander                 |");
        System.out.println("|  3 - Squirtle                   |");
        System.out.println("+---------------------------------+");
        //codigo pra inserir um numero de 1 a 3
        
        
        menu.Main escolha2 = new menu.Main();
        escolha2.escolha(escolha_oponente);

    }
}