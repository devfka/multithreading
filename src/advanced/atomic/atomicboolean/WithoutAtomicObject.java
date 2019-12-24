package advanced.atomic.atomicboolean;

public class WithoutAtomicObject implements Runnable
{
    private boolean locked = false;

    public synchronized boolean lock() {
        if(!locked) {
            locked = true;
            return true;
        }
        return false;
    }


    @Override public void run()
    {

    }
}
