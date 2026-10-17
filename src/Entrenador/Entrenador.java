package Entrenador;
import Exepciones.*;
import Pokemones.Pokemon;
import Tipos.Tipos;

import java.util.Scanner;

public class Entrenador {

    // ATRIBUTOS

    private Pokemon[]  pokemonsList = new Pokemon[4];
    final private String NAMEUSER;
    final private int IDENTRENADOR = 6531;
    private int Dinero = 0;
    private int contPokemonesActivos = 0;
    private Mochila mochila = new Mochila();

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
        return  Exceptions.textosVacios(nameUser);
    }

    public int getIdEntrenador() {
        return IDENTRENADOR;
    }

    public Mochila getMochila() {
        return mochila;
    }

    public void setMochila(Mochila mochila) {
        this.mochila = mochila;
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

    public void changePokemonList () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("CUAL POKEMON QUIERES CAMBIAR DE POSICION???");
        showPokemons();
        System.out.println("INGRESA EL INDICE DEL POKEMON");
        int indicePokemon = Exceptions.validarIndicePokemonList();
        System.out.println("INGRESA A QUE POSICIÓN QUIERES QUE ESTE");
        byte indiceDeCambio = scanner.nextByte();
        if (indiceDeCambio>(contPokemonesActivos+1));
    }





}
