package advanced.concurrentMap;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class Counter implements Runnable
{
    public ConcurrentHashMap<Integer, Integer> concurrentHashMap;


    public Counter(ConcurrentHashMap concurrentHashMap)
    {
        this.concurrentHashMap = concurrentHashMap;
    }

    @Override
    public void run()
    {
        for (int i = 0; i < 10; i++)
        {
            if(this.concurrentHashMap.get(i + 1) != null)
            {
                this.concurrentHashMap.put(i + 1, this.concurrentHashMap.get(i + 1) + 1);
            }
            else
            {
                this.concurrentHashMap.put(i + 1, i + 1);
            }

            System.out.println(" Thread " + Thread.currentThread().getName() +"  " +this.concurrentHashMap);

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
