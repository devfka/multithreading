package advanced.arrayBlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main
{
    public static void main(String[] args) throws InterruptedException
    {
        BlockingQueue queue = new ArrayBlockingQueue(1024);
        queue.put("1");
        Object object = queue.take();
        System.out.println(object.toString());

        BlockingQueue<String> queue1 = new ArrayBlockingQueue<String>(1024);
        queue1.put("2");
        String string = queue1.take();

        System.out.println(string);
    }
}
