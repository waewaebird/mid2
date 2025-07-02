package collection.set.test;

import java.util.HashSet;
import java.util.Set;

public class UniqueNamesTest1 {
    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};

        Set<Integer> s = new HashSet<>();

        for(Integer x : inputArr) {
            s.add(x);
        }

        for(Integer x : s) {
            System.out.println(x);
        }

    }
}
