package gyakorlo;

public class Vetites {

    public char terem;
    public int szekek;
    public String film;

    public Vetites(char terem) {
        this(terem, 100, "nincs");
    }

    public Vetites(char terem, int szekek) {
        this(terem, szekek, "nincs");
    }

    public Vetites(char terem, String film) {
        this(terem, 100, film);
    }

    public Vetites(char terem, int szekek, String film) {
        this.terem = terem;
        this.szekek = 100 + szekek;
        this.film = film;
    }

    public void setTerem(char terem) {
        this.terem = terem;
    }

    public void setFilm(String film) {
        this.film = film;
    }

    public void setPotszek(int szekek) {
        this.szekek = szekek;
    }

    @Override
    public String toString() {
        return "Vetites{" + "terem = " + terem + ", szekek = " + szekek + ", film = " + film + '}';
    }

}
