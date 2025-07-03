package collection.deque.test.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {
    private Deque<String> historyStack = new ArrayDeque<>();
    public void visitPage(String s) {
        historyStack.push(s);
        System.out.println("방문 : " + s);
    }


    public String goBack() {
        historyStack.pop();
        System.out.println("뒤로 가기 : " + historyStack.peek());
        return historyStack.peek();
    }
}
