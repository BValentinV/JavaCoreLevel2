package lesson4.part1;

import java.util.*;

public class MainClass {
    public static void main(String[] args){
        List<String> words = Arrays.asList(
                "Andrey", "Stanislav", "Mihail", "Sergey", "Petr",
                "Aleksandr", "Valentin", "Anton", "Sergey", "Petr",
                "Stanislav", "Mihail", "Sergey", "Valentin", "Valentin",
                "Mihail", "Sergey", "Valentin", "Valentin", "Sergey"
        );

        Set<String> unique = new HashSet<String>(words);

        System.out.println("Первоначальный массив");
        System.out.println(words.toString());

        System.out.println("Уникальные слова");
        Set<String> uniques = new LinkedHashSet<>();
        Set<String> dups = new HashSet<>();
        for (String word : words) {
            if (!uniques.add(word)) {
                dups.add(word);
            }
        }
        uniques.removeAll(dups);
        System.out.println(uniques);

        System.out.println("Частота встречаемости слов");
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(words, key));
        }
    }
}
