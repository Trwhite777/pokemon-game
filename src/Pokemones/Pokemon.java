package Pokemones;

import Ataques.Ataque;
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
    final private int[] tipos = new int[2];
    private ArrayList ataques = new ArrayList<Ataque>(4);

    // Constructor Principal 1Tipo unico
    protected Pokemon(String name, int vida , int ataque , int defensa ,int ataqueEspecial , int defenseEspecial , int velocidad , int ID , int tipo) {
        this.NAME = setNAME(name);
        this.setVida(vida);
        this.setAtaque(ataque);
        this.setAtaqueEspecial(ataqueEspecial);
        this.setDefensa(defensa);
        this.setDefenseEspecial(defenseEspecial);
        this.setVelocidad(velocidad);
        this.ID = setID(ID);
        this.tipos[0] = setTipo1(tipo);
        this.tipos[1] = 0;
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
        this.tipos[0] = setTipo1(tipo1);
        this.tipos[1] = setTipo2(tipo2);
    }

    public int[] getTipos() {
        return tipos;
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

    public int getTipo1() {
        return tipos[0];
    }

    public int setTipo1(int tipo1) {
        if (tipo1<0 || tipo1>12) {
            throw new IllegalArgumentException("Tipo No existente");
        } else {
            return tipo1;
        }
    }

    public int getTipo2() {
        return tipos[1];
    }

    public int setTipo2(int tipo2) {
        if (tipo2 <0 || tipo2 >12) {
            throw new IllegalArgumentException("Tipo No existente");
        } else {
            return tipo2;
        }
    }

    public ArrayList<Ataque> getAtaques() {
        return ataques;
    }

    public Pokemon setAtaques(ArrayList ataques) {
        this.ataques = ataques;
        return this;
    }


    // METODOS PROPIOS

    // print ID ME SIRVE PARA MOSTRAR LA ID EN UN FORMATO MAS FORMAS
    // EJEMPLO 1 --> 001
    public void printID (int ID) {
        System.out.printf("%0 4d" , ID);
        System.out.println();
    }

    public void  mostrarEstadisticas(Pokemon pokemon) {
        System.out.println("NOMBRE : " + pokemon.getNAME());
        System.out.print("ID : " ) ; pokemon.printID(pokemon.getId());
        System.out.println("ESTADISTICAS");
        System.out.println("ATAQUE : " + getAtaque());
        System.out.println("DEFENSA : " + getDefensa());
        System.out.println("ATAQUE ESPECIAL : " + getAtaqueEspecial() );
        System.out.println("DEFENSA ESPECIAL : " + getDefenseEspecial());
        System.out.println("VELOCIDAD : " + getVelocidad());
        Tipos.showTipos(tipos);

    }


    public void addAtaque(Ataque ataque) {
        this.ataques.add(ataque);
    }


    public  void showAtaques (ArrayList<Ataque> ataques) {
        for (Ataque ataque1 : ataques) {
            System.out.println(ataque1.getName());
        }
    }



} // class pokemon
