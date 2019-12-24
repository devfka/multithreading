package basics.raceConditions.withoutSync;

public class Counter implements Runnable
{
    private long count = 0;

    public void add(long value)
    {
        this.count = this.count + value;
        System.out.println("count : " + this.count + " Thread: " + Thread.currentThread().getName());
    }


    @Override
    public void run()
    {
        for (int i = 0; i < 10; i++)
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
    }
}
