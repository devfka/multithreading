package advanced.executerservice.simplesubmit;

import java.util.concurrent.Callable;

public class Multiplier implements Callable<Integer>
{
    private int count = 1;

    public void add(int value)
    {
        synchronized (this)
        {
            this.count = this.count * value;
            System.out.println("count : " + this.count + " Thread " + Thread.currentThread().getName());
        }
    }

    @Override public Integer call() throws Exception
    {
        for (int i = 1; i < 10; i++)
        {
            this.add(i);
            try
            {
                Thread.sleep(1L * 1000L);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }

        return this.count;
    }
}
