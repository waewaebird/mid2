package collection.compare.test;

import java.util.*;

public class CardGameMain {
    static class Cards implements Comparable<Cards> {
        Character c;
        Integer n;
        Integer hidden;
        public Cards(Character c, Integer n, Integer hidden) {
            this.c = c;
            this.n = n;
            this.hidden = hidden;
        }

        @Override
        public int compareTo(Cards o) {
            if(this.n == o.n) {
                return Integer.compare(this.hidden, o.hidden);
            } else {
                return Integer.compare(this.n, o.n);
            }
        }
    }

    public static void main(String[] args) {
        List<Character> emblem = new ArrayList<>() ;
        emblem.add('♠');
        emblem.add('♥');
        emblem.add('g');
        emblem.add('♣');

        List<Cards> list = new ArrayList<>();
        for(char x : emblem) {
            int hidden = 0;
            if(x == '♠') {
                hidden = 1;
            } else if(x == '♥') {
                hidden = 2;
            } else if(x == 'g') {
                hidden = 3;
            } else {
                hidden = 4;
            }
            for (int i = 1; i <= 13; i++) {
                list.add(new Cards(x, i, hidden));
            }
        }

        Collections.shuffle(list);
        List<Cards> player1 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            player1.add(list.get(i));
        }
        int sum1 = 0;
        System.out.print("플레이어1의 카드 : ");
        for (Cards c : player1) {
            System.out.print("[" + c.n + "(" + c.c + "), ");
            sum1 += c.n;
        }
        System.out.println("], 합계 : " + sum1);


        Collections.shuffle(list);
        List<Cards> player2 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            player2.add(list.get(i));
        }
        int sum2 = 0;
        System.out.print("플레이어2의 카드 : ");
        for (Cards c : player2) {
            System.out.print("[" + c.n + "(" + c.c + "), ");
            sum2 += c.n;
        }
        System.out.println("], 합계 : " + sum2);

        if(sum1 > sum2) {
            System.out.println("플레이어1 승리");
        } else if(sum1 < sum2) {
            System.out.println("플레이어2 승리");
        } else {
            System.out.println("무승부");
        }
    }
}
