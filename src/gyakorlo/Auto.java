package gyakorlo;
  

public class Auto {
    
    /*mutasd be, ha egy autó halad, akkor elfogy belőle a benzin*/
    /*csak akkor tud haladni, ha be van indítva a motor, benzin nélkül lehet indítani,
    de kikapcsolt motornál lehet csak tankolni*/
    /*15% eséllyel defektet kap, kerék csere, 1db pótkerék*/
    
    private boolean benzin;
    private boolean motor;
    private int pótkerék = 1;

    public void halad() {
        this.benzin = false;
    }
    
    public void tankol() {
        this.benzin = true;
    }

    @Override
    public String toString() {
        return "Auto{" + "benzin=" + benzin + '}';
    }
    
}
