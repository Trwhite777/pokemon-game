package Entrenador;
import Pokemones.Pokemon;

public class Npc extends Entrenador {

    public Npc(String nameuser) {
        super(nameuser);
    }


    public void presentacion_Npc() {
        Pokemon[] pokemons =  this.getPokemonList();
        System.out.println("Ja creias que te ibas a safar de mi");
        System.out.println("ven aqui " + pokemons[0].getNAME());
    }

}
