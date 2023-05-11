package gyakorlo;

public class Aranyhal {

    private static final int kivansagokSzama = 3;
    private int kor;
    private String[] kivansagok;
    private String kifogta;

    public Aranyhal(String kifogta) {
        this.kifogta = kifogta;
        getKor();
    }

    public Aranyhal(String kifogta, int kor) {
        this.kor = kor;
        this.kifogta = kifogta;
    }

    public int getKor() {
        kor = 5;
        return kor;
    }

    public void setKifogta(String kifogta) {
        this.kifogta = kifogta;
    }

    public int kivansagokSzama(String kifogta) {
        return kivansagokSzama;
    }

    public String[] kikkelTalakozott() {
        String[] elozo = new String[3];
        return elozo;
    }

    public boolean kivansagotTeljesit(String kivansag) {
        return true;
    }

    @Override
    public String toString() {
        return "Aranyhal{" + "kivansagokSzama=" + kivansagokSzama + ", kor=" + kor + ", kivansagok=" + kivansagok + ", kifogta=" + kifogta + '}';
    }

}
