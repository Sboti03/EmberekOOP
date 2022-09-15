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
        try {
            File file = new File(path);
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()){
                String[] data = sc.nextLine().split("-");
                datas.add(new Ember(data[0], data[1], data[3]));
            }

        } catch (FileNotFoundException e) {

        }
        Ember[] szemelyek = new Ember[datas.size()];
        szemelyek = datas.toArray(szemelyek);
        return szemelyek;
    }
}
