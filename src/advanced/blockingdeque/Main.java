package advanced.blockingdeque;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class Main
{
    public static void main(String[] args) throws InterruptedException
    {
        BlockingDeque<String> deque = new LinkedBlockingDeque<String>();

        deque.addFirst("1");
        deque.addLast("2");

        String two = deque.takeLast();
        String one = deque.takeFirst();
    }
}
