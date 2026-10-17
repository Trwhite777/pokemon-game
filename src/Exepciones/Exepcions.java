package Exepciones;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exepcions extends RuntimeException{


    public static String textosVacios (String texto) {
        Scanner scanner = new Scanner(System.in);
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
        if (num<0 && num>12) {
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
        Scanner scanner = new Scanner(System.in);
        boolean isValidate = true;
        int accionValida;
        while (isValidate) {
           try {
               System.out.println("INGRESE ACCION");
               accionValida = scanner.nextInt();
               if (accionValida > 0 && accionValida < 5) {
                   isValidate = false;
                   return accionValida;
               } else {
                   System.out.println("NO ENTA EN EL RANGO ESTABLECIDO");
               }
           } catch (Exception e) {
               System.out.println("CARACTER NO VALIDA INTENTE NUEVAMENTE");
               scanner.nextLine();
           }

        }

    }





} // class
