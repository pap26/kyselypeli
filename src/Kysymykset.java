package fi.academy;

public class Kysymykset {

    private String kysymys;
    private String vastaus;
    private String syote;

    public Kysymykset(String kysymys, String vastaus) {
        this.kysymys = kysymys;
        this.vastaus = vastaus;
    }

    public String getKysymys() {
        return kysymys;
    }

    public void setKysymys(String kysymys) {
        this.kysymys = kysymys;
    }

    public String getVastaus() {
        return vastaus;
    }

    public void setVastaus(String vastaus) {
        this.vastaus = vastaus;
    }

    public String getSyote() {
        return syote;
    }

    public void setSyote() {
        this.syote = syote;
    }


    @Override
    public String toString() {
        return kysymys;
    }

    public void tarkistus(String syote) {
        if (syote.equals(getVastaus())) {
        System.out.println("OIKEIN");
        } else {
        System.out.println("VÄÄRIN");
        }
    }
}
