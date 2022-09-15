package hu.botond.emberekoop.ember;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Emberek {
    private List<Ember> emberek;

    public  Emberek(Ember[] emberek) {
        this.emberek = Arrays.asList(emberek);
    }

    @Override
    public String toString() {

        String adatok = "";
        for (Ember e:emberek) {
            adatok += e + "\n";
        }

        return adatok;
    }
}
