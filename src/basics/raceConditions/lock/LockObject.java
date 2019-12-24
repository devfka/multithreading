package basics.raceConditions.lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class LockObject implements Lock
{
    private boolean isLocked = false;


    @Override public synchronized void lock()
    {
        while (isLocked)
        {
            try
            {
                wait();
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        isLocked = true;
    }


    @Override public void lockInterruptibly() throws InterruptedException
    {

    }


    @Override public boolean tryLock()
    {
        return false;
    }


    @Override public boolean tryLock(long time, TimeUnit unit) throws InterruptedException
    {
        return false;
    }


    @Override public synchronized void unlock()
    {
        isLocked = false;
        notifyAll();
    }


    @Override public Condition newCondition()
    {
        return null;
    }
}
