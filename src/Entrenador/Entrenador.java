package Entrenador;
import Exepciones.Exepcions;
import Pokemones.Pokemon;
import Tipos.Tipos;
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
        return  Exepcions.textosVacios(nameUser);
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

    public void  menuAccionsMain() {
        System.out.println("==========================");
        System.out.println("Menu Accions");
        System.out.println("1 : HABILIDADES");
        System.out.println("2 : MOCHILA");
        System.out.println("3 : POKEMON");
        System.out.println("4 : HUIR");
        System.out.println("==========================");
    }





}
