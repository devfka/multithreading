package advanced.atomic.atomicinteger;

import java.util.concurrent.atomic.AtomicInteger;

public class WithAtomicObject implements Runnable
{
    private AtomicInteger atomicInteger = new AtomicInteger(0);

    public void increase()
    {
        atomicInteger.getAndIncrement();
    }

    @Override public void run()
    {
        for (int i = 0; i < 10; i++)
        {
            System.out.println("count : " + this.atomicInteger + " Thread " + Thread.currentThread().getName());
            increase();
        }
    }
}
