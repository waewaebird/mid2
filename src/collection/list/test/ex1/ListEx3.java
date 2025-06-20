package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("n개의 정수를 입력하세요 (종료 0)");

        List<Integer> answers = new ArrayList<>();
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

        int sum = 0;
        for(Integer x : answers) {
            sum += x;
        }
        System.out.println("입력한 정수의 합계 : " + sum);
        System.out.println("입력한 정수의 평균 : " + (double) sum / answers.size());
    }
}
