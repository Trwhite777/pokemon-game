package Pokemones;

import Ataques.Ataque;
import Exepciones.Exepcions;
import Tipos.Tipos;

import java.util.ArrayList;


abstract public class Pokemon {
    final private String NAME;
    private int vida;
    private int ataque;
    private int ataqueEspecial;
    private int defensa;
    private int defenseEspecial;
    private int velocidad;
    final private int ID;
    final private int[] TIPOS = new int[2];
    private Ataque[] ataques = new Ataque[4];
    private int contadorAtaques = 0;
    final private int nivel= 10;

    // Constructor Principal 1 Tipo
    protected Pokemon(String name, int vida , int ataque , int defensa ,int ataqueEspecial , int defenseEspecial , int velocidad , int ID , int tipo) {
        this.NAME = setNAME(name);
        this.setVida(vida);
        this.setAtaque(ataque);
        this.setAtaqueEspecial(ataqueEspecial);
        this.setDefensa(defensa);
        this.setDefenseEspecial(defenseEspecial);
        this.setVelocidad(velocidad);
        this.ID = setID(ID);
        this.TIPOS[0] = setTipo1(tipo);
        this.TIPOS[1] = 15;
    }

    // Constructor 2 tipos asignados
    protected Pokemon(String name, int vida , int ataque , int defensa ,int ataqueEspecial , int defenseEspecial , int velocidad , int ID , int tipo1 ,int tipo2) {
        this.NAME = setNAME(name);
        this.setVida(vida);
        this.setAtaque(ataque);
        this.setAtaqueEspecial(ataqueEspecial);
        this.setDefensa(defensa);
        this.setDefenseEspecial(defenseEspecial);
        this.setVelocidad(velocidad);
        this.ID = setID(ID);
        this.TIPOS[0] = setTipo1(tipo1);
        this.TIPOS[1] = setTipo2(tipo2);
    }



    // GETTER AND SETTERS


    public String getNAME() {
        return NAME;
    }

    public static String setNAME(String NAME) {
        return Exepcions.textosVacios(NAME);
    }

    public double getVida() {
        return vida;
    }

    public void setVida(int vida) {
       if (vida<=0) {
           throw new IllegalArgumentException ("VIDA NO PUDE SER NEGATIVA");
       }
            this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        if (ataque<=0) {
           throw new  IllegalArgumentException("ATAQUE NO PUEDE SER MENOR O IGUAL A CERO");
        } else {
            this.ataque = ataque;
        }
    }

    public int getAtaqueEspecial() {
        return ataqueEspecial;
    }

    public void setAtaqueEspecial(int ataqueEspecial) {
        if (ataqueEspecial<=0) {
            throw new  IllegalArgumentException("ATAQUE ESPECIAL NO PUEDE SER MENOR O IGUAL A CERO");
        } else {
            this.ataqueEspecial = ataqueEspecial;
        }
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        if (defensa<=0) {
            throw new  IllegalArgumentException("DEFENSA NO PUEDE SER MENOR O IGUAL A CERO");
        } else {
            this.defensa = defensa;
        }
    }

    public int getDefenseEspecial() {
        return defenseEspecial;
    }

    public void setDefenseEspecial(int defenseEspecial) {
        if (defenseEspecial<=0) {
            throw new  IllegalArgumentException("DEFENSA ESPECIAL NO PUEDE SER MENOR O IGUAL A CERO");
        } else {
            this.defenseEspecial = defenseEspecial;
        }
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        if (velocidad<=0) {
            throw new  IllegalArgumentException("VELOCIDAD NO PUEDE SER MENOR O IGUAL A CERO");
        } else {
            this.velocidad = velocidad;
        }
    }

    public int getId() {
        return ID;
    }

    public int setID (int ID) {
        int cont = 1;
        cont++;
        return ID;
    }

    public int[] getTIPOS() {
        return TIPOS;
    }

    public int getTipo1() {
        return TIPOS[0];
    }

    public int setTipo1(int tipo1) {
        if (tipo1<0 || tipo1>12) {
            throw new IllegalArgumentException("Tipo No existente");
        } else {
            return tipo1;
        }
    }

    public int getTipo2() {
        return TIPOS[1];
    }

    public int setTipo2(int tipo2) {
        if (tipo2 <0 || tipo2 >12) {
            throw new IllegalArgumentException("Tipo No existente");
        } else {
            return tipo2;
        }
    }

    // GETTERS Y SETTER CON LA CLASE ATAQUE

    public Ataque[] getAtaques() {
        return ataques;
    }

    public Ataque getAtaqueSelect(int numeroAtaque) {
        return ataques[numeroAtaque];
    }

    public void addAtaque(Ataque ataque) {
        if (contadorAtaques<ataques.length) {
            ataques[contadorAtaques] = ataque;
            contadorAtaques++;
        } else {
            ataquesLlenos();
        }
    }

    public void ataquesLlenos () {
        System.out.println("TU POKEMON NO PUEDE APRENDER MAS ATAQUES");
        for (int i = 0 ; i<contadorAtaques ; i++) {
            System.out.println(this.ataques[contadorAtaques].getName() + i);
        }
        System.out.println("CUAL ATAQUE QUIERES REMPLAZAR?");
    }

    // METODOS PROPIOS PINTAR DATOS

    // print ID ME SIRVE PARA MOSTRAR LA ID EN UN FORMATO MAS FORMAS
    // EJEMPLO 1 --> 001

    public void printID () {
        System.out.printf("%0 4d" , this.ID);
        System.out.println();
    }

    public void  mostrarEstadisticas() {
        System.out.println("NOMBRE : " + getNAME());
        System.out.print("ID : " ) ; printID();
        System.out.println("ESTADISTICAS");
        System.out.println("ATAQUE : " + getAtaque());
        System.out.println("DEFENSA : " + getDefensa());
        System.out.println("ATAQUE ESPECIAL : " + getAtaqueEspecial() );
        System.out.println("DEFENSA ESPECIAL : " + getDefenseEspecial());
        System.out.println("VELOCIDAD : " + getVelocidad());
        Tipos.showTipos(TIPOS);

    }

    public  void showAtaques () {
        for (int i = 0 ; i<contadorAtaques ; i++) {
            System.out.println(this.ataques[i].getName() + i);
        }
    }

    // METODOS UTILIZANDO LA CLASE ATAQUE

    public void atacarPokemon (int numeroAtaque , Pokemon pokemonDefensor){

        Ataque ataque = this.getAtaqueSelect(numeroAtaque);
        System.out.println(this.getNAME() + " USO " + ataque.getName() + " Contra "  + pokemonDefensor.getNAME()  );
        // una variable que como dice su me servira para variar el daño generado no se siempre el mismo
        double variacion = Math.random()*(1 - 0.85) + 0.85;
        double stab;
        this.getAtaques();
        //STAB (Same Type Attack Bonus): Multiplicador de 1.5 si el tipo del movimiento coincide con uno de los tipos del Pokémon que lo usa. Si no coincide, es 1.0.
        if (ataque.getTipo()==this.getTipo1() || ataque.getTipo()==this.getTipo2()) {
            stab = 1.5;
        } else {
            stab = 1.0;
        }
        double efectividad = Tipos.calculator_Efectividad(ataque.getTipo() , pokemonDefensor.getTIPOS() );
        double subdano = 1;
        double danoTotal;
        if (ataque.getClase()==0) {
            // ataque especial
            subdano =  ((((2.0 * 10) / 5.0 + 2.0) * ataque.getPotencia() * ((double) this.getAtaque() / pokemonDefensor.getDefensa())) / 50.0) + 2.0;
            danoTotal =  subdano * (stab * efectividad * variacion);
        } else {
            double danioBase = ((((2.0 * nivel) / 5.0 + 2.0) * ataque.getPotencia() * ((double) this.getAtaqueEspecial() / pokemonDefensor.getDefenseEspecial())) / 50.0) + 2.0;
            danoTotal =  (   subdano * (stab * efectividad * variacion));
        }
        System.out.println(danoTotal);

    }


} // class pokemon
