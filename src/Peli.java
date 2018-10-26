package fi.academy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Peli {

    public static void main(String[] args) {

        Scanner lukija = new Scanner(System.in);

        Kysymykset k1 = new Kysymykset("Onko nyt perjantai? (on / ei)", "on");
        Kysymykset k2 = new Kysymykset("Montako bittiä sisältyy short-primitiivityyppiin? (8 / 16 / 32)", "16");
        Kysymykset k3 = new Kysymykset("Periikö aliluokka yliluokan? (kyllä / ei)", "kyllä");
        Kysymykset k4 = new Kysymykset("Mikä näistä viittaa primitiivityyppiin? (String / float / toString)", "float");
        Kysymykset k5 = new Kysymykset("Mikä näistä ei ole looginen operaattori? (^ / | / ==)", "==");
        Kysymykset k6 = new Kysymykset("Mikä näistä ei ole Set-rajapinnan toteutus? (TreeSet / LinkedHashSet / WeakSet)", "WeakSet");
        Kysymykset k7 = new Kysymykset("Mikä näistä on tyyppimuunnos? ({String} / (String) / [String])", "(String)");
        Kysymykset k8 = new Kysymykset("Millä hyppylauseella palautetaan kontrolli toistolauseen alkuun? (return / break / continue)", "continue");
        Kysymykset k9 = new Kysymykset("VOiko taulukko olla metodin parametri? (kyllä / ei)", "kyllä");
        Kysymykset k10 = new Kysymykset("Näkyykö protected-attribuutti saman pakkauksen luokissa? (kyllä / ei)", "kyllä");

        List<Kysymykset> lista = new ArrayList<>();
        lista.add(k1);
        lista.add(k2);
        lista.add(k3);
        lista.add(k4);
        lista.add(k5);
        lista.add(k6);
        lista.add(k7);
        lista.add(k8);
        lista.add(k9);
        lista.add(k10);
        Collections.shuffle(lista);

        int oikeatVastaukset = 0;

        for(Kysymykset kysymys: lista){
            System.out.println(kysymys);
            String syote = lukija.nextLine();
            kysymys.tarkistus(syote);
            if(syote.equals(kysymys.getVastaus())) {
                oikeatVastaukset += 1;
            }
        }

        if(oikeatVastaukset == 10) {
            System.out.println("Loisto homma! Sait kaikki oikein.");
        } else if(oikeatVastaukset < 10 && oikeatVastaukset > 4) {
            System.out.println("Hyvä! Sait " + oikeatVastaukset + "/10 oikein.");
        } else {
            System.out.println("Opiskele lisää! Sait vain " + oikeatVastaukset + "/10 oikein.");
        }


    }

}
