package Pokemones;

import Interfaz.Accions;

public class Bulbasur extends Pokemon implements Accions {

    public Bulbasur(String name, int vida, int ataque, int defensa, int ataqueEspecial, int defenseEspecial, int velocidad, int ID, int tipo) {
        super(name, vida, ataque, defensa, ataqueEspecial, defenseEspecial, velocidad, ID, tipo);
    }

    public Bulbasur(String name, int vida, int ataque, int defensa, int ataqueEspecial, int defenseEspecial, int velocidad, int ID, int tipo1, int tipo2) {
        super(name, vida, ataque, defensa, ataqueEspecial, defenseEspecial, velocidad, ID, tipo1, tipo2);
    }
}
