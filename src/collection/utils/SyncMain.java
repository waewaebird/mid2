package collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SyncMain {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        //쓰레드1
        list.add(1);
        list.add(2);
        list.add(3);

        //쓰레드2
        list.remove(1);

        System.out.println("list class = " + list.getClass());
        List<Integer> synchronizedList = Collections.synchronizedList(list); //동시에 실행해도 먼저들어온 작업이 끝날떄까지 기달려야 함...
        System.out.println("synchronizedList class = " + synchronizedList.getClass());
    }
}
