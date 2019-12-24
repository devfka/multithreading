package advanced.exchanger;

import java.util.concurrent.Exchanger;

public class ExchangerRunnable implements Runnable
{
    Exchanger<Object> exchanger = null;
    Object object = null;

    public ExchangerRunnable(Exchanger<Object> exchanger, Object object)
    {
        this.exchanger = exchanger;
        this.object = object;
    }

    @Override
    public void run()
    {
        Object previous = this.object;

        try
        {
            this.object = this.exchanger.exchange(this.object);

            System.out.println(
                Thread.currentThread().getName() +
                    " exchanged " + previous + " for " + this.object);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
