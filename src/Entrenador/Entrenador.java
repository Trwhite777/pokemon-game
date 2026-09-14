package Entrenador;

import Exepciones.Exepcions;
import Pokemones.Pokemon;
import Tipos.Tipos;

import java.util.ArrayList;
import java.util.Objects;

public class Entrenador {

    private ArrayList<Pokemon> pokemonList = new ArrayList<Pokemon>(6);  ;
    final private String NAMEUSER;
    final private int IDENTRENADOR = 6531;
    private int Dinero = 0;

    public Entrenador(String nameuser) {
        NAMEUSER = setNAMEUSER(nameuser);
    }

    public ArrayList<Pokemon> getPokemonList() {
        return pokemonList;
    }

    public Entrenador setPokemonList(ArrayList pokemonList) {
        this.pokemonList = pokemonList;
        return this;
    }

    public void addPokemon (Pokemon pokemon) {
        System.out.println("Enhorabuena has obtenido a "  + pokemon.getNAME());
        pokemonList.add(pokemon);
    }

    public int getDinero() {
        return Dinero;
    }

    public Entrenador setDinero(int dinero) {
        Dinero = dinero;
        return this;
    }

    public String getNAMEUSER() {
        return NAMEUSER;
    }

    public String setNAMEUSER(String nameUser) {
        return  Exepcions.textosVacios(nameUser);
    }

    public int getIdEntrenador() {
        return IDENTRENADOR;
    }

    public void tarjetaEntrenador () {
        System.out.println("TARJETA ENTRENADOR");
        System.out.println("NOMBRE : " + getNAMEUSER());
        System.out.println("ID N' " + getIdEntrenador());
        System.out.println("DINERO : " + getDinero());
    }

    public void showPokemons (ArrayList<Pokemon> pokemonList) {
        System.out.println("POKEMONES");
        for (Pokemon pokemos : pokemonList ) {
            System.out.print(pokemos.getNAME() + ": "); Tipos.showTipos(pokemos.getTipos());
            System.out.println();
        }
    }



}
