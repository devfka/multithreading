package advanced.executerservice.simpleexecute;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main
{
    public static void main(String[] args)
    {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        executorService.execute(new Runnable() {
            public void run() {
                System.out.println("Asynchronous task : " + Thread.currentThread().toString());
            }
        });

        executorService.execute(new Counter());
        executorService.execute(new Counter());
        executorService.execute(new Counter());

        executorService.shutdown();
    }
}
