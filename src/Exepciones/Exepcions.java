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







} // class
