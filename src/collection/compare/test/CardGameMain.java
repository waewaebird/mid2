package collection.compare.test;

import java.util.*;

public class CardGameMain {
    static class Decks implements Comparable<Decks>{
        Card card;
        Integer number;
        public Decks(Card card, Integer number) {
            this.card = card;
            this.number = number;
        }

        @Override
        public int compareTo(Decks o) {
            if(this.number == o.number) {
                return Integer.compare(this.card.getV(), o.card.getV());
            } else {
                return Integer.compare(this.number, o.number);
            }
        }
    }
    public static void main(String[] args) {
        List<Decks> list = new ArrayList<>();

        Card[] values = Card.values();
        for(Card card : values) {
            for (int i = 1; i <= 13; i++) {
                list.add(new Decks(card, i));
            }
        }

        Collections.shuffle(list);
        List<Decks> player1 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            player1.add(list.get(i));
            list.remove(i);
        }
        int sum1 = 0;
        System.out.print("플레이어1의 카드 : [");
        player1.sort(null);
        for (Decks D : player1) {
            System.out.print("" + D.number + "(" + D.card.getC() + "), ");
            sum1 += D.number;
        }
        System.out.println("], 합계 : " + sum1);

        List<Decks> player2 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            player2.add(list.get(i));
            list.remove(i);
        }
        int sum2 = 0;
        System.out.print("플레이어2의 카드 : [");
        player2.sort(null);
        for (Decks D : player2) {
            System.out.print("" + D.number + "(" + D.card.getC() + "), ");
            sum2 += D.number;
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
