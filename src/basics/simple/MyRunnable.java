package basics.simple;

public class MyRunnable implements Runnable
{

    private boolean doStop = false;


    public synchronized void doStop()
    {
        this.doStop = true;
        System.out.println("Stopped has been called");
    }


    private synchronized boolean keepRunning()
    {
        return !this.doStop;
    }


    @Override public void run()
    {
        while (keepRunning())
        {
            System.out.println("My Thread is running. Thread : " + Thread.currentThread().getName() );

            try
            {
                Thread.sleep(3L * 1000L);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }

    }
}
