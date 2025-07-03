package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class ArrayToMapTest {
    public static void main(String[] args) {
        String[][] productArr = {{"Java", "10000"}, {"Spring", "20000"}, {"JPA", "30000"}};

        Map<String, Integer> maps = new HashMap<>();
        for(String[] temp : productArr) {
            maps.put(temp[0], Integer.parseInt(temp[1]));
        }

        for(String key : maps.keySet()) {
            System.out.println("제품 : " + key + ", 가격 : " + maps.get(key));
        }

    }
}
