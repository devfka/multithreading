package basics.raceConditions.withSync;

public class Main
{
    public static void main(String[] args)
    {
        Counter counter = new Counter();
        Thread thread = new Thread(counter);
        Thread thread1 = new Thread(counter);
        Thread thread2 = new Thread(counter);
        Thread thread3 = new Thread(counter);

        thread.start();
        thread1.start();
        thread2.start();
        thread3.start();

    }
}
