package Entrenador;
import Pokemones.Pokemon;
import Tipos.Tipos;

import java.util.Scanner;

import static Exepciones.Exceptions.*;

public class Entrenador {

    // ATRIBUTOS

    private Pokemon[]  pokemonsList = new Pokemon[6];
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
        return  textosVacios(nameUser);
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
            System.out.print((i+1) + " " +pokemonsList[i].getNAME() + ": " + Tipos.showTipos(pokemonsList[i].getTIPOS()));
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
        if (contPokemonesActivos==6) {
            System.out.println("NO PUEDES TENER MAS POKEMONES ");
        } else {
            System.out.println("Enhorabuena has obtenido a "  + pokemon.getNAME());
            this.pokemonsList[contPokemonesActivos] = pokemon;
            contPokemonesActivos++;
        }
    }

    public void changePokemonList () {
        System.out.println("CUAL POKEMON QUIERES CAMBIAR DE POSICION???");
        showPokemons();
        System.out.println("INGRESA EL INDICE DEL POKEMON");
        int indicePokemon = validarIndicePokemonList(contPokemonesActivos);
        System.out.println("INGRESA A QUE POSICIÓN QUIERES QUE ESTE");
        byte indiceDeCambio = (byte) validarIndicePokemonList(contPokemonesActivos);
        Pokemon pokemonTemporal = pokemonsList[indiceDeCambio];
        pokemonsList[indiceDeCambio] = pokemonsList[indicePokemon];
        pokemonsList[indicePokemon] = pokemonTemporal;


    }

    public void atacarPokemon(Pokemon pokemonDefensor) {
        pokemonsList[0].atacarPokemon(0,pokemonDefensor);
    }


    public void deletePokemon () {
        System.out.println("Que pokemon deseas liberar???");
        showPokemons();
        System.out.println("ingresa el indice");
        int indicePokemonLiberado = validarIndicePokemonList(contPokemonesActivos);

        pokemonsList[indicePokemonLiberado] = null;
        // para que no encontrar valores nulos entre el array por ejemplo
        // si eliminan al pokemon en la posicion 4 y hay un pokemon en la posicion 5
        // no quede un valor nulo en el medio
        if (pokemonsList[5]==null || pokemonsList[indicePokemonLiberado+1]==null) {
            this.contPokemonesActivos--;
            System.out.println("no habia pokemon siguiente");
        } else {
            for (int i=indicePokemonLiberado; i < contPokemonesActivos;i++) {
                if (i==5) break;
                pokemonsList[i]= pokemonsList[i+1];
            }
            this.contPokemonesActivos--;
        }
    }





}
