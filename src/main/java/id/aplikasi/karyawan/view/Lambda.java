package id.aplikasi.karyawan.view;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Lambda {
    public static void main(String[] args) {
        Consumer<String> nama = s -> System.out.println("The name is " + s);
        nama.accept("Jeff");

        BiConsumer<String, Boolean> factCheck = (s, b) -> System.out.println(s + " is " + b);
        factCheck.accept("Zinorge", true);

        List<String> monsterNames = new ArrayList<>();
        monsterNames.add("Zinorge");
        monsterNames.add("Rajang");
        monsterNames.add("Rathalos");

        monsterNames.forEach(name -> System.out.println("The " + name));

        monsterNames.forEach(name -> {

            System.out.println("print=" + name);
        });

    }


}
