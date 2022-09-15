package hu.botond.emberekoop.filemanagement;

import hu.botond.emberekoop.ember.Ember;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReader {

    public Ember[] ReadInEmbers(String path) {
        List<Ember> datas = new ArrayList<Ember>();

            File file = new File(path);
        Scanner sc = null;
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        while (sc.hasNextLine()){
                String[] data = sc.nextLine().split(";");
                datas.add(new Ember(data[0], data[1], data[2]));
            }


        Ember[] szemelyek = new Ember[datas.size()];
        szemelyek = datas.toArray(szemelyek);
        return szemelyek;
    }
}
