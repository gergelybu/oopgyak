package gyakorlo;

public class Auto {

    /*mutasd be, ha egy autó halad, akkor elfogy belőle a benzin*/
 /*csak akkor tud haladni, ha be van indítva a motor, benzin nélkül lehet indítani,
    de kikapcsolt motornál lehet csak tankolni*/
 /*15% eséllyel defektet kap, kerék csere, 1db pótkerék*/
    private boolean benzin = true;
    private boolean motor;
    private int potkerek = 1;

    public void halad() {
        if (benzin) {
            this.benzin = false;
        }
        boolean defekt = false;
        if (defekt) {
            kerekCsere();
        }
    }

    public Auto() {
        this(true);
    }

    public Auto(boolean benzin) {
        this.benzin = benzin;
    }

    public void tankol() {
        this.benzin = true;
    }

    public int kerekCsere() {
        if (potkerek > 0) {
            potkerek -= 1;
            System.out.println("Elhasználta a pótkereket!");
        } else {
            System.out.println("Nincs több pótkerék!");
        }
        return potkerek;
    }

    @Override
    public String toString() {
        return "Auto{" + "benzin=" + benzin + '}';
    }

}
