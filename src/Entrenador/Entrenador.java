package Entrenador;

import Ataques.Ataque;
import Exepciones.Exepcions;
import Pokemones.Pokemon;
import Tipos.Tipos;

import java.util.ArrayList;

public class Entrenador {

    // ATRIBUTOS

    private Pokemon[]  pokemonsList = new Pokemon[4];
    final private String NAMEUSER;
    final private int IDENTRENADOR = 6531;
    private int Dinero = 0;
    private int contPokemonesActivos = 0;

    //GETTERS AND SETTERS

    public Entrenador(String nameuser) {
        NAMEUSER = setNAMEUSER(nameuser);
    }

    public Pokemon[] getPokemonList() {
        return pokemonsList;
    }

    public Entrenador setPokemonList(Pokemon[] pokemonList) {
        this.pokemonsList = pokemonList;
        return this;
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

    // METODOS PROPIOS DE ENTRENADOR

    public void tarjetaEntrenador () {
        System.out.println("TARJETA ENTRENADOR");
        System.out.println("NOMBRE : " + getNAMEUSER());
        System.out.println("ID N' " + getIdEntrenador());
        System.out.println("DINERO : " + getDinero());
    }

    // METODOS UTILIZANDO CLASE POKEMON

    public void showPokemons () {
        System.out.println("POKEMONES");
        for (int i=0 ; i<contPokemonesActivos ; i++ ) {
            System.out.print(pokemonsList[i].getNAME() + ": "); Tipos.showTipos(pokemonsList[i].getTIPOS());
            System.out.println();
        }
    }

    public void showPokemonAtaques (int num) {
        Pokemon pokemon = pokemonsList[num];
        System.out.print("pokemon " + num + " " +pokemon.getNAME() +  " ");
        System.out.println();
        pokemon.showAtaques();
        System.out.println();
    }

    public void addPokemon (Pokemon pokemon) {
        System.out.println("Enhorabuena has obtenido a "  + pokemon.getNAME());
        this.pokemonsList[contPokemonesActivos] = pokemon;
        contPokemonesActivos++;
    }



}
