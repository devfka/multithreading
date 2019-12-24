package advanced.executerservice.simplesubmit;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main
{
    public static void main(String[] args) throws ExecutionException, InterruptedException
    {

        //a Runnable was originally designed for long running concurrent execution, e.g. running a network server concurrently, or watching a directory for new files. The Callable interface is more designed for one-off tasks that return a single result.

        ExecutorService executorService = Executors.newFixedThreadPool(5);

        Future future = executorService.submit(new Counter());
        Future future1 = executorService.submit(new Counter());
        Future future2 = executorService.submit(new Counter());
        Future future4 = executorService.submit(new Multiplier());

        System.out.println("Result 1 : " + future.get());
        System.out.println("Result 2 : " + future1.get());
        System.out.println("Result 3 : " + future2.get());
        System.out.println("Result 4 : " + future4.get()); //this is callable and returns value

        if(future.isDone()) {
            System.out.println("First job completed");
        } else {
            System.out.println("First job still continues");
        }

        executorService.shutdown();
    }
}
