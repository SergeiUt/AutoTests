package practice_8;

import java.util.PriorityQueue;

public class PriorityQueueTasks {


    public static void main(String[] args) {

        PriorityQueue<Integer> numbers = new PriorityQueue<>();

        numbers.offer(5);
        numbers.offer(1);
        numbers.offer(2);
        numbers.offer(8);
        numbers.offer(4);

        while (!numbers.isEmpty()) {
            System.out.println(numbers.poll());
        }

    }
}
