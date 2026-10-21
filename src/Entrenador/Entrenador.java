package Entrenador;
import Pokemones.Pokemon;
import Tipos.Tipos;

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
        System.out.print("pokemon " + (num+1) + " " +pokemon.getNAME() +  " ");
        System.out.println();
        pokemon.showAtaques();
        System.out.println();
    }

    public void addPokemon (Pokemon pokemonRecibido) {
        Pokemon pokemon = new Pokemon(pokemonRecibido);
        if (contPokemonesActivos==6) {
            System.out.println("NO PUEDES TENER MAS POKEMONES ");
        } else {
            System.out.println("Enhorabuena has obtenido a "  + pokemon.getNAME());
            this.pokemonsList[contPokemonesActivos] = pokemon;
            contPokemonesActivos++;
        }
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

    public void iniciaCombate () {
        //validar si el primer pokemon esta debilitado
        changePokemonDebilitado();
    }

    public void pokemonIsDebilitado () {
        validarPokemonesEstanDebilidatos();
        if (pokemonsList[0].getIsDebilitado()) {
            System.out.println(pokemonsList[0].getNAME()  + "esta debilidato");

        }
    }


    public void validarPokemonesEstanDebilidatos (){
        for (Pokemon pokemon : pokemonsList) {
            if (pokemon.getIsDebilitado())  {
                break;
            } else {
                System.out.println("Todos los pokemones han sido debilitados has perdido.....");
            }
        }
    }

    // cambio opcional que puede hacer en cualquier momento
    public void changePokemonList () {
        System.out.println("CUAL POKEMON QUIERES CAMBIAR DE POSICION???");
        showPokemons();
        System.out.println("INGRESA EL INDICE DEL POKEMON");
        int indicePokemon = validarIndicePokemonList(contPokemonesActivos);
        System.out.println("INGRESA A QUE POSICIÓN QUIERES QUE ESTE");
        byte indiceDeCambio = (byte) validarIndicePokemonList(contPokemonesActivos);
        cambioPokemonLogica(indiceDeCambio,indicePokemon);
    }

    //cambio obligatorio cuando su pokemon es debilitado

    public void changePokemonDebilitado () {
        while (true) {
            System.out.println("ingresa el indice del pokemon que pasara a luchar");
            showPokemons();
            // indice del pokemon es el que cedera la posicion al pokemon que indique el jugador con el indice
            int indicePokemon = 0;
            // indice de cambio sera el pokemon que intercambiara su posicion con el otro pokemon
            int indiceDeCambio = validarIndicePokemonList(contPokemonesActivos);
            if (pokemonsList[indiceDeCambio].getIsDebilitado()) {
                System.out.println("ese pokemon también esta debilitado");
            } else {
                System.out.println("Yo te elijo " + pokemonsList[indiceDeCambio].getNAME());
                cambioPokemonLogica(indiceDeCambio,indicePokemon);
                break;
            }
        }
    }


    public void cambioPokemonLogica (int indiceDeCambio , int indicePokemon) {
        Pokemon pokemonTemporal = pokemonsList[indiceDeCambio];
        pokemonsList[indiceDeCambio] = pokemonsList[indicePokemon];
        pokemonsList[indicePokemon] = pokemonTemporal;
    }








}
