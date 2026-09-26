package Tipos;
import Pokemones.Pokemon;

public class Tipos {

    static final private String[] tiposArray = {"Normal", "Fuego" , "Agua" , "Electrico" , "Planta" , "Hielo" , "Lucha" , "Veneno" , "Tierra" , "Volador" , "Psiquico" , "Insecto" , "Roca" , "Fantasma" , "Dragon" , ""};

    // PINTAR TIPOS

    public static String getTiposArray(int tipo) {
        return tiposArray[tipo];
    }

    public static void  showTipos(int[]tipo) {
        if (tipo[1]==15) {
            System.out.print(getTiposArray(tipo[0]));
        } else {
            System.out.print(getTiposArray(tipo[0]) + "/" + getTiposArray(tipo[1]));
        }

    }//showTipos

    //CALCULAR LA EFECTIVIDAD

    public static double calculator_Efectividad (int tipoMovmiento , int[] tiposDefensorPokemonArrays) {
        // defino la efectividad total como el producto de efectividad 1 y 2
        double efectividadTotal = 1;
        double[][] tablaTipos = {
                {1,1,1,1,1,1,1,1,1,1,1,1,0.5,0,1}, //0 normal
                {1,0.5,0.5,1,2,2,1,1,1,1,1,2,0.5,1,0.5}  , //1 fuego
                {1,2,0.5,1,0.5,1,1,1,2,1,1,1,2,1,0.5} , //2 Agua
                {1,1,2,0.5,0.5,1,1,1,0,2,1,1,1,1,0.5} , //3 Eléctrico
                {1,0.5,2,1,0.5,1,1,0.5,2,0.5,1,0.5,2,1,0.5} , //4 planta
                {1,1,0.5,1,2,0.5,1,1,2,2,1,1,1,1,2} , //5 Hielo
                {2,1,1,1,1,2,1,0.5,1,0.5,0.5,0.5,2,0,1} , //6 Lucha
                {1,1,1,1,2,1,1,0.5,0.5,1,1,2,0.5,0.5,1} , //7 veneno
                {1,2,1,2,0.5,1,1,2,1,0,1,0.5,2,1,1} ,  //8 Tierra
                {1,1,1,0.5,2,1,2,1,1,1,1,2,0.5,1,1} , //9 volador
                {1,1,1,1,1,1,2,2,1,1,0.5,1,1,1,1} , //10 Psíquico
                {1,0.5,1,1,2,1,0.5,2,1,0.5,2,1,1,0.5,1} , //11 insecto
                {1,2,1,1,1,2,0.5,1,0.5,2,1,2,1,1,1}, //12 roca
                {0,1,1,1,1,1,1,1,1,1,2,1,1,2,1}, //13 fantasma
                {1,1,1,1,1,1,1,1,1,1,1,1,1,1,2} //14 Dragon
        } ;
        if (tiposDefensorPokemonArrays[1]!=15) {
            efectividadTotal *= tablaTipos[tipoMovmiento][tiposDefensorPokemonArrays[0]];
            efectividadTotal *= tablaTipos[tipoMovmiento][tiposDefensorPokemonArrays[1]];
        } else {
            efectividadTotal *= tablaTipos[tipoMovmiento][tiposDefensorPokemonArrays[0]];
        }

        //Ataque \ Tipo del Oponente defensor

        if (efectividadTotal==0.25) {
            System.out.println("MUY POCO EFECTIVO");
        } else if (efectividadTotal==0.5) {
            System.out.println("POCO EFECTIVO");
        } else if (efectividadTotal==2) {
            System.out.println("EFECTIVO");
        } else if (efectividadTotal==4) {
            System.out.println("MUY EFECTIVO");
        } else if (efectividadTotal==0) {
            System.out.println("IMMUNE");
        }
        return efectividadTotal;


        // tipo pokemon---> tipoMovimiento re
    }
}
