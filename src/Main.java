import Ataques.Ataque;
import Entrenador.Entrenador;
import Pokemones.Bulbasur;
import Pokemones.Charmander;
import Pokemones.Squirtle;
import Entrenador.Npc;

import java.util.Scanner;
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Ataque placaje = new Ataque("Placaje","Golpea al objetivo con las extremidades, la cola o similares.",0,0,40,100,35);
    Ataque razguño = new Ataque("Razguño","Razguña al objetivo con las extremidades, la cola o similares.",0,0,40,100,35);
    Bulbasur bulbasur = new Bulbasur( "Bulbasur" , 45, 49 , 49 , 65 , 65 ,45, 12,4,7 );
    Charmander charmander = new Charmander("Charmander",45,10000,45,54,34,4,90,1);
    Squirtle squirtle = new Squirtle("Squirtler" , 40 ,30 ,32, 40 , 39 ,89 , 91 , 2);
    Charmander maniqui = new Charmander("Charmander",1000000000,10000,45,54,34,4,90,1);
    Entrenador entrenador = new Entrenador("caixer");
    Npc npc = new Npc("Rival blue");

    squirtle.pokemonRecibeDano(100000);
    bulbasur.pokemonRecibeDano(100000);


    entrenador.addPokemon(squirtle);
    entrenador.addPokemon(bulbasur);
    entrenador.addPokemon(charmander);

    entrenador.iniciaCombate();

    entrenador.showPokemons();




}//main

