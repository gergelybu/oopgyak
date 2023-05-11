
package gyakorlo;

public class Gyakorlo {

    public static void main(String[] args) {
        //Italautomata Automata = new Italautomata();
        //Vetites terem = new Vetites('a', 12, "ASD");
        //System.out.println(terem.toString());
        //Aranyhal aranyhal = new Aranyhal("Béla", 10);
        //System.out.println(aranyhal.toString());
        Auto auto = new Auto();
        System.out.println("Tankolt-e? " + auto.toString());
        auto.halad();
        System.out.println("Az autó haladt! " + auto.toString());
        auto.tankol();
        System.out.println("Az autó tankolt! " + auto.toString());
    }

}
