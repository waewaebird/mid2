package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest1 {
    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";
        String[] temps = text.split(" ");

        Map<String, Integer> maps = new HashMap<>();
        for(String x : temps) {
            maps.put(x, maps.getOrDefault(x, 0) + 1);
        }

        System.out.println(maps);
    }
}
