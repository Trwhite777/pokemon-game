package Entrenador;

import Entrenador.Objetos.Objetos;

import java.util.ArrayList;
import java.util.Objects;

public class Mochila {
    ArrayList<Objetos> mochila = new ArrayList<Objetos>(0);
    int cantidadObjetos = 0;

   public void  mostrarMochila() {
       for (Objetos objeto : mochila) {
           System.out.println(objeto);
       }
   }


}
