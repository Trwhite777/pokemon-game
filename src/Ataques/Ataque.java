package Ataques;

import Exepciones.Exepcions;
import Tipos.Tipos;

public class Ataque {

    final private String name;
    final private String descripcion;
    final private int tipo;
    final private int clase;
    final private int potencia;
    final private int precision;
    final private int pp;


    public Ataque(String name, String descripcion, int tipo, int clase, int potencia, int precision, int pp) {
        this.name = Exepcions.textosVacios(name);
        this.descripcion = Exepcions.textosVacios(descripcion);
        this.tipo = Exepcions.tipoNoExsitente(tipo);
        this.clase = Exepcions.claseMovimientoNovalida(clase);
        this.potencia = Exepcions.numerosNegativos(potencia);
        this.precision = Exepcions.numerosNegativos(precision);
        this.pp = Exepcions.numerosNegativos(pp);

    }


    public String getName() {
        return name;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getTipo() {
        return tipo;
    }

    public int getClase() {
        return clase;
    }

    public int getPotencia() {
        return potencia;
    }

    public int getPrecision() {
        return precision;
    }

    public int getPp() {
        return pp;
    }

    public void showClase (int clase) {
        if (clase==0) {
            System.out.println("CLASE : FISICO");
        } else {
            System.out.println("CLASE : ESPECIAL");
        }
    }

    public void showMov () {
        System.out.println( "Nombre :"+ getName());
        System.out.println("Descripcion " + getDescripcion());
        System.out.print("TIPO : ");
        System.out.println(Tipos.getTiposArray(getTipo()));
        showClase(getClase());
        System.out.println("Potencia :" +getPotencia());
        System.out.println("Precision : " + getPrecision());
        System.out.println("PP : " + getPp());
    }





}
