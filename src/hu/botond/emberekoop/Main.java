package hu.botond.emberekoop;

import hu.botond.emberekoop.ember.Ember;
import hu.botond.emberekoop.ember.Emberek;
import hu.botond.emberekoop.filemanagement.FileReader;

public class Main {
    public static void main(String[] args) {


        FileReader fr = new FileReader();
        Emberek szemelyek = new Emberek(fr.ReadInEmbers("emberek.txt"));
        System.out.println(szemelyek);
    }
}