import Ataques.Ataque;
import Entrenador.Entrenador;
import Pokemones.Bulbasur;
import Pokemones.Charmander;
import Pokemones.Squirtle;

import java.util.Scanner;
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Ataque placaje = new Ataque("Placaje","Golpea al objetivo con las extremidades, la cola o similares.",1,0,40,100,35);
    Ataque razguño = new Ataque("Razguño","Razguña al objetivo con las extremidades, la cola o similares.",0,0,40,100,35);
    Bulbasur bulbasur = new Bulbasur( "Bulbasur" , 45, 49 , 49 , 65 , 65 ,45, 12,4,7 );
    Charmander charmander = new Charmander("Charmander",45,45,45,54,34,4,90,1);
    Squirtle squirtle = new Squirtle("Squirtler" , 40 ,30 ,32, 40 , 39 ,89 , 91 , 2);
    System.out.println("Hola como estas cual es tu nombre?");
    String name = scanner.nextLine();
    Entrenador entrenador = new Entrenador(name);
    Entrenador entrenador1 = new Entrenador("GOLA");


    System.out.println(razguño.getTipo());


    System.out.println("Recibe tu primer pokemon Bulbasur");

    entrenador.addPokemon(bulbasur);
    entrenador.addPokemon(charmander);
    entrenador.addPokemon(squirtle);

    entrenador.tarjetaEntrenador();

    entrenador.showPokemons(entrenador.getPokemonList());

    placaje.showMov();

    charmander.addAtaque(placaje);
    charmander.addAtaque(razguño);


    entrenador1.tarjetaEntrenador();

    entrenador1.showPokemons(entrenador1.getPokemonList());



    entrenador.showPokemonAtaques(1);

    charmander.atacarPokemon(charmander.getMovimientoAtaque(1) , charmander , squirtle);
}//main

