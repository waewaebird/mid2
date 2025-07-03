package collection.map.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ItemPriceTest {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("사과", 500);
        map.put("바나나", 500);
        map.put("망고", 1000);
        map.put("딸기", 1000);

        List<String> answers = new ArrayList<>();
        for(Map.Entry<String, Integer> temp : map.entrySet()) {
            if(temp.getValue() == 1000) {
                answers.add(temp.getKey());
            }
        }

        System.out.println(answers);
    }
}
