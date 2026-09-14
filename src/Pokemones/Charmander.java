package Pokemones;

public class Charmander extends  Pokemon{

    public Charmander(String name, int vida, int ataque, int defensa, int ataqueEspecial, int defenseEspecial, int velocidad, int ID, int tipo) {
        super(name, vida, ataque, defensa, ataqueEspecial, defenseEspecial, velocidad, ID, tipo);
    }

    protected Charmander(String name, int vida, int ataque, int defensa, int ataqueEspecial, int defenseEspecial, int velocidad, int ID, int tipo1, int tipo2) {
        super(name, vida, ataque, defensa, ataqueEspecial, defenseEspecial, velocidad, ID, tipo1, tipo2);
    }



}
