package advanced.atomic.atomicinteger;

import basics.raceConditions.lock.LockObject;

public class CounterWithoutAtomic implements Runnable
{
    private LockObject lock = new LockObject();
    private int count = 0;


    public void inc(int i)
    {
        lock.lock();
        try{
            this.count = this.count + i;
            System.out.println("count : " + this.count + " Thread " + Thread.currentThread().getName());

        } finally {
            lock.unlock();
        }
    }


    @Override public void run()
    {
        for (int i = 0; i < 10; i++)
        {
            this.inc(i);
            try
            {
                Thread.sleep(2L * 1000L);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
