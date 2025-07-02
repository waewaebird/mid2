package collection.set.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetOperationsTest {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(List.of(1,2,3,4,5));
        Set<Integer> set2 = new HashSet<>(List.of(3,4,5,6,7));

        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("합집합 : " + union);
        
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("교집합 : " + intersection);

        Set<Integer> difference = new HashSet<>(set1);
        difference.remove(set2);
        System.out.println("차집합 : " + difference);

        System.out.println();

        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        Set<Integer> s3 = new HashSet<>();

        for(Integer x : set1) {
            if(set2.contains(x)) {
                s2.add(x);
            }
            if(!set2.contains(x)) {
                s3.add(x);
            }
            s1.add(x);
        }

        for(Integer x : set2) {
            s1.add(x);
        }

        System.out.println("합집합 : " + s1);
        System.out.println("교집합 : " + s2);
        System.out.println("차집합 : " + s3);
    }
}
