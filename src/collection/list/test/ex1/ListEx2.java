package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<Integer> answers = new ArrayList<>();

        System.out.println("n개의 정수를 입력하세요 (종료 0)");
        boolean flag = true;
        while(true) {
            int a = in.nextInt();
            if(a != 0) {
                answers.add(a);
            } else {
                flag = false;
            }

            if(!flag) {
                break;
            }
        }

        System.out.println("출력");
        for (int i = 0; i < answers.size(); i++) {
            if(i == answers.size() - 1) {
                System.out.print(answers.get(i));
            } else {
                System.out.print(answers.get(i) + " , ");
            }
        }
    }
}
