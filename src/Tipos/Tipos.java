package Tipos;
import Pokemones.Pokemon;

public class Tipos {
    Pokemon pokemon;


    public static void calcularEfectividad (Pokemon pokemon) {
    }


    public static void   showTipos(int[]tipo) {
        if (tipo[1]  ==0) {
            Tipos.searchTipos(tipo[0]);
        } else {
            Tipos.searchTipos(tipo[0]);
            System.out.print("/");
            Tipos.searchTipos(tipo[1]);
        }

    }//showTipos

    public static void searchTipos(int tip) {
        switch (tip) {
            case 1:
                System.out.print("Normal");
                break;
            case 2:
                System.out.print("Fuego");
                break;
            case 3:
                System.out.print("Agua");
                break;
            case 4:
                System.out.print("Electrico");
                break;
            case 5:
                System.out.print("Planta");
                break;
            case 6:
                System.out.print("Hielo");
                break;
            case 7:
                System.out.print("Lucha");
                break;
            case 8:
                System.out.print("Veneno");
                break;
            case 9:
                System.out.print("Tierra");
                break;
            case 10:
                System.out.print("Volador");
                break;
            case 11:
                System.out.print("Psiquico");
            break;
            case 12:
                System.out.print("Insecto");
            break;
            case 13:
                System.out.print("Roca");
                break;
            case 14:
                System.out.print("Fantasma");
                break;
            case 15:
                System.out.print("Dragon");
                break;
            default:
                System.out.print("null");

        }
    }





}
