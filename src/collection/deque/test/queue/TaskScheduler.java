package collection.deque.test.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class TaskScheduler {
    private Queue<Task> queue = new ArrayDeque<>();

    public void addTask(Task task) {
        queue.offer(task);
    }

    public Integer getRemainingTasks() {
        return queue.size();
    }

    public void processNextTask() {
        Task temp = queue.poll();
        temp.execute();
    }
}
