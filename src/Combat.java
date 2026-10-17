import Entrenador.*;
import Pokemones.Pokemon;

import java.util.Scanner;

public class Combat {

    Npc npcRival;
    Entrenador entrenadorProtagonista;
    boolean isCombatActive;


    public Combat (Npc npcRival , Entrenador entrenadorProtagonista ) {
        this.npcRival = npcRival;
        this.entrenadorProtagonista = entrenadorProtagonista;
        this.isCombatActive = true;
        inicioCombate();
    }


    public Npc  getNpcRival() {
        return npcRival;
    }

    public Entrenador getEntrenadorProtagonista() {
        return entrenadorProtagonista;
    }

    public boolean getCombatActive() {
        return isCombatActive;
    }

    public void setCombatActive(boolean combatActive) {
        this.isCombatActive = combatActive;
    }

    public void  menuAccionsMain () {
        System.out.println("==========================");
        System.out.println("Menu Accions");
        System.out.println("1 : ATACAR");
        System.out.println("2 : MOCHILA");
        System.out.println("3 : POKEMON");
        System.out.println("4 : HUIR");
        System.out.println("==========================");
    }


    public void accionInfo () {
        menuAccionsMain();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione Accion");
        int accion = scanner.nextByte();
        switch (accion) {
            case 1:
                break;
            case 2:
                entrenadorProtagonista.getMochila().mostrarMochila();
                break;
            case 3:
                entrenadorProtagonista.showPokemons();
                break;
            case 4:
                 System.out.println("NO PUEDES ESCAPAR DE UN COMBATE POKEMON");
                 break;
            default:
        }
    }

    public void inicioCombate() {
        System.out.println("EMPIEZA EL COMBATE");
        npcRival.presentacion_Npc();
        while (getCombatActive()) {
            System.out.println("Hello");
        }

    }


    //LEER ACCIONES






}
