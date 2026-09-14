import Entrenador.Npc;
import Pokemones.Pokemon;

public class Combat {

    Pokemon pokemon;
    boolean isCombatActive = false;

    public void combat () {

    }

    public boolean GetisCombatActive() {
        return isCombatActive;
    }

    public void setCombatActive(boolean combatActive) {
        isCombatActive = combatActive;
    }

    public void  menuAccionsMain () {
        System.out.println("==========================");
        System.out.println("Menu Accions");
        System.out.println("1 : Info Combat");
        System.out.println("2 : Defenderse");
        System.out.println("3 : Habilidades");
        System.out.println("4 : Huir");
        System.out.println("==========================");
    }

    public void  menuAccionsAttack () {
        System.out.println("=====================");
        System.out.println("Habilidades");
        System.out.println("1 : ATACAR");
        System.out.println("2 : CONCENTRARSE");
        System.out.println("3 : CURARSE");
        System.out.println("4 : ESPECIAL");
        System.out.println("5 : VOLVER");
        System.out.println("=====================");
    }

    public void menuAccionInfo () {
        System.out.println("==========================");
        System.out.println("INFO");
        System.out.println("1 : VER STAST");
        System.out.println("2 : VER STAST ENEMIGO");
        System.out.println("3 : VOLVER");
        System.out.println("==========================");
    }

    public void accionInfo (byte Accion, Pokemon pokemon1, Npc npc1) {
        switch (Accion) {
            case 1:
                break;
            case 2:
                break;
        }
    }





}
