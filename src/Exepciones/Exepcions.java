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





} // class
