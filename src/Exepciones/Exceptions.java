package Exepciones;
import java.util.Scanner;

public class Exceptions {
    static Scanner scanner = new Scanner(System.in);


    public static String textosVacios (String texto) {
        while (texto.isEmpty()) {
            try {
                System.out.println("NOMBRE VACIO !!!!!");
                texto = scanner.nextLine();
            } catch (Exception e) {
                System.out.print("Dato invalido ingrese nuevamente");
            }
        }
        return texto;
    }

    public static int numerosNegativos (int num) {
        if (num<0) {
            throw new IllegalArgumentException("NUMERO NO PUEDE SER NEGATIVO");
        } else {
            return num;
        }
    }

    //CLASES Y TIPOS EXEPCIONES

    public static int tipoNoExsitente (int num) {
        if (num<0 && num>14) {
            throw new IllegalArgumentException("TIPO NO EXISTENTE");
        }
        return num;
    }

    public static int claseMovimientoNovalida (int num) {
        if (num!=0 && num!=1) {
            throw new IllegalArgumentException("CLASE DE MOVIMIENTO NO VALIDA");
        }
        return num;
    }

    public static int validarAccion () {
        boolean isValidate = true;
        int accionValida = 0;
        while (isValidate) {
           try {
               System.out.println("INGRESE ACCION");
               accionValida = scanner.nextInt();
               if (accionValida > 0 && accionValida < 5) {
                   isValidate = false;
               } else {
                   System.out.println("NO ESTA EN EL RANGO ESTABLECIDO");
               }
           } catch (Exception e) {
               System.out.println("CARACTER NO VALIDA INTENTE NUEVAMENTE");
               scanner.nextLine();
           }

        }
        return accionValida;
    }

    public static int validarIndicePokemonList(int contPokemonesActivos){
        int indice = 0;
        System.out.println(contPokemonesActivos);
        contPokemonesActivos--;
        while (true) {
            try {
                indice = scanner.nextInt();
                indice--;
                if (indice<=-1 || indice>contPokemonesActivos) {
                    System.out.println("INDICE INVALIDO INTENTE NUEVAMENTE RECUERDE QUE ES UN DATO DE 1 A " + (contPokemonesActivos+1) );
                } else  break;
            } catch (Exception e) {
                System.out.println("CARACTER INVALIDO");
                scanner.nextLine();
            }
        }
        return indice;
    }





} // class
