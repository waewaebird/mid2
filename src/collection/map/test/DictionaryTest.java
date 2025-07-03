package collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Map<String, String> dict = new HashMap<>();

        System.out.println("== 단어 입력 단계==");
        while (true) {
            System.out.print("영어 단어를 입력하세요 (종료는 'q') : ");
            String eStr = in.next();

            if(eStr.equals("q")) {
                break;
            }

            System.out.print("한글 뜻을 입력하세요 : ");
            String kStr = in.next();

            dict.put(eStr, kStr);
        }

        System.out.println("== 단어 검색 단계==");
        while (true) {
            System.out.print("찾을 영어 단어를 입력하세요 (종료는 'q') : ");
            String eKey = in.next();

            if(eKey.equals("q")) {
                break;
            }

            if(dict.get(eKey) != null) {
                System.out.println(eKey + "의 뜻 : " + dict.get(eKey));
            } else {
                System.out.println(eKey + "은(는) 사전에 없는 단어입니다.");
            }
        }
    }
}
