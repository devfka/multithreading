package advanced.atomic.atomicboolean;

import java.util.concurrent.atomic.AtomicBoolean;

public class WithAtomicObject implements Runnable
{
    private AtomicBoolean locked = new AtomicBoolean(false);

    public boolean lock() {
        return locked.compareAndSet(false, true);
    }


    @Override public void run()
    {

    }
}
