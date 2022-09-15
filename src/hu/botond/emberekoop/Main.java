package hu.botond.emberekoop;

import hu.botond.emberekoop.ember.Emberek;
import hu.botond.emberekoop.filemanagement.FileReader;

public class Main {
    public static void main(String[] args) {


        FileReader fr = new FileReader();
        Emberek szemelyek = new Emberek(fr.ReadInEmbers("C:\\Petrik\\AMAF_Java\\EmberekOOP\\src\\hu\\botond\\emberekoop\\emberek.txt"));

        System.out.println(szemelyek);
    }
}