package gyakorlo;

public class Italautomata {

    /*public enum termek {
        ital1, ital2, ital3;
    }*/
    public String termek;
    public String[] termekValasztek;

    public Italautomata(String termek) {
        //this.termek=termek;
        this(new String[]{termek});
    }

    public Italautomata() {
        this("nincs");
    }

    public Italautomata(String[] termekValasztek) {
        this.termekValasztek = termekValasztek;
        int i = (int) (Math.random() * termekValasztek.length);
        this.termek = termekValasztek[i];

    }

    public String valasz() {
        return termek;
    }
    
}
