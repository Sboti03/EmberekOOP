package hu.botond.emberekoop.ember;

import java.util.Calendar;

public class Ember {

    private String nev;
    private String szulDatum;
    private String szulHely;

    public Ember(String nev, String szulDatum, String szulHely) {
        this.nev = nev;
        this.szulDatum = szulDatum;
        this.szulHely = szulHely;
    }

    public int yearOfBirth() {
        String year = szulDatum.split("-")[0];
        return Integer.parseInt(year);
    }

    public int monthOfBirth() {
        String month = szulDatum.split("-")[1];
        return Integer.parseInt(month);
    }

    public int dayOfBirth() {
        String day = szulDatum.split("-")[2];
        return Integer.parseInt(day);
    }

    public int getAge() {
        return Calendar.getInstance().get(Calendar.YEAR) - yearOfBirth();
    }


    @Override
    public String toString() {
        return "Ember:\n" + "Név: " + nev + "\nSzületési hely: " + szulHely + "\nSzületési idő: " + szulDatum;
    }
}
