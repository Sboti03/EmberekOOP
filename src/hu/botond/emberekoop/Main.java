package hu.botond.emberekoop;

import hu.botond.emberekoop.ember.Ember;
import hu.botond.emberekoop.ember.Emberek;
import hu.botond.emberekoop.filemanagement.FileReader;

public class Main {
    public static void main(String[] args) {
        Ember szemely = new Ember("Somogyi Botond", "2003. 09. 26.", "Budapest");
        System.out.println(szemely);
        System.out.println(szemely.getAge());


        FileReader fr = new FileReader();
        Emberek szemelyek = new Emberek(fr.ReadInEmbers("emberek.txt"));
    }
}