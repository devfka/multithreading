package advanced.concurrentMap;

import java.util.concurrent.ConcurrentHashMap;

public class Main
{
    public static void main(String[] args)
    {
        Counter counter = new Counter(new ConcurrentHashMap<>());

        new Thread(counter).start();
        new Thread(counter).start();
        new Thread(counter).start();

    }
}
